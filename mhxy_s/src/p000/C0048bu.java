package p000;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Vector;

/* renamed from: bu */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0048bu {

    /* renamed from: a */
    private String f1773a;

    /* renamed from: b */
    private String f1774b;

    /* renamed from: c */
    private Vector f1775c = new Vector();

    /* renamed from: d */
    private Vector f1776d = new Vector();

    /* renamed from: e */
    private C0001aa[] f1777e;

    public C0048bu(String str, String str2) throws IOException {
        this.f1773a = str2;
        this.f1774b = str;
        m981e();
    }

    public C0048bu(String str, byte[] bArr) {
        this.f1773a = str;
        this.f1774b = new StringBuffer().append("/").append(this.f1773a).append("/").toString();
        m978c(bArr);
    }

    /* renamed from: a */
    public static int m955a(String str, byte b) {
        return m956a(m971b(str, b).toCharArray());
    }

    /* renamed from: a */
    public static int m956a(char[] cArr) {
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

    /* renamed from: a */
    private C0001aa m957a(short s) {
        for (int i = 0; i < this.f1777e.length; i++) {
            if (this.f1777e[i] != null && this.f1777e[i].f1b == s) {
                return this.f1777e[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C0023aw m958a(byte[][] bArr) {
        C0023aw c0023aw = new C0023aw();
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0]));
        try {
            try {
                c0023aw.f468m = (short[][]) Array.newInstance((Class<?>) Short.TYPE, dataInputStream.readByte(), 4);
                for (int i = 0; i < c0023aw.f468m.length; i++) {
                    c0023aw.f468m[i][0] = dataInputStream.readShort();
                    c0023aw.f468m[i][1] = dataInputStream.readShort();
                    c0023aw.f468m[i][2] = dataInputStream.readShort();
                    c0023aw.f468m[i][3] = dataInputStream.readShort();
                }
                c0023aw.f456a = dataInputStream.readShort();
                c0023aw.f457b = dataInputStream.readShort();
                c0023aw.f458c = dataInputStream.readByte();
                c0023aw.f459d = dataInputStream.readByte();
                c0023aw.f460e = dataInputStream.readByte();
                c0023aw.f461f = dataInputStream.readByte();
                c0023aw.f462g = (byte) ((c0023aw.f456a % c0023aw.f458c == 0 ? 0 : 1) + (c0023aw.f456a / c0023aw.f458c));
                c0023aw.f463h = (byte) ((c0023aw.f457b % c0023aw.f459d == 0 ? 0 : 1) + (c0023aw.f457b / c0023aw.f459d));
                int i2 = (c0023aw.f456a / c0023aw.f460e) + (c0023aw.f456a % c0023aw.f460e == 0 ? 0 : 1);
                c0023aw.f464i = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, (c0023aw.f457b % c0023aw.f461f == 0 ? 0 : 1) + (c0023aw.f457b / c0023aw.f461f));
                int i3 = dataInputStream.readShort();
                short[] sArr = new short[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    sArr[i4] = dataInputStream.readShort();
                    c0023aw.f464i[sArr[i4] % i2][sArr[i4] / i2] = 1;
                }
                c0023aw.f465j = (C0051bx[][]) Array.newInstance((Class<?>) C0051bx.class, c0023aw.f462g, c0023aw.f463h);
                for (int i5 = 0; i5 < c0023aw.f465j.length; i5++) {
                    for (int i6 = 0; i6 < c0023aw.f465j[i5].length; i6++) {
                        if (dataInputStream.readByte() >= 0) {
                            c0023aw.f465j[i5][i6] = new C0051bx();
                            c0023aw.f465j[i5][i6].m1020a(dataInputStream, true);
                        }
                    }
                }
                int i7 = dataInputStream.readShort();
                if (i7 > 0) {
                    c0023aw.f466k = new C0051bx[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        c0023aw.f466k[i8] = new C0051bx();
                        c0023aw.f466k[i8].m1020a(dataInputStream, true);
                    }
                }
                int i9 = dataInputStream.readShort();
                if (i9 > 0) {
                    c0023aw.f467l = new C0051bx[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        c0023aw.f467l[i10] = new C0051bx();
                        c0023aw.f467l[i10].m1020a(dataInputStream, true);
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
            return c0023aw;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    /* renamed from: a */
    private C0033bf m959a(short s, short s2, short s3, short s4) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1775c.size()) {
                return null;
            }
            if (this.f1775c.elementAt(i2) instanceof C0033bf) {
                C0033bf c0033bf = (C0033bf) this.f1775c.elementAt(i2);
                if (c0033bf.f1957p != null && c0033bf.f1957p.f1b == s && c0033bf.f602e == s2 && c0033bf.f603f == s3 && c0033bf.f604g == s4) {
                    return c0033bf;
                }
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private static C0033bf m960a(byte[][] bArr, short s, short s2, short s3) throws Throwable {
        DataInputStream dataInputStream;
        C0033bf c0033bf = new C0033bf(s, s2, s3);
        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr[1]));
        try {
            c0033bf.f599b = (short) dataInputStream2.readInt();
            c0033bf.f600c = (short) dataInputStream2.readInt();
            if (bArr[0] == null || bArr[0].length <= 4) {
                c0033bf.f601d = new C0010aj[1];
                c0033bf.f601d[0] = new C0010aj((short) 0, (short) 0, c0033bf.f599b, c0033bf.f600c);
                dataInputStream = dataInputStream2;
            } else {
                dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr[0], 2, bArr[0].length - 2));
                try {
                    try {
                        int i = dataInputStream.readByte();
                        c0033bf.f601d = new C0010aj[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            c0033bf.f601d[i2] = new C0010aj(dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort(), dataInputStream.readShort());
                        }
                        if (i == 0) {
                            c0033bf.f601d = new C0010aj[1];
                            c0033bf.f601d[0] = new C0010aj((short) 0, (short) 0, c0033bf.f599b, c0033bf.f600c);
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
                    return c0033bf;
                }
            }
            dataInputStream.close();
            c0033bf.m651a(bArr, true);
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
        return c0033bf;
    }

    /* renamed from: a */
    private DataInputStream m961a(C0001aa c0001aa) {
        byte[] bArr;
        InputStream resourceAsStream;
        if (this.f1773a.equals(C0047bt.f1389kX) && C0047bt.f1390kY != null) {
            short s = 0;
            while (true) {
                short s2 = s;
                if (s2 >= C0047bt.f1390kY.size()) {
                    bArr = null;
                    break;
                }
                C0075g c0075g = (C0075g) C0047bt.f1390kY.elementAt(s2);
                if (c0075g.f2270a == c0001aa.f0a) {
                    bArr = c0075g.f2271b;
                    break;
                }
                s = (short) (s2 + 1);
            }
        } else {
            this.f1773a.equals(null);
            bArr = null;
        }
        if (bArr != null) {
            return new DataInputStream(new ByteArrayInputStream(bArr));
        }
        DataInputStream dataInputStream = (!this.f1773a.equals(C0047bt.f1389kX) || (resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append(this.f1774b).append(c0001aa.f0a).append(".rpg").toString())) == null) ? null : new DataInputStream(resourceAsStream);
        if (dataInputStream != null) {
            return dataInputStream;
        }
        InputStream resourceAsStream2 = getClass().getResourceAsStream(new StringBuffer().append(this.f1774b).append((int) c0001aa.f1b).append(".rpg").toString());
        if (resourceAsStream2 == null) {
            return null;
        }
        return new DataInputStream(resourceAsStream2);
    }

    /* renamed from: a */
    private void m962a(C0001aa c0001aa, DataInputStream dataInputStream, short s, short s2, short s3) {
        short[] sArr;
        C0030bc c0030bcM970b = m970b(m969a(dataInputStream, 0), s, s2, s3);
        this.f1776d.removeAllElements();
        if (c0030bcM970b == null || c0030bcM970b.f571k == null) {
            sArr = null;
        } else {
            for (int i = 0; i < c0030bcM970b.f571k.length; i++) {
                if (c0030bcM970b.f571k[i] != null) {
                    for (int i2 = 0; i2 < c0030bcM970b.f571k[i].length; i2++) {
                        if (c0030bcM970b.f571k[i][i2] != null) {
                            String strValueOf = String.valueOf((int) c0030bcM970b.f571k[i][i2].f1794b);
                            if (!this.f1776d.contains(strValueOf)) {
                                this.f1776d.addElement(strValueOf);
                            }
                        }
                    }
                }
            }
            sArr = new short[this.f1776d.size()];
            for (int i3 = 0; i3 < this.f1776d.size(); i3++) {
                sArr[i3] = Short.parseShort((String) this.f1776d.elementAt(i3));
            }
            this.f1776d.removeAllElements();
        }
        if (sArr != null) {
            for (int i4 = 0; i4 < sArr.length; i4++) {
                if (sArr[i4] >= 0) {
                    if (m980d(sArr[i4], s, s2, s3) != null) {
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
                    m973b(sArr[i6], s, s2, s3);
                }
            }
        }
        m964a(c0030bcM970b, s, s2, s3);
        c0030bcM970b.f1957p = c0001aa;
        this.f1775c.addElement(c0030bcM970b);
    }

    /* renamed from: a */
    private void m963a(C0023aw c0023aw) {
        this.f1776d.removeAllElements();
        if (c0023aw.f465j != null) {
            for (int i = 0; i < c0023aw.f465j.length; i++) {
                for (int i2 = 0; i2 < c0023aw.f465j[i].length; i2++) {
                    if (c0023aw.f465j[i][i2] != null) {
                        String strValueOf = String.valueOf((int) c0023aw.f465j[i][i2].f1794b);
                        if (!this.f1776d.contains(strValueOf)) {
                            this.f1776d.addElement(strValueOf);
                        }
                    }
                }
            }
        }
        if (c0023aw.f466k != null) {
            for (int i3 = 0; i3 < c0023aw.f466k.length; i3++) {
                if (c0023aw.f466k[i3] != null) {
                    String strValueOf2 = String.valueOf((int) c0023aw.f466k[i3].f1794b);
                    if (!this.f1776d.contains(strValueOf2)) {
                        this.f1776d.addElement(strValueOf2);
                    }
                }
            }
        }
        if (c0023aw.f467l != null) {
            for (int i4 = 0; i4 < c0023aw.f467l.length; i4++) {
                if (c0023aw.f467l[i4] != null && c0023aw.f467l[i4].f1795c == 0) {
                    String strValueOf3 = String.valueOf((int) c0023aw.f467l[i4].f1794b);
                    if (!this.f1776d.contains(strValueOf3)) {
                        this.f1776d.addElement(strValueOf3);
                    }
                }
            }
        }
        short[] sArr = new short[this.f1776d.size()];
        for (int i5 = 0; i5 < this.f1776d.size(); i5++) {
            sArr[i5] = Short.parseShort((String) this.f1776d.elementAt(i5));
        }
        this.f1776d.removeAllElements();
        for (int i6 = 0; i6 < sArr.length; i6++) {
            if (sArr[i6] >= 0) {
                short sM605a = c0023aw.m605a(sArr[i6]);
                if (m980d(sArr[i6], sM605a < 0 ? (short) 0 : c0023aw.f468m[sM605a][1], sM605a < 0 ? (short) 0 : c0023aw.f468m[sM605a][2], sM605a < 0 ? (short) 0 : c0023aw.f468m[sM605a][3]) != null) {
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
                short sM605a2 = c0023aw.m605a(sArr[i8]);
                if (sM605a2 >= 0) {
                    m973b(sArr[i8], c0023aw.f468m[sM605a2][1], c0023aw.f468m[sM605a2][2], c0023aw.f468m[sM605a2][3]);
                } else {
                    m973b(sArr[i8], (short) 0, (short) 0, (short) 0);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v47, types: [int] */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* renamed from: a */
    private void m964a(C0030bc c0030bc, short s, short s2, short s3) {
        if (c0030bc.f571k == null) {
            return;
        }
        if (c0030bc.f567g == null || c0030bc.f568h == null) {
            c0030bc.f567g = new short[c0030bc.f571k.length];
            c0030bc.f568h = new short[c0030bc.f571k.length];
            if (c0030bc.f571k != null) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= c0030bc.f571k.length) {
                        break;
                    }
                    if (c0030bc.f571k[i2] != null) {
                        for (int i3 = 0; i3 < c0030bc.f571k[i2].length; i3++) {
                            if (c0030bc.f571k[i2][i3] != null && c0030bc.f571k[i2][i3].f1793a == null) {
                                c0030bc.f571k[i2][i3].f1793a = m959a(c0030bc.f571k[i2][i3].f1794b, s, s2, s3);
                            }
                        }
                        C0051bx[] c0051bxArr = c0030bc.f571k[i2];
                        short s4 = 0;
                        short s5 = 0;
                        int i4 = 0;
                        short s6 = 0;
                        s6 = 0;
                        if (c0051bxArr != null) {
                            if (c0051bxArr.length > 0 && c0051bxArr[0].f1793a != null) {
                                c0010ajM650a = c0051bxArr[0].f1793a.f1956o == 0 ? ((C0033bf) c0051bxArr[0].f1793a).m650a(c0051bxArr[0].f1796d) : null;
                                s4 = c0051bxArr[0].f1797e;
                                s5 = c0051bxArr[0].f1798f;
                                i4 = c0051bxArr[0].f1797e + (c0010ajM650a == null ? (short) 0 : c0010ajM650a.f97c);
                                s6 = (c0010ajM650a == null ? (short) 0 : c0010ajM650a.f98d) + c0051bxArr[0].f1798f;
                            }
                            int i5 = 0;
                            short sMax = s6;
                            int i6 = i4;
                            short s7 = s5;
                            int iMin = s4;
                            while (i5 < c0051bxArr.length) {
                                C0051bx c0051bx = c0051bxArr[i5];
                                if (c0051bxArr[0].f1793a != null && c0051bxArr[0].f1793a.f1956o == 0) {
                                    c0010ajM650a = ((C0033bf) c0051bx.f1793a).m650a(c0051bx.f1796d);
                                }
                                iMin = Math.min((int) c0051bx.f1797e, iMin);
                                ?? Min = Math.min((int) s7, (int) c0051bx.f1798f);
                                int iMax = Math.max(i6, (c0010ajM650a == null ? (short) 0 : c0010ajM650a.f97c) + c0051bx.f1797e);
                                i5++;
                                sMax = Math.max((int) sMax, (c0010ajM650a == null ? (short) 0 : c0010ajM650a.f98d) + c0051bx.f1798f);
                                i6 = iMax;
                                s7 = Min;
                            }
                            c0030bc.f567g[i2] = (short) Math.abs(i6 - iMin);
                            c0030bc.f568h[i2] = (short) Math.abs(sMax - s7);
                        }
                    }
                    i = i2 + 1;
                }
                if (c0030bc.f567g != null) {
                    c0030bc.f569i = (byte) (c0030bc.f567g[0] / 2);
                    c0030bc.f570j = (byte) c0030bc.f568h[0];
                }
            }
        }
    }

    /* renamed from: a */
    private void m965a(int[] iArr, short[] sArr, short[] sArr2, short[] sArr3) {
        short[] sArr4 = new short[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            C0001aa c0001aaM979d = m979d(iArr[i]);
            if (c0001aaM979d != null) {
                sArr4[i] = c0001aaM979d.f1b;
            } else {
                sArr4[i] = -1;
            }
        }
        m966a(sArr4, sArr, sArr2, sArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8, types: [bc] */
    /* renamed from: a */
    private void m966a(short[] sArr, short[] sArr2, short[] sArr3, short[] sArr4) {
        short sM976c;
        boolean z = (sArr2 == null || sArr3 == null || sArr4 == null) ? false : true;
        for (int i = 0; i < sArr.length; i++) {
            short s = z ? sArr2[i] : (short) 0;
            short s2 = z ? sArr3[i] : (short) 0;
            short s3 = z ? sArr4[i] : (short) 0;
            sM976c = sArr[i];
            if (sM976c >= 0) {
                sM976c = m976c(sArr[i], s, s2, s3);
                if (sM976c != 0) {
                    sArr[i] = -1;
                } else {
                    sM976c = i + 1;
                    while (sM976c < sArr.length) {
                        if (sArr[sM976c] >= 0 && sArr[i] == sArr[sM976c]) {
                            if (s == (z ? sArr2[sM976c] : (short) 0)) {
                                if (s2 == (z ? sArr3[sM976c] : (short) 0)) {
                                    if (s3 == (z ? sArr4[sM976c] : (short) 0)) {
                                        sArr[i] = -1;
                                    }
                                }
                            }
                        }
                        sM976c++;
                    }
                }
            }
        }
        int i2 = 0;
        while (i2 < sArr.length) {
            short s4 = z ? sArr2[i2] : (short) 0;
            short s5 = z ? sArr3[i2] : (short) 0;
            short s6 = z ? sArr4[i2] : (short) 0;
            sM976c = sM976c;
            if (sArr[i2] >= 0 || s4 != 0 || s5 != 0 || s6 != 0) {
                C0030bc c0030bcM976c = m976c(sArr[i2], s4, s5, s6);
                if (c0030bcM976c == null) {
                    sM976c = 0;
                    C0001aa c0001aaM957a = m957a(sArr[i2]);
                    if (c0001aaM957a != null) {
                        DataInputStream dataInputStreamM961a = m961a(c0001aaM957a);
                        sM976c = dataInputStreamM961a;
                        if (dataInputStreamM961a != null) {
                            m962a(c0001aaM957a, dataInputStreamM961a, s4, s5, s6);
                            sM976c = dataInputStreamM961a;
                            if (dataInputStreamM961a != null) {
                                try {
                                    dataInputStreamM961a.close();
                                    sM976c = dataInputStreamM961a;
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    sM976c = dataInputStreamM961a;
                                }
                            }
                        } else if (dataInputStreamM961a != null) {
                            try {
                                dataInputStreamM961a.close();
                                sM976c = dataInputStreamM961a;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                sM976c = dataInputStreamM961a;
                            }
                        }
                    }
                } else {
                    this.f1775c.addElement(c0030bcM976c.m626a(s4, s5, s6));
                    sM976c = sM976c;
                }
            }
            while (true) {
                try {
                    try {
                        i2++;
                        break;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        if (sM976c != 0) {
                            try {
                                sM976c.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (sM976c != 0) {
                        try {
                            sM976c.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    private static int[] m967a(Vector vector, byte b) {
        int[] iArr = new int[vector.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= vector.size()) {
                return iArr;
            }
            iArr[i2] = m955a((String) vector.elementAt(i2), b);
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private static int[] m968a(String[] strArr, byte b) {
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("")) {
                iArr[i] = -1;
            } else {
                iArr[i] = m955a(strArr[i], (byte) 2);
            }
        }
        return iArr;
    }

    /* renamed from: a */
    private static byte[][] m969a(DataInputStream dataInputStream, int i) throws IOException {
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

    /* renamed from: b */
    private static C0030bc m970b(byte[][] bArr, short s, short s2, short s3) {
        C0030bc c0030bc = new C0030bc(s, s2, s3);
        c0030bc.m627a(bArr);
        return c0030bc;
    }

    /* renamed from: b */
    public static String m971b(String str, byte b) {
        return b == 0 ? new StringBuffer().append(str).append("p").toString() : b == 2 ? new StringBuffer().append(str).append("s").toString() : b == 3 ? new StringBuffer().append(str).append("m").toString() : str;
    }

    /* renamed from: b */
    private void m972b(C0001aa c0001aa, DataInputStream dataInputStream, short s, short s2, short s3) throws Throwable {
        C0033bf c0033bfM960a = m960a(m969a(dataInputStream, 0), s, s2, s3);
        c0033bfM960a.f1957p = c0001aa;
        this.f1775c.addElement(c0033bfM960a);
    }

    /* renamed from: b */
    private void m973b(short s, short s2, short s3, short s4) {
        if (m980d(s, s2, s3, s4) != null) {
            return;
        }
        DataInputStream dataInputStreamM961a = null;
        try {
            try {
                C0001aa c0001aaM957a = m957a(s);
                if (c0001aaM957a != null) {
                    dataInputStreamM961a = m961a(c0001aaM957a);
                    if (dataInputStreamM961a != null) {
                        m972b(c0001aaM957a, dataInputStreamM961a, s2, s3, s4);
                        if (dataInputStreamM961a != null) {
                            try {
                                dataInputStreamM961a.close();
                            } catch (IOException e) {
                            }
                        }
                    } else if (dataInputStreamM961a != null) {
                        try {
                            dataInputStreamM961a.close();
                        } catch (IOException e2) {
                        }
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        dataInputStreamM961a.close();
                    } catch (IOException e4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (dataInputStreamM961a != null) {
                try {
                    dataInputStreamM961a.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    private short[] m974b(C0023aw c0023aw) {
        this.f1776d.removeAllElements();
        if (c0023aw.f467l != null) {
            for (int i = 0; i < c0023aw.f467l.length; i++) {
                if (c0023aw.f467l[i] != null && c0023aw.f467l[i].f1795c == 2) {
                    String strValueOf = String.valueOf((int) c0023aw.f467l[i].f1794b);
                    if (!this.f1776d.contains(strValueOf)) {
                        this.f1776d.addElement(strValueOf);
                    }
                }
            }
        }
        short[] sArr = new short[this.f1776d.size()];
        for (int i2 = 0; i2 < this.f1776d.size(); i2++) {
            sArr[i2] = Short.parseShort((String) this.f1776d.elementAt(i2));
        }
        this.f1776d.removeAllElements();
        return sArr;
    }

    /* renamed from: b */
    private static byte[][] m975b(byte[] bArr) {
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

    /* renamed from: c */
    private C0030bc m976c(short s, short s2, short s3, short s4) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1775c.size()) {
                return null;
            }
            AbstractC0060cf abstractC0060cf = (AbstractC0060cf) this.f1775c.elementAt(i2);
            if (abstractC0060cf.f1956o == 2 && abstractC0060cf.f1957p != null && abstractC0060cf.f1957p.f1b == s) {
                C0030bc c0030bc = (C0030bc) abstractC0060cf;
                if (c0030bc.f561a == s2 && c0030bc.f562b == s3 && c0030bc.f563c == s4) {
                    return c0030bc;
                }
            }
            i = i2 + 1;
        }
    }

    /* renamed from: c */
    private void m977c(C0023aw c0023aw) {
        AbstractC0060cf abstractC0060cfM959a;
        C0051bx c0051bx;
        if (c0023aw.f465j != null) {
            for (int i = 0; i < c0023aw.f465j.length; i++) {
                for (int i2 = 0; i2 < c0023aw.f465j[i].length; i2++) {
                    if (c0023aw.f465j[i][i2] != null) {
                        short sM605a = c0023aw.m605a(c0023aw.f465j[i][i2].f1794b);
                        if (sM605a != -1) {
                            c0023aw.f465j[i][i2].f1793a = m959a(c0023aw.f465j[i][i2].f1794b, c0023aw.f468m[sM605a][1], c0023aw.f468m[sM605a][2], c0023aw.f468m[sM605a][3]);
                        } else {
                            c0023aw.f465j[i][i2].f1793a = m959a(c0023aw.f465j[i][i2].f1794b, (short) 0, (short) 0, (short) 0);
                        }
                    }
                }
            }
        }
        if (c0023aw.f466k != null) {
            for (int i3 = 0; i3 < c0023aw.f466k.length; i3++) {
                if (c0023aw.f466k[i3] != null) {
                    short sM605a2 = c0023aw.m605a(c0023aw.f466k[i3].f1794b);
                    if (sM605a2 != -1) {
                        c0023aw.f466k[i3].f1793a = m959a(c0023aw.f466k[i3].f1794b, c0023aw.f468m[sM605a2][1], c0023aw.f468m[sM605a2][2], c0023aw.f468m[sM605a2][3]);
                    } else {
                        c0023aw.f466k[i3].f1793a = m959a(c0023aw.f466k[i3].f1794b, (short) 0, (short) 0, (short) 0);
                    }
                }
            }
        }
        if (c0023aw.f467l != null) {
            for (int i4 = 0; i4 < c0023aw.f467l.length; i4++) {
                if (c0023aw.f467l[i4] != null) {
                    if (c0023aw.f467l[i4].f1795c == 0) {
                        short sM605a3 = c0023aw.m605a(c0023aw.f467l[i4].f1794b);
                        if (sM605a3 != -1) {
                            c0051bx = c0023aw.f467l[i4];
                            abstractC0060cfM959a = m959a(c0023aw.f467l[i4].f1794b, c0023aw.f468m[sM605a3][1], c0023aw.f468m[sM605a3][2], c0023aw.f468m[sM605a3][3]);
                        } else {
                            c0051bx = c0023aw.f467l[i4];
                            abstractC0060cfM959a = m959a(c0023aw.f467l[i4].f1794b, (short) 0, (short) 0, (short) 0);
                        }
                    } else if (c0023aw.f467l[i4].f1795c == 2) {
                        C0051bx c0051bx2 = c0023aw.f467l[i4];
                        short s = c0023aw.f467l[i4].f1794b;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= this.f1775c.size()) {
                                C0088t.m1679a(new StringBuffer().append("no resource ").append((int) s).toString());
                                abstractC0060cfM959a = null;
                                c0051bx = c0051bx2;
                                break;
                            } else {
                                if (this.f1775c.elementAt(i5) instanceof C0030bc) {
                                    abstractC0060cfM959a = (C0030bc) this.f1775c.elementAt(i5);
                                    if (abstractC0060cfM959a.f1957p != null && abstractC0060cfM959a.f1957p.f1b == s) {
                                        c0051bx = c0051bx2;
                                        break;
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                    c0051bx.f1793a = abstractC0060cfM959a;
                }
            }
        }
    }

    /* renamed from: c */
    private void m978c(byte[] bArr) {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            try {
                int i = dataInputStream.readShort();
                this.f1777e = new C0001aa[i];
                for (int i2 = 0; i2 < i; i2++) {
                    this.f1777e[i2] = new C0001aa(dataInputStream.readInt(), dataInputStream.readShort());
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

    /* renamed from: d */
    private C0001aa m979d(int i) {
        for (int i2 = 0; i2 < this.f1777e.length; i2++) {
            if (this.f1777e[i2] != null && this.f1777e[i2].f0a == i) {
                return this.f1777e[i2];
            }
        }
        return null;
    }

    /* renamed from: d */
    private C0033bf m980d(short s, short s2, short s3, short s4) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1775c.size()) {
                return null;
            }
            AbstractC0060cf abstractC0060cf = (AbstractC0060cf) this.f1775c.elementAt(i2);
            if (abstractC0060cf.f1956o == 0 && abstractC0060cf.f1957p != null && abstractC0060cf.f1957p.f1b == s) {
                C0033bf c0033bf = (C0033bf) abstractC0060cf;
                if (c0033bf.f602e == s2 && c0033bf.f603f == s3 && c0033bf.f604g == s4) {
                    return c0033bf;
                }
            }
            i = i2 + 1;
        }
    }

    /* renamed from: e */
    private void m981e() throws IOException {
        InputStream resourceAsStream = getClass().getResourceAsStream(new StringBuffer().append("/").append(this.f1773a).append(".rule").toString());
        DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
        try {
            try {
                int i = dataInputStream.readShort();
                this.f1777e = new C0001aa[i];
                for (int i2 = 0; i2 < i; i2++) {
                    this.f1777e[i2] = new C0001aa(dataInputStream.readInt(), dataInputStream.readShort());
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

    /* renamed from: a */
    public final C0023aw m982a(byte[] bArr) {
        C0023aw c0023awM958a = m958a(m975b(bArr));
        m963a(c0023awM958a);
        m966a(m974b(c0023awM958a), (short[]) null, (short[]) null, (short[]) null);
        m977c(c0023awM958a);
        return c0023awM958a;
    }

    /* renamed from: a */
    public final C0030bc m983a(int i, short s, short s2, short s3) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f1775c.size()) {
                return null;
            }
            if (this.f1775c.elementAt(i3) instanceof C0030bc) {
                C0030bc c0030bc = (C0030bc) this.f1775c.elementAt(i3);
                if (c0030bc.f1957p != null && c0030bc.f1957p.f0a == i && c0030bc.f561a == s && c0030bc.f562b == s2 && c0030bc.f563c == s3) {
                    return c0030bc;
                }
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    public final C0030bc m984a(String str, short s, short s2, short s3) {
        return m983a(m956a(m971b(str, (byte) 2).toCharArray()), s, s2, s3);
    }

    /* renamed from: a */
    public final C0033bf m985a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        int iM956a = m956a(m971b(str, (byte) 0).toCharArray());
        while (true) {
            int i2 = i;
            if (i2 >= this.f1775c.size()) {
                return null;
            }
            if (this.f1775c.elementAt(i2) instanceof C0033bf) {
                C0033bf c0033bf = (C0033bf) this.f1775c.elementAt(i2);
                if (c0033bf.f1957p != null && c0033bf.f1957p.f0a == iM956a) {
                    return c0033bf;
                }
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    public final Vector m986a() {
        return this.f1775c;
    }

    /* renamed from: a */
    public final void m987a(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f1775c.size()) {
                return;
            }
            AbstractC0060cf abstractC0060cf = (AbstractC0060cf) this.f1775c.elementAt(i3);
            if (abstractC0060cf.f1957p != null && abstractC0060cf.f1957p.f0a == i) {
                this.f1775c.removeElement(abstractC0060cf);
                return;
            }
            i2 = i3 + 1;
        }
    }

    /* renamed from: a */
    public final void m988a(Vector vector, short[] sArr, short[] sArr2, short[] sArr3) {
        m965a(m967a(vector, (byte) 2), sArr, sArr2, sArr3);
    }

    /* renamed from: a */
    public final void m989a(String[] strArr) {
        m965a(m968a(strArr, (byte) 2), (short[]) null, (short[]) null, (short[]) null);
    }

    /* renamed from: a */
    public final void m990a(String[] strArr, short[] sArr, short[] sArr2, short[] sArr3) {
        m965a(m968a(strArr, (byte) 2), sArr, sArr2, sArr3);
    }

    /* renamed from: b */
    public final C0030bc m991b(String str) {
        return m983a(m956a(m971b(str, (byte) 2).toCharArray()), (short) 0, (short) 0, (short) 0);
    }

    /* renamed from: b */
    public final short m992b() {
        return (short) this.f1775c.size();
    }

    /* renamed from: b */
    public final void m993b(String str, short s, short s2, short s3) {
        C0030bc c0030bc;
        DataInputStream dataInputStreamM961a = null;
        int iM955a = m955a(str, (byte) 2);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f1775c.size()) {
                c0030bc = null;
                break;
            }
            AbstractC0060cf abstractC0060cf = (AbstractC0060cf) this.f1775c.elementAt(i2);
            if (abstractC0060cf.f1956o == 2 && abstractC0060cf.f1957p != null && abstractC0060cf.f1957p.f0a == iM955a) {
                c0030bc = (C0030bc) abstractC0060cf;
                if (c0030bc.f561a != s || c0030bc.f562b != s2 || c0030bc.f563c != s3) {
                }
            }
            i = i2 + 1;
        }
        try {
            if (c0030bc != null) {
                return;
            }
            try {
                C0001aa c0001aaM979d = m979d(iM955a);
                if (c0001aaM979d != null) {
                    dataInputStreamM961a = m961a(c0001aaM979d);
                    if (dataInputStreamM961a != null) {
                        m962a(c0001aaM979d, dataInputStreamM961a, s, s2, s3);
                        if (dataInputStreamM961a != null) {
                            try {
                                dataInputStreamM961a.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } else if (dataInputStreamM961a != null) {
                        try {
                            dataInputStreamM961a.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        dataInputStreamM961a.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            if (dataInputStreamM961a != null) {
                try {
                    dataInputStreamM961a.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m994b(Vector vector, short[] sArr, short[] sArr2, short[] sArr3) {
        int[] iArrM967a = m967a(vector, (byte) 0);
        short[] sArr4 = new short[iArrM967a.length];
        for (int i = 0; i < iArrM967a.length; i++) {
            C0001aa c0001aaM979d = m979d(iArrM967a[i]);
            if (c0001aaM979d != null) {
                sArr4[i] = c0001aaM979d.f1b;
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
                if (m980d(sArr4[i2], s, s2, s3) != null) {
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
                m973b(sArr4[i4], z ? sArr5[i4] : (short) 0, z ? sArr6[i4] : (short) 0, z ? sArr7[i4] : (short) 0);
            }
        }
    }

    /* renamed from: b */
    public final boolean m995b(int i) {
        for (int i2 = 0; i2 < this.f1775c.size(); i2++) {
            AbstractC0060cf abstractC0060cf = (AbstractC0060cf) this.f1775c.elementAt(i2);
            if (abstractC0060cf.f1957p != null && abstractC0060cf.f1957p.f0a == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C0023aw m996c(java.lang.String r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r5 = 3
            r0 = 0
            r2 = 0
            java.lang.String r1 = m971b(r9, r5)
            char[] r1 = r1.toCharArray()
            int r3 = m956a(r1)
            r1 = r0
        L10:
            java.util.Vector r0 = r8.f1775c
            int r0 = r0.size()
            if (r1 >= r0) goto L37
            java.util.Vector r0 = r8.f1775c
            java.lang.Object r0 = r0.elementAt(r1)
            cf r0 = (p000.AbstractC0060cf) r0
            byte r4 = r0.f1956o
            if (r4 != r5) goto L33
            aa r4 = r0.f1957p
            if (r4 == 0) goto L33
            aa r4 = r0.f1957p
            int r4 = r4.f0a
            if (r4 != r3) goto L33
            aw r0 = (p000.C0023aw) r0
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
            aa r3 = r8.m979d(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L80
            if (r3 != 0) goto L41
            r0 = r2
            goto L32
        L41:
            java.io.DataInputStream r1 = r8.m961a(r3)     // Catch: java.io.IOException -> L74 java.lang.Throwable -> L80
            if (r1 != 0) goto L4e
            if (r1 == 0) goto L4c
            r1.close()     // Catch: java.io.IOException -> L88
        L4c:
            r0 = r2
            goto L32
        L4e:
            r0 = 0
            byte[][] r0 = m969a(r1, r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            aw r0 = m958a(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r1.close()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r8.m963a(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            short[] r4 = r8.m974b(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r5 = 0
            r6 = 0
            r7 = 0
            r8.m966a(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r8.m977c(r0)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            r0.f1957p = r3     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0048bu.m996c(java.lang.String):aw");
    }

    /* renamed from: c */
    public final C0030bc m997c(int i) {
        return m983a(i, (short) 0, (short) 0, (short) 0);
    }

    /* renamed from: c */
    public final void m998c() {
        this.f1775c.removeAllElements();
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m999d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0048bu.m999d():void");
    }

    /* renamed from: d */
    public final void m1000d(String str) {
        m993b(str, (short) 0, (short) 0, (short) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1001e(java.lang.String r7) {
        /*
            r6 = this;
            r3 = 0
            r2 = 0
            int r4 = m955a(r7, r2)
            r1 = r2
        L7:
            java.util.Vector r0 = r6.f1775c
            int r0 = r0.size()
            if (r1 >= r0) goto L4b
            java.util.Vector r0 = r6.f1775c
            java.lang.Object r0 = r0.elementAt(r1)
            cf r0 = (p000.AbstractC0060cf) r0
            byte r5 = r0.f1956o
            if (r5 != 0) goto L47
            aa r5 = r0.f1957p
            if (r5 == 0) goto L47
            aa r5 = r0.f1957p
            int r5 = r5.f0a
            if (r5 != r4) goto L47
            bf r0 = (p000.C0033bf) r0
            int r5 = r0.f602e
            if (r5 != r2) goto L47
            int r5 = r0.f603f
            if (r5 != r2) goto L47
            int r5 = r0.f604g
            if (r5 != r2) goto L47
        L33:
            if (r0 != 0) goto L46
            aa r1 = r6.m979d(r4)
            if (r1 == 0) goto L46
            java.io.DataInputStream r2 = r6.m961a(r1)     // Catch: java.io.IOException -> L5c java.lang.Throwable -> L69
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
            r0.m972b(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L75 java.io.IOException -> L77
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0048bu.m1001e(java.lang.String):void");
    }
}
