package defpackage;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

/* loaded from: java版梦回西游3区251011.jar:bj.class */
public final class bj {
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.lang.Throwable] */
    public static void a(byte[] bArr, String str) {
        RecordStore recordStore = null;
        ?? D = d(str);
        try {
            try {
                RecordStore recordStoreA = a(str, (boolean) D);
                recordStore = recordStoreA;
                recordStoreA.addRecord(bArr, 0, bArr.length);
                RecordStore recordStore2 = recordStore;
                if (recordStore2 != null) {
                    try {
                        recordStore2 = recordStore;
                        recordStore2.closeRecordStore();
                    } catch (RecordStoreNotOpenException e) {
                        recordStore2.printStackTrace();
                    } catch (RecordStoreException e2) {
                        recordStore2.printStackTrace();
                    }
                }
            } catch (RecordStoreException e3) {
                D.printStackTrace();
                RecordStore recordStore3 = recordStore;
                if (recordStore3 != null) {
                    try {
                        recordStore3 = recordStore;
                        recordStore3.closeRecordStore();
                    } catch (RecordStoreNotOpenException e4) {
                        recordStore3.printStackTrace();
                    } catch (RecordStoreException e5) {
                        recordStore3.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            RecordStore recordStore4 = recordStore;
            if (recordStore4 != null) {
                try {
                    recordStore4 = recordStore;
                    recordStore4.closeRecordStore();
                } catch (RecordStoreNotOpenException e6) {
                    recordStore4.printStackTrace();
                } catch (RecordStoreException e7) {
                    recordStore4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static byte[] a(String str) {
        if (!d(str)) {
            return null;
        }
        Throwable th = null;
        RecordStore recordStore = null;
        try {
            try {
                RecordStore recordStoreA = a(str, false);
                recordStore = recordStoreA;
                if (recordStoreA.getNumRecords() + 1 > 1) {
                    byte[] record = recordStore.getRecord(1);
                    RecordStore recordStore2 = recordStore;
                    if (recordStore2 != null) {
                        try {
                            recordStore2 = recordStore;
                            recordStore2.closeRecordStore();
                        } catch (RecordStoreException e) {
                            recordStore2.printStackTrace();
                        } catch (RecordStoreNotOpenException e2) {
                            recordStore2.printStackTrace();
                        }
                    }
                    return record;
                }
                RecordStore recordStore3 = recordStore;
                if (recordStore3 == null) {
                    return null;
                }
                try {
                    recordStore3 = recordStore;
                    recordStore3.closeRecordStore();
                    return null;
                } catch (RecordStoreException e3) {
                    recordStore3.printStackTrace();
                    return null;
                } catch (RecordStoreNotOpenException e4) {
                    recordStore3.printStackTrace();
                    return null;
                }
            } catch (RecordStoreException e5) {
                th.printStackTrace();
                RecordStore recordStore4 = recordStore;
                if (recordStore4 == null) {
                    return null;
                }
                try {
                    recordStore4 = recordStore;
                    recordStore4.closeRecordStore();
                    return null;
                } catch (RecordStoreException e6) {
                    recordStore4.printStackTrace();
                    return null;
                } catch (RecordStoreNotOpenException e7) {
                    recordStore4.printStackTrace();
                    return null;
                }
            }
        } catch (Throwable th2) {
            RecordStore recordStore5 = recordStore;
            if (recordStore5 != null) {
                try {
                    recordStore5 = recordStore;
                    recordStore5.closeRecordStore();
                } catch (RecordStoreException e8) {
                    recordStore5.printStackTrace();
                } catch (RecordStoreNotOpenException e9) {
                    recordStore5.printStackTrace();
                }
            }
            throw th2;
        }
    }

    private static RecordStore a(String str, boolean z) {
        if (!z) {
            return RecordStore.openRecordStore(str, !z);
        }
        RecordStore.deleteRecordStore(str);
        return RecordStore.openRecordStore(str, z);
    }

    private static boolean d(String str) {
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

    public static boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            String strTrim = str.substring(i, i + 1).trim();
            if (strTrim == null || strTrim.equals("") || e(strTrim)) {
                return false;
            }
            byte[] bytes = strTrim.getBytes();
            for (int i2 = 0; i2 < bytes.length; i2++) {
                if (!a(bytes[i2]) && (bytes[i2] < 48 || bytes[i2] > 57)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean c(String str) {
        for (int i = 0; i < str.length(); i++) {
            String strTrim = str.substring(i, i + 1).trim();
            if (strTrim == null || strTrim.equals("") || e(strTrim)) {
                return false;
            }
            byte[] bytes = strTrim.getBytes();
            for (int i2 = 0; i2 < bytes.length; i2++) {
                if (!a(bytes[i2])) {
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

    private static boolean a(byte b) {
        return (b & 255) > 128;
    }

    private static boolean e(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if ((str.substring(i).getBytes()[0] & 255) > 128) {
                return true;
            }
        }
        return false;
    }
}
