/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class bu {
    private String a;
    private String b;
    private Vector c = new Vector();
    private Vector d = new Vector();
    private aa[] e;

    public bu(String string, String string2) {
        this.a = string2;
        this.b = string;
        this.e();
    }

    public bu(String string, byte[] byArray) {
        this.a = string;
        this.b = "/" + this.a + "/";
        this.c(byArray);
    }

    public final Vector a() {
        return this.c;
    }

    public final short b() {
        return (short)this.c.size();
    }

    public final void c() {
        this.c.removeAllElements();
    }

    public final void a(int n2) {
        cf cf2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            cf2 = (cf)this.c.elementAt(i2);
            if (cf2.p == null || cf2.p.a != n2) continue;
            this.c.removeElement(cf2);
            return;
        }
    }

    public final boolean b(int n2) {
        cf cf2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            cf2 = (cf)this.c.elementAt(i2);
            if (cf2.p == null || cf2.p.a != n2) continue;
            return true;
        }
        return false;
    }

    public final bf a(String string) {
        if (string == null) {
            return null;
        }
        string = bu.b(string, (byte)0);
        int n2 = bu.a(string.toCharArray());
        bf bf2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!(this.c.elementAt(i2) instanceof bf)) continue;
            bf2 = (bf)this.c.elementAt(i2);
            if (bf2.p == null || bf2.p.a != n2) continue;
            return bf2;
        }
        return null;
    }

    private bf a(short s2, short s3, short s4, short s5) {
        bf bf2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!(this.c.elementAt(i2) instanceof bf)) continue;
            bf2 = (bf)this.c.elementAt(i2);
            if (bf2.p == null || bf2.p.b != s2 || bf2.e != s3 || bf2.f != s4 || bf2.g != s5) continue;
            return bf2;
        }
        return null;
    }

    public final bc b(String string) {
        string = bu.b(string, (byte)2);
        return this.a(bu.a(string.toCharArray()), (short)0, (short)0, (short)0);
    }

    public final bc a(String string, short s2, short s3, short s4) {
        string = bu.b(string, (byte)2);
        return this.a(bu.a(string.toCharArray()), s2, s3, s4);
    }

    public final bc c(int n2) {
        return this.a(n2, (short)0, (short)0, (short)0);
    }

    public final bc a(int n2, short s2, short s3, short s4) {
        bc bc2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!(this.c.elementAt(i2) instanceof bc)) continue;
            bc2 = (bc)this.c.elementAt(i2);
            if (bc2.p == null || bc2.p.a != n2 || bc2.a != s2 || bc2.b != s3 || bc2.c != s4) continue;
            return bc2;
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d() {
        int n2;
        Object object;
        Object object2 = null;
        boolean bl2 = false;
        Object object3 = null;
        object3 = null;
        object3 = this;
        object3 = object3.getClass().getResourceAsStream(((bu)object3).b + ((bu)object3).a + ".rpg");
        if (object3 == null) {
            object = null;
        } else {
            object3 = new DataInputStream((InputStream)object3);
            ((DataInputStream)object3).read(ai.d);
            object = object3;
        }
        object2 = object;
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            byte by2 = ((DataInputStream)object2).readByte();
            n2 = ((DataInputStream)object2).readByte();
            byte[][] byArrayArray = new byte[n2][];
            for (int i3 = 0; i3 < n2; ++i3) {
                int n3 = ((DataInputStream)object2).readInt();
                byArrayArray[i3] = new byte[n3];
                ((DataInputStream)object2).read(byArrayArray[i3]);
            }
            if (by2 == 0) {
                object3 = bu.a(byArrayArray, (short)0, (short)0, (short)0);
                bu.a(byArrayArray, (short)0, (short)0, (short)0).p = this.e[i2];
                this.c.addElement(object3);
                continue;
            }
            object3 = bu.b(byArrayArray, (short)0, (short)0, (short)0);
            bu.b(byArrayArray, (short)0, (short)0, (short)0).p = this.e[i2];
            this.c.addElement(object3);
        }
        cf cf2 = null;
        for (n2 = 0; n2 < this.c.size(); ++n2) {
            cf2 = (cf)this.c.elementAt(n2);
            if (cf2.o != 2) continue;
            this.a((bc)cf2, (short)0, (short)0, (short)0);
        }
        if (object2 == null) return;
        try {
            ((FilterInputStream)object2).close();
            return;
        }
        catch (IOException iOException) {
            object3 = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (Exception exception) {
            Exception exception2;
            try {
                exception2 = exception;
                exception.printStackTrace();
                if (object2 == null) return;
            }
            catch (Throwable throwable) {
                if (object2 == null) throw throwable;
                try {
                    ((FilterInputStream)object2).close();
                    throw throwable;
                }
                catch (IOException iOException) {
                    object2 = iOException;
                    iOException.printStackTrace();
                }
                throw throwable;
            }
            try {
                ((FilterInputStream)object2).close();
                return;
            }
            catch (IOException iOException) {
                exception2 = iOException;
                iOException.printStackTrace();
                return;
            }
        }
    }

    public final aw a(byte[] object) {
        aw aw2 = null;
        byte[][] byArray = bu.b(object);
        object = byArray;
        aw2 = bu.a(byArray);
        this.a(aw2);
        object = this.b(aw2);
        this.a((short[])object, (short[])null, (short[])null, (short[])null);
        this.c(aw2);
        return aw2;
    }

    /*
     * Loose catch block
     */
    public final aw c(String string) {
        FilterInputStream filterInputStream;
        Object object;
        Object object2;
        block22: {
            block21: {
                Object object3;
                int n2;
                block20: {
                    string = bu.b(string, (byte)3);
                    n2 = bu.a(string.toCharArray());
                    object2 = null;
                    int n3 = n2;
                    object2 = object5;
                    object = null;
                    for (int i2 = 0; i2 < ((bu)object2).c.size(); ++i2) {
                        object = (cf)((bu)object2).c.elementAt(i2);
                        if (((cf)object).o != 3 || ((cf)object).p == null || ((cf)object).p.a != n3) continue;
                        object3 = (aw)object;
                        break block20;
                    }
                    object3 = object2 = null;
                }
                if (object3 != null) {
                    return object2;
                }
                filterInputStream = null;
                object = null;
                object = ((bu)object5).d(n2);
                if (object != null) break block21;
                Object var1_4 = null;
                return null;
            }
            filterInputStream = ((bu)object5).a((aa)object);
            if (filterInputStream != null) break block22;
            Object var1_5 = null;
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
            return null;
        }
        Object object4 = bu.a((DataInputStream)filterInputStream, 0);
        object2 = bu.a(object4);
        filterInputStream.close();
        ((bu)object5).a((aw)object2);
        object4 = ((bu)object5).b((aw)object2);
        ((bu)object5).a((short[])object4, (short[])null, (short[])null, (short[])null);
        ((bu)object5).c((aw)object2);
        ((cf)object2).p = object;
        Object object5 = object2;
        try {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
        }
        catch (IOException iOException) {}
        return object5;
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (filterInputStream != null) {
                        filterInputStream.close();
                    }
                }
                catch (IOException iOException3) {}
                throw throwable;
            }
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
            }
            catch (IOException iOException4) {}
        }
        return null;
    }

    public final void d(String string) {
        this.b(string, (short)0, (short)0, (short)0);
    }

    public final void a(String[] objectArray) {
        objectArray = bu.a(objectArray, (byte)2);
        this.a((int[])objectArray, null, null, null);
    }

    public final void a(String[] objectArray, short[] sArray, short[] sArray2, short[] sArray3) {
        objectArray = bu.a(objectArray, (byte)2);
        this.a((int[])objectArray, sArray, sArray2, sArray3);
    }

    public final void a(Vector object, short[] sArray, short[] sArray2, short[] sArray3) {
        object = bu.a((Vector)object, (byte)2);
        this.a((int[])object, sArray, sArray2, sArray3);
    }

    private void a(int[] nArray, short[] sArray, short[] sArray2, short[] sArray3) {
        aa aa2 = null;
        short[] sArray4 = new short[nArray.length];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            aa2 = this.d(nArray[i2]);
            sArray4[i2] = aa2 != null ? aa2.b : (short)-1;
        }
        this.a(sArray4, sArray, sArray2, sArray3);
    }

    /*
     * Loose catch block
     */
    private void a(short[] object, short[] sArray, short[] sArray2, short[] sArray3) {
        int n2;
        boolean bl2 = true;
        short s2 = 0;
        short s3 = 0;
        short s4 = 0;
        if (sArray == null || sArray2 == null || sArray3 == null) {
            bl2 = false;
        }
        for (int i2 = 0; i2 < ((short[])object).length; ++i2) {
            s2 = bl2 ? sArray[i2] : (short)0;
            s3 = bl2 ? sArray2[i2] : (short)0;
            short s5 = s4 = bl2 ? sArray3[i2] : (short)0;
            if (object[i2] < 0) continue;
            if (this.c(object[i2], s2, s3, s4) != null) {
                object[i2] = -1;
                continue;
            }
            for (n2 = i2 + 1; n2 < ((short[])object).length; ++n2) {
                if (object[n2] < 0 || object[i2] != object[n2] || s2 != (bl2 ? sArray[n2] : (short)0) || s3 != (bl2 ? sArray2[n2] : (short)0) || s4 != (bl2 ? sArray3[n2] : (short)0)) continue;
                object[i2] = -1;
            }
        }
        Object var9_12 = null;
        for (n2 = 0; n2 < ((short[])object).length; ++n2) {
            s2 = bl2 ? sArray[n2] : (short)0;
            s3 = bl2 ? sArray2[n2] : (short)0;
            short s6 = s4 = bl2 ? sArray3[n2] : (short)0;
            if (object[n2] < 0 && s2 == 0 && s3 == 0 && s4 == 0) continue;
            bc bc2 = this.c(object[n2], s2, s3, s4);
            if (bc2 == null) {
                aa aa2;
                FilterInputStream filterInputStream;
                Object object2;
                short s7;
                short s8;
                block20: {
                    s8 = s4;
                    s7 = s3;
                    s4 = s2;
                    s3 = object[n2];
                    object2 = this;
                    filterInputStream = null;
                    aa2 = null;
                    aa2 = ((bu)object2).a(s3);
                    if (aa2 == null) continue;
                    filterInputStream = super.a(aa2);
                    if (filterInputStream != null) break block20;
                    try {
                        if (filterInputStream == null) continue;
                        filterInputStream.close();
                    }
                    catch (IOException iOException) {
                        object2 = iOException;
                        iOException.printStackTrace();
                    }
                    continue;
                }
                super.a(aa2, (DataInputStream)filterInputStream, s4, s7, s8);
                try {
                    if (filterInputStream == null) continue;
                    filterInputStream.close();
                }
                catch (IOException iOException) {
                    object2 = iOException;
                    iOException.printStackTrace();
                }
                continue;
                catch (IOException iOException) {
                    try {
                        object2 = iOException;
                        iOException.printStackTrace();
                    }
                    catch (Throwable throwable) {
                        try {
                            if (filterInputStream != null) {
                                filterInputStream.close();
                            }
                        }
                        catch (IOException iOException2) {
                            object = iOException2;
                            iOException2.printStackTrace();
                        }
                        throw throwable;
                    }
                    try {
                        if (filterInputStream == null) continue;
                        filterInputStream.close();
                    }
                    catch (IOException iOException3) {
                        object2 = iOException3;
                        iOException3.printStackTrace();
                    }
                    continue;
                }
            }
            bc2 = bc2.a(s2, s3, s4);
            this.c.addElement(bc2);
        }
    }

    /*
     * Loose catch block
     */
    public final void b(String string, short s2, short s3, short s4) {
        Object object;
        aa aa2;
        Object object2;
        block21: {
            cf cf2;
            int n2;
            block20: {
                n2 = bu.a(string, (byte)2);
                short s5 = s4;
                short s6 = s3;
                short s7 = s2;
                int n3 = n2;
                object2 = object;
                cf cf3 = null;
                cf3 = null;
                for (int i2 = 0; i2 < ((bu)object2).c.size(); ++i2) {
                    cf3 = (cf)((bu)object2).c.elementAt(i2);
                    if (cf3.o != 2 || cf3.p == null || cf3.p.a != n3) continue;
                    cf3 = (bc)cf3;
                    if (((bc)cf3).a != s7 || ((bc)cf3).b != s6 || ((bc)cf3).c != s5) continue;
                    cf2 = cf3;
                    break block20;
                }
                cf2 = null;
            }
            if (cf2 != null) {
                return;
            }
            object2 = null;
            aa2 = null;
            aa2 = ((bu)object).d(n2);
            if (aa2 == null) {
                return;
            }
            object2 = super.a(aa2);
            if (object2 != null) break block21;
            try {
                if (object2 != null) {
                    ((FilterInputStream)object2).close();
                }
                return;
            }
            catch (IOException iOException) {
                object = iOException;
                iOException.printStackTrace();
                return;
            }
        }
        super.a(aa2, (DataInputStream)object2, s2, s3, s4);
        try {
            if (object2 != null) {
                ((FilterInputStream)object2).close();
            }
            return;
        }
        catch (IOException iOException) {
            object = iOException;
            iOException.printStackTrace();
            return;
        }
        catch (IOException iOException) {
            try {
                object = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (object2 != null) {
                        ((FilterInputStream)object2).close();
                    }
                }
                catch (IOException iOException2) {
                    IOException iOException3 = iOException2;
                    iOException2.printStackTrace();
                }
                throw throwable;
            }
            try {
                if (object2 != null) {
                    ((FilterInputStream)object2).close();
                }
                return;
            }
            catch (IOException iOException4) {
                object = iOException4;
                iOException4.printStackTrace();
                return;
            }
        }
    }

    private void a(aa aa2, DataInputStream object, short s2, short s3, short s4) {
        Object object2;
        byte[][] byArray = bu.a((DataInputStream)object, 0);
        object = byArray;
        object = bu.b(byArray, s2, s3, s4);
        short s5 = s4;
        short s6 = s3;
        short s7 = s2;
        Object object3 = object;
        bu bu2 = this;
        Object object4 = object3;
        object3 = bu2;
        bu2.d.removeAllElements();
        if (object4 == null || ((bc)object4).k == null) {
            object2 = null;
        } else {
            int n2;
            String string = null;
            for (int i2 = 0; i2 < ((bc)object4).k.length; ++i2) {
                if (((bc)object4).k[i2] == null) continue;
                for (n2 = 0; n2 < ((bc)object4).k[i2].length; ++n2) {
                    if (((bc)object4).k[i2][n2] == null || ((bu)object3).d.contains(string = String.valueOf(((bc)object4).k[i2][n2].b))) continue;
                    ((bu)object3).d.addElement(string);
                }
            }
            short[] sArray = new short[((bu)object3).d.size()];
            for (n2 = 0; n2 < ((bu)object3).d.size(); ++n2) {
                sArray[n2] = Short.parseShort((String)((bu)object3).d.elementAt(n2));
            }
            ((bu)object3).d.removeAllElements();
            object3 = sArray;
            object2 = object3;
        }
        if (object2 != null) {
            int n3;
            for (n3 = 0; n3 < ((Object)object3).length; ++n3) {
                if (object3[n3] < 0) continue;
                if (bu2.d((short)object3[n3], s7, s6, s5) != null) {
                    object3[n3] = -1;
                    continue;
                }
                for (int i3 = n3 + 1; i3 < ((Object)object3).length; ++i3) {
                    if (object3[i3] < 0 || object3[n3] != object3[i3]) continue;
                    object3[n3] = -1;
                }
            }
            for (n3 = 0; n3 < ((Object)object3).length; ++n3) {
                if (object3[n3] < 0) continue;
                bu2.b((short)object3[n3], s7, s6, s5);
            }
        }
        this.a((bc)object, s2, s3, s4);
        ((cf)object).p = aa2;
        this.c.addElement(object);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void e(String string) {
        DataInputStream dataInputStream;
        Object object;
        Object object2;
        block15: {
            cf cf2;
            int n2;
            block14: {
                boolean bl2 = false;
                bl2 = false;
                bl2 = false;
                object2 = this;
                n2 = bu.a(string, (byte)0);
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                int n6 = n2;
                object = object2;
                cf cf3 = null;
                cf3 = null;
                for (int i2 = 0; i2 < ((bu)object).c.size(); ++i2) {
                    cf3 = (cf)((bu)object).c.elementAt(i2);
                    if (cf3.o != 0 || cf3.p == null || cf3.p.a != n6) continue;
                    cf3 = (bf)cf3;
                    if (((bf)cf3).e != n5 || ((bf)cf3).f != n4 || ((bf)cf3).g != n3) continue;
                    cf2 = cf3;
                    break block14;
                }
                cf2 = null;
            }
            if (cf2 != null) return;
            object = null;
            object = ((bu)object2).d(n2);
            if (object == null) return;
            dataInputStream = null;
            dataInputStream = ((bu)object2).a((aa)object);
            if (dataInputStream != null) break block15;
            try {
                if (dataInputStream == null) return;
                dataInputStream.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
        super.b((aa)object, dataInputStream, (short)0, (short)0, (short)0);
        try {
            if (dataInputStream == null) return;
            dataInputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (IOException iOException) {
            try {
                object2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (dataInputStream == null) throw throwable;
                    dataInputStream.close();
                    throw throwable;
                }
                catch (IOException iOException2) {}
                throw throwable;
            }
            try {
                if (dataInputStream == null) return;
                dataInputStream.close();
                return;
            }
            catch (IOException iOException3) {
                return;
            }
        }
    }

    public final void b(Vector object, short[] object2, short[] sArray, short[] sArray2) {
        int n2;
        object = bu.a((Vector)object, (byte)0);
        object2 = null;
        sArray = new short[((Object)object).length];
        for (int i2 = 0; i2 < ((Object)object).length; ++i2) {
            aa aa2 = this.d((int)object[i2]);
            object2 = aa2;
            sArray[i2] = aa2 != null ? object2.b : (short)-1;
        }
        short[] sArray3 = sArray;
        Object var4_6 = null;
        sArray = null;
        object2 = null;
        object = sArray3;
        boolean bl2 = true;
        short s2 = 0;
        short s3 = 0;
        short s4 = 0;
        if (object2 == null || sArray == null || var4_6 == null) {
            bl2 = false;
        }
        for (n2 = 0; n2 < ((Object)object).length; ++n2) {
            s2 = bl2 ? object2[n2] : (short)0;
            s3 = bl2 ? sArray[n2] : (short)0;
            short s5 = s4 = bl2 ? var4_6[n2] : (short)0;
            if (object[n2] < 0) continue;
            if (this.d((short)object[n2], s2, s3, s4) != null) {
                object[n2] = -1;
                continue;
            }
            for (int i3 = n2 + 1; i3 < ((Object)object).length; ++i3) {
                if (object[i3] < 0 || object[n2] != object[i3] || s2 != (bl2 ? object2[i3] : (short)0) || s3 != (bl2 ? sArray[i3] : (short)0) || s4 != (bl2 ? var4_6[i3] : (short)0)) continue;
                object[n2] = -1;
            }
        }
        for (n2 = 0; n2 < ((Object)object).length; ++n2) {
            if (object[n2] < 0) continue;
            this.b((short)object[n2], bl2 ? object2[n2] : (short)0, bl2 ? sArray[n2] : (short)0, bl2 ? var4_6[n2] : (short)0);
        }
    }

    private void a(aw aw2) {
        int n2;
        int n3;
        int n4;
        aw aw3 = aw2;
        Object object = this;
        ((bu)object).d.removeAllElements();
        String string = null;
        if (aw3.j != null) {
            for (n4 = 0; n4 < aw3.j.length; ++n4) {
                for (n3 = 0; n3 < aw3.j[n4].length; ++n3) {
                    if (aw3.j[n4][n3] == null || ((bu)object).d.contains(string = String.valueOf(aw3.j[n4][n3].b))) continue;
                    ((bu)object).d.addElement(string);
                }
            }
        }
        if (aw3.k != null) {
            for (n4 = 0; n4 < aw3.k.length; ++n4) {
                if (aw3.k[n4] == null || ((bu)object).d.contains(string = String.valueOf(aw3.k[n4].b))) continue;
                ((bu)object).d.addElement(string);
            }
        }
        if (aw3.l != null) {
            for (n4 = 0; n4 < aw3.l.length; ++n4) {
                if (aw3.l[n4] == null || aw3.l[n4].c != 0 || ((bu)object).d.contains(string = String.valueOf(aw3.l[n4].b))) continue;
                ((bu)object).d.addElement(string);
            }
        }
        short[] sArray = new short[((bu)object).d.size()];
        for (n3 = 0; n3 < ((bu)object).d.size(); ++n3) {
            sArray[n3] = Short.parseShort((String)((bu)object).d.elementAt(n3));
        }
        ((bu)object).d.removeAllElements();
        object = sArray;
        int n5 = 0;
        for (n2 = 0; n2 < ((Object)object).length; ++n2) {
            if (object[n2] < 0) continue;
            n5 = aw2.a((int)object[n2]);
            if (this.d((short)object[n2], n5 < 0 ? (short)0 : aw2.m[n5][1], n5 < 0 ? (short)0 : aw2.m[n5][2], n5 < 0 ? (short)0 : aw2.m[n5][3]) != null) {
                object[n2] = -1;
                continue;
            }
            for (n5 = n2 + 1; n5 < ((Object)object).length; ++n5) {
                if (object[n5] < 0 || object[n2] != object[n5]) continue;
                object[n2] = -1;
            }
        }
        for (n2 = 0; n2 < ((Object)object).length; ++n2) {
            if (object[n2] < 0) continue;
            n5 = aw2.a((int)object[n2]);
            if (n5 >= 0) {
                this.b((short)object[n2], aw2.m[n5][1], aw2.m[n5][2], aw2.m[n5][3]);
                continue;
            }
            this.b((short)object[n2], (short)0, (short)0, (short)0);
        }
    }

    /*
     * Loose catch block
     */
    private void b(short s2, short s3, short s4, short s5) {
        FilterInputStream filterInputStream;
        aa aa2;
        block19: {
            if (((bu)((Object)iOException2)).d(s2, s3, s4, s5) != null) {
                return;
            }
            aa2 = null;
            filterInputStream = null;
            aa2 = ((bu)((Object)iOException2)).a(s2);
            if (aa2 == null) {
                return;
            }
            filterInputStream = super.a(aa2);
            if (filterInputStream != null) break block19;
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
        super.b(aa2, (DataInputStream)filterInputStream, s3, s4, s5);
        try {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (filterInputStream != null) {
                        filterInputStream.close();
                    }
                }
                catch (IOException iOException3) {}
                throw throwable;
            }
            try {
                if (filterInputStream != null) {
                    filterInputStream.close();
                }
                return;
            }
            catch (IOException iOException4) {
                return;
            }
        }
    }

    private void b(aa aa2, DataInputStream object, short s2, short s3, short s4) {
        byte[][] byArray = bu.a((DataInputStream)object, 0);
        object = byArray;
        object = bu.a(byArray, s2, s3, s4);
        bu.a(byArray, s2, s3, s4).p = aa2;
        this.c.addElement(object);
    }

    /*
     * Loose catch block
     */
    private static bf a(byte[][] byArray, short s2, short s3, short s4) {
        bf bf2;
        block14: {
            bf2 = new bf(s2, s3, s4);
            boolean bl2 = true;
            byte[][] byArray2 = byArray;
            bf bf3 = bf2;
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray2[1]));
            bf3.b = (short)dataInputStream.readInt();
            bf3.c = (short)dataInputStream.readInt();
            if (byArray2[0] != null && byArray2[0].length > 4) {
                dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray2[0], 2, byArray2[0].length - 2));
                int n2 = dataInputStream.readByte();
                bf3.d = new aj[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    aj aj2;
                    bf3.d[i2] = aj2 = new aj(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                }
                if (n2 == 0) {
                    bf3.d = new aj[1];
                    bf3.d[0] = new aj(0, 0, bf3.b, bf3.c);
                }
                dataInputStream.close();
            } else {
                bf3.d = new aj[1];
                bf3.d[0] = new aj(0, 0, bf3.b, bf3.c);
            }
            dataInputStream.close();
            bf3.a(byArray2, true);
            try {
                dataInputStream.close();
            }
            catch (IOException iOException) {}
            break block14;
            catch (IOException iOException) {
                try {
                    IOException iOException2 = iOException;
                    iOException.printStackTrace();
                }
                catch (Throwable throwable) {
                    try {
                        dataInputStream.close();
                    }
                    catch (IOException iOException3) {}
                    throw throwable;
                }
                try {
                    dataInputStream.close();
                }
                catch (IOException iOException4) {}
            }
        }
        return bf2;
    }

    private static bc b(byte[][] byArray, short s2, short s3, short s4) {
        bc bc2 = new bc(s2, s3, s4);
        bc2.a(byArray);
        return bc2;
    }

    /*
     * Loose catch block
     */
    private static aw a(byte[][] object) {
        Object object2;
        block18: {
            Object object3;
            block17: {
                int n2;
                int n3;
                object2 = new aw();
                object3 = object;
                object = object2;
                object3 = object3[0];
                object = object2;
                object3 = new DataInputStream(new ByteArrayInputStream((byte[])object3));
                object.m = new short[((DataInputStream)object3).readByte()][4];
                for (n3 = 0; n3 < object.m.length; ++n3) {
                    object.m[n3][0] = ((DataInputStream)object3).readShort();
                    object.m[n3][1] = ((DataInputStream)object3).readShort();
                    object.m[n3][2] = ((DataInputStream)object3).readShort();
                    object.m[n3][3] = ((DataInputStream)object3).readShort();
                }
                object.a = ((DataInputStream)object3).readShort();
                object.b = ((DataInputStream)object3).readShort();
                object.c = ((DataInputStream)object3).readByte();
                object.d = ((DataInputStream)object3).readByte();
                object.e = ((DataInputStream)object3).readByte();
                object.f = ((DataInputStream)object3).readByte();
                object.g = (byte)(object.a / object.c + (object.a % object.c == 0 ? 0 : 1));
                object.h = (byte)(object.b / object.d + (object.b % object.d == 0 ? 0 : 1));
                n3 = object.a / object.e + (object.a % object.e == 0 ? 0 : 1);
                int n4 = object.b / object.f + (object.b % object.f == 0 ? 0 : 1);
                object.i = new byte[n3][n4];
                short s2 = ((DataInputStream)object3).readShort();
                n4 = s2;
                short[] sArray = new short[s2];
                for (n2 = 0; n2 < n4; ++n2) {
                    sArray[n2] = ((DataInputStream)object3).readShort();
                    object.i[sArray[n2] % n3][sArray[n2] / n3] = 1;
                }
                object.j = new bx[object.g][object.h];
                for (n2 = 0; n2 < object.j.length; ++n2) {
                    for (n3 = 0; n3 < object.j[n2].length; ++n3) {
                        byte by2 = ((DataInputStream)object3).readByte();
                        n4 = by2;
                        if (by2 < 0) continue;
                        object.j[n2][n3] = new bx();
                        object.j[n2][n3].a((DataInputStream)object3, true);
                    }
                }
                short s3 = ((DataInputStream)object3).readShort();
                n2 = s3;
                if (s3 > 0) {
                    object.k = new bx[n2];
                    for (n3 = 0; n3 < n2; ++n3) {
                        object.k[n3] = new bx();
                        object.k[n3].a((DataInputStream)object3, true);
                    }
                }
                short s4 = ((DataInputStream)object3).readShort();
                n2 = s4;
                if (s4 <= 0) break block17;
                object.l = new bx[n2];
                for (n3 = 0; n3 < n2; ++n3) {
                    object.l[n3] = new bx();
                    object.l[n3].a((DataInputStream)object3, true);
                }
            }
            try {
                ((FilterInputStream)object3).close();
            }
            catch (IOException iOException) {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            break block18;
            catch (IOException iOException) {
                try {
                    IOException iOException3 = iOException;
                    iOException.printStackTrace();
                }
                catch (Throwable throwable) {
                    try {
                        ((FilterInputStream)object3).close();
                    }
                    catch (IOException iOException4) {
                        object2 = iOException4;
                        iOException4.printStackTrace();
                    }
                    throw throwable;
                }
                try {
                    ((FilterInputStream)object3).close();
                }
                catch (IOException iOException5) {
                    IOException iOException6 = iOException5;
                    iOException5.printStackTrace();
                }
            }
        }
        return object2;
    }

    private static byte[][] a(DataInputStream dataInputStream, int n2) {
        dataInputStream.skipBytes(0);
        dataInputStream.readShort();
        dataInputStream.readByte();
        byte by2 = dataInputStream.readByte();
        n2 = by2;
        byte[][] byArrayArray = new byte[by2][];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = dataInputStream.readInt();
            byArrayArray[i2] = new byte[n3];
            dataInputStream.read(byArrayArray[i2]);
        }
        return byArrayArray;
    }

    /*
     * Loose catch block
     */
    private static byte[][] b(byte[] object) {
        byte[][] byArrayArray;
        block11: {
            object = new ByteArrayInputStream((byte[])object);
            object = new DataInputStream((InputStream)object);
            byArrayArray = null;
            ((DataInputStream)object).readShort();
            ((DataInputStream)object).readByte();
            int n2 = ((DataInputStream)object).readByte();
            byArrayArray = new byte[n2][];
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = ((DataInputStream)object).readInt();
                byArrayArray[i2] = new byte[n3];
                ((DataInputStream)object).read(byArrayArray[i2]);
            }
            try {
                ((FilterInputStream)object).close();
            }
            catch (IOException iOException) {}
            break block11;
            catch (IOException iOException) {
                try {
                    IOException iOException2 = iOException;
                    iOException.printStackTrace();
                }
                catch (Throwable throwable) {
                    try {
                        ((FilterInputStream)object).close();
                    }
                    catch (IOException iOException3) {}
                    throw throwable;
                }
                try {
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException4) {}
            }
        }
        return byArrayArray;
    }

    private DataInputStream a(aa aa2) {
        Object object;
        byte[] byArray = null;
        if (this.a.equals(bt.kX) && bt.kY != null) {
            object = null;
            for (int n2 = 0; n2 < bt.kY.size(); n2 = (int)((short)(n2 + 1))) {
                object = (g)bt.kY.elementAt(n2);
                if (((g)object).a != aa2.a) continue;
                byArray = ((g)object).b;
                break;
            }
        } else {
            this.a.equals(null);
        }
        object = null;
        if (byArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            object = new DataInputStream(byteArrayInputStream);
        } else {
            InputStream inputStream = null;
            if (this.a.equals(bt.kX) && (inputStream = this.getClass().getResourceAsStream(this.b + aa2.a + ".rpg")) != null) {
                object = new DataInputStream(inputStream);
            }
            if (object == null) {
                inputStream = this.getClass().getResourceAsStream(this.b + aa2.b + ".rpg");
                if (inputStream == null) {
                    return null;
                }
                object = new DataInputStream(inputStream);
            }
        }
        return object;
    }

    private aa d(int n2) {
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.e[i2] == null || this.e[i2].a != n2) continue;
            return this.e[i2];
        }
        return null;
    }

    private aa a(short s2) {
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.e[i2] == null || this.e[i2].b != s2) continue;
            return this.e[i2];
        }
        return null;
    }

    /*
     * Loose catch block
     */
    private void c(byte[] object) {
        object = new ByteArrayInputStream((byte[])object);
        object = new DataInputStream((InputStream)object);
        int n2 = ((DataInputStream)object).readShort();
        this.e = new aa[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.e[i2] = new aa(((DataInputStream)object).readInt(), ((DataInputStream)object).readShort());
        }
        try {
            ((FilterInputStream)object).close();
            ((FilterInputStream)object).close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    ((FilterInputStream)object).close();
                    ((FilterInputStream)object).close();
                }
                catch (IOException iOException3) {}
                throw throwable;
            }
            try {
                ((FilterInputStream)object).close();
                ((FilterInputStream)object).close();
                return;
            }
            catch (IOException iOException4) {
                return;
            }
        }
    }

    /*
     * Loose catch block
     */
    private void e() {
        InputStream inputStream = this.getClass().getResourceAsStream("/" + this.a + ".rule");
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int n2 = dataInputStream.readShort();
        this.e = new aa[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.e[i2] = new aa(dataInputStream.readInt(), dataInputStream.readShort());
        }
        try {
            if (inputStream != null) {
                inputStream.close();
            }
            dataInputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = iOException;
                iOException.printStackTrace();
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    dataInputStream.close();
                }
                catch (IOException iOException3) {}
                throw throwable;
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                dataInputStream.close();
                return;
            }
            catch (IOException iOException4) {
                return;
            }
        }
    }

    private short[] b(aw aw2) {
        this.d.removeAllElements();
        String string = null;
        if (aw2.l != null) {
            for (int i2 = 0; i2 < aw2.l.length; ++i2) {
                if (aw2.l[i2] == null || aw2.l[i2].c != 2 || this.d.contains(string = String.valueOf(aw2.l[i2].b))) continue;
                this.d.addElement(string);
            }
        }
        short[] sArray = new short[this.d.size()];
        for (int i3 = 0; i3 < this.d.size(); ++i3) {
            sArray[i3] = Short.parseShort((String)this.d.elementAt(i3));
        }
        this.d.removeAllElements();
        return sArray;
    }

    private void a(bc bc2, short s2, short s3, short s4) {
        if (bc2.k == null) {
            return;
        }
        if (bc2.g == null || bc2.h == null) {
            bc2.g = new short[bc2.k.length];
            bc2.h = new short[bc2.k.length];
            if (bc2.k == null) {
                return;
            }
            for (int i2 = 0; i2 < bc2.k.length; ++i2) {
                if (bc2.k[i2] == null) continue;
                for (int i3 = 0; i3 < bc2.k[i2].length; ++i3) {
                    if (bc2.k[i2][i3] == null || bc2.k[i2][i3].a != null) continue;
                    bc2.k[i2][i3].a = this.a(bc2.k[i2][i3].b, s2, s3, s4);
                }
                int n2 = i2;
                bx[] bxArray = bc2.k[i2];
                bc bc3 = bc2;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                Object object = null;
                object = null;
                if (bxArray == null) continue;
                if (bxArray.length > 0 && bxArray[0].a != null) {
                    if (bxArray[0].a.o == 0) {
                        object = (bf)bxArray[0].a;
                        object = ((bf)object).a(bxArray[0].d);
                    }
                    n3 = bxArray[0].e;
                    n4 = bxArray[0].f;
                    n5 = bxArray[0].e + (object == null ? (short)0 : ((aj)object).c);
                    n6 = bxArray[0].f + (object == null ? (short)0 : ((aj)object).d);
                }
                bx bx2 = null;
                for (int i4 = 0; i4 < bxArray.length; ++i4) {
                    bx2 = bxArray[i4];
                    if (bxArray[0].a != null && bxArray[0].a.o == 0) {
                        object = (bf)bx2.a;
                        object = ((bf)object).a(bx2.d);
                    }
                    n3 = Math.min(bx2.e, n3);
                    n4 = Math.min(n4, bx2.f);
                    n5 = Math.max(n5, bx2.e + (object == null ? (short)0 : ((aj)object).c));
                    n6 = Math.max(n6, bx2.f + (object == null ? (short)0 : ((aj)object).d));
                }
                bc3.g[n2] = (short)Math.abs(n5 - n3);
                bc3.h[n2] = (short)Math.abs(n6 - n4);
            }
            if (bc2.g != null) {
                bc2.i = (byte)(bc2.g[0] / 2);
                bc2.j = (byte)bc2.h[0];
            }
        }
    }

    private void c(aw aw2) {
        int n2;
        int n3;
        short s2 = 0;
        if (aw2.j != null) {
            for (n3 = 0; n3 < aw2.j.length; ++n3) {
                for (n2 = 0; n2 < aw2.j[n3].length; ++n2) {
                    if (aw2.j[n3][n2] == null) continue;
                    s2 = aw2.a(aw2.j[n3][n2].b);
                    aw2.j[n3][n2].a = s2 != -1 ? this.a(aw2.j[n3][n2].b, aw2.m[s2][1], aw2.m[s2][2], aw2.m[s2][3]) : this.a(aw2.j[n3][n2].b, (short)0, (short)0, (short)0);
                }
            }
        }
        if (aw2.k != null) {
            for (n3 = 0; n3 < aw2.k.length; ++n3) {
                if (aw2.k[n3] == null) continue;
                s2 = aw2.a(aw2.k[n3].b);
                aw2.k[n3].a = s2 != -1 ? this.a(aw2.k[n3].b, aw2.m[s2][1], aw2.m[s2][2], aw2.m[s2][3]) : this.a(aw2.k[n3].b, (short)0, (short)0, (short)0);
            }
        }
        if (aw2.l != null) {
            for (n3 = 0; n3 < aw2.l.length; ++n3) {
                cf cf2;
                block12: {
                    bx bx2;
                    if (aw2.l[n3] == null) continue;
                    if (aw2.l[n3].c == 0) {
                        s2 = aw2.a(aw2.l[n3].b);
                        if (s2 != -1) {
                            bx2 = aw2.l[n3];
                            cf2 = this.a(aw2.l[n3].b, aw2.m[s2][1], aw2.m[s2][2], aw2.m[s2][3]);
                        } else {
                            bx2 = aw2.l[n3];
                            cf2 = this.a(aw2.l[n3].b, (short)0, (short)0, (short)0);
                        }
                    } else {
                        if (aw2.l[n3].c != 2) continue;
                        bx2 = aw2.l[n3];
                        n2 = aw2.l[n3].b;
                        bu bu2 = this;
                        bc bc2 = null;
                        for (int i2 = 0; i2 < bu2.c.size(); ++i2) {
                            if (!(bu2.c.elementAt(i2) instanceof bc)) continue;
                            bc2 = (bc)bu2.c.elementAt(i2);
                            if (bc2.p == null || bc2.p.b != n2) continue;
                            cf2 = bc2;
                            break block12;
                        }
                        t.a("no resource " + n2);
                        cf2 = null;
                    }
                }
                bx2.a = cf2;
            }
        }
    }

    private bc c(short s2, short s3, short s4, short s5) {
        cf cf2 = null;
        cf2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            cf2 = (cf)this.c.elementAt(i2);
            if (cf2.o != 2 || cf2.p == null || cf2.p.b != s2) continue;
            cf2 = (bc)cf2;
            if (((bc)cf2).a != s3 || ((bc)cf2).b != s4 || ((bc)cf2).c != s5) continue;
            return cf2;
        }
        return null;
    }

    private bf d(short s2, short s3, short s4, short s5) {
        cf cf2 = null;
        cf2 = null;
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            cf2 = (cf)this.c.elementAt(i2);
            if (cf2.o != 0 || cf2.p == null || cf2.p.b != s2) continue;
            cf2 = (bf)cf2;
            if (((bf)cf2).e != s3 || ((bf)cf2).f != s4 || ((bf)cf2).g != s5) continue;
            return cf2;
        }
        return null;
    }

    private static int[] a(Vector vector, byte by2) {
        int[] nArray = new int[vector.size()];
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            nArray[i2] = bu.a((String)vector.elementAt(i2), by2);
        }
        return nArray;
    }

    private static int[] a(String[] stringArray, byte by2) {
        int[] nArray = new int[stringArray.length];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            nArray[i2] = stringArray[i2].equals("") ? -1 : bu.a(stringArray[i2], (byte)2);
        }
        return nArray;
    }

    public static int a(char[] cArray) {
        int n2 = cArray.length;
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n4 = n4 * 31 + cArray[n3++];
        }
        return n4;
    }

    public static int a(String string, byte by2) {
        string = bu.b(string, by2);
        return bu.a(string.toCharArray());
    }

    public static String b(String string, byte by2) {
        if (by2 == 0) {
            string = string + "p";
        } else if (by2 == 2) {
            string = string + "s";
        } else if (by2 == 3) {
            string = string + "m";
        }
        return string;
    }
}

