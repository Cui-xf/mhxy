package com.hook.agent;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.AdviceAdapter;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class HookTransformer implements ClassFileTransformer {

    private static final String HELPER = "com/hook/agent/HookHelper";
    private static final String MIDLET_CLASSLOADER = "org/microemu/app/classloader/MIDletClassLoader";


    public HookTransformer() {
    }

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) {
        if (className == null) {
            return null;
        }
        if (className.startsWith("com/hook/agent")) {
            return null;
        }

        if (MIDLET_CLASSLOADER.equals(className)) {
            return patchClassLoader(classfileBuffer);
        }

        if (HookConfig.shouldHookMethod(className, null) != null) {
            return hookGameClass(className, loader, classfileBuffer);
        }

        return null;
    }

    // ==================== 修补 MIDletClassLoader ====================

    private byte[] patchClassLoader(byte[] bytes) {
        System.out.println("[HookAgent] Patching MIDletClassLoader.classLoadByParent ...");
        try {
            ClassReader cr = new ClassReader(bytes);
            ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
            ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                @Override
                public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                    MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                    if ("classLoadByParent".equals(name) && "(Ljava/lang/String;)Z".equals(descriptor)) {
                        return new AdviceAdapter(Opcodes.ASM9, mv, access, name, descriptor) {
                            @Override
                            protected void onMethodEnter() {
                                visitVarInsn(ALOAD, 1);
                                visitLdcInsn("com.hook.");
                                visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
                                Label skip = new Label();
                                visitJumpInsn(IFEQ, skip);
                                visitInsn(ICONST_1);
                                visitInsn(IRETURN);
                                visitLabel(skip);
                            }
                        };
                    }
                    return mv;
                }
            };
            cr.accept(cv, ClassReader.EXPAND_FRAMES);
            System.out.println("[HookAgent] MIDletClassLoader patched OK");
            return cw.toByteArray();
        } catch (Exception e) {
            System.err.println("[HookAgent] ERROR patching MIDletClassLoader: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // ==================== Hook 游戏类 ====================
    private byte[] hookGameClass(String className, ClassLoader loader, byte[] bytes) {
        String readableName = className.replace('/', '.');
        try {
            ClassReader cr = new ClassReader(bytes);
            ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);
            HookClassVisitor cv = new HookClassVisitor(Opcodes.ASM9, cw, className);
            cr.accept(cv, ClassReader.EXPAND_FRAMES);

            if (cv.hookedCount == 0) return null;

            System.out.println("[HookAgent] " + readableName + " — hooked " + cv.hookedCount + " methods");
            return cw.toByteArray();
        } catch (Exception e) {
            System.err.println("[HookAgent] ERROR hooking " + readableName + ": " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private static class HookClassVisitor extends ClassVisitor {
        private final String className;
        int hookedCount = 0;

        HookClassVisitor(int api, ClassVisitor cv, String className) {
            super(api, cv);
            this.className = className;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
            if (mv == null) return null;
            if ((access & (Opcodes.ACC_NATIVE | Opcodes.ACC_ABSTRACT)) != 0) return mv;
            String hookKey = HookConfig.shouldHookMethod(className, name + descriptor);
            if (hookKey == null) {
                return mv;
            } else {
                hookedCount++;
            }
            final String desc = descriptor;
            final int acc = access;

            return new AdviceAdapter(Opcodes.ASM9, mv, access, name, descriptor) {
                private final boolean isStaticMethod = (acc & Opcodes.ACC_STATIC) != 0;
                private final boolean isConstructor = "<init>".equals(name);
                private int receiverLocal = -1;
                private boolean receiverCaptured = false;

                private void captureReceiver() {
                    if (isStaticMethod || receiverCaptured) {
                        return;
                    }
                    receiverLocal = newLocal(Type.getType(Object.class));
                    loadThis();
                    storeLocal(receiverLocal);
                    receiverCaptured = true;
                }

                private void loadReceiverForHook() {
                    if (isStaticMethod) {
                        visitInsn(ACONST_NULL);
                        return;
                    }
                    if (isConstructor && !receiverCaptured) {
                        // 构造器在 super()/this() 完成前，this 仍可能是未初始化状态。
                        visitInsn(ACONST_NULL);
                        return;
                    }
                    loadLocal(receiverLocal);
                }

                @Override
                protected void onMethodEnter() {
                    captureReceiver();
                    push(hookKey);
                    loadReceiverForHook();
                    loadArgArray();
                    visitMethodInsn(INVOKESTATIC, HELPER, "printEnter", "(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", false);
                }

                @Override
                protected void onMethodExit(int opcode) {
                    if (opcode == ATHROW) {
                        visitInsn(DUP);
                        int exLocal = newLocal(Type.getType(Throwable.class));
                        storeLocal(exLocal);
                        push(hookKey);
                        loadReceiverForHook();
                        loadLocal(exLocal);
                        visitMethodInsn(INVOKESTATIC, HELPER, "printExitThrow", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
                    } else if (opcode == RETURN) {
                        push(hookKey);
                        loadReceiverForHook();
                        visitMethodInsn(INVOKESTATIC, HELPER, "printExitVoid", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
                    } else {
                        Type retType = Type.getReturnType(desc);
                        if (retType.getSize() == 2) {
                            visitInsn(DUP2);
                        } else {
                            visitInsn(DUP);
                        }
                        box(retType);
                        int boxedLocal = newLocal(Type.getType(Object.class));
                        storeLocal(boxedLocal);
                        push(hookKey);
                        loadReceiverForHook();
                        loadLocal(boxedLocal);
                        visitMethodInsn(INVOKESTATIC, HELPER, "printExit", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", false);
                    }
                }
            };
        }
    }

//    private static String[] parseType(String desc, int pos) {
//        char c = desc.charAt(pos);
//        switch (c) {
//            case 'V':
//                return new String[]{"void", String.valueOf(pos + 1)};
//            case 'Z':
//                return new String[]{"boolean", String.valueOf(pos + 1)};
//            case 'B':
//                return new String[]{"byte", String.valueOf(pos + 1)};
//            case 'C':
//                return new String[]{"char", String.valueOf(pos + 1)};
//            case 'S':
//                return new String[]{"short", String.valueOf(pos + 1)};
//            case 'I':
//                return new String[]{"int", String.valueOf(pos + 1)};
//            case 'J':
//                return new String[]{"long", String.valueOf(pos + 1)};
//            case 'F':
//                return new String[]{"float", String.valueOf(pos + 1)};
//            case 'D':
//                return new String[]{"double", String.valueOf(pos + 1)};
//            case 'L': {
//                int end = desc.indexOf(';', pos);
//                String clsName = desc.substring(pos + 1, end).replace('/', '.');
//                return new String[]{clsName, String.valueOf(end + 1)};
//            }
//            case '[': {
//                String[] inner = parseType(desc, pos + 1);
//                return new String[]{inner[0] + "[]", inner[1]};
//            }
//            default:
//                return new String[]{"unknown", String.valueOf(pos + 1)};
//        }
//    }
}
