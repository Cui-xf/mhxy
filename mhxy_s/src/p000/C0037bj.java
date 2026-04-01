package p000;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

/* renamed from: bj */
/* loaded from: /var/folders/v7/k_cf95q978x1_d3dh120r_f40000gn/T/jadx-4234804660425969496/classes.dex */
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
    */
    public static byte[] m684a(String str) throws Throwable {
        RecordStore recordStoreM681a;
        byte[] record = null;
        if (m687d(str)) {
            try {
                try {
                    recordStoreM681a = m681a(str, false);
                } catch (RecordStoreException e) {
                    e = e;
                    recordStoreM681a = null;
                } catch (Throwable th) {
                    th = th;
                    recordStoreM681a = null;
                    if (recordStoreM681a != null) {
                    }
                    throw th;
                }
                try {
                    if (recordStoreM681a.getNumRecords() + 1 > 1) {
                        record = recordStoreM681a.getRecord(1);
                        if (recordStoreM681a != null) {
                            try {
                                recordStoreM681a.closeRecordStore();
                            } catch (RecordStoreNotOpenException e2) {
                                e2.printStackTrace();
                            } catch (RecordStoreException e3) {
                                e3.printStackTrace();
                            }
                        }
                    } else if (recordStoreM681a != null) {
                        try {
                            recordStoreM681a.closeRecordStore();
                        } catch (RecordStoreNotOpenException e4) {
                            e4.printStackTrace();
                        } catch (RecordStoreException e5) {
                            e5.printStackTrace();
                        }
                    }
                } catch (RecordStoreException e6) {
                    e = e6;
                    e.printStackTrace();
                    if (recordStoreM681a != null) {
                        try {
                            recordStoreM681a.closeRecordStore();
                        } catch (RecordStoreException e7) {
                            e7.printStackTrace();
                        } catch (RecordStoreNotOpenException e8) {
                            e8.printStackTrace();
                        }
                    }
                    return record;
                }
            } catch (Throwable th2) {
                th = th2;
                if (recordStoreM681a != null) {
                    try {
                        recordStoreM681a.closeRecordStore();
                    } catch (RecordStoreException e9) {
                        e9.printStackTrace();
                    } catch (RecordStoreNotOpenException e10) {
                        e10.printStackTrace();
                    }
                }
                throw th;
            }
        }
        return record;
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
