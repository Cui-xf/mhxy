package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Vector;

/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-8105993946875401281/classes.dex */
public final class bu {
    private String a;
    private String b;
    private Vector c = new Vector();
    private Vector d = new Vector();
    private aa[] e;

    public bu(String str, String str2) throws IOException {
        this.a = str2;
        this.b = str;
        e();
    }

    public bu(String str, byte[] bArr) {
        this.a = str;
        this.b = new StringBuffer().append("/").append(this.a).append("/").toString();
        c(bArr);
    }

    public static int a(String str, byte b) {
        return a(b(str, b).toCharArray());
    }

    public static int a(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            i++;
            i2 = (i2 * 31) + cArr[i3];
            i3++;
        }
        return i2;
    }

    private aa a(short s) {
        for (int i = 0; i < this.e.length; i++) {
            if (this.e[i] != null && this.e[i].b == s) {
                return this.e[i];
            }
        }
        return null;
    }

    private static aw a(byte[][] bArr) {
        aw awVar = new aw();
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0]));
        try {
            try {
                awVar.m = (short[][]) Array.newInstance((Class<?>) Short.TYPE, dataInputStream.readByte(), 4);
                for (int i = 0; i < awVar.m.length; i++) {
                    awVar.m[i][0] = dataInputStream.readShort();
                    awVar.m[i][1] = dataInputStream.readShort();
                    awVar.m[i][2] = dataInputStream.readShort();
                    awVar.m[i][3] = dataInputStream.readShort();
                }
                awVar.a = dataInputStream.readShort();
                awVar.b = dataInputStream.readShort();
                awVar.c = dataInputStream.readByte();
                awVar.d = dataInputStream.readByte();
                awVar.e = dataInputStream.readByte();
                awVar.f = dataInputStream.readByte();
                awVar.g = (byte) ((awVar.a % awVar.c == 0 ? 0 : 1) + (awVar.a / awVar.c));
                awVar.h = (byte) ((awVar.b % awVar.d == 0 ? 0 : 1) + (awVar.b / awVar.d));
                int i2 = (awVar.a / awVar.e) + (awVar.a % awVar.e == 0 ? 0 : 1);
                awVar.i = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, (awVar.b % awVar.f == 0 ? 0 : 1) + (awVar.b / awVar.f));
                int i3 = dataInputStream.readShort();
                short[] sArr = new short[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    sArr[i4] = dataInputStream.readShort();
                    awVar.i[sArr[i4] % i2][sArr[i4] / i2] = 1;
                }
                awVar.j = (bx[][]) Array.newInstance((Class<?>) bx.class, awVar.g, awVar.h);
                for (int i5 = 0; i5 < awVar.j.length; i5++) {
                    for (int i6 = 0; i6 < awVar.j[i5].length; i6++) {
                        if (dataInputStream.readByte() >= 0) {
                            awVar.j[i5][i6] = new bx();
                            awVar.j[i5][i6].a(dataInputStream, true);
                        }
                    }
                }
                int i7 = dataInputStream.readShort();
                if (i7 > 0) {
                    awVar.k = new bx[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        awVar.k[i8] = new bx();
                        awVar.k[i8].a(dataInputStream, true);
                    }
                }
                int i9 = dataInputStream.readShort();
                if (i9 > 0) {
                    awVar.l = new bx[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        awVar.l[i10] = new bx();
                        awVar.l[i10].a(dataInputStream, true);
                    }
                }
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                    dataInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            return awVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    private bf a(short s, short s2, short s3, short s4) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return null;
            }
            if (this.c.elementAt(i2) instanceof bf) {
                bf bfVar = (bf) this.c.elementAt(i2);
                if (bfVar.p != null && bfVar.p.b == s && bfVar.e == s2 && bfVar.f == s3 && bfVar.g == s4) {
                    return bfVar;
                }
            }
            i = i2 + 1;
        }
    }

    private static bf a(byte[][] bArr, short s, short s2, short s3) throws Throwable {
        DataInputStream dataInputStream;
        bf bfVar = new bf(s, s2, s3);
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr[1]));
        try {
            bfVar.b = (short) dataInputStream2.readInt();
            bfVar.c = (short) dataInputStream2.readInt();
            if (bArr[0] == null || bArr[0].length <= 4) {
                bfVar.d = new aj[1];
                bfVar.d[0] = new aj((short) 0, (short) 0, bfVar.b, bfVar.c);
                dataInputStream = dataInputStream2;
            } else {
                dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0], 2, bArr[0].length - 2));
                try {
                    try {
                        int i = dataInputStream.readByte();
                        bfVar.d = new aj[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            bfVar.d[i2] = new aj(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                        }
                        if (i == 0) {
                            bfVar.d = new aj[1];
                            bfVar.d[0] = new aj((short) 0, (short) 0, bfVar.b, bfVar.c);
                        }
                        dataInputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        try {
                            dataInputStream.close();
                        } catch (IOException e) {
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    try {
                        dataInputStream.close();
                    } catch (IOException e3) {
                    }
                    return bfVar;
                }
            }
            dataInputStream.close();
            bfVar.a(bArr, true);
            try {
                dataInputStream.close();
            } catch (IOException e4) {
            }
        } catch (IOException e5) {
            e = e5;
            dataInputStream = dataInputStream2;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = dataInputStream2;
            dataInputStream.close();
            throw th;
        }
        return bfVar;
    }

    private DataInputStream a(aa aaVar) {
        byte[] bArr;
        InputStream resourceAsStream;
        if (this.a.equals(bt.kX) && bt.kY != null) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= bt.kY.size()) {
                    bArr = null;
                    break;
                }
                g gVar = (g) bt.kY.elementAt(s2);
                if (gVar.a == aaVar.a) {
                    bArr = gVar.b;
                    break;
                }
                s = (short) (s2 + 1);
            }
        } else {
            this.a.equals(null);
            bArr = null;
        }
        if (bArr != null) {
            return new DataInputStream(new ByteArrayInputStream(bArr));
        }
        DataInputStream dataInputStream = (!this.a.equals(bt.kX) || (resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append(this.b).append(aaVar.a).append(".rpg").toString())) == null) ? null : new DataInputStream(resourceAsStream);
        if (dataInputStream != null) {
            return dataInputStream;
        }
        InputStream resourceAsStream2 = getClass().getResourceAsStream(new StringBuffer().append(this.b).append((int) aaVar.b).append(".rpg").toString());
        if (resourceAsStream2 == null) {
            return null;
        }
        return new DataInputStream(resourceAsStream2);
    }

    private void a(aa aaVar, DataInputStream dataInputStream, short s, short s2, short s3) {
        short[] sArr;
        bc bcVarB = b(a(dataInputStream, 0), s, s2, s3);
        this.d.removeAllElements();
        if (bcVarB == null || bcVarB.k == null) {
            sArr = null;
        } else {
            for (int i = 0; i < bcVarB.k.length; i++) {
                if (bcVarB.k[i] != null) {
                    for (int i2 = 0; i2 < bcVarB.k[i].length; i2++) {
                        if (bcVarB.k[i][i2] != null) {
                            String strValueOf = String.valueOf((int) bcVarB.k[i][i2].b);
                            if (!this.d.contains(strValueOf)) {
                                this.d.addElement(strValueOf);
                            }
                        }
                    }
                }
            }
            sArr = new short[this.d.size()];
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                sArr[i3] = Short.parseShort((String) this.d.elementAt(i3));
            }
            this.d.removeAllElements();
        }
        if (sArr != null) {
            for (int i4 = 0; i4 < sArr.length; i4++) {
                if (sArr[i4] >= 0) {
                    if (d(sArr[i4], s, s2, s3) != null) {
                        sArr[i4] = -1;
                    } else {
                        for (int i5 = i4 + 1; i5 < sArr.length; i5++) {
                            if (sArr[i5] >= 0 && sArr[i4] == sArr[i5]) {
                                sArr[i4] = -1;
                            }
                        }
                    }
                }
            }
            for (int i6 = 0; i6 < sArr.length; i6++) {
                if (sArr[i6] >= 0) {
                    b(sArr[i6], s, s2, s3);
                }
            }
        }
        a(bcVarB, s, s2, s3);
        bcVarB.p = aaVar;
        this.c.addElement(bcVarB);
    }

    private void a(aw awVar) {
        this.d.removeAllElements();
        if (awVar.j != null) {
            for (int i = 0; i < awVar.j.length; i++) {
                for (int i2 = 0; i2 < awVar.j[i].length; i2++) {
                    if (awVar.j[i][i2] != null) {
                        String strValueOf = String.valueOf((int) awVar.j[i][i2].b);
                        if (!this.d.contains(strValueOf)) {
                            this.d.addElement(strValueOf);
                        }
                    }
                }
            }
        }
        if (awVar.k != null) {
            for (int i3 = 0; i3 < awVar.k.length; i3++) {
                if (awVar.k[i3] != null) {
                    String strValueOf2 = String.valueOf((int) awVar.k[i3].b);
                    if (!this.d.contains(strValueOf2)) {
                        this.d.addElement(strValueOf2);
                    }
                }
            }
        }
        if (awVar.l != null) {
            for (int i4 = 0; i4 < awVar.l.length; i4++) {
                if (awVar.l[i4] != null && awVar.l[i4].c == 0) {
                    String strValueOf3 = String.valueOf((int) awVar.l[i4].b);
                    if (!this.d.contains(strValueOf3)) {
                        this.d.addElement(strValueOf3);
                    }
                }
            }
        }
        short[] sArr = new short[this.d.size()];
        for (int i5 = 0; i5 < this.d.size(); i5++) {
            sArr[i5] = Short.parseShort((String) this.d.elementAt(i5));
        }
        this.d.removeAllElements();
        for (int i6 = 0; i6 < sArr.length; i6++) {
            if (sArr[i6] >= 0) {
                short sA = awVar.a(sArr[i6]);
                if (d(sArr[i6], sA < 0 ? (short) 0 : awVar.m[sA][1], sA < 0 ? (short) 0 : awVar.m[sA][2], sA < 0 ? (short) 0 : awVar.m[sA][3]) != null) {
                    sArr[i6] = -1;
                } else {
                    for (int i7 = i6 + 1; i7 < sArr.length; i7++) {
                        if (sArr[i7] >= 0 && sArr[i6] == sArr[i7]) {
                            sArr[i6] = -1;
                        }
                    }
                }
            }
        }
        for (int i8 = 0; i8 < sArr.length; i8++) {
            if (sArr[i8] >= 0) {
                short sA2 = awVar.a(sArr[i8]);
                if (sA2 >= 0) {
                    b(sArr[i8], awVar.m[sA2][1], awVar.m[sA2][2], awVar.m[sA2][3]);
                } else {
                    b(sArr[i8], (short) 0, (short) 0, (short) 0);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    private void a(bc bcVar, short s, short s2, short s3) {
        if (bcVar.k == null) {
            return;
        }
        if (bcVar.g == null || bcVar.h == null) {
            bcVar.g = new short[bcVar.k.length];
            bcVar.h = new short[bcVar.k.length];
            if (bcVar.k != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= bcVar.k.length) {
                        break;
                    }
                    if (bcVar.k[i2] != null) {
                        for (int i3 = 0; i3 < bcVar.k[i2].length; i3++) {
                            if (bcVar.k[i2][i3] != null && bcVar.k[i2][i3].a == null) {
                                bcVar.k[i2][i3].a = a(bcVar.k[i2][i3].b, s, s2, s3);
                            }
                        }
                        bx[] bxVarArr = bcVar.k[i2];
                        short s4 = 0;
                        short s5 = 0;
                        int i4 = 0;
                        short s6 = 0;
                        s6 = 0;
                        if (bxVarArr != null) {
                            if (bxVarArr.length > 0 && bxVarArr[0].a != null) {
                                ajVarA = bxVarArr[0].a.o == 0 ? ((bf) bxVarArr[0].a).a(bxVarArr[0].d) : null;
                                s4 = bxVarArr[0].e;
                                s5 = bxVarArr[0].f;
                                i4 = bxVarArr[0].e + (ajVarA == null ? (short) 0 : ajVarA.c);
                                s6 = (ajVarA == null ? (short) 0 : ajVarA.d) + bxVarArr[0].f;
                            }
                            int i5 = 0;
                            short sMax = s6;
                            int i6 = i4;
                            short s7 = s5;
                            int iMin = s4;
                            while (i5 < bxVarArr.length) {
                                bx bxVar = bxVarArr[i5];
                                if (bxVarArr[0].a != null && bxVarArr[0].a.o == 0) {
                                    ajVarA = ((bf) bxVar.a).a(bxVar.d);
                                }
                                iMin = Math.min((int) bxVar.e, iMin);
                                ?? Min = Math.min((int) s7, (int) bxVar.f);
                                int iMax = Math.max(i6, (ajVarA == null ? (short) 0 : ajVarA.c) + bxVar.e);
                                i5++;
                                sMax = Math.max((int) sMax, (ajVarA == null ? (short) 0 : ajVarA.d) + bxVar.f);
                                i6 = iMax;
                                s7 = Min;
                            }
                            bcVar.g[i2] = (short) Math.abs(i6 - iMin);
                            bcVar.h[i2] = (short) Math.abs(sMax - s7);
                        }
                    }
                    i = i2 + 1;
                }
                if (bcVar.g != null) {
                    bcVar.i = (byte) (bcVar.g[0] / 2);
                    bcVar.j = (byte) bcVar.h[0];
                }
            }
        }
    }

    private void a(int[] iArr, short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            aa aaVarD = d(iArr[i]);
            if (aaVarD != null) {
                sArr4[i] = aaVarD.b;
            } else {
                sArr4[i] = -1;
            }
        }
        a(sArr4, sArr, sArr2, sArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8, types: [bc] */
    private void a(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short sC;
        boolean z = (sArr2 == null || sArr3 == null || sArr4 == null) ? false : true;
        for (int i = 0; i < sArr.length; i++) {
            short s = z ? sArr2[i] : (short) 0;
            short s2 = z ? sArr3[i] : (short) 0;
            short s3 = z ? sArr4[i] : (short) 0;
            sC = sArr[i];
            if (sC >= 0) {
                sC = c(sArr[i], s, s2, s3);
                if (sC != 0) {
                    sArr[i] = -1;
                } else {
                    sC = i + 1;
                    while (sC < sArr.length) {
                        if (sArr[sC] >= 0 && sArr[i] == sArr[sC]) {
                            if (s == (z ? sArr2[sC] : (short) 0)) {
                                if (s2 == (z ? sArr3[sC] : (short) 0)) {
                                    if (s3 == (z ? sArr4[sC] : (short) 0)) {
                                        sArr[i] = -1;
                                    }
                                }
                            }
                        }
                        sC++;
                    }
                }
            }
        }
        int i2 = 0;
        while (i2 < sArr.length) {
            short s4 = z ? sArr2[i2] : (short) 0;
            short s5 = z ? sArr3[i2] : (short) 0;
            short s6 = z ? sArr4[i2] : (short) 0;
            sC = sC;
            if (sArr[i2] >= 0 || s4 != 0 || s5 != 0 || s6 != 0) {
                bc bcVarC = c(sArr[i2], s4, s5, s6);
                if (bcVarC == null) {
                    sC = 0;
                    aa aaVarA = a(sArr[i2]);
                    if (aaVarA != null) {
                        DataInputStream dataInputStreamA = a(aaVarA);
                        sC = dataInputStreamA;
                        if (dataInputStreamA != null) {
                            a(aaVarA, dataInputStreamA, s4, s5, s6);
                            sC = dataInputStreamA;
                            if (dataInputStreamA != null) {
                                try {
                                    dataInputStreamA.close();
                                    sC = dataInputStreamA;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    sC = dataInputStreamA;
                                }
                            }
                        } else if (dataInputStreamA != null) {
                            try {
                                dataInputStreamA.close();
                                sC = dataInputStreamA;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                sC = dataInputStreamA;
                            }
                        }
                    }
                } else {
                    this.c.addElement(bcVarC.a(s4, s5, s6));
                    sC = sC;
                }
            }
            while (true) {
                try {
                    try {
                        i2++;
                        break;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        if (sC != 0) {
                            try {
                                sC.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (sC != 0) {
                        try {
                            sC.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        }
    }

    private static int[] a(Vector vector, byte b) {
        int[] iArr = new int[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= vector.size()) {
                return iArr;
            }
            iArr[i2] = a((String) vector.elementAt(i2), b);
            i = i2 + 1;
        }
    }

    private static int[] a(String[] strArr, byte b) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("")) {
                iArr[i] = -1;
            } else {
                iArr[i] = a(strArr[i], (byte) 2);
            }
        }
        return iArr;
    }

    private static byte[][] a(DataInputStream dataInputStream, int i) throws IOException {
        dataInputStream.skipBytes(0);
        dataInputStream.readShort();
        dataInputStream.readByte();
        int i2 = dataInputStream.readByte();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr[i3]);
        }
        return bArr;
    }

    private static bc b(byte[][] bArr, short s, short s2, short s3) {
        bc bcVar = new bc(s, s2, s3);
        bcVar.a(bArr);
        return bcVar;
    }

    public static String b(String str, byte b) {
        return b == 0 ? new StringBuffer().append(str).append("p").toString() : b == 2 ? new StringBuffer().append(str).append("s").toString() : b == 3 ? new StringBuffer().append(str).append("m").toString() : str;
    }

    private void b(aa aaVar, DataInputStream dataInputStream, short s, short s2, short s3) throws Throwable {
        bf bfVarA = a(a(dataInputStream, 0), s, s2, s3);
        bfVarA.p = aaVar;
        this.c.addElement(bfVarA);
    }

    private void b(short s, short s2, short s3, short s4) {
        if (d(s, s2, s3, s4) != null) {
            return;
        }
        DataInputStream dataInputStreamA = null;
        try {
            try {
                aa aaVarA = a(s);
                if (aaVarA != null) {
                    dataInputStreamA = a(aaVarA);
                    if (dataInputStreamA != null) {
                        b(aaVarA, dataInputStreamA, s2, s3, s4);
                        if (dataInputStreamA != null) {
                            try {
                                dataInputStreamA.close();
                            } catch (IOException e) {
                            }
                        }
                    } else if (dataInputStreamA != null) {
                        try {
                            dataInputStreamA.close();
                        } catch (IOException e2) {
                        }
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        dataInputStreamA.close();
                    } catch (IOException e4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (dataInputStreamA != null) {
                try {
                    dataInputStreamA.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    private short[] b(aw awVar) {
        this.d.removeAllElements();
        if (awVar.l != null) {
            for (int i = 0; i < awVar.l.length; i++) {
                if (awVar.l[i] != null && awVar.l[i].c == 2) {
                    String strValueOf = String.valueOf((int) awVar.l[i].b);
                    if (!this.d.contains(strValueOf)) {
                        this.d.addElement(strValueOf);
                    }
                }
            }
        }
        short[] sArr = new short[this.d.size()];
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            sArr[i2] = Short.parseShort((String) this.d.elementAt(i2));
        }
        this.d.removeAllElements();
        return sArr;
    }

    private static byte[][] b(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        byte[][] bArr2 = null;
        try {
            try {
                dataInputStream.readShort();
                dataInputStream.readByte();
                int i = dataInputStream.readByte();
                bArr2 = new byte[i][];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = new byte[dataInputStream.readInt()];
                    dataInputStream.read(bArr2[i2]);
                }
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                    dataInputStream.close();
                } catch (IOException e3) {
                }
            }
            return bArr2;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }

    private bc c(short s, short s2, short s3, short s4) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return null;
            }
            cf cfVar = (cf) this.c.elementAt(i2);
            if (cfVar.o == 2 && cfVar.p != null && cfVar.p.b == s) {
                bc bcVar = (bc) cfVar;
                if (bcVar.a == s2 && bcVar.b == s3 && bcVar.c == s4) {
                    return bcVar;
                }
            }
            i = i2 + 1;
        }
    }

    private void c(aw awVar) {
        cf cfVarA;
        bx bxVar;
        if (awVar.j != null) {
            for (int i = 0; i < awVar.j.length; i++) {
                for (int i2 = 0; i2 < awVar.j[i].length; i2++) {
                    if (awVar.j[i][i2] != null) {
                        short sA = awVar.a(awVar.j[i][i2].b);
                        if (sA != -1) {
                            awVar.j[i][i2].a = a(awVar.j[i][i2].b, awVar.m[sA][1], awVar.m[sA][2], awVar.m[sA][3]);
                        } else {
                            awVar.j[i][i2].a = a(awVar.j[i][i2].b, (short) 0, (short) 0, (short) 0);
                        }
                    }
                }
            }
        }
        if (awVar.k != null) {
            for (int i3 = 0; i3 < awVar.k.length; i3++) {
                if (awVar.k[i3] != null) {
                    short sA2 = awVar.a(awVar.k[i3].b);
                    if (sA2 != -1) {
                        awVar.k[i3].a = a(awVar.k[i3].b, awVar.m[sA2][1], awVar.m[sA2][2], awVar.m[sA2][3]);
                    } else {
                        awVar.k[i3].a = a(awVar.k[i3].b, (short) 0, (short) 0, (short) 0);
                    }
                }
            }
        }
        if (awVar.l != null) {
            for (int i4 = 0; i4 < awVar.l.length; i4++) {
                if (awVar.l[i4] != null) {
                    if (awVar.l[i4].c == 0) {
                        short sA3 = awVar.a(awVar.l[i4].b);
                        if (sA3 != -1) {
                            bxVar = awVar.l[i4];
                            cfVarA = a(awVar.l[i4].b, awVar.m[sA3][1], awVar.m[sA3][2], awVar.m[sA3][3]);
                        } else {
                            bxVar = awVar.l[i4];
                            cfVarA = a(awVar.l[i4].b, (short) 0, (short) 0, (short) 0);
                        }
                    } else if (awVar.l[i4].c == 2) {
                        bx bxVar2 = awVar.l[i4];
                        short s = awVar.l[i4].b;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= this.c.size()) {
                                t.a(new StringBuffer().append("no resource ").append((int) s).toString());
                                cfVarA = null;
                                bxVar = bxVar2;
                                break;
                            } else {
                                if (this.c.elementAt(i5) instanceof bc) {
                                    cfVarA = (bc) this.c.elementAt(i5);
                                    if (cfVarA.p != null && cfVarA.p.b == s) {
                                        bxVar = bxVar2;
                                        break;
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                    bxVar.a = cfVarA;
                }
            }
        }
    }

    private void c(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            try {
                int i = dataInputStream.readShort();
                this.e = new aa[i];
                for (int i2 = 0; i2 < i; i2++) {
                    this.e[i2] = new aa(dataInputStream.readInt(), dataInputStream.readShort());
                }
                try {
                    dataInputStream.close();
                    dataInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                    dataInputStream.close();
                    dataInputStream.close();
                } catch (IOException e3) {
                }
            }
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                dataInputStream.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }

    private aa d(int i) {
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (this.e[i2] != null && this.e[i2].a == i) {
                return this.e[i2];
            }
        }
        return null;
    }

    private bf d(short s, short s2, short s3, short s4) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return null;
            }
            cf cfVar = (cf) this.c.elementAt(i2);
            if (cfVar.o == 0 && cfVar.p != null && cfVar.p.b == s) {
                bf bfVar = (bf) cfVar;
                if (bfVar.e == s2 && bfVar.f == s3 && bfVar.g == s4) {
                    return bfVar;
                }
            }
            i = i2 + 1;
        }
    }

    private void e() throws IOException {
        InputStream resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append("/").append(this.a).append(".rule").toString());
        DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
        try {
            try {
                int i = dataInputStream.readShort();
                this.e = new aa[i];
                for (int i2 = 0; i2 < i; i2++) {
                    this.e[i2] = new aa(dataInputStream.readInt(), dataInputStream.readShort());
                }
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e) {
                        return;
                    }
                }
                dataInputStream.close();
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e2) {
                        throw th;
                    }
                }
                dataInputStream.close();
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException e4) {
                    return;
                }
            }
            dataInputStream.close();
        }
    }

    public final aw a(byte[] bArr) {
        aw awVarA = a(b(bArr));
        a(awVarA);
        a(b(awVarA), (short[]) null, (short[]) null, (short[]) null);
        c(awVarA);
        return awVarA;
    }

    public final bc a(int i, short s, short s2, short s3) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.c.size()) {
                return null;
            }
            if (this.c.elementAt(i3) instanceof bc) {
                bc bcVar = (bc) this.c.elementAt(i3);
                if (bcVar.p != null && bcVar.p.a == i && bcVar.a == s && bcVar.b == s2 && bcVar.c == s3) {
                    return bcVar;
                }
            }
            i2 = i3 + 1;
        }
    }

    public final bc a(String str, short s, short s2, short s3) {
        return a(a(b(str, (byte) 2).toCharArray()), s, s2, s3);
    }

    public final bf a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        int iA = a(b(str, (byte) 0).toCharArray());
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                return null;
            }
            if (this.c.elementAt(i2) instanceof bf) {
                bf bfVar = (bf) this.c.elementAt(i2);
                if (bfVar.p != null && bfVar.p.a == iA) {
                    return bfVar;
                }
            }
            i = i2 + 1;
        }
    }

    public final Vector a() {
        return this.c;
    }

    public final void a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.c.size()) {
                return;
            }
            cf cfVar = (cf) this.c.elementAt(i3);
            if (cfVar.p != null && cfVar.p.a == i) {
                this.c.removeElement(cfVar);
                return;
            }
            i2 = i3 + 1;
        }
    }

    public final void a(Vector vector, short[] sArr, short[] sArr2, short[] sArr3) {
        a(a(vector, (byte) 2), sArr, sArr2, sArr3);
    }

    public final void a(String[] strArr) {
        a(a(strArr, (byte) 2), (short[]) null, (short[]) null, (short[]) null);
    }

    public final void a(String[] strArr, short[] sArr, short[] sArr2, short[] sArr3) {
        a(a(strArr, (byte) 2), sArr, sArr2, sArr3);
    }

    public final bc b(String str) {
        return a(a(b(str, (byte) 2).toCharArray()), (short) 0, (short) 0, (short) 0);
    }

    public final short b() {
        return (short) this.c.size();
    }

    public final void b(String str, short s, short s2, short s3) {
        bc bcVar;
        DataInputStream dataInputStreamA = null;
        int iA = a(str, (byte) 2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.c.size()) {
                bcVar = null;
                break;
            }
            cf cfVar = (cf) this.c.elementAt(i2);
            if (cfVar.o == 2 && cfVar.p != null && cfVar.p.a == iA) {
                bcVar = (bc) cfVar;
                if (bcVar.a != s || bcVar.b != s2 || bcVar.c != s3) {
                }
            }
            i = i2 + 1;
        }
        try {
            if (bcVar != null) {
                return;
            }
            try {
                aa aaVarD = d(iA);
                if (aaVarD != null) {
                    dataInputStreamA = a(aaVarD);
                    if (dataInputStreamA != null) {
                        a(aaVarD, dataInputStreamA, s, s2, s3);
                        if (dataInputStreamA != null) {
                            try {
                                dataInputStreamA.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } else if (dataInputStreamA != null) {
                        try {
                            dataInputStreamA.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        dataInputStreamA.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            if (dataInputStreamA != null) {
                try {
                    dataInputStreamA.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public final void b(Vector vector, short[] sArr, short[] sArr2, short[] sArr3) {
        int[] iArrA = a(vector, (byte) 0);
        short[] sArr4 = new short[iArrA.length];
        for (int i = 0; i < iArrA.length; i++) {
            aa aaVarD = d(iArrA[i]);
            if (aaVarD != null) {
                sArr4[i] = aaVarD.b;
            } else {
                sArr4[i] = -1;
            }
        }
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        boolean z = (0 == 0 || 0 == 0 || 0 == 0) ? false : true;
        for (int i2 = 0; i2 < sArr4.length; i2++) {
            short s = z ? sArr5[i2] : (short) 0;
            short s2 = z ? sArr6[i2] : (short) 0;
            short s3 = z ? sArr7[i2] : (short) 0;
            if (sArr4[i2] >= 0) {
                if (d(sArr4[i2], s, s2, s3) != null) {
                    sArr4[i2] = -1;
                } else {
                    for (int i3 = i2 + 1; i3 < sArr4.length; i3++) {
                        if (sArr4[i3] >= 0 && sArr4[i2] == sArr4[i3]) {
                            if (s == (z ? sArr5[i3] : (short) 0)) {
                                if (s2 == (z ? sArr6[i3] : (short) 0)) {
                                    if (s3 == (z ? sArr7[i3] : (short) 0)) {
                                        sArr4[i2] = -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i4 = 0; i4 < sArr4.length; i4++) {
            if (sArr4[i4] >= 0) {
                b(sArr4[i4], z ? sArr5[i4] : (short) 0, z ? sArr6[i4] : (short) 0, z ? sArr7[i4] : (short) 0);
            }
        }
    }

    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            cf cfVar = (cf) this.c.elementAt(i2);
            if (cfVar.p != null && cfVar.p.a == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aw c(java.lang.String r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r5 = 3
            r0 = 0
            r2 = 0
            java.lang.String r1 = b(r9, r5)
            char[] r1 = r1.toCharArray()
            int r3 = a(r1)
            r1 = r0
        L10:
            java.util.Vector r0 = r8.c
            int r0 = r0.size()
            if (r1 >= r0) goto L37
            java.util.Vector r0 = r8.c
            java.lang.Object r0 = r0.elementAt(r1)
            cf r0 = (defpackage.cf) r0
            byte r4 = r0.o
            if (r4 != r5) goto L33
            aa r4 = r0.p
            if (r4 == 0) goto L33
            aa r4 = r0.p
            int r4 = r4.a
            if (r4 != r3) goto L33
            aw r0 = (defpackage.aw) r0
        L30:
            if (r0 == 0) goto L39
        L32:
            return r0
        L33:
            int r0 = r1 + 1
            r1 = r0
            goto L10
        L37:
            r0 = r2
            goto L30
        L39:
            aa r3 = r8.d(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L80
            if (r3 != 0) goto L41
            r0 = r2
            goto L32
        L41:
            java.io.DataInputStream r1 = r8.a(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L80
            if (r1 != 0) goto L4e
            if (r1 == 0) goto L4c
            r1.close()     // Catch: java.io.IOException -> L88
        L4c:
            r0 = r2
            goto L32
        L4e:
            r0 = 0
            byte[][] r0 = a(r1, r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            aw r0 = a(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r1.close()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r8.a(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            short[] r4 = r8.b(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r5 = 0
            r6 = 0
            r7 = 0
            r8.a(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r8.c(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r0.p = r3     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.io.IOException -> L72
            goto L32
        L72:
            r1 = move-exception
            goto L32
        L74:
            r0 = move-exception
            r1 = r2
        L76:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L7e
            r1.close()     // Catch: java.io.IOException -> L8a
        L7e:
            r0 = r2
            goto L32
        L80:
            r0 = move-exception
            r1 = r2
        L82:
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.io.IOException -> L8c
        L87:
            throw r0
        L88:
            r0 = move-exception
            goto L4c
        L8a:
            r0 = move-exception
            goto L7e
        L8c:
            r1 = move-exception
            goto L87
        L8e:
            r0 = move-exception
            goto L82
        L90:
            r0 = move-exception
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.c(java.lang.String):aw");
    }

    public final bc c(int i) {
        return a(i, (short) 0, (short) 0, (short) 0);
    }

    public final void c() {
        this.c.removeAllElements();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.d():void");
    }

    public final void d(String str) {
        b(str, (short) 0, (short) 0, (short) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r7) {
        /*
            r6 = this;
            r3 = 0
            r2 = 0
            int r4 = a(r7, r2)
            r1 = r2
        L7:
            java.util.Vector r0 = r6.c
            int r0 = r0.size()
            if (r1 >= r0) goto L4b
            java.util.Vector r0 = r6.c
            java.lang.Object r0 = r0.elementAt(r1)
            cf r0 = (defpackage.cf) r0
            byte r5 = r0.o
            if (r5 != 0) goto L47
            aa r5 = r0.p
            if (r5 == 0) goto L47
            aa r5 = r0.p
            int r5 = r5.a
            if (r5 != r4) goto L47
            bf r0 = (defpackage.bf) r0
            int r5 = r0.e
            if (r5 != r2) goto L47
            int r5 = r0.f
            if (r5 != r2) goto L47
            int r5 = r0.g
            if (r5 != r2) goto L47
        L33:
            if (r0 != 0) goto L46
            aa r1 = r6.d(r4)
            if (r1 == 0) goto L46
            java.io.DataInputStream r2 = r6.a(r1)     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L69
            if (r2 != 0) goto L4d
            if (r2 == 0) goto L46
            r2.close()     // Catch: java.io.IOException -> L71
        L46:
            return
        L47:
            int r0 = r1 + 1
            r1 = r0
            goto L7
        L4b:
            r0 = r3
            goto L33
        L4d:
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r0.b(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
            if (r2 == 0) goto L46
            r2.close()     // Catch: java.io.IOException -> L5a
            goto L46
        L5a:
            r0 = move-exception
            goto L46
        L5c:
            r0 = move-exception
            r2 = r3
        L5e:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L46
            r2.close()     // Catch: java.io.IOException -> L67
            goto L46
        L67:
            r0 = move-exception
            goto L46
        L69:
            r0 = move-exception
            r2 = r3
        L6b:
            if (r2 == 0) goto L70
            r2.close()     // Catch: java.io.IOException -> L73
        L70:
            throw r0
        L71:
            r0 = move-exception
            goto L46
        L73:
            r1 = move-exception
            goto L70
        L75:
            r0 = move-exception
            goto L6b
        L77:
            r0 = move-exception
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.e(java.lang.String):void");
    }
}
