package com.cc;

import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotOpenException;

public final class bj {
   public static void a(byte[] var0, String var1) {
      RecordStore var2 = null;
      boolean var3 = d(var1);

      try {
         (var2 = a(var1, var3)).addRecord(var0, 0, var0.length);
         return;
      } catch (RecordStoreException var14) {
         ((Throwable)var14).printStackTrace();
      } finally {
         if (var2 != null) {
            try {
               var2.closeRecordStore();
            } catch (RecordStoreNotOpenException var12) {
               ((Throwable)var12).printStackTrace();
            } catch (RecordStoreException var13) {
               ((Throwable)var13).printStackTrace();
            }
         }

      }

   }

   public static byte[] a(String var0) {
      if (d(var0)) {
         RecordStore var1 = null;

         try {
            if ((var1 = a(var0, false)).getNumRecords() + 1 <= 1) {
               return null;
            }

            return  var1.getRecord(1);
         } catch (RecordStoreException var14) {
            ((Throwable)var14).printStackTrace();
            return null;
         } finally {
            if (var1 != null) {
               try {
                  var1.closeRecordStore();
               } catch (RecordStoreNotOpenException var12) {
                  ((Throwable)var12).printStackTrace();
               } catch (RecordStoreException var13) {
                  ((Throwable)var13).printStackTrace();
               }
            }

         }
      } else {
         return null;
      }
   }

   private static RecordStore a(String var0, boolean var1) throws RecordStoreException {
      Object var2 = null;
      if (var1) {
         RecordStore.deleteRecordStore(var0);
         return RecordStore.openRecordStore(var0, var1);
      } else {
         return RecordStore.openRecordStore(var0, !var1);
      }
   }

   private static boolean d(String var0) {
      String[] var1;
      if ((var1 = RecordStore.listRecordStores()) == null) {
         return false;
      } else {
         for(int var2 = var1.length - 1; var2 >= 0; --var2) {
            if (var1[var2].equals(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean b(String var0) {
      for(int var2 = 0; var2 < var0.length(); ++var2) {
         String var1;
         if ((var1 = var0.substring(var2, var2 + 1).trim()) == null || var1.equals("")) {
            return false;
         }

         if (e(var1)) {
            return false;
         }

         byte[] var4 = var1.getBytes();

         for(int var3 = 0; var3 < var4.length; ++var3) {
            if (!a(var4[var3]) && (var4[var3] < 48 || var4[var3] > 57)) {
               return false;
            }
         }
      }

      return true;
   }

   public static boolean c(String var0) {
      for(int var2 = 0; var2 < var0.length(); ++var2) {
         String var1;
         if ((var1 = var0.substring(var2, var2 + 1).trim()) == null || var1.equals("")) {
            return false;
         }

         if (e(var1)) {
            return false;
         }

         byte[] var4 = var1.getBytes();

         for(int var3 = 0; var3 < var4.length; ++var3) {
            if (!a(var4[var3]) && (var4[var3] < 48 || var4[var3] > 57 && var4[var3] < 65 || var4[var3] > 90 && var4[var3] < 97 || var4[var3] > 122)) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean a(byte var0) {
      return (var0 & 255) > 128;
   }

   private static boolean e(String var0) {
      int var1 = var0.length();

      for(int var3 = 0; var3 < var1; ++var3) {
         if ((var0.substring(var3).getBytes()[0] & 255) > 128) {
            return true;
         }
      }

      return false;
   }
}
