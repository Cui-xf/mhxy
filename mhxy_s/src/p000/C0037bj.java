package p000;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

/* renamed from: bj */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-5080095226433994817/classes.dex */
public final class C0037bj {
    /* renamed from: a */
    private static RecordStore m681a(String str, boolean z) {
        if (!z) {
            return RecordStore.openRecordStore(str, !z);
        }
        RecordStore.deleteRecordStore(str);
        return RecordStore.openRecordStore(str, z);
    }

    /* renamed from: a */
    public static void m682a(byte[] bArr, String str) {
        RecordStore recordStoreM681a = null;
        try {
            try {
                recordStoreM681a = m681a(str, m687d(str));
                recordStoreM681a.addRecord(bArr, 0, bArr.length);
                if (recordStoreM681a != null) {
                    try {
                        recordStoreM681a.closeRecordStore();
                    } catch (RecordStoreNotOpenException e) {
                        e.printStackTrace();
                    } catch (RecordStoreException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (RecordStoreException e3) {
                e3.printStackTrace();
                if (recordStoreM681a != null) {
                    try {
                        recordStoreM681a.closeRecordStore();
                    } catch (RecordStoreException e4) {
                        e4.printStackTrace();
                    } catch (RecordStoreNotOpenException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            if (recordStoreM681a != null) {
                try {
                    recordStoreM681a.closeRecordStore();
                } catch (RecordStoreException e6) {
                    e6.printStackTrace();
                } catch (RecordStoreNotOpenException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m683a(byte b) {
        return (b & 255) > 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m684a(java.lang.String r4) throws java.lang.Throwable {
        /*
            r0 = 0
            r3 = 1
            boolean r1 = m687d(r4)
            if (r1 == 0) goto L1f
            r1 = 0
            javax.microedition.rms.RecordStore r2 = m681a(r4, r1)     // Catch: javax.microedition.rms.RecordStoreException -> L3a java.lang.Throwable -> L4f
            int r1 = r2.getNumRecords()     // Catch: java.lang.Throwable -> L61 javax.microedition.rms.RecordStoreException -> L64
            int r1 = r1 + 1
            if (r1 <= r3) goto L2a
            r1 = 1
            byte[] r0 = r2.getRecord(r1)     // Catch: java.lang.Throwable -> L61 javax.microedition.rms.RecordStoreException -> L64
            if (r2 == 0) goto L1f
            r2.closeRecordStore()     // Catch: javax.microedition.rms.RecordStoreNotOpenException -> L20 javax.microedition.rms.RecordStoreException -> L25
        L1f:
            return r0
        L20:
            r1 = move-exception
            r1.printStackTrace()
            goto L1f
        L25:
            r1 = move-exception
            r1.printStackTrace()
            goto L1f
        L2a:
            if (r2 == 0) goto L1f
            r2.closeRecordStore()     // Catch: javax.microedition.rms.RecordStoreNotOpenException -> L30 javax.microedition.rms.RecordStoreException -> L35
            goto L1f
        L30:
            r1 = move-exception
            r1.printStackTrace()
            goto L1f
        L35:
            r1 = move-exception
            r1.printStackTrace()
            goto L1f
        L3a:
            r1 = move-exception
            r2 = r0
        L3c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L1f
            r2.closeRecordStore()     // Catch: javax.microedition.rms.RecordStoreNotOpenException -> L45 javax.microedition.rms.RecordStoreException -> L4a
            goto L1f
        L45:
            r1 = move-exception
            r1.printStackTrace()
            goto L1f
        L4a:
            r1 = move-exception
            r1.printStackTrace()
            goto L1f
        L4f:
            r1 = move-exception
            r2 = r0
        L51:
            if (r2 == 0) goto L56
            r2.closeRecordStore()     // Catch: javax.microedition.rms.RecordStoreNotOpenException -> L57 javax.microedition.rms.RecordStoreException -> L5c
        L56:
            throw r1
        L57:
            r0 = move-exception
            r0.printStackTrace()
            goto L56
        L5c:
            r0 = move-exception
            r0.printStackTrace()
            goto L56
        L61:
            r0 = move-exception
            r1 = r0
            goto L51
        L64:
            r1 = move-exception
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0037bj.m684a(java.lang.String):byte[]");
    }

    /* renamed from: b */
    public static boolean m685b(String str) {
        for (int i = 0; i < str.length(); i++) {
            String strTrim = str.substring(i, i + 1).trim();
            if (strTrim == null || strTrim.equals("") || m688e(strTrim)) {
                return false;
            }
            byte[] bytes = strTrim.getBytes();
            for (int i2 = 0; i2 < bytes.length; i2++) {
                if (!m683a(bytes[i2]) && (bytes[i2] < 48 || bytes[i2] > 57)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m686c(String str) {
        for (int i = 0; i < str.length(); i++) {
            String strTrim = str.substring(i, i + 1).trim();
            if (strTrim == null || strTrim.equals("") || m688e(strTrim)) {
                return false;
            }
            byte[] bytes = strTrim.getBytes();
            for (int i2 = 0; i2 < bytes.length; i2++) {
                if (!m683a(bytes[i2])) {
                    if (bytes[i2] < 48) {
                        return false;
                    }
                    if (bytes[i2] > 57 && bytes[i2] < 65) {
                        return false;
                    }
                    if ((bytes[i2] > 90 && bytes[i2] < 97) || bytes[i2] > 122) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m687d(String str) {
        String[] strArrListRecordStores = RecordStore.listRecordStores();
        if (strArrListRecordStores == null) {
            return false;
        }
        for (int length = strArrListRecordStores.length - 1; length >= 0; length--) {
            if (strArrListRecordStores[length].equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m688e(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if ((str.substring(i).getBytes()[0] & 255) > 128) {
                return true;
            }
        }
        return false;
    }
}
