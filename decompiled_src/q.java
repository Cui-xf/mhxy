/*
 * Decompiled with CFR 0.152.
 */
import com.yinhan.kjava.main.a;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

public final class q {
    private a a;
    private DataInputStream b;
    private ByteArrayInputStream c;
    private short d = (short)-1;
    private int e;
    private int f;
    private int g;
    private int h;
    private Vector i = new Vector();
    private bl[] j;

    public final void a(a a2) {
        this.a = a2;
    }

    /*
     * Exception decompiling
     */
    public final void a(w var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 48[CASE]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void a() {
        byte by2 = this.b.readByte();
        bt.C = new byte[by2];
        for (by2 = 0; by2 < bt.C.length; by2 = (byte)(by2 + 1)) {
            bt.C[by2] = this.b.readByte();
        }
    }

    private void a(DataInputStream dataInputStream) {
        try {
            Object object;
            int n2;
            if (com.yinhan.kjava.main.a.e == null || com.yinhan.kjava.main.a.e.k == 25 || com.yinhan.kjava.main.a.e.k == 18) {
                return;
            }
            int n3 = dataInputStream.readByte();
            if (n3 > ao.aW[0] && bt.bw == 0) {
                n3 = ao.aW[0];
            }
            bl[] blArray = new bl[n3];
            for (n2 = 0; n2 < n3; ++n2) {
                blArray[n2] = new bl();
                blArray[n2].a(dataInputStream);
            }
            if (bt.o != null) {
                int n4;
                int n5;
                Object object2 = blArray;
                object = ((q)object5).a;
                ((q)object5).i.removeAllElements();
                object = object2;
                object2 = object5;
                if (object2.j == null) {
                    object2.j = new bl[3];
                }
                if (object != null && com.yinhan.kjava.main.a.e != null && com.yinhan.kjava.main.a.e.I != null) {
                    int n6;
                    for (n6 = 0; n6 < object2.j.length; ++n6) {
                        object2.j[n6] = null;
                    }
                    n6 = 0;
                    if (((Object)object).length <= 3) {
                        n6 = 1;
                    }
                    n5 = com.yinhan.kjava.main.a.e.I.k / 16;
                    n4 = com.yinhan.kjava.main.a.e.I.j / 16;
                    boolean bl2 = false;
                    int n7 = 0;
                    int n8 = 0;
                    for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
                        boolean bl3;
                        if (object[i2] == null) continue;
                        Object object3 = object[i2];
                        if (object3 != null) {
                            for (n7 = 0; n7 < bt.o.length; ++n7) {
                                if (bt.o[n7] == null || !bt.o[n7].a.equals(((bl)object3).a)) continue;
                                ((ar)object3).j = bt.o[n7].j;
                                ((ar)object3).k = bt.o[n7].k;
                                ((ar)object3).h = bt.o[n7].h;
                                bl3 = true;
                                break;
                            }
                        } else {
                            bl3 = false;
                        }
                        if (!bl3) continue;
                        byte by2 = (byte)(((ar)object[i2]).k / 16);
                        byte by3 = (byte)(((ar)object[i2]).j / 16);
                        n7 = by3;
                        if ((by3 < n4 - 4 || n7 > n4 + 4 || by2 < n5 - 4 || by2 > n5 + 4) && n6 == 0 || Math.abs(((ar)object[i2]).l - ((ar)object[i2]).j) < 32 && Math.abs(((ar)object[i2]).m - ((ar)object[i2]).k) < 32 && n6 == 0 || n8 >= object2.j.length) continue;
                        object2.j[n8] = object[i2];
                        n8 = (byte)(n8 + 1);
                    }
                }
                if (((q)object5).j != null) {
                    for (int i3 = 0; i3 < ((q)object5).j.length; ++i3) {
                        if (((q)object5).j[i3] == null) continue;
                        ((q)object5).e = ((q)object5).j[i3].j / 16 + (((q)object5).j[i3].j % 16 == 0 ? 0 : 1);
                        ((q)object5).f = ((q)object5).j[i3].k / 16 + (((q)object5).j[i3].k % 16 == 0 ? 0 : 1);
                        ((q)object5).g = ((q)object5).j[i3].l / 16 + (((q)object5).j[i3].l % 16 == 0 ? 0 : 1);
                        ((q)object5).h = ((q)object5).j[i3].m / 16 + (((q)object5).j[i3].m % 16 == 0 ? 0 : 1);
                        if (((q)object5).e == ((q)object5).g && ((q)object5).f == ((q)object5).h) continue;
                        ((q)object5).i = ((q)object5).a(com.yinhan.kjava.main.a.e.f, ((q)object5).i, new bs(((q)object5).e, ((q)object5).f), new bs(((q)object5).g, ((q)object5).h));
                        if (((q)object5).i == null) continue;
                        ((q)object5).j[i3].f.removeAllElements();
                        n5 = ((q)object5).i.size();
                        for (n4 = 0; n4 < n5; ++n4) {
                            object = (bs)((q)object5).i.elementAt(n4);
                            Object object4 = n4 < n5 - 1 ? (bs)((q)object5).i.elementAt(n4 + 1) : object;
                            if (((bs)object).a != ((bs)object4).a) {
                                if (((bs)object).a > ((bs)object4).a) {
                                    for (int i4 = 0; i4 < 4; ++i4) {
                                        ((q)object5).j[i3].f.addElement(new short[]{(short)((((bs)object).a << 4) - (i4 << 2)), (short)(((bs)object).b << 4)});
                                    }
                                    continue;
                                }
                                for (int i5 = 0; i5 < 4; ++i5) {
                                    ((q)object5).j[i3].f.addElement(new short[]{(short)((((bs)object).a << 4) + (i5 << 2)), (short)(((bs)object).b << 4)});
                                }
                                continue;
                            }
                            if (((bs)object).b == ((bs)object4).b) continue;
                            if (((bs)object).b > ((bs)object4).b) {
                                for (int i6 = 0; i6 < 4; ++i6) {
                                    ((q)object5).j[i3].f.addElement(new short[]{(short)(((bs)object).a << 4), (short)((((bs)object).b << 4) - (i6 << 2))});
                                }
                                continue;
                            }
                            for (int i7 = 0; i7 < 4; ++i7) {
                                ((q)object5).j[i3].f.addElement(new short[]{(short)(((bs)object).a << 4), (short)((((bs)object).b << 4) + (i7 << 2))});
                            }
                        }
                    }
                }
            } else {
                for (n2 = 0; n2 < blArray.length; ++n2) {
                    blArray[n2].j = blArray[n2].l;
                    blArray[n2].k = blArray[n2].m;
                }
            }
            if (n3 > 0) {
                Object object5;
                if (bt.bw >= 1) {
                    for (int i8 = 0; i8 < blArray.length; ++i8) {
                        object = dataInputStream;
                        object5 = blArray[i8];
                        blArray[i8].u = ((DataInputStream)object).readByte();
                        ((bl)object5).v = ((DataInputStream)object).readByte();
                    }
                } else {
                    for (int i9 = 0; i9 < blArray.length; ++i9) {
                        object5 = blArray[i9];
                        blArray[i9].u = 0;
                    }
                }
            }
            ao.a(blArray);
            return;
        }
        catch (Exception exception) {
            if (com.yinhan.kjava.main.a.e != null) {
                com.yinhan.kjava.main.a.e.c("\u7cfb\u7edf\u5f02\u5e38[8]");
            }
            return;
        }
    }

    private void b() {
        bt.c(((q)object).b);
        if (com.yinhan.kjava.main.a.e != null && com.yinhan.kjava.main.a.e.I != null) {
            if (t.o && ((q)object).a.aj != null) {
                if (!com.yinhan.kjava.main.a.e.I.c.isEmpty()) {
                    com.yinhan.kjava.main.a.e.I.c.removeAllElements();
                    com.yinhan.kjava.main.a.e.I.b();
                }
                if (((q)object).a.aj != null) {
                    ((q)object).a.aj.c = 0;
                    ((q)object).a.aj.d = 0;
                }
                ((q)object).a.b = 0;
                ((q)object).a.a = 0;
            }
            com.yinhan.kjava.main.a.e.I.j = bt.at;
            com.yinhan.kjava.main.a.e.I.k = bt.au;
        }
        if (bt.bs == 0 && bt.q != null && bt.s == 0) {
            for (int i2 = 0; i2 < bt.q.length; ++i2) {
                bt.q[i2].f.removeAllElements();
                if (bt.q[i2].j == -1 && bt.q[i2].k == -1) {
                    bt.q[i2].j = bt.at;
                    bt.q[i2].k = bt.au;
                }
                bt.q[i2].l = bt.at;
                bt.q[i2].m = bt.au;
            }
        }
        if (com.yinhan.kjava.main.a.e == null) {
            ((q)object).a.g();
            com.yinhan.kjava.main.a.e.I.d();
            return;
        }
        if (com.yinhan.kjava.main.a.e != null) {
            com.yinhan.kjava.main.a.e.I.a((int)bt.av);
        }
        if (com.yinhan.kjava.main.a.e.Y != bt.ar || com.yinhan.kjava.main.a.e.I.h()) {
            if (bt.bs == -1) {
                com.yinhan.kjava.main.a.e.aY = 0L;
            }
            if (com.yinhan.kjava.main.a.e.I.d != null) {
                com.yinhan.kjava.main.a.e.I.d.e.removeAllElements();
                com.yinhan.kjava.main.a.e.I.d.h = bt.at;
                com.yinhan.kjava.main.a.e.I.d.i = bt.au;
                com.yinhan.kjava.main.a.e.I.d.j = com.yinhan.kjava.main.a.e.I.h;
                com.yinhan.kjava.main.a.e.I.d.a(com.yinhan.kjava.main.a.e.I.h);
            }
            if (ao.i()) {
                if (com.yinhan.kjava.main.a.e.Y != bt.ar) {
                    com.yinhan.kjava.main.a.e.e();
                } else {
                    com.yinhan.kjava.main.a.e.f();
                }
                com.yinhan.kjava.main.a.e.I.i();
                com.yinhan.kjava.main.a.e.Y = bt.ar;
            }
            com.yinhan.kjava.main.a.e.I.d();
            return;
        }
        if (bt.bs == 0 && bt.q != null && bt.s == 0) {
            q q2 = object;
            Object object = ((q)object).a;
            object = q2;
            Vector vector = new Vector();
            ((q)object).e = bt.q[0].j / 16 + (bt.q[0].j % 16 == 0 ? 0 : 1);
            ((q)object).f = bt.q[0].k / 16 + (bt.q[0].k % 16 == 0 ? 0 : 1);
            ((q)object).g = bt.q[0].l / 16 + (bt.q[0].l % 16 == 0 ? 0 : 1);
            ((q)object).h = bt.q[0].m / 16 + (bt.q[0].m % 16 == 0 ? 0 : 1);
            if (((q)object).e != ((q)object).g || ((q)object).f != ((q)object).h) {
                if (bt.q[0].f == null) {
                    bt.q[0].f = new Vector();
                }
                vector = ((q)object).a(com.yinhan.kjava.main.a.e.f, vector, new bs(((q)object).e, ((q)object).f), new bs(((q)object).g, ((q)object).h));
                int n2 = vector.size();
                for (int i3 = 0; i3 < bt.q.length; ++i3) {
                    bt.q[i3].f.removeAllElements();
                    for (int i4 = 0; i4 < n2; ++i4) {
                        object = (bs)vector.elementAt(i4);
                        Object object2 = i4 < n2 - 1 ? (bs)vector.elementAt(i4 + 1) : object;
                        if (((bs)object).a != ((bs)object2).a) {
                            if (((bs)object).a > ((bs)object2).a) {
                                for (int i5 = 0; i5 < 4; ++i5) {
                                    bt.q[i3].f.addElement(new short[]{(short)((((bs)object).a << 4) - (i5 << 2)), (short)(((bs)object).b << 4)});
                                }
                                continue;
                            }
                            for (int i6 = 0; i6 < 4; ++i6) {
                                bt.q[i3].f.addElement(new short[]{(short)((((bs)object).a << 4) + (i6 << 2)), (short)(((bs)object).b << 4)});
                            }
                            continue;
                        }
                        if (((bs)object).b == ((bs)object2).b) continue;
                        if (((bs)object).b > ((bs)object2).b) {
                            for (int i7 = 0; i7 < 4; ++i7) {
                                bt.q[i3].f.addElement(new short[]{(short)(((bs)object).a << 4), (short)((((bs)object).b << 4) - (i7 << 2))});
                            }
                            continue;
                        }
                        for (int i8 = 0; i8 < 4; ++i8) {
                            bt.q[i3].f.addElement(new short[]{(short)(((bs)object).a << 4), (short)((((bs)object).b << 4) + (i8 << 2))});
                        }
                    }
                }
            }
        }
    }

    private void c() {
        bt.bE = this.b.readByte() == 1;
        bt.bF = bt.bE ? this.b.readInt() : -1;
        bt.bG = this.b.readInt();
        bt.bH = this.b.readUTF();
        if (bt.bE) {
            com.yinhan.kjava.main.a.e.k = (short)2;
        }
        if (com.yinhan.kjava.main.a.e.k == 2) {
            ao.K = new bw(bt.bH, (short)(t.b - 20));
            if (bt.bE) {
                com.yinhan.kjava.main.a.e.an = new String[]{"\u63a5\u53d7", "\u8fd4\u56de"};
            } else if (bt.bK[com.yinhan.kjava.main.a.e.ai] == -1) {
                com.yinhan.kjava.main.a.e.an = new String[]{"\u63a5\u53d7", "\u8fd4\u56de"};
            } else if (bt.bK[com.yinhan.kjava.main.a.e.ai] == 0) {
                com.yinhan.kjava.main.a.e.an = new String[]{"\u786e\u5b9a", "\u8fd4\u56de"};
            } else if (bt.bK[com.yinhan.kjava.main.a.e.ai] == 1) {
                com.yinhan.kjava.main.a.e.an = new String[]{"\u63d0\u4ea4", "\u8fd4\u56de"};
            }
            ca.a(com.yinhan.kjava.main.a.F, ao.K, com.yinhan.kjava.main.a.e.an, null, true);
            this.a.j = this.a.k;
            com.yinhan.kjava.main.a.e.l = 1;
            return;
        }
        if (com.yinhan.kjava.main.a.e.k == 6) {
            this.a.b("\u4e0d\u5904\u7406");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d() {
        bt.I(this.b);
        if (com.yinhan.kjava.main.a.e == null) return;
        if (!ao.i()) {
            return;
        }
        if (com.yinhan.kjava.main.a.e.k == 13) {
            if (bt.fA != null) {
                if (com.yinhan.kjava.main.a.e.l == 6) {
                    com.yinhan.kjava.main.a.e.k(com.yinhan.kjava.main.a.e.aE);
                    return;
                }
                if (com.yinhan.kjava.main.a.e.l == 8) {
                    if (this.a.j == 2) return;
                    this.a.j = this.a.k;
                    return;
                }
                if (o.e == 1) {
                    if (this.a.j == 2) return;
                    this.a.j = this.a.k;
                    return;
                }
                com.yinhan.kjava.main.a.e.j(com.yinhan.kjava.main.a.e.as);
                if (this.a.j == 2) return;
                this.a.j = this.a.k;
                return;
            }
            bt.B();
            this.a.b("\u60a8\u6ca1\u6709\u5ba0\u7269\uff01");
            return;
        }
        if (com.yinhan.kjava.main.a.e.k == 36) {
            com.yinhan.kjava.main.a.e.b(false);
            return;
        }
        if (com.yinhan.kjava.main.a.e.k == 96 && com.yinhan.kjava.main.a.e.ap) {
            com.yinhan.kjava.main.a.e.k(com.yinhan.kjava.main.a.e.aE);
            com.yinhan.kjava.main.a.e.ap = false;
            return;
        }
        if (com.yinhan.kjava.main.a.e.k == 4 && com.yinhan.kjava.main.a.e.bh) {
            com.yinhan.kjava.main.a.e.s(com.yinhan.kjava.main.a.e.bg);
            return;
        }
        if (com.yinhan.kjava.main.a.e.k != 120) return;
        com.yinhan.kjava.main.a.e.t(this.a.ar.g());
    }

    private static void b(DataInputStream dataInputStream) {
        int n2;
        long l2 = dataInputStream.readLong();
        if (bq.g > 0 && bt.v <= 0L) {
            bt.v = l2;
            bq.g = -1;
        }
        if ((n2 = dataInputStream.readShort()) > 0) {
            Object object;
            DataInputStream dataInputStream2;
            int n3 = 0;
            int n4 = 0;
            for (n3 = 0; n3 < n2; ++n3) {
                n4 = dataInputStream.readShort();
                if (n4 <= 0) continue;
                i[] iArray = new i[n4];
                for (int i2 = 0; i2 < n4; ++i2) {
                    iArray[i2] = new i();
                    dataInputStream2 = dataInputStream;
                    object = iArray[i2];
                    iArray[i2].a = dataInputStream2.readByte();
                    ((i)object).b = dataInputStream2.readByte();
                    dataInputStream2.readByte();
                    ((i)object).c = dataInputStream2.readByte();
                    ((i)object).d = dataInputStream2.readByte();
                    ((i)object).e = dataInputStream2.readShort();
                    ((i)object).f = dataInputStream2.readUTF();
                }
                com.yinhan.kjava.main.a.e.g.a(iArray);
            }
            ae[] aeArray = null;
            for (n3 = 0; n3 < n2; ++n3) {
                n4 = dataInputStream.readShort();
                if (n4 <= 0) continue;
                aeArray = new ae[n4];
                for (int i3 = 0; i3 < n4; ++i3) {
                    aeArray[i3] = new ae();
                    dataInputStream2 = dataInputStream;
                    object = aeArray[i3];
                    aeArray[i3].f = 0;
                    ((ae)object).a = dataInputStream2.readByte();
                    ((ae)object).b = dataInputStream2.readByte();
                    ((ae)object).c = dataInputStream2.readByte();
                    ((ae)object).d = dataInputStream2.readInt();
                    ((ae)object).g = dataInputStream2.readInt();
                    ((ae)object).i = dataInputStream2.readInt();
                    ((ae)object).e = dataInputStream2.readInt();
                    ((ae)object).h = dataInputStream2.readInt();
                    ((ae)object).j = dataInputStream2.readInt();
                    ((ae)object).k = dataInputStream2.readByte();
                }
                com.yinhan.kjava.main.a.e.g.a(aeArray);
            }
            for (n3 = 0; n3 < n2; ++n3) {
                com.yinhan.kjava.main.a.e.g.a(dataInputStream.readUTF());
            }
            if (com.yinhan.kjava.main.a.e.k == 25 || com.yinhan.kjava.main.a.e.k == 18 || !ao.i()) {
                com.yinhan.kjava.main.a.e.g.f = 1;
            }
        }
    }

    private void e() {
        int n2 = bpArray2.b.readByte();
        if (n2 > 0) {
            bt.s = bpArray2.b.readByte();
            bp[] bpArray = new bp[n2];
            int n3 = 1;
            for (int i2 = 0; i2 < n2; ++i2) {
                bpArray[i2] = new bp();
                bpArray[i2].a(com.yinhan.kjava.main.a.e, bpArray2.b);
                if (bpArray[i2].s == 1) {
                    bpArray[i2].a = 0;
                    continue;
                }
                bpArray[i2].a = (byte)n3;
                n3 = (byte)(n3 + 1);
            }
            bp[] bpArray2 = bpArray;
            for (n2 = 0; n2 < bpArray2.length - 1; ++n2) {
                for (n3 = 0; n3 < bpArray2.length - 1; ++n3) {
                    bp bp2 = bpArray2[n3];
                    bp bp3 = bpArray2[n3 + 1];
                    if (bp3.a >= bp2.a) continue;
                    bpArray2[n3] = bp3;
                    bpArray2[n3 + 1] = bp2;
                }
            }
            if (com.yinhan.kjava.main.a.e != null) {
                com.yinhan.kjava.main.a.e.a(bpArray);
            }
            return;
        }
        if (com.yinhan.kjava.main.a.e != null) {
            com.yinhan.kjava.main.a.e.a((bp[])null);
        }
    }

    private void f() {
        byte by2 = this.b.readByte();
        if (bt.fl != null) {
            bt.v();
        }
        if (bt.fs != null) {
            bt.w();
        }
        bt.fw = null;
        bt.y();
        bt.z();
        bt.fg = 0L;
        bt.fn = 0L;
        com.yinhan.kjava.main.a.e.am = null;
        com.yinhan.kjava.main.a.e.al = null;
        if (ao.i()) {
            com.yinhan.kjava.main.a.f.a(com.yinhan.kjava.main.a.e.f, ao.h, ao.i, true, false, 0x202F2F);
            this.a.k = (short)7;
            this.a.j = (short)7;
            com.yinhan.kjava.main.a.e.k = 0;
            com.yinhan.kjava.main.a.e.j = 0;
        }
        if (by2 == 1) {
            this.a.b("\u4ea4\u6613\u6210\u529f!");
            return;
        }
        if (by2 == 0) {
            this.a.b("\u4ea4\u6613\u53d6\u6d88!");
            return;
        }
        if (by2 == -1) {
            this.a.b(this.b.readUTF());
        }
    }

    private static void c(DataInputStream dataInputStream) {
        bt.am(dataInputStream);
        com.yinhan.kjava.main.a.e.l((byte)1);
    }

    public final Vector a(aw aw2, Vector vector, bs bs2, bs bs3) {
        try {
            if (aw2 == null || vector == null || aw2.i == null) {
                return new Vector();
            }
            Vector vector2 = new Vector();
            boolean bl2 = false;
            vector.removeAllElements();
            vector.addElement(bs2);
            while (!vector.isEmpty()) {
                bs bs4 = q.a(vector, bs3);
                if (bs4.b(bs3)) {
                    bl2 = true;
                }
                if (bl2) {
                    vector2.removeAllElements();
                    vector2.addElement(bs3);
                    bs4 = q.a(vector, bs3);
                    while (!bs4.b(bs2)) {
                        bs4 = bs4.c;
                        vector2.addElement(bs4);
                    }
                    return vector2;
                }
                vector.removeElement(bs4);
                vector2.addElement(bs4);
                bs[] bsArray = new bs[]{new bs(bs4.a, bs4.b - 1), new bs(bs4.a, bs4.b + 1), new bs(bs4.a - 1, bs4.b), new bs(bs4.a + 1, bs4.b)};
                for (int i2 = 0; i2 < bsArray.length; ++i2) {
                    if (bsArray[i2].a == bs4.a && bsArray[i2].b == bs4.b || bsArray[i2].a < 0 || bsArray[i2].a >= aw2.a / 16 + (aw2.a % 16 == 0 ? 0 : 1) + 1 || bsArray[i2].b < 0 || bsArray[i2].b >= aw2.b / 16 + (aw2.b % 16 == 0 ? 0 : 1) + 1 || q.a(vector, bsArray[i2].a, bsArray[i2].b) || q.b(vector2, bsArray[i2].a, bsArray[i2].b) || com.yinhan.kjava.main.a.f.a(aw2, (bsArray[i2].a << 4) + 8, bsArray[i2].b << 4) != 0 || com.yinhan.kjava.main.a.f.a((bsArray[i2].a << 4) + 8, bsArray[i2].b << 4)) continue;
                    vector.addElement(new bs(bsArray[i2].a, bsArray[i2].b, bs4));
                }
            }
        }
        catch (Exception exception) {}
        return new Vector();
    }

    private static boolean a(Vector vector, int n2, int n3) {
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            if (n2 != ((bs)vector.elementAt((int)i2)).a || n3 != ((bs)vector.elementAt((int)i2)).b) continue;
            return true;
        }
        return false;
    }

    private static boolean b(Vector vector, int n2, int n3) {
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            if (n2 != ((bs)vector.elementAt((int)i2)).a || n3 != ((bs)vector.elementAt((int)i2)).b) continue;
            return true;
        }
        return false;
    }

    private static bs a(Vector vector, bs bs2) {
        bs bs3 = null;
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            bs bs4 = (bs)vector.elementAt(i2);
            if (bs3 != null && bs3.a(bs2) <= bs4.a(bs2)) continue;
            bs3 = bs4;
        }
        return bs3;
    }
}

