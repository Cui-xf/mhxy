package com.cc;

import com.yinhan.kjava.main.a_MainCanvas;

import java.io.DataInputStream;
import java.io.IOException;

public final class bp_1 extends ar {
   public byte a;
   public String b = "";
   public String c;
   public int n;
   public short o;
   public byte p;
   public byte q;
   public byte r;
   public byte s;
   public short t;
   public short u;
   private String v = "";
   private short w = 0;
   private short x = 0;
   private short y = 0;
   private int[] z = new int[4];
   private int[] A = new int[4];

   public final void a(ao_1 var1, DataInputStream var2) throws IOException {
      var2.readByte();
      this.b = var2.readUTF();
      super.e = var2.readUTF();
      this.c = var2.readUTF();
      this.n = ca_1.a(var2.readByte());
      this.o = var2.readShort();
      this.p = var2.readByte();
      this.q = var2.readByte();
      this.s = var2.readByte();
      this.r = var2.readByte();
      this.t = var2.readShort();
      this.u = var2.readShort();
      this.v = var2.readUTF();
      if (!this.v.equals("")) {
         this.w = var2.readShort();
         this.x = var2.readShort();
         this.y = var2.readShort();
      }

      if (this.b.equals(bt_1.ad)) {
         bt_1.bs = (short)this.s;
      }

      super.l = var1.I.j;
      super.m = var1.I.k;
      super.j = var1.I.j;
      super.k = var1.I.k;
      this.a();
      this.a(true);
   }

   private void a() {
      this.z[1] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)1, this.r, false, this.v), (byte)2);
      this.A[1] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)1, this.r, true, this.v), (byte)2);
      this.z[3] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)3, this.r, false, this.v), (byte)2);
      this.A[3] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)3, this.r, true, this.v), (byte)2);
      this.z[0] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)0, this.r, false, this.v), (byte)2);
      this.A[0] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)0, this.r, true, this.v), (byte)2);
      this.z[2] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)2, this.r, false, this.v), (byte)2);
      this.A[2] = bu_1.a((String) a_MainCanvas.a(this.q, this.p, (byte)2, this.r, true, this.v), (byte)2);
   }

   private void a(boolean var1) {
      super.g = a_MainCanvas.ab.a(var1 ? this.A[super.h] : this.z[super.h], this.w, this.x, this.y);
      if (super.g == null) {
         a_MainCanvas.a(this.q, this.p, (byte)5, this.r, this.v, this.w, this.x, this.y);
         super.g = a_MainCanvas.ab.a(var1 ? this.A[super.h] : this.z[super.h], this.w, this.x, this.y);
         if (super.g == null) {
            this.r = 0;
            this.a();
            super.g = a_MainCanvas.ab.c(var1 ? this.A[super.h] : this.z[super.h]);
            if (super.g == null) {
               a_MainCanvas.a(this.q, this.p, super.h, this.r, this.v, this.w, this.x, this.y);
               super.g = a_MainCanvas.ab.c(var1 ? this.A[super.h] : this.z[super.h]);
            }
         }
      }

   }

   public final void a(ai_1 var1, long var2) {
      if (super.g != null) {
         if (bt_1.bs == 0) {
            if (this.a(this.a, 0)) {
               if (super.f != null && super.f.size() >= 1) {
                  if (super.f.size() > 1) {
                     int var6;
                     if ((var6 = super.f.size() - 1) >= 0) {
                        short[] var8 = (short[])super.f.elementAt(var6);
                        short[] var9;
                        if (var6 - 1 > 0) {
                           var9 = (short[])super.f.elementAt(var6 - 1);
                        } else {
                           var9 = (short[])super.f.elementAt(0);
                        }

                        if (var9[0] != var8[0]) {
                           if (var9[0] > var8[0]) {
                              super.h = 2;
                           } else {
                              super.h = 0;
                           }

                           this.a(false);
                        } else if (var9[1] != var8[1]) {
                           if (var9[1] > var8[1]) {
                              super.h = 3;
                           } else {
                              super.h = 1;
                           }

                           this.a(false);
                        } else {
                           this.a(true);
                        }

                        super.j = var9[0];
                        super.k = var9[1];
                        super.f.removeElementAt(var6);
                     }
                  } else {
                     this.a(true);
                  }

                  ai.a(super.g, var2);
                  return;
               }

               this.a(true);
               ai.a(super.g, var2);
               return;
            }

            this.a(true);
            ai.a(super.g, var2);
            return;
         }

         if (this.a(this.a, 1)) {
            ai.a(super.g, var2);
            int var4;
            if ((var4 = super.f.size()) < 7) {
               this.a(true);
               return;
            }

            if (0 < var4) {
               short[] var5 = (short[])super.f.elementAt(0);
               short[] var7;
               if (1 < var4) {
                  var7 = (short[])super.f.elementAt(1);
               } else {
                  var7 = (short[])super.f.elementAt(var4 - 1);
               }

               if (var7[0] != var5[0]) {
                  if (var7[0] > var5[0]) {
                     super.h = 2;
                  } else {
                     super.h = 0;
                  }

                  this.a(false);
               } else if (var7[1] != var5[1]) {
                  if (var7[1] > var5[1]) {
                     super.h = 3;
                  } else {
                     super.h = 1;
                  }

                  this.a(false);
               } else {
                  this.a(true);
               }

               super.j = var5[0];
               super.k = var5[1];
               super.f.removeElementAt(0);
            }
         } else {
            this.a(true);
            ai.a(super.g, var2);
         }
      }

   }

   private boolean a(byte var1, int var2) {
      if (this.s == 1) {
         return true;
      } else {
         bp_1 var10000;
         label147: {
            if (bt_1.q != null) {
               for(int var3 = 0; var3 < bt_1.q.length; ++var3) {
                  if (bt_1.q[var3].s == 1) {
                     var10000 = bt_1.q[var3];
                     break label147;
                  }
               }
            }

            var10000 = null;
         }

         this = var10000;
         if (var2 == 0) {
            if (this.a == 0) {
               if (var1 == 1) {
                  if (super.f.size() <= 0 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[0].f.size()) > 7) {
                     return true;
                  }
               } else if (var1 == 2 && (bt_1.q[1].f.size() <= 0 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[1].f.size()) > 7)) {
                  return true;
               }
            } else if (this.a == 1) {
               if (var1 == 0) {
                  if (bt_1.q[1].f.size() <= 0 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[1].f.size()) > 7) {
                     return true;
                  }
               } else if (var1 == 2 && (bt_1.q[0].f.size() <= 0 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[0].f.size()) > 7)) {
                  return true;
               }
            } else if (this.a == 2) {
               if (var1 == 0) {
                  if (bt_1.q[2].f.size() <= 0 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[2].f.size()) > 7) {
                     return true;
                  }
               } else if (var1 == 1 && (bt_1.q[0].f.size() <= 0 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[0].f.size()) > 7)) {
                  return true;
               }
            }
         } else if (var2 == 1) {
            if (this.a == 0) {
               if (var1 == 1) {
                  if (bt_1.q[var1].f.size() > 2) {
                     return true;
                  }
               } else if (var1 == 2 && (bt_1.q[1].f.size() <= 2 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[1].f.size()) > 5)) {
                  return true;
               }
            } else if (this.a == 1) {
               if (var1 == 0) {
                  if (bt_1.q[var1].f.size() > 2) {
                     return true;
                  }
               } else if (var1 == 2 && (bt_1.q[0].f.size() <= 2 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[0].f.size()) > 5)) {
                  return true;
               }
            } else if (this.a == 2) {
               if (var1 == 0) {
                  if (bt_1.q[var1].f.size() > 2) {
                     return true;
                  }
               } else if (var1 == 1 && (bt_1.q[0].f.size() <= 2 || Math.abs(bt_1.q[var1].f.size() - bt_1.q[0].f.size()) > 5)) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
