/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 *  javax.microedition.rms.RecordStoreNotOpenException
 */
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

public final class bj {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(byte[] object, String object2) {
        void var1_7;
        RecordStore recordStore = null;
        boolean bl2 = bj.d((String)var1_7);
        recordStore = bj.a((String)var1_7, bl2);
        recordStore.addRecord(object, 0, ((byte[])object).length);
        if (recordStore == null) return;
        try {
            recordStore.closeRecordStore();
            return;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            RecordStoreNotOpenException recordStoreNotOpenException2 = recordStoreNotOpenException;
            recordStoreNotOpenException.printStackTrace();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            RecordStoreException recordStoreException2 = recordStoreException;
            recordStoreException.printStackTrace();
            return;
        }
        catch (RecordStoreException recordStoreException) {
            try {
                RecordStoreException recordStoreException3 = recordStoreException;
                recordStoreException.printStackTrace();
                if (recordStore == null) return;
            }
            catch (Throwable throwable) {
                if (recordStore == null) throw throwable;
                try {
                    recordStore.closeRecordStore();
                    throw throwable;
                }
                catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                    RecordStoreNotOpenException recordStoreNotOpenException3 = recordStoreNotOpenException;
                    recordStoreNotOpenException.printStackTrace();
                    throw throwable;
                }
                catch (RecordStoreException recordStoreException4) {
                    RecordStoreException recordStoreException5 = recordStoreException4;
                    recordStoreException4.printStackTrace();
                }
                throw throwable;
            }
            try {
                recordStore.closeRecordStore();
                return;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                RecordStoreNotOpenException recordStoreNotOpenException4 = recordStoreNotOpenException;
                recordStoreNotOpenException.printStackTrace();
                return;
            }
            catch (RecordStoreException recordStoreException6) {
                RecordStoreException recordStoreException7 = recordStoreException6;
                recordStoreException6.printStackTrace();
                return;
            }
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] a(String object) {
        RecordStore recordStore;
        Object var1_9;
        block16: {
            byte[] byArray;
            if (!bj.d(object)) return null;
            var1_9 = null;
            recordStore = bj.a(object, false);
            if (recordStore.getNumRecords() + 1 <= 1) break block16;
            byte[] byArray2 = byArray = recordStore.getRecord(1);
            if (recordStore == null) return byArray2;
            try {
                recordStore.closeRecordStore();
                return byArray2;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                RecordStoreNotOpenException recordStoreNotOpenException2 = recordStoreNotOpenException;
                recordStoreNotOpenException.printStackTrace();
                return byArray2;
            }
            catch (RecordStoreException recordStoreException) {
                RecordStoreException recordStoreException2 = recordStoreException;
                recordStoreException.printStackTrace();
            }
            return byArray2;
        }
        if (recordStore == null) return null;
        try {
            recordStore.closeRecordStore();
            return null;
        }
        catch (RecordStoreNotOpenException recordStoreNotOpenException) {
            RecordStoreNotOpenException recordStoreNotOpenException3 = recordStoreNotOpenException;
            recordStoreNotOpenException.printStackTrace();
            return null;
        }
        catch (RecordStoreException recordStoreException) {
            RecordStoreException recordStoreException3 = recordStoreException;
            recordStoreException.printStackTrace();
        }
        return null;
        catch (RecordStoreException recordStoreException) {
            try {
                RecordStoreException recordStoreException4 = recordStoreException;
                recordStoreException.printStackTrace();
                if (var1_9 == null) return null;
            }
            catch (Throwable throwable) {
                if (var1_9 == null) throw throwable;
                try {
                    var1_9.closeRecordStore();
                    throw throwable;
                }
                catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                    RecordStoreNotOpenException recordStoreNotOpenException4 = recordStoreNotOpenException;
                    recordStoreNotOpenException.printStackTrace();
                    throw throwable;
                }
                catch (RecordStoreException recordStoreException5) {
                    RecordStoreException recordStoreException6 = recordStoreException5;
                    recordStoreException5.printStackTrace();
                }
                throw throwable;
            }
            try {
                var1_9.closeRecordStore();
                return null;
            }
            catch (RecordStoreNotOpenException recordStoreNotOpenException) {
                RecordStoreNotOpenException recordStoreNotOpenException5 = recordStoreNotOpenException;
                recordStoreNotOpenException.printStackTrace();
                return null;
            }
            catch (RecordStoreException recordStoreException7) {
                RecordStoreException recordStoreException8 = recordStoreException7;
                recordStoreException7.printStackTrace();
            }
            return null;
        }
    }

    private static RecordStore a(String string, boolean bl2) {
        RecordStore recordStore = null;
        if (bl2) {
            RecordStore.deleteRecordStore((String)string);
            recordStore = RecordStore.openRecordStore((String)string, (boolean)bl2);
            return recordStore;
        }
        recordStore = RecordStore.openRecordStore((String)string, (!bl2 ? 1 : 0) != 0);
        return recordStore;
    }

    private static boolean d(String string) {
        String[] stringArray = RecordStore.listRecordStores();
        if (stringArray == null) {
            return false;
        }
        for (int i2 = stringArray.length - 1; i2 >= 0; --i2) {
            if (!stringArray[i2].equals(string)) continue;
            return true;
        }
        return false;
    }

    public static boolean b(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            Object object = string.substring(i2, i2 + 1).trim();
            if (object == null || ((String)object).equals("")) {
                return false;
            }
            if (bj.e((String)object)) {
                return false;
            }
            object = ((String)object).getBytes();
            for (int i3 = 0; i3 < ((Object)object).length; ++i3) {
                if (bj.a((byte)object[i3]) || object[i3] >= 48 && object[i3] <= 57) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean c(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            Object object = string.substring(i2, i2 + 1).trim();
            if (object == null || ((String)object).equals("")) {
                return false;
            }
            if (bj.e((String)object)) {
                return false;
            }
            object = ((String)object).getBytes();
            for (int i3 = 0; i3 < ((Object)object).length; ++i3) {
                if (bj.a((byte)object[i3]) || !(object[i3] < 48 || object[i3] > 57 && object[i3] < 65 || object[i3] > 90 && object[i3] < 97) && object[i3] <= 122) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte by2) {
        return (by2 & 0xFF) > 128;
    }

    private static boolean e(String string) {
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            byte[] byArray = string.substring(i2).getBytes();
            if ((byArray[0] & 0xFF) <= 128) continue;
            return true;
        }
        return false;
    }
}

