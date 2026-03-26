package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

/* loaded from: java版梦回西游3区251011.jar:bu.class */
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

    public final Vector a() {
        return this.c;
    }

    public final short b() {
        return (short) this.c.size();
    }

    public final void c() {
        this.c.removeAllElements();
    }

    public final void a(int i) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            cf cfVar = (cf) this.c.elementAt(i2);
            if (cfVar.p != null && cfVar.p.a == i) {
                this.c.removeElement(cfVar);
                return;
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

    public final bf a(String str) {
        if (str == null) {
            return null;
        }
        int iA = a(b(str, (byte) 0).toCharArray());
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.elementAt(i) instanceof bf) {
                bf bfVar = (bf) this.c.elementAt(i);
                if (bfVar.p != null && bfVar.p.a == iA) {
                    return bfVar;
                }
            }
        }
        return null;
    }

    private bf a(short s, short s2, short s3, short s4) {
        for (int i = 0; i < this.c.size(); i++) {
            if (this.c.elementAt(i) instanceof bf) {
                bf bfVar = (bf) this.c.elementAt(i);
                if (bfVar.p != null && bfVar.p.b == s && bfVar.e == s2 && bfVar.f == s3 && bfVar.g == s4) {
                    return bfVar;
                }
            }
        }
        return null;
    }

    public final bc b(String str) {
        return a(a(b(str, (byte) 2).toCharArray()), (short) 0, (short) 0, (short) 0);
    }

    public final bc a(String str, short s, short s2, short s3) {
        return a(a(b(str, (byte) 2).toCharArray()), s, s2, s3);
    }

    public final bc c(int i) {
        return a(i, (short) 0, (short) 0, (short) 0);
    }

    public final bc a(int i, short s, short s2, short s3) {
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            if (this.c.elementAt(i2) instanceof bc) {
                bc bcVar = (bc) this.c.elementAt(i2);
                if (bcVar.p != null && bcVar.p.a == i && bcVar.a == s && bcVar.b == s2 && bcVar.c == s3) {
                    return bcVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v37, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r1v41, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.DataInputStream] */
    public final void d() {
        DataInputStream dataInputStream;
        ?? r0 = 0;
        ?? r7 = 0;
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append(this.b).append(this.a).append(".rpg").toString());
                if (resourceAsStream == null) {
                    dataInputStream = null;
                } else {
                    DataInputStream dataInputStream2 = new DataInputStream(resourceAsStream);
                    dataInputStream2.read(ai.d);
                    dataInputStream = dataInputStream2;
                }
                r7 = dataInputStream;
                for (int i = 0; i < this.e.length; i++) {
                    byte b = r7.readByte();
                    int i2 = r7.readByte();
                    ?? r02 = new byte[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        r02[i3] = new byte[r7.readInt()];
                        r7.read(r02[i3]);
                    }
                    if (b == 0) {
                        bf bfVarA = a((byte[][]) r02, (short) 0, (short) 0, (short) 0);
                        bfVarA.p = this.e[i];
                        this.c.addElement(bfVarA);
                    } else {
                        bc bcVarB = b((byte[][]) r02, (short) 0, (short) 0, (short) 0);
                        bcVarB.p = this.e[i];
                        this.c.addElement(bcVarB);
                    }
                }
                int i4 = 0;
                while (true) {
                    r0 = i4;
                    if (r0 >= this.c.size()) {
                        break;
                    }
                    cf cfVar = (cf) this.c.elementAt(i4);
                    if (cfVar.o == 2) {
                        a((bc) cfVar, (short) 0, (short) 0, (short) 0);
                    }
                    i4++;
                }
                ?? r03 = r7;
                if (r03 != 0) {
                    try {
                        r03 = r7;
                        r03.close();
                    } catch (IOException e) {
                        r03.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                ?? r04 = r7;
                if (r04 != 0) {
                    try {
                        r04 = r7;
                        r04.close();
                    } catch (IOException e2) {
                        r04.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            r0.printStackTrace();
            ?? r05 = r7;
            if (r05 != 0) {
                try {
                    r05 = r7;
                    r05.close();
                } catch (IOException e4) {
                    r05.printStackTrace();
                }
            }
        }
    }

    public final aw a(byte[] bArr) {
        aw awVarA = a(b(bArr));
        a(awVarA);
        a(b(awVarA), (short[]) null, (short[]) null, (short[]) null);
        c(awVarA);
        return awVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [aw] */
    public final aw c(String str) {
        aw awVar;
        int iA = a(b(str, (byte) 3).toCharArray());
        int i = 0;
        while (true) {
            if (i >= this.c.size()) {
                awVar = null;
                break;
            }
            cf cfVar = (cf) this.c.elementAt(i);
            if (cfVar.o == 3 && cfVar.p != null && cfVar.p.a == iA) {
                awVar = (aw) cfVar;
                break;
            }
            i++;
        }
        aw awVar2 = awVar;
        if (awVar != null) {
            return awVar2;
        }
        DataInputStream dataInputStream = null;
        ?? r0 = 0;
        try {
            try {
                aa aaVarD = d(iA);
                if (aaVarD == null) {
                    return null;
                }
                DataInputStream dataInputStreamA = a(aaVarD);
                dataInputStream = dataInputStreamA;
                if (dataInputStreamA == null) {
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e) {
                            return null;
                        }
                    }
                    return null;
                }
                aw awVarA = a(a(dataInputStream, 0));
                dataInputStream.close();
                a(awVarA);
                a(b(awVarA), (short[]) null, (short[]) null, (short[]) null);
                c(awVarA);
                awVarA.p = aaVarD;
                r0 = awVarA;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return r0;
            } catch (Throwable th) {
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException unused2) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            r0.printStackTrace();
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException unused3) {
                    return null;
                }
            }
            return null;
        }
    }

    public final void d(String str) {
        b(str, (short) 0, (short) 0, (short) 0);
    }

    public final void a(String[] strArr) {
        a(a(strArr, (byte) 2), (short[]) null, (short[]) null, (short[]) null);
    }

    public final void a(String[] strArr, short[] sArr, short[] sArr2, short[] sArr3) {
        a(a(strArr, (byte) 2), sArr, sArr2, sArr3);
    }

    public final void a(Vector vector, short[] sArr, short[] sArr2, short[] sArr3) {
        a(a(vector, (byte) 2), sArr, sArr2, sArr3);
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
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v40, types: [aa] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bu] */
    private void a(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        boolean z = (sArr2 == null || sArr3 == null || sArr4 == null) ? false : true;
        for (int i = 0; i < sArr.length; i++) {
            short s = z ? sArr2[i] : (short) 0;
            short s2 = z ? sArr3[i] : (short) 0;
            short s3 = z ? sArr4[i] : (short) 0;
            if (sArr[i] >= 0) {
                if (c(sArr[i], s, s2, s3) != null) {
                    sArr[i] = -1;
                } else {
                    for (int i2 = i + 1; i2 < sArr.length; i2++) {
                        if (sArr[i2] >= 0 && sArr[i] == sArr[i2]) {
                            if (s == (z ? sArr2[i2] : (short) 0)) {
                                if (s2 == (z ? sArr3[i2] : (short) 0)) {
                                    if (s3 == (z ? sArr4[i2] : (short) 0)) {
                                        sArr[i] = -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i3 = 0; i3 < sArr.length; i3++) {
            short s4 = z ? sArr2[i3] : (short) 0;
            short s5 = z ? sArr3[i3] : (short) 0;
            short s6 = z ? sArr4[i3] : (short) 0;
            if (sArr[i3] >= 0 || s4 != 0 || s5 != 0 || s6 != 0) {
                bc bcVarC = c(sArr[i3], s4, s5, s6);
                if (bcVarC == null) {
                    ?? A = 0;
                    try {
                        try {
                            A = a(sArr[i3]);
                            if (A != 0) {
                                DataInputStream dataInputStreamA = a(A);
                                if (dataInputStreamA == null) {
                                    ?? r0 = dataInputStreamA;
                                    if (r0 != 0) {
                                        try {
                                            r0 = dataInputStreamA;
                                            r0.close();
                                        } catch (IOException e) {
                                            r0.printStackTrace();
                                        }
                                    }
                                } else {
                                    a(A, dataInputStreamA, s4, s5, s6);
                                    ?? r02 = dataInputStreamA;
                                    if (r02 != 0) {
                                        try {
                                            r02 = dataInputStreamA;
                                            r02.close();
                                        } catch (IOException e2) {
                                            r02.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            ?? r03 = 0;
                            if (0 != 0) {
                                try {
                                    r03 = 0;
                                    r03.close();
                                } catch (IOException e3) {
                                    r03.printStackTrace();
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e4) {
                        A.printStackTrace();
                        ?? r04 = 0;
                        if (0 != 0) {
                            try {
                                r04 = 0;
                                r04.close();
                            } catch (IOException e5) {
                                r04.printStackTrace();
                            }
                        }
                    }
                } else {
                    this.c.addElement(bcVarC.a(s4, s5, s6));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v23, types: [bu] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.io.DataInputStream] */
    public final void b(String str, short s, short s2, short s3) {
        bc bcVar;
        int iA = a(str, (byte) 2);
        int i = 0;
        while (true) {
            if (i >= this.c.size()) {
                bcVar = null;
                break;
            }
            cf cfVar = (cf) this.c.elementAt(i);
            if (cfVar.o == 2 && cfVar.p != null && cfVar.p.a == iA) {
                bc bcVar2 = (bc) cfVar;
                if (bcVar2.a == s && bcVar2.b == s2 && bcVar2.c == s3) {
                    bcVar = bcVar2;
                    break;
                }
            }
            i++;
        }
        if (bcVar != null) {
            return;
        }
        DataInputStream dataInputStream = null;
        ?? r0 = 0;
        try {
            try {
                aa aaVarD = d(iA);
                if (aaVarD == null) {
                    return;
                }
                DataInputStream dataInputStreamA = a(aaVarD);
                dataInputStream = dataInputStreamA;
                if (dataInputStreamA == null) {
                    ?? r02 = dataInputStream;
                    if (r02 != 0) {
                        try {
                            r02 = dataInputStream;
                            r02.close();
                            return;
                        } catch (IOException e) {
                            r02.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
                r0 = this;
                r0.a(aaVarD, dataInputStream, s, s2, s3);
                ?? r03 = dataInputStream;
                if (r03 != 0) {
                    try {
                        r03 = dataInputStream;
                        r03.close();
                    } catch (IOException e2) {
                        r03.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                ?? r04 = dataInputStream;
                if (r04 != 0) {
                    try {
                        r04 = dataInputStream;
                        r04.close();
                    } catch (IOException e3) {
                        r04.printStackTrace();
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            r0.printStackTrace();
            ?? r05 = dataInputStream;
            if (r05 != 0) {
                try {
                    r05 = dataInputStream;
                    r05.close();
                } catch (IOException e5) {
                    r05.printStackTrace();
                }
            }
        }
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
            short[] sArr2 = new short[this.d.size()];
            for (int i3 = 0; i3 < this.d.size(); i3++) {
                sArr2[i3] = Short.parseShort((String) this.d.elementAt(i3));
            }
            this.d.removeAllElements();
            sArr = sArr2;
        }
        short[] sArr3 = sArr;
        if (sArr != null) {
            for (int i4 = 0; i4 < sArr3.length; i4++) {
                if (sArr3[i4] >= 0) {
                    if (d(sArr3[i4], s, s2, s3) != null) {
                        sArr3[i4] = -1;
                    } else {
                        for (int i5 = i4 + 1; i5 < sArr3.length; i5++) {
                            if (sArr3[i5] >= 0 && sArr3[i4] == sArr3[i5]) {
                                sArr3[i4] = -1;
                            }
                        }
                    }
                }
            }
            for (int i6 = 0; i6 < sArr3.length; i6++) {
                if (sArr3[i6] >= 0) {
                    b(sArr3[i6], s, s2, s3);
                }
            }
        }
        a(bcVarB, s, s2, s3);
        bcVarB.p = aaVar;
        this.c.addElement(bcVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [bu] */
    public final void e(String str) {
        bf bfVar;
        aa aaVarD;
        int iA = a(str, (byte) 0);
        int i = 0;
        while (true) {
            if (i >= this.c.size()) {
                bfVar = null;
                break;
            }
            cf cfVar = (cf) this.c.elementAt(i);
            if (cfVar.o == 0 && cfVar.p != null && cfVar.p.a == iA) {
                bf bfVar2 = (bf) cfVar;
                if (bfVar2.e == 0 && bfVar2.f == 0 && bfVar2.g == 0) {
                    bfVar = bfVar2;
                    break;
                }
            }
            i++;
        }
        if (bfVar != null || (aaVarD = d(iA)) == null) {
            return;
        }
        ?? r0 = 0;
        DataInputStream dataInputStream = null;
        try {
            try {
                DataInputStream dataInputStreamA = a(aaVarD);
                dataInputStream = dataInputStreamA;
                if (dataInputStreamA == null) {
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } else {
                    r0 = this;
                    r0.b(aaVarD, dataInputStream, (short) 0, (short) 0, (short) 0);
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                }
            } catch (Throwable th) {
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException unused) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            r0.printStackTrace();
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException unused2) {
                }
            }
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
    /* JADX WARN: Type inference failed for: r0v14, types: [bu] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    private void b(short s, short s2, short s3, short s4) {
        if (d(s, s2, s3, s4) != null) {
            return;
        }
        ?? r0 = 0;
        DataInputStream dataInputStream = null;
        try {
            try {
                aa aaVarA = a(s);
                if (aaVarA == null) {
                    return;
                }
                DataInputStream dataInputStreamA = a(aaVarA);
                dataInputStream = dataInputStreamA;
                if (dataInputStreamA == null) {
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                            return;
                        } catch (IOException e) {
                            return;
                        }
                    }
                    return;
                }
                r0 = this;
                r0.b(aaVarA, dataInputStream, s2, s3, s4);
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e2) {
                    }
                }
            } catch (IOException e3) {
                r0.printStackTrace();
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException unused2) {
                    throw th;
                }
            }
            throw th;
        }
    }

    private void b(aa aaVar, DataInputStream dataInputStream, short s, short s2, short s3) {
        bf bfVarA = a(a(dataInputStream, 0), s, s2, s3);
        bfVarA.p = aaVar;
        this.c.addElement(bfVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v15, types: [bf] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    private static bf a(byte[][] bArr, short s, short s2, short s3) {
        bf bfVar = new bf(s, s2, s3);
        ?? dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[1]));
        DataInputStream dataInputStream2 = dataInputStream;
        try {
            try {
                bfVar.b = (short) dataInputStream2.readInt();
                bfVar.c = (short) dataInputStream2.readInt();
                if (bArr[0] == null || bArr[0].length <= 4) {
                    bfVar.d = new aj[1];
                    bfVar.d[0] = new aj((short) 0, (short) 0, bfVar.b, bfVar.c);
                } else {
                    DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream(bArr[0], 2, bArr[0].length - 2));
                    dataInputStream2 = dataInputStream3;
                    int i = dataInputStream3.readByte();
                    bfVar.d = new aj[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        bfVar.d[i2] = new aj(dataInputStream2.readShort(), dataInputStream2.readShort(), dataInputStream2.readShort(), dataInputStream2.readShort());
                    }
                    if (i == 0) {
                        bfVar.d = new aj[1];
                        bfVar.d[0] = new aj((short) 0, (short) 0, bfVar.b, bfVar.c);
                    }
                    dataInputStream2.close();
                }
                dataInputStream2.close();
                dataInputStream = bfVar;
                dataInputStream.a(bArr, true);
                try {
                    dataInputStream2.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                dataInputStream.printStackTrace();
                try {
                    dataInputStream2.close();
                } catch (IOException unused) {
                }
            }
            return bfVar;
        } catch (Throwable th) {
            try {
                dataInputStream2.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static bc b(byte[][] bArr, short s, short s2, short s3) {
        bc bcVar = new bc(s, s2, s3);
        bcVar.a(bArr);
        return bcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataInputStream, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v48, types: [bx[]] */
    /* JADX WARN: Type inference failed for: r0v49, types: [bx] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v56, types: [bx[]] */
    /* JADX WARN: Type inference failed for: r0v57, types: [bx] */
    /* JADX WARN: Type inference failed for: r0v66, types: [bx[][]] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [bx] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.DataInputStream] */
    private static aw a(byte[][] bArr) {
        aw awVar = new aw();
        ?? dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0]));
        try {
            try {
                awVar.m = new short[dataInputStream.readByte()][4];
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
                awVar.g = (byte) ((awVar.a / awVar.c) + (awVar.a % awVar.c == 0 ? 0 : 1));
                awVar.h = (byte) ((awVar.b / awVar.d) + (awVar.b % awVar.d == 0 ? 0 : 1));
                int i2 = (awVar.a / awVar.e) + (awVar.a % awVar.e == 0 ? 0 : 1);
                awVar.i = new byte[i2][(awVar.b / awVar.f) + (awVar.b % awVar.f == 0 ? 0 : 1)];
                int i3 = dataInputStream.readShort();
                short[] sArr = new short[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    sArr[i4] = dataInputStream.readShort();
                    awVar.i[sArr[i4] % i2][sArr[i4] / i2] = 1;
                }
                awVar.j = new bx[awVar.g][awVar.h];
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
                        dataInputStream = awVar.l[i10];
                        dataInputStream.a(dataInputStream, true);
                    }
                }
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    dataInputStream.printStackTrace();
                }
            } catch (IOException e2) {
                dataInputStream.printStackTrace();
                try {
                    dataInputStream.close();
                } catch (IOException e3) {
                    dataInputStream.printStackTrace();
                }
            }
            return awVar;
        } catch (Throwable th) {
            try {
                dataInputStream = dataInputStream;
                dataInputStream.close();
            } catch (IOException e4) {
                dataInputStream.printStackTrace();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [byte[], byte[][]] */
    private static byte[][] a(DataInputStream dataInputStream, int i) throws IOException {
        dataInputStream.skipBytes(0);
        dataInputStream.readShort();
        dataInputStream.readByte();
        int i2 = dataInputStream.readByte();
        ?? r0 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            r0[i3] = new byte[dataInputStream.readInt()];
            dataInputStream.read(r0[i3]);
        }
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    private static byte[][] b(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        ?? r0 = 0;
        byte[][] bArr2 = null;
        try {
            try {
                dataInputStream.readShort();
                dataInputStream.readByte();
                int i = dataInputStream.readByte();
                bArr2 = new byte[i];
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = new byte[dataInputStream.readInt()];
                    r0 = dataInputStream.read(bArr2[i2]);
                }
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                r0.printStackTrace();
            }
            return bArr2;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private DataInputStream a(aa aaVar) {
        InputStream resourceAsStream;
        byte[] bArr = null;
        if (this.a.equals(bt.kX) && bt.kY != null) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= bt.kY.size()) {
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
        }
        DataInputStream dataInputStream = null;
        if (bArr != null) {
            dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        } else {
            if (this.a.equals(bt.kX) && (resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append(this.b).append(aaVar.a).append(".rpg").toString())) != null) {
                dataInputStream = new DataInputStream(resourceAsStream);
            }
            if (dataInputStream == null) {
                InputStream resourceAsStream2 = getClass().getResourceAsStream(new StringBuffer().append(this.b).append((int) aaVar.b).append(".rpg").toString());
                if (resourceAsStream2 == null) {
                    return null;
                }
                dataInputStream = new DataInputStream(resourceAsStream2);
            }
        }
        return dataInputStream;
    }

    private aa d(int i) {
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (this.e[i2] != null && this.e[i2].a == i) {
                return this.e[i2];
            }
        }
        return null;
    }

    private aa a(short s) {
        for (int i = 0; i < this.e.length; i++) {
            if (this.e[i] != null && this.e[i].b == s) {
                return this.e[i];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aa[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    private void c(byte[] bArr) {
        ?? dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            try {
                int i = dataInputStream.readShort();
                this.e = new aa[i];
                for (int i2 = 0; i2 < i; i2++) {
                    dataInputStream = this.e;
                    dataInputStream[i2] = new aa(dataInputStream.readInt(), dataInputStream.readShort());
                }
                try {
                    dataInputStream.close();
                    dataInputStream.close();
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                dataInputStream.printStackTrace();
                try {
                    dataInputStream.close();
                    dataInputStream.close();
                } catch (IOException unused) {
                }
            }
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                dataInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [aa[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.DataInputStream] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Throwable] */
    private void e() throws IOException {
        InputStream resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append("/").append(this.a).append(".rule").toString());
        ?? dataInputStream = new DataInputStream(resourceAsStream);
        try {
            try {
                int i = dataInputStream.readShort();
                this.e = new aa[i];
                for (int i2 = 0; i2 < i; i2++) {
                    dataInputStream = this.e;
                    dataInputStream[i2] = new aa(dataInputStream.readInt(), dataInputStream.readShort());
                }
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e) {
                        return;
                    }
                }
                dataInputStream.close();
            } catch (IOException e2) {
                dataInputStream.printStackTrace();
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
                dataInputStream.close();
            }
        } catch (Throwable th) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                    throw th;
                }
            }
            dataInputStream.close();
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

    private void a(bc bcVar, short s, short s2, short s3) {
        if (bcVar.k == null) {
            return;
        }
        if (bcVar.g == null || bcVar.h == null) {
            bcVar.g = new short[bcVar.k.length];
            bcVar.h = new short[bcVar.k.length];
            if (bcVar.k == null) {
                return;
            }
            for (int i = 0; i < bcVar.k.length; i++) {
                if (bcVar.k[i] != null) {
                    for (int i2 = 0; i2 < bcVar.k[i].length; i2++) {
                        if (bcVar.k[i][i2] != null && bcVar.k[i][i2].a == null) {
                            bcVar.k[i][i2].a = a(bcVar.k[i][i2].b, s, s2, s3);
                        }
                    }
                    bx[] bxVarArr = bcVar.k[i];
                    int i3 = i;
                    int iMin = 0;
                    int iMin2 = 0;
                    int iMax = 0;
                    int iMax2 = 0;
                    if (bxVarArr != null) {
                        if (bxVarArr.length > 0 && bxVarArr[0].a != null) {
                            ajVarA = bxVarArr[0].a.o == 0 ? ((bf) bxVarArr[0].a).a(bxVarArr[0].d) : null;
                            iMin = bxVarArr[0].e;
                            iMin2 = bxVarArr[0].f;
                            iMax = bxVarArr[0].e + (ajVarA == null ? (short) 0 : ajVarA.c);
                            iMax2 = bxVarArr[0].f + (ajVarA == null ? (short) 0 : ajVarA.d);
                        }
                        for (bx bxVar : bxVarArr) {
                            if (bxVarArr[0].a != null && bxVarArr[0].a.o == 0) {
                                ajVarA = ((bf) bxVar.a).a(bxVar.d);
                            }
                            iMin = Math.min((int) bxVar.e, iMin);
                            iMin2 = Math.min(iMin2, (int) bxVar.f);
                            iMax = Math.max(iMax, bxVar.e + (ajVarA == null ? (short) 0 : ajVarA.c));
                            iMax2 = Math.max(iMax2, bxVar.f + (ajVarA == null ? (short) 0 : ajVarA.d));
                        }
                        bcVar.g[i3] = (short) Math.abs(iMax - iMin);
                        bcVar.h[i3] = (short) Math.abs(iMax2 - iMin2);
                    }
                }
            }
            if (bcVar.g != null) {
                bcVar.i = (byte) (bcVar.g[0] / 2);
                bcVar.j = (byte) bcVar.h[0];
            }
        }
    }

    private void c(aw awVar) {
        bx bxVar;
        cf cfVarA;
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
                        bxVar = awVar.l[i4];
                        short s = awVar.l[i4].b;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= this.c.size()) {
                                t.a(new StringBuffer().append("no resource ").append((int) s).toString());
                                cfVarA = null;
                                break;
                            }
                            if (this.c.elementAt(i5) instanceof bc) {
                                cf cfVar = (bc) this.c.elementAt(i5);
                                if (cfVar.p != null && cfVar.p.b == s) {
                                    cfVarA = cfVar;
                                    break;
                                }
                            }
                            i5++;
                        }
                    }
                    bxVar.a = cfVarA;
                }
            }
        }
    }

    private bc c(short s, short s2, short s3, short s4) {
        for (int i = 0; i < this.c.size(); i++) {
            cf cfVar = (cf) this.c.elementAt(i);
            if (cfVar.o == 2 && cfVar.p != null && cfVar.p.b == s) {
                bc bcVar = (bc) cfVar;
                if (bcVar.a == s2 && bcVar.b == s3 && bcVar.c == s4) {
                    return bcVar;
                }
            }
        }
        return null;
    }

    private bf d(short s, short s2, short s3, short s4) {
        for (int i = 0; i < this.c.size(); i++) {
            cf cfVar = (cf) this.c.elementAt(i);
            if (cfVar.o == 0 && cfVar.p != null && cfVar.p.b == s) {
                bf bfVar = (bf) cfVar;
                if (bfVar.e == s2 && bfVar.f == s3 && bfVar.g == s4) {
                    return bfVar;
                }
            }
        }
        return null;
    }

    private static int[] a(Vector vector, byte b) {
        int[] iArr = new int[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            iArr[i] = a((String) vector.elementAt(i), b);
        }
        return iArr;
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

    public static int a(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i;
            i++;
            i2 = (i2 * 31) + cArr[i4];
        }
        return i2;
    }

    public static int a(String str, byte b) {
        return a(b(str, b).toCharArray());
    }

    public static String b(String str, byte b) {
        if (b == 0) {
            str = new StringBuffer().append(str).append("p").toString();
        } else if (b == 2) {
            str = new StringBuffer().append(str).append("s").toString();
        } else if (b == 3) {
            str = new StringBuffer().append(str).append("m").toString();
        }
        return str;
    }
}
