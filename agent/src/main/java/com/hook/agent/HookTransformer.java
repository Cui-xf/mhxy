package com.hook.agent;

import org.objectweb.asm.*;
import org.objectweb.asm.commons.AdviceAdapter;

import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;

public class HookTransformer implements ClassFileTransformer {

    private static final String HELPER = "com/hook/agent/HookHelper";
    private static final String MIDLET_CLASSLOADER = "org/microemu/app/classloader/MIDletClassLoader";

    private final HookConfig config;

    public HookTransformer(HookConfig config) {
        this.config = config;
    }

    @Override
    public byte[] transform(ClassLoader loader, String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) {
        if (className == null) return null;

        if (MIDLET_CLASSLOADER.equals(className)) {
            return patchClassLoader(classfileBuffer);
        }

        if (config.shouldTransformClass(className)) {
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
                public MethodVisitor visitMethod(int access, String name, String descriptor,
                                                 String signature, String[] exceptions) {
                    MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                    if ("classLoadByParent".equals(name) && "(Ljava/lang/String;)Z".equals(descriptor)) {
                        return new AdviceAdapter(Opcodes.ASM9, mv, access, name, descriptor) {
                            @Override
                            protected void onMethodEnter() {
                                visitVarInsn(ALOAD, 1);
                                visitLdcInsn("com.hook.");
                                visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith",
                                        "(Ljava/lang/String;)Z", false);
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
            HookClassVisitor cv = new HookClassVisitor(Opcodes.ASM9, cw, className, config);
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
        private final HookConfig config;
        int hookedCount = 0;

        HookClassVisitor(int api, ClassVisitor cv, String className, HookConfig config) {
            super(api, cv);
            this.className = className;
            this.config = config;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor,
                                         String signature, String[] exceptions) {
            MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
            if (mv == null) return null;
            if ((access & (Opcodes.ACC_NATIVE | Opcodes.ACC_ABSTRACT)) != 0) return mv;

            if (!config.shouldHookMethod(className, name)) return mv;

            String readableClass = className.replace('/', '.');
            String fullSig = buildMethodSignature(access, readableClass, name, descriptor);
            hookedCount++;

            final String desc = descriptor;

            return new AdviceAdapter(Opcodes.ASM9, mv, access, name, descriptor) {

                @Override
                protected void onMethodEnter() {
                    push(fullSig);
                    loadArgArray();
                    visitMethodInsn(INVOKESTATIC, HELPER, "printEnter",
                            "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
                }

                @Override
                protected void onMethodExit(int opcode) {
                    if (opcode == ATHROW) {
                        visitInsn(DUP);
                        push(fullSig);
                        visitInsn(SWAP);
                        visitMethodInsn(INVOKESTATIC, HELPER, "printExitThrow",
                                "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
                    } else if (opcode == RETURN) {
                        push(fullSig);
                        visitMethodInsn(INVOKESTATIC, HELPER, "printExitVoid",
                                "(Ljava/lang/String;)V", false);
                    } else {
                        Type retType = Type.getReturnType(desc);
                        if (retType.getSize() == 2) {
                            visitInsn(DUP2);
                        } else {
                            visitInsn(DUP);
                        }
                        box(retType);
                        push(fullSig);
                        visitInsn(SWAP);
                        visitMethodInsn(INVOKESTATIC, HELPER, "printExit",
                                "(Ljava/lang/String;Ljava/lang/Object;)V", false);
                    }
                }
            };
        }
    }

    // ==================== 方法签名解析 ====================

    static String buildMethodSignature(int access, String className, String methodName, String descriptor) {
        StringBuilder sb = new StringBuilder();

        if ((access & Opcodes.ACC_PUBLIC) != 0) sb.append("public ");
        if ((access & Opcodes.ACC_PRIVATE) != 0) sb.append("private ");
        if ((access & Opcodes.ACC_PROTECTED) != 0) sb.append("protected ");
        if ((access & Opcodes.ACC_STATIC) != 0) sb.append("static ");
        if ((access & Opcodes.ACC_FINAL) != 0) sb.append("final ");
        if ((access & Opcodes.ACC_SYNCHRONIZED) != 0) sb.append("synchronized ");

        if (!"<init>".equals(methodName) && !"<clinit>".equals(methodName)) {
            sb.append(parseReturnType(descriptor)).append(" ");
        }

        sb.append(className).append(".").append(methodName);

        sb.append("(");
        String[] paramTypes = parseParamTypes(descriptor);
        for (int i = 0; i < paramTypes.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(paramTypes[i]);
        }
        sb.append(")");

        return sb.toString();
    }

    private static String parseReturnType(String descriptor) {
        int idx = descriptor.lastIndexOf(')') + 1;
        return parseType(descriptor, idx)[0];
    }

    private static String[] parseParamTypes(String descriptor) {
        List<String> types = new ArrayList<>();
        int i = 1;
        while (descriptor.charAt(i) != ')') {
            String[] result = parseType(descriptor, i);
            types.add(result[0]);
            i = Integer.parseInt(result[1]);
        }
        return types.toArray(new String[0]);
    }

    private static String[] parseType(String desc, int pos) {
        char c = desc.charAt(pos);
        switch (c) {
            case 'V': return new String[]{"void", String.valueOf(pos + 1)};
            case 'Z': return new String[]{"boolean", String.valueOf(pos + 1)};
            case 'B': return new String[]{"byte", String.valueOf(pos + 1)};
            case 'C': return new String[]{"char", String.valueOf(pos + 1)};
            case 'S': return new String[]{"short", String.valueOf(pos + 1)};
            case 'I': return new String[]{"int", String.valueOf(pos + 1)};
            case 'J': return new String[]{"long", String.valueOf(pos + 1)};
            case 'F': return new String[]{"float", String.valueOf(pos + 1)};
            case 'D': return new String[]{"double", String.valueOf(pos + 1)};
            case 'L': {
                int end = desc.indexOf(';', pos);
                String clsName = desc.substring(pos + 1, end).replace('/', '.');
                return new String[]{clsName, String.valueOf(end + 1)};
            }
            case '[': {
                String[] inner = parseType(desc, pos + 1);
                return new String[]{inner[0] + "[]", inner[1]};
            }
            default:
                return new String[]{"unknown", String.valueOf(pos + 1)};
        }
    }
}
