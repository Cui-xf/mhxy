package com.cc;

import com.yinhan.kjava.main.MainCanvas;

import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class bq_1 {
   public static byte a = 25;
   public static short b = (short)25;
   public static short c;
   private static short t;
   private String[] u;
   private Vector v = new Vector();
   private Vector w = new Vector();
   private Vector x = new Vector();
   private MainCanvas y;
   private ao_1 z;
   private cj A;
   public int d;
   public int e;
   private long B;
   private long C;
   private long D = -1L;
   private i[] E;
   private ae[] F;
   public short f;
   public static int g = -1;
   private Frame0 G = null;
   private Vector H = new Vector();
   private long I = 0L;
   public byte h;
   public byte i;
   private boolean J = false;
   public byte j;
   public byte k;
   public byte l;
   public byte m;
   public byte n;
   public byte o;
   public int p;
   public int q;
   private String[] K;
   public static long r = 0L;
   private int[][] L = new int[5][4];
   public static short s;
   private int[][] M = new int[3][4];
   private int[][] N = new int[10][4];
   private int[] O = new int[]{513, 514, 515, 516, 517, 518, 519, 520, 1024, 2048};
   private static short P;
   private boolean Q = true;

   public bq_1(MainCanvas var1, ao_1 var2, byte var3) {
      this.y = var1;
      this.z = var2;
      t = (short)var3;
      var1.b();
      GlobalStatus.v = GlobalStatus.w;
      this.a();
      var1.b();
   }

   public final void a() {
      int var2 = (GlobalConfig.defaultWidth - 176) / 4;
      int var3 = (GlobalConfig.defaultHigh - 208) / 6;
      GlobalConfig.Q = new short[6][2];
      (GlobalConfig.R = new short[6][2])[0][0] = (short)(GlobalConfig.T[0][0] + var2);
      GlobalConfig.R[0][1] = (short)(GlobalConfig.T[0][1] + (var3 << 1));
      GlobalConfig.R[1][0] = (short)(GlobalConfig.T[1][0] + (var2 << 1));
      GlobalConfig.R[1][1] = (short)(GlobalConfig.T[1][1] + (var3 << 1));
      GlobalConfig.R[2][0] = (short)(GlobalConfig.T[2][0] + var2 * 3);
      GlobalConfig.R[2][1] = (short)(GlobalConfig.T[2][1] + (var3 << 1));
      GlobalConfig.R[3][0] = (short)(GlobalConfig.T[3][0] + var2);
      GlobalConfig.R[3][1] = (short)(GlobalConfig.T[3][1] + var3);
      GlobalConfig.R[4][0] = (short)(GlobalConfig.T[4][0] + (var2 << 1));
      GlobalConfig.R[4][1] = (short)(GlobalConfig.T[4][1] + var3);
      GlobalConfig.R[5][0] = (short)(GlobalConfig.T[5][0] + var2 * 3);
      GlobalConfig.R[5][1] = (short)(GlobalConfig.T[5][1] + var3);
      GlobalConfig.Q[0][0] = (short)(GlobalConfig.S[0][0] + var2);
      GlobalConfig.Q[0][1] = (short)(GlobalConfig.S[0][1] + var3 * 5);
      GlobalConfig.Q[1][0] = (short)(GlobalConfig.S[1][0] + (var2 << 1));
      GlobalConfig.Q[1][1] = (short)(GlobalConfig.S[1][1] + var3 * 5);
      GlobalConfig.Q[2][0] = (short)(GlobalConfig.S[2][0] + var2 * 3);
      GlobalConfig.Q[2][1] = (short)(GlobalConfig.S[2][1] + var3 * 5);
      GlobalConfig.Q[3][0] = (short)(GlobalConfig.S[3][0] + var2);
      GlobalConfig.Q[3][1] = (short)(GlobalConfig.S[3][1] + (var3 << 2));
      GlobalConfig.Q[4][0] = (short)(GlobalConfig.S[4][0] + (var2 << 1));
      GlobalConfig.Q[4][1] = (short)(GlobalConfig.S[4][1] + (var3 << 2));
      GlobalConfig.Q[5][0] = (short)(GlobalConfig.S[5][0] + var2 * 3);
      GlobalConfig.Q[5][1] = (short)(GlobalConfig.S[5][1] + (var3 << 2));
      GlobalStatus.H = new p[GlobalStatus.I.length];
      if (t == 0) {
         GlobalStatus.M = new ck[GlobalStatus.N.length];
      } else if (t == 1 || t == 2) {
         GlobalStatus.M = new ck[GlobalStatus.J.length];
      }

      for(int var1 = 0; var1 < GlobalStatus.I.length; ++var1) {
         GlobalStatus.H[var1] = GlobalStatus.I[var1].c();
         GlobalStatus.H[var1].b((byte)1);
      }

      if (t == 0) {
         for(byte var4 = 0; var4 < GlobalStatus.N.length; ++var4) {
            ck[] var10000 = GlobalStatus.M;
            ck var9 = GlobalStatus.N[var4];
            ck var10;
            (var10 = new ck()).a = var9.a;
            var10.b = var9.b;
            var10.c = var9.c;
            var10.d = var9.d;
            var10.e = var9.e;
            var10.f = var9.f;
            var10.g = var9.g;
            var10.h = var9.h;
            var10.j = var9.j;
            var10.n = var9.n;
            var10.m = var9.m;
            var10.r = var9.r;
            var10.s = var9.s;
            var10.t = var9.t;
            var10.i = var9.i;
            var10.k = var9.k;
            var10.l = var9.l;
            var10000[var4] = var10;
            GlobalStatus.M[var4].b((byte)1);
         }
      } else if (t == 1 || t == 2) {
         for(byte var5 = 0; var5 < GlobalStatus.J.length; ++var5) {
            GlobalStatus.M[var5] = GlobalStatus.J[var5].b();
            GlobalStatus.M[var5].b((byte)1);
         }
      }

      if (GlobalStatus.I != null) {
         for(byte var6 = 0; var6 < GlobalStatus.I.length; ++var6) {
            if (GlobalStatus.I[var6] != null) {
               GlobalStatus.I[var6].e();
               GlobalStatus.I[var6] = null;
            }
         }

         GlobalStatus.I = null;
      }

      if (t == 0) {
         if (GlobalStatus.N != null) {
            for(byte var7 = 0; var7 < GlobalStatus.N.length; ++var7) {
               if (GlobalStatus.N[var7] != null) {
                  GlobalStatus.N[var7].b();
                  GlobalStatus.N[var7] = null;
               }
            }

            GlobalStatus.N = null;
         }
      } else if (GlobalStatus.J != null) {
         for(byte var8 = 0; var8 < GlobalStatus.J.length; ++var8) {
            if (GlobalStatus.J[var8] != null) {
               GlobalStatus.J[var8].e();
               GlobalStatus.J[var8] = null;
            }
         }

         GlobalStatus.J = null;
      }

      GlobalStatus.K = GlobalStatus.L;
      GlobalStatus.L = -1;
      if (GlobalStatus.K == 2 && GlobalStatus.bs != -1 && GlobalStatus.s == 0) {
         this.f = 9;
      } else {
         this.f = 0;
      }

      this.d = 0;
      this.h = 0;
      this.e = 5;
      this.z.az = 0;
      if (GlobalStatus.bt) {
         b = 1;
         s = 1;
         P = (short)a;
      } else {
         P = s = b = (short)a;
      }

      this.C = System.currentTimeMillis();
   }

   public final void a(int var1) {
      if (GlobalStatus.bs == 0 && GlobalStatus.s == 0 && g > 0) {
         this.d();
      } else {
         if (this.f != 10) {
            bq_1 var2 = this;
            if (ao_1.ac != null) {
               PngUtil.a(ao_1.ac, this.y.ak);
            }

            if (ao_1.ad != null) {
               PngUtil.a(ao_1.ad, this.y.ak);
            }

            if (ao_1.ae != null) {
               PngUtil.a(ao_1.ae, this.y.ak);
            }

            if (GlobalStatus.H != null) {
               for(byte var3 = 0; var3 < GlobalStatus.H.length; ++var3) {
                  if (GlobalStatus.H[var3].k == 1) {
                     p var10000 = GlobalStatus.H[var3];
                     long var10 = var2.y.ak;
                     PngUtil var7 = MainCanvas.f;
                     p var6 = var10000;
                     if (var10000.j != null && !var6.d()) {
                        PngUtil.a(var6.j, var10);
                     } else {
                        boolean var50 = true;
                     }

                     if (var2.F != null) {
                        for(byte var31 = 0; var31 < var2.F.length; ++var31) {
                           if (var2.F[var31].b == 0 && var2.F[var31].c == GlobalStatus.H[var3].a) {
                              a(GlobalStatus.H[var3], var2.F[var31]);
                           }
                        }
                     }
                  } else if (GlobalStatus.H[var3].k == 2) {
                     if (GlobalStatus.H[var3].j == null || PngUtil.a(GlobalStatus.H[var3].j, var2.y.ak) == 2) {
                        GlobalStatus.H[var3].b((byte)1);
                        if (var2.F != null) {
                           for(byte var28 = 0; var28 < var2.F.length; ++var28) {
                              if (var2.F[var28].b == 0 && var2.F[var28].c == GlobalStatus.H[var3].a) {
                                 a(GlobalStatus.H[var3], var2.F[var28]);
                              }
                           }
                        }

                        if (var2.A != null) {
                           var2.f = 5;
                        } else {
                           for(byte var29 = 0; var29 < GlobalStatus.M.length; ++var29) {
                              if (var2.F != null) {
                                 for(byte var5 = 0; var5 < var2.F.length; ++var5) {
                                    if (var2.F[var5].b == 1 && GlobalStatus.M[var29].a == var2.F[var5].c) {
                                       GlobalStatus.M[var29].b((byte)4);
                                       break;
                                    }
                                 }
                              }
                           }

                           for(byte var30 = 0; var30 < GlobalStatus.H.length; ++var30) {
                              if (var2.F != null) {
                                 for(byte var38 = 0; var38 < var2.F.length; ++var38) {
                                    if (var2.F[var38].b == 0 && GlobalStatus.H[var30].a == var2.F[var38].c) {
                                       GlobalStatus.H[var30].b((byte)4);
                                       break;
                                    }
                                 }
                              }
                           }

                           var2.B = var2.y.ak;
                           var2.f = 3;
                        }
                     }
                  } else if (GlobalStatus.H[var3].k == 4 && (GlobalStatus.H[var3].j == null || PngUtil.a(GlobalStatus.H[var3].j, var2.y.ak) == 2)) {
                     if (var2.F != null) {
                        for(byte var4 = 0; var4 < var2.F.length; ++var4) {
                           if (var2.F[var4].b == 0 && var2.F[var4].c == GlobalStatus.H[var3].a) {
                              a(GlobalStatus.H[var3], var2.F[var4]);
                           }
                        }
                     }

                     GlobalStatus.H[var3].b((byte)1);
                  }
               }
            }

            if (GlobalStatus.M != null) {
               for(byte var24 = 0; var24 < GlobalStatus.M.length; ++var24) {
                  if (GlobalStatus.M[var24].n == 1) {
                     GlobalStatus.M[var24].a(MainCanvas.f, var2.y.ak);
                  } else if (GlobalStatus.M[var24].n == 2) {
                     if (GlobalStatus.M[var24].m == null || PngUtil.a(GlobalStatus.M[var24].m, var2.y.ak) == 2) {
                        GlobalStatus.M[var24].b((byte)1);
                        if (var2.A != null) {
                           var2.f = 5;
                        } else {
                           for(byte var33 = 0; var33 < GlobalStatus.H.length; ++var33) {
                              if (var2.F != null) {
                                 for(byte var39 = 0; var39 < var2.F.length; ++var39) {
                                    if (var2.F[var39].b == 0 && GlobalStatus.H[var33].a == var2.F[var39].c) {
                                       GlobalStatus.H[var33].b((byte)4);
                                       break;
                                    }
                                 }
                              }
                           }

                           for(byte var34 = 0; var34 < GlobalStatus.M.length; ++var34) {
                              if (var2.F != null) {
                                 for(byte var40 = 0; var40 < var2.F.length; ++var40) {
                                    if (var2.F[var40].b == 1 && GlobalStatus.M[var34].a == var2.F[var40].c) {
                                       GlobalStatus.M[var34].b((byte)4);
                                       break;
                                    }
                                 }
                              }
                           }

                           var2.B = var2.y.ak;
                           var2.f = 3;
                        }
                     }
                  } else if (GlobalStatus.M[var24].n != 3 && GlobalStatus.M[var24].n == 4 && (GlobalStatus.M[var24].m == null || PngUtil.a(GlobalStatus.M[var24].m, var2.y.ak) == 2)) {
                     if (var2.F != null) {
                        for(byte var32 = 0; var32 < var2.F.length; ++var32) {
                           if (var2.F[var32].b == 1 && var2.F[var32].c == GlobalStatus.M[var24].a) {
                              GlobalStatus.M[var24].e = var2.F[var32].g;
                              GlobalStatus.M[var24].g = var2.F[var32].h;
                              GlobalStatus.M[var24].f = var2.F[var32].i;
                              GlobalStatus.M[var24].h = var2.F[var32].j;
                              if (GlobalStatus.M[var24].e <= 0) {
                                 byte var45 = 0;

                                 byte var10001;
                                 while(true) {
                                    if (var45 >= GlobalStatus.M.length) {
                                       var10001 = -1;
                                       break;
                                    }

                                    if (t != 1 && t != 2) {
                                       if (GlobalStatus.M[var45].e > 0) {
                                          var10001 = var45;
                                          break;
                                       }
                                    } else if (GlobalStatus.M[var45].e > 0 && GlobalStatus.M[var45].b == 0) {
                                       var10001 = var45;
                                       break;
                                    }

                                    ++var45;
                                 }

                                 var2.h = var10001;
                                 var2.h = var2.h < 0 ? 0 : var2.h;
                              }
                           }
                        }
                     }

                     GlobalStatus.M[var24].b((byte)1);
                  }
               }
            }
         }

         if (this.d == 0 || this.d == 2 || this.f > 1) {
            if (var1 == 8) {
               if (this.e == 5 || this.e == 3 && this.d > 1) {
                  this.z.az = this.z.az <= 0 ? 9 : --this.z.az;
               }
            } else if (var1 == 2) {
               if (this.e == 5 || this.e == 3 && this.d > 1) {
                  this.z.az = this.z.az >= 9 ? 0 : ++this.z.az;
               }
            } else if (var1 == 1073741824) {
               if (this.e == 5 || this.e == 3 && this.d > 1) {
                  if (this.z.az == 8) {
                     this.z.K();
                  } else if (this.z.az == 9) {
                     this.z.O();
                     this.e = 5;
                  }
               }
            } else if (var1 == 1024) {
               this.z.K();
            } else if (var1 == 2048) {
               this.z.O();
               if (this.d <= 1) {
                  this.e = 5;
               } else if (this.d > 1) {
                  this.e = 3;
               }
            }
         }

         if (this.f == 0) {
            this.I = System.currentTimeMillis();
            if (h() && this.f != -1 && !ao_1.r()) {
               this.j = 0;
               this.p = GlobalStatus.ej[this.z.az];
               this.n = 1;
               int var60 = GlobalStatus.bt ? 0 : 1;
               int var10002 = GlobalStatus.bt ? 0 : 1;
               boolean var10005 = GlobalStatus.bt;
               this.a((byte)var60, var10002, (byte)1, GlobalStatus.M[this.h].a, (byte)1, GlobalStatus.bt ? 0 : 1, (byte)1, GlobalStatus.M[this.h].a);
               this.f = -1;
               this.e = 5;
               this.d = 0;
            }

            if (this.d == 0) {
               if (y() && !h()) {
                  this.j = 1;
                  this.p = 1;
                  this.n = 1;
                  if (this.j()) {
                     this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                     this.f = -1;
                     this.e = 5;
                  } else {
                     this.d = 2;
                     this.e = 3;
                  }
               } else if (var1 == 1) {
                  this.e = this.e <= 0 ? 5 : --this.e;
               } else if (var1 == 4) {
                  this.e = this.e >= 5 ? 0 : ++this.e;
               } else if (var1 == 1073741824) {
                  this.J = false;
                  if (this.e == 0 && !h()) {
                     if (c() <= 1) {
                        this.j = 1;
                        this.p = 1;
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.d = 1;
                     }
                  } else if (this.e == 1 && !h()) {
                     this.j = 3;
                     this.p = 1;
                     this.n = 1;
                     this.o = GlobalStatus.M[this.h].a;
                     if (this.j()) {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                        this.f = -1;
                        this.e = 5;
                     } else {
                        this.d = 2;
                        this.e = 3;
                     }
                  } else if (this.e == 2 && !h()) {
                     if (GlobalStatus.dB != null && GlobalStatus.dB.length > 0) {
                        this.z.h((int)3);
                     } else {
                        this.y.b("没有可用技能");
                     }
                  } else if (this.e == 3) {
                     this.z.e((int)6);
                  } else if (this.e == 4 && !h()) {
                     if (this.j()) {
                        this.k = 1;
                        this.q = 1;
                        if (t == 1) {
                           this.y.b("决斗时不能逃跑!");
                        } else if (GlobalStatus.bs == 0 && GlobalStatus.s == 0) {
                           this.y.b("队员不能逃跑");
                        } else {
                           this.a((byte)4, -1, (byte)0, this.o, this.k, this.q, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        }
                     } else if (t == 1) {
                        this.y.b("决斗时不能逃跑!");
                     } else {
                        this.j = 4;
                        this.p = 1;
                        this.n = 0;
                        this.o = 1;
                        this.d = 2;
                        this.e = 3;
                     }
                  } else if (this.e == 5 && GlobalStatus.en[this.z.az] != -1 && this.z.az >= 0 && this.z.az < 8) {
                     this.q();
                  }
               } else if (var1 == 513 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[0] != -1) {
                     this.z.az = 0;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 514 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[1] != -1) {
                     this.z.az = 1;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 515 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[2] != -1) {
                     this.z.az = 2;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 516 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[3] != -1) {
                     this.z.az = 3;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 517 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[4] != -1) {
                     this.z.az = 4;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 518 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[5] != -1) {
                     this.z.az = 5;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 519 && !GlobalStatus.bt) {
                  if (GlobalStatus.en[6] != -1) {
                     this.z.az = 6;
                     if (GlobalStatus.el[this.z.az] < 2) {
                        this.q();
                     } else if (this.b((int)0)) {
                        this.j = 0;
                        this.p = GlobalStatus.ej[this.z.az];
                        this.n = 1;
                        this.o = GlobalStatus.M[this.h].a;
                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     } else {
                        this.J = true;
                        this.d = 1;
                     }
                  }
               } else if (var1 == 520 && !GlobalStatus.bt && GlobalStatus.en[7] != -1) {
                  this.z.az = 7;
                  if (GlobalStatus.el[this.z.az] < 2) {
                     this.q();
                  } else if (this.b((int)0)) {
                     this.j = 0;
                     this.p = GlobalStatus.ej[this.z.az];
                     this.n = 1;
                     this.o = GlobalStatus.M[this.h].a;
                     if (this.j()) {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                        this.f = -1;
                        this.e = 5;
                     } else {
                        this.d = 2;
                        this.e = 3;
                     }
                  } else {
                     this.J = true;
                     this.d = 1;
                  }
               }
            } else if (this.d == 1) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 == 1073741824) {
                     label1626: {
                        if (this.e != 5 && !this.J) {
                           if (this.e == 0) {
                              this.j = 1;
                              this.p = 1;
                              this.n = 1;
                              this.o = GlobalStatus.M[this.h].a;
                           } else if (this.e == 2) {
                              this.j = 1;
                              this.p = GlobalStatus.dl[this.y.ar.g()];
                              this.n = 1;
                              this.o = GlobalStatus.M[this.h].a;
                           }
                        } else {
                           if (this.z.az >= 0 && this.z.az <= 7 && GlobalStatus.bt) {
                              break label1626;
                           }

                           this.j = 0;
                           this.p = GlobalStatus.ej[this.z.az];
                           this.n = 1;
                           this.o = GlobalStatus.M[this.h].a;
                        }

                        if (this.j()) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, (byte)-1);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.d = 2;
                           this.e = 3;
                        }
                     }
                  } else if (var1 == 536870912) {
                     this.d = 0;
                  }
               } else {
                  this.h = b(this.h);
               }
            } else if (this.d == 2) {
               byte var41 = 0;

               boolean var53;
               while(true) {
                  if (var41 >= GlobalStatus.H.length) {
                     var53 = false;
                     break;
                  }

                  if (GlobalStatus.H[var41].b != 0 && GlobalStatus.H[var41].a == i() + 3 && GlobalStatus.H[var41].o) {
                     var53 = true;
                     break;
                  }

                  ++var41;
               }

               if (var53) {
                  this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                  this.f = -1;
                  this.e = 5;
               } else {
                  if (var1 == 1) {
                     this.e = this.e <= 0 ? 3 : --this.e;
                  } else if (var1 == 4) {
                     this.e = this.e >= 3 ? 0 : ++this.e;
                  } else if (var1 == 1073741824) {
                     if (this.e == 0) {
                        if (c() <= 1) {
                           this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                           this.f = -1;
                           this.e = 5;
                        } else {
                           this.k = 1;
                           this.q = 1;
                           this.d = 3;
                        }
                     } else if (this.e == 1) {
                        this.a(this.j, this.p, this.n, this.o, (byte)3, 1, (byte)1, GlobalStatus.M[this.h].a);
                        this.f = -1;
                        this.e = 5;
                     } else if (this.e == 2) {
                        if (GlobalStatus.cR != null && GlobalStatus.cR.length > 0) {
                           this.z.a(false, true);
                        } else {
                           this.y.b("宠物没有技能!");
                        }
                     } else if (this.e == 3 && GlobalStatus.et[this.z.az] != -1) {
                        this.r();
                     }
                  }

                  if (var1 == 513 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[0] != -1) {
                        this.z.az = 0;
                        this.r();
                     }
                  } else if (var1 == 514 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[1] != -1) {
                        this.z.az = 1;
                        this.r();
                     }
                  } else if (var1 == 515 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[2] != -1) {
                        this.z.az = 2;
                        this.r();
                     }
                  } else if (var1 == 516 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[3] != -1) {
                        this.z.az = 3;
                        this.r();
                     }
                  } else if (var1 == 517 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[4] != -1) {
                        this.z.az = 4;
                        this.r();
                     }
                  } else if (var1 == 518 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[5] != -1) {
                        this.z.az = 5;
                        this.r();
                     }
                  } else if (var1 == 519 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[6] != -1) {
                        this.z.az = 6;
                        this.r();
                     }
                  } else if (var1 == 520 && !GlobalStatus.bt) {
                     if (GlobalStatus.et[7] != -1) {
                        this.z.az = 7;
                        this.r();
                     }
                  } else if (var1 == 536870912) {
                     if (y()) {
                        this.y.b("你已被锁定\t无法进行该操作");
                     } else {
                        this.d = 0;
                     }
                  }
               }
            } else if (this.d == 3) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 2;
                        this.e = 3;
                     }
                  } else {
                     this.a(this.j, this.p, this.n, this.o, this.k, this.q, (byte)1, GlobalStatus.M[this.h].a);
                     this.f = -1;
                     this.e = 5;
                  }
               } else {
                  this.h = b(this.h);
               }
            } else if (this.d == 4) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 0;
                     }
                  } else {
                     this.o = GlobalStatus.H[this.i].a;
                     if (!this.j()) {
                        this.d = 2;
                        this.e = 3;
                     } else {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
                        this.f = -1;
                        this.e = 5;
                     }
                  }
               } else if (h()) {
                  this.y.b("只能对自己使用复活道具");
               } else {
                  this.i = c(this.i);
               }
            } else if (this.d == 5) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 0;
                     }
                  } else {
                     this.o = GlobalStatus.H[this.i].a;
                     this.j = 1;
                     this.p = GlobalStatus.dl[this.y.ar.g()];
                     this.n = 0;
                     if (!this.j()) {
                        this.d = 2;
                        this.e = 3;
                     } else {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, (byte)-1);
                        this.f = -1;
                        this.e = 5;
                     }
                  }
               } else {
                  this.i = c(this.i);
               }
            } else if (this.d == 6) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 2;
                        this.e = 3;
                     }
                  } else {
                     this.k = 1;
                     this.q = GlobalStatus.dl[this.y.ar.g()];
                     this.l = 0;
                     this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, GlobalStatus.H[this.i].a);
                     this.f = -1;
                     this.e = 5;
                  }
               } else {
                  this.i = c(this.i);
               }
            } else if (this.d == 7) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 0;
                     }
                  } else {
                     this.o = GlobalStatus.H[this.i].a;
                     if (!this.j()) {
                        this.d = 2;
                        this.e = 3;
                     } else {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, (byte)-1);
                        this.f = -1;
                        this.e = 5;
                     }
                  }
               } else {
                  this.i = c(this.i);
               }
            } else if (this.d == 8) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 2;
                        this.e = 3;
                     }
                  } else {
                     this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, GlobalStatus.H[this.i].a);
                     this.f = -1;
                     this.e = 5;
                  }
               } else {
                  this.i = c(this.i);
               }
            } else if (this.d == 9) {
               if (var1 != 8 && var1 != 2 && var1 != 1 && var1 != 4) {
                  if (var1 != 1073741824 && var1 != 517) {
                     if (var1 == 536870912) {
                        this.d = 0;
                     }
                  } else {
                     this.o = GlobalStatus.M[this.h].a;
                     if (!this.j()) {
                        this.d = 2;
                        this.e = 3;
                     } else {
                        this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, (byte)-1);
                        this.f = -1;
                        this.e = 5;
                     }
                  }
               } else {
                  this.h = b(this.h);
               }
            }
         } else if (this.f == 1) {
            bq_1 var20 = this;
            if (this.Q) {
               this.Q = false;
               boolean var25 = false;
               boolean var35 = false;
               var1 = 0;

               byte var54;
               while(true) {
                  if (var1 >= GlobalStatus.H.length) {
                     var54 = -1;
                     break;
                  }

                  if (GlobalStatus.H[var1].b == 0 && GlobalStatus.H[var1].c.equals(GlobalStatus.ad)) {
                     var54 = (byte)var1;
                     break;
                  }

                  ++var1;
               }

               byte var42 = var54;
               var1 = 0;

               while(true) {
                  if (var1 >= GlobalStatus.H.length) {
                     var54 = -1;
                     break;
                  }

                  if (GlobalStatus.H[var1].b != 0 && GlobalStatus.H[var1].a == i() + 3) {
                     var54 = (byte)var1;
                     break;
                  }

                  ++var1;
               }

               byte var46 = var54;

               for(int var49 = 0; var49 < var20.v.size(); ++var49) {
                  if (((i[])((i[])var20.v.elementAt(var49)))[0].d == 9) {
                     ae[] var11 = (ae[])var20.w.elementAt(var49);

                     for(int var14 = 0; var14 < var11.length; ++var14) {
                        if (var11[var14].b == 0 && GlobalStatus.H[var42].a == var11[var14].c && d(var11[var14].k)) {
                           GlobalStatus.H[var42].o = true;
                           var25 = true;
                        }

                        if (GlobalStatus.be > 0 && var11[var14].b == 0 && GlobalStatus.H[var46].a == var11[var14].c && d(var11[var14].k)) {
                           GlobalStatus.H[var46].o = true;
                           var35 = true;
                        }
                     }
                  }
               }

               if (!var25) {
                  GlobalStatus.H[var42].o = false;
               }

               if (!var35 && GlobalStatus.be > 0) {
                  GlobalStatus.H[var46].o = false;
               }
            }

            if (this.v.size() > 0) {
               var1 = 0;
               if (0 < this.v.size()) {
                  this.E = (i[])this.v.elementAt(0);
                  if (this.w.size() > 0) {
                     this.F = (ae[])this.w.elementAt(0);
                  } else {
                     this.F = null;
                  }

                  if (this.x.size() > 0) {
                     this.u = (String[])this.x.elementAt(0);
                  } else {
                     this.u = null;
                  }

                  var20 = this;
                  if (this.E[0].d == 7 || this.E[0].d == 5 || this.E[0].d == 9 || this.E[0].d == 1 || this.E[0].d == 2 || this.E[0].d == 3) {
                     for(byte var26 = 0; var26 < GlobalStatus.H.length; ++var26) {
                        if (GlobalStatus.H[var26] != null && !GlobalStatus.H[var26].d()) {
                           for(byte var36 = 0; var36 < var20.F.length; ++var36) {
                              if (var20.F[var36].k >= 0 && var20.F[var36].b == 0 && var20.F[var36].c == GlobalStatus.H[var26].a) {
                                 var20.G = MainCanvas.ui.getFrame(String.valueOf(var20.F[var36].k));
                                 if (var20.G != null && !var20.H.contains(var20.G)) {
                                    boolean var43 = true;

                                    for(int var47 = 0; var47 < var20.H.size(); ++var47) {
                                       if (var20.H.elementAt(var47).equals(var20.G)) {
                                          var43 = false;
                                       }
                                    }

                                    if (var43) {
                                       var20.H.addElement(var20.G);
                                    }
                                 }
                              }
                           }
                        }

                        a(GlobalStatus.H[var26].s, var20.H);
                        var20.H.removeAllElements();
                     }

                     for(byte var27 = 0; var27 < GlobalStatus.M.length; ++var27) {
                        if (GlobalStatus.M[var27] != null && !GlobalStatus.M[var27].a()) {
                           for(byte var37 = 0; var37 < var20.F.length; ++var37) {
                              if (var20.F[var37].k >= 0 && var20.F[var37].b == 1 && var20.F[var37].c == GlobalStatus.M[var27].a) {
                                 var20.G = MainCanvas.ui.getFrame(String.valueOf(var20.F[var37].k));
                                 if (var20.G != null && !var20.H.contains(var20.G)) {
                                    boolean var44 = true;

                                    for(int var48 = 0; var48 < var20.H.size(); ++var48) {
                                       if (var20.H.elementAt(var48) != var20.G) {
                                          var44 = false;
                                       }
                                    }

                                    if (var44) {
                                       var20.H.addElement(var20.G);
                                    }
                                 }
                              }
                           }

                           a(GlobalStatus.M[var27].u, var20.H);
                           var20.H.removeAllElements();
                        }
                     }
                  }

                  if (var20.E[0].d == 7) {
                     var20.n();
                  } else {
                     var20.o();
                  }

                  if (this.v.size() > 0) {
                     this.v.removeElementAt(0);
                  }

                  if (this.w.size() > 0) {
                     this.w.removeElementAt(0);
                  }

                  if (this.x.size() > 0) {
                     this.x.removeElementAt(0);
                  }
               }
            } else {
               this.E = null;
               if (h()) {
                  if (ao_1.r()) {
                     this.f = 0;
                     s = b;
                  } else {
                     this.j = 0;
                     this.p = GlobalStatus.ej[this.z.az];
                     this.n = 1;
                     int var61 = GlobalStatus.bt ? 0 : 1;
                     int var62 = GlobalStatus.bt ? 0 : 1;
                     boolean var63 = GlobalStatus.bt;
                     this.a((byte)var61, var62, (byte)1, GlobalStatus.M[this.h].a, (byte)1, GlobalStatus.bt ? 0 : 1, (byte)1, GlobalStatus.M[this.h].a);
                     this.f = -1;
                     this.e = 5;
                  }

                  this.d = 0;
               } else if (this.f != 0) {
                  this.d = 0;
                  s = b;
                  this.f = 0;
               }

               for(byte var16 = 0; var16 < GlobalStatus.H.length; ++var16) {
                  GlobalStatus.H[var16].m = false;
                  GlobalStatus.H[var16].l = false;
                  GlobalStatus.H[var16].n = false;
               }

               for(byte var17 = 0; var17 < GlobalStatus.M.length; ++var17) {
                  GlobalStatus.M[var17].p = false;
                  GlobalStatus.M[var17].o = false;
                  GlobalStatus.M[var17].q = false;
               }

               this.Q = true;
            }
         } else if (this.f == 2) {
            if (this.D == -1L) {
               this.D = this.y.ak;
            }
         } else if (this.f == 3 && x()) {
            if (this.u != null && this.y.ak - this.B >= 1450L) {
               this.f = 1;
            } else if (this.u == null) {
               this.f = 1;
            }
         }

         if (this.f == 4) {
            if (u()) {
               this.y.mainMidlet.start();
            }

            this.d();
            this.z.j = this.z.k = 0;
         } else if (this.f == 5) {
            if (this.s() == 2) {
               for(byte var18 = 0; var18 < GlobalStatus.H.length; ++var18) {
                  if (this.F != null) {
                     for(byte var22 = 0; var22 < this.F.length; ++var22) {
                        if (this.F[var22].b == 0 && GlobalStatus.H[var18].a == this.F[var22].c) {
                           GlobalStatus.H[var18].b((byte)4);
                           break;
                        }
                     }
                  }
               }

               for(byte var19 = 0; var19 < GlobalStatus.M.length; ++var19) {
                  if (this.F != null) {
                     for(byte var23 = 0; var23 < this.F.length; ++var23) {
                        if (this.F[var23].b == 1 && GlobalStatus.M[var19].a == this.F[var23].c) {
                           GlobalStatus.M[var19].b((byte)4);
                           break;
                        }
                     }
                  }
               }

               this.B = this.y.ak;
               this.f = 3;
            }
         } else if (this.f == 6) {
            if (PngUtil.a(ao_1.ab, this.y.ak) == 2) {
               this.f = 1;
            }
         } else if (this.f == 7) {
            if (PngUtil.a(ao_1.aa, this.y.ak) == 2) {
               this.f = 8;
            }
         } else if (this.f == 8) {
            this.y.mainMidlet.start();
            this.d();
            this.z.j = this.z.k = 0;
         }

         if (this.f == 0 || this.f == 1) {
            if (this.v.size() <= 0 && GlobalStatus.x == -1) {
               if (t() || u() || this.f == 1) {
                  this.f = 4;
                  return;
               }
            } else if (this.f != 9 && (GlobalStatus.bs >= 0 && GlobalStatus.s == 0 || t == 1 || t == 2 || GlobalStatus.bt) && s > 0) {
               this.p();
            }
         }

      }
   }

   public final void a(PngUtil var1, Graphics var2) {
      var2.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
      if ((this.f == 2 || this.f == 3 || this.f == 6) && this.E != null && this.E[0].f != null && !this.E[0].f.equals("")) {
         LoadingPage.a(var2, (String)this.E[0].f, (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 0, 16777215);
      }

      if (this.f != 4 && this.f != 8) {
         Graphics var5 = var2;
         bq_1 var4 = this;
         if (GlobalStatus.H != null) {
            for(byte var6 = (byte)(GlobalStatus.H.length - 1); var6 >= 0; --var6) {
               if (GlobalStatus.H[var6].j != null) {
                  if (GlobalStatus.H[var6].d()) {
                     MainCanvas.f.a(var5, (Frame1) ao_1.ad, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var6].a][0], GlobalConfig.Q[GlobalStatus.H[var6].a][1], 0, 0);
                  } else if (GlobalStatus.H[var6].b != 0 && GlobalStatus.H[var6].j != null) {
                     if (GlobalStatus.H[var6].k == 1 || GlobalStatus.H[var6].k == 4) {
                        GlobalStatus.H[var6].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[var6].a][0], GlobalConfig.Q[GlobalStatus.H[var6].a][1], (byte)0);
                     }

                     if (var4.f != -1 && var4.f != 0 && var4.f != 7 && GlobalStatus.H[var6].m) {
                        MainCanvas.f.a(var5, (Frame1) ao_1.ae, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var6].a][0], GlobalConfig.Q[GlobalStatus.H[var6].a][1], 0, 0);
                     } else if (var4.f == 6 && GlobalStatus.H[var6].l) {
                        MainCanvas.f.a(var5, (Frame1) ao_1.ab, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var6].a][0], GlobalConfig.Q[GlobalStatus.H[var6].a][1], 0, 0);
                     }
                  }
               }
            }

            for(byte var17 = 0; var17 < GlobalStatus.H.length; ++var17) {
               if (GlobalStatus.H[var17].b == 0 && GlobalStatus.H[var17].j != null) {
                  if (GlobalStatus.H[var17].c.equals(GlobalStatus.ad)) {
                     var5.drawImage(ao_1.H.pngImage, GlobalConfig.Q[GlobalStatus.H[var17].a][0] - ao_1.H.b / 2, GlobalConfig.Q[GlobalStatus.H[var17].a][1] - ao_1.H.c / 2, 20);
                     if ((var4.f != 7 || GlobalStatus.bs != 1) && (var4.f != 7 || GlobalStatus.bs != -1) && (var4.f != 7 || GlobalStatus.s != 1)) {
                        if (!GlobalStatus.H[var17].d()) {
                           if (GlobalStatus.H[var17].k == 1 || GlobalStatus.H[var17].k == 4) {
                              GlobalStatus.H[var17].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], (byte)0);
                           }

                           if (var4.f != -1 && var4.f != 0 && GlobalStatus.H[var17].m) {
                              MainCanvas.f.a(var5, (Frame1) ao_1.ae, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                           } else if (var4.f == 6 && GlobalStatus.H[var17].l) {
                              MainCanvas.f.a(var5, (Frame1) ao_1.ab, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                           }
                        }
                     } else {
                        MainCanvas.f.a(var5, (Frame1) ao_1.aa, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                     }
                  } else if (var4.f == 7) {
                     for(int var7 = 0; var7 < GlobalStatus.q.length; ++var7) {
                        if (GlobalStatus.q[var7].e.equals(GlobalStatus.H[var17].d) && GlobalStatus.q[var7].s == 1) {
                           MainCanvas.f.a(var5, (Frame1) ao_1.aa, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                        } else if (GlobalStatus.q[var7].e.equals(GlobalStatus.H[var17].d) && GlobalStatus.q[var7].s == 0 && !GlobalStatus.H[var17].d()) {
                           if (GlobalStatus.H[var17].k == 1 || GlobalStatus.H[var17].k == 4) {
                              GlobalStatus.H[var17].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], (byte)0);
                           }

                           if (var4.f != -1 && var4.f != 0 && GlobalStatus.H[var17].m) {
                              MainCanvas.f.a(var5, (Frame1) ao_1.ae, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                           } else if (var4.f == 6 && GlobalStatus.H[var17].l) {
                              MainCanvas.f.a(var5, (Frame1) ao_1.ab, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                           }
                        }
                     }
                  } else if (!GlobalStatus.H[var17].d()) {
                     if (GlobalStatus.H[var17].k == 1 || GlobalStatus.H[var17].k == 4) {
                        GlobalStatus.H[var17].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], (byte)0);
                     }

                     if (var4.f != -1 && var4.f != 0 && GlobalStatus.H[var17].m) {
                        MainCanvas.f.a(var5, (Frame1) ao_1.ae, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                     } else if (var4.f == 6 && GlobalStatus.H[var17].l) {
                        MainCanvas.f.a(var5, (Frame1) ao_1.ab, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0], GlobalConfig.Q[GlobalStatus.H[var17].a][1], 0, 0);
                     }
                  }
               }

               if (GlobalStatus.H[var17].s.size() > 0 && GlobalStatus.H[var17].j != null) {
                  for(byte var22 = 0; var22 < GlobalStatus.H[var17].s.size(); ++var22) {
                     MainCanvas.f.a(var5, (Frame0) GlobalStatus.H[var17].s.elementAt(var22), (int[])null, 0, 0, 0, GlobalConfig.Q[GlobalStatus.H[var17].a][0] - GlobalStatus.H[var17].h() / 2, GlobalConfig.Q[GlobalStatus.H[var17].a][1] + var22 * 11 - GlobalStatus.H[var17].i(), 0, 0);
                  }
               }
            }
         }

         var5 = var2;
         var4 = this;
         if (GlobalStatus.M != null) {
            for(byte var18 = 0; var18 < GlobalStatus.M.length; ++var18) {
               if (GlobalStatus.M[var18].m != null) {
                  if (GlobalStatus.M[var18].a()) {
                     if (t == 1 || t == 2) {
                        MainCanvas.f.a(var5, (Frame1) ao_1.ac, (int[])null, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], 0, 0);
                     }
                  } else {
                     if (GlobalStatus.M[var18].n != 1 && GlobalStatus.M[var18].n != 4) {
                        if (GlobalStatus.M[var18].n == 2) {
                           if (var4.A != null && var4.A.b.length > 0) {
                              GlobalStatus.M[var18].a(var5, MainCanvas.f, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], (byte)0);
                           } else if (GlobalStatus.M[var18].q) {
                              if (c((int)var4.E[0].c) >= 0 && c((int)var4.E[0].c) < GlobalStatus.M.length) {
                                 GlobalStatus.M[var18].a(var5, MainCanvas.f, GlobalConfig.R[GlobalStatus.M[c((int)var4.E[0].c)].a][0], GlobalConfig.R[GlobalStatus.M[c((int)var4.E[0].c)].a][1], (byte)0);
                              }
                           } else if (a(var4.E[0].c) >= 0 && a(var4.E[0].c) < GlobalStatus.H.length) {
                              GlobalStatus.M[var18].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[a(var4.E[0].c)].a][0] - GlobalStatus.H[a(var4.E[0].c)].h() / 2, GlobalConfig.Q[GlobalStatus.H[a(var4.E[0].c)].a][1], (byte)0);
                           }
                        }
                     } else {
                        GlobalStatus.M[var18].a(var5, MainCanvas.f, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], (byte)0);
                        if (var4.f != -1 && var4.f != 0 && GlobalStatus.M[var18].p) {
                           MainCanvas.f.a(var5, (Frame1) ao_1.ae, (int[])null, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], 0, 0);
                        } else if (var4.f == 6 && GlobalStatus.M[var18].o) {
                           MainCanvas.f.a(var5, (Frame1) ao_1.ab, (int[])null, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0], GlobalConfig.R[GlobalStatus.M[var18].a][1], 0, 0);
                        }
                     }

                     if (GlobalStatus.M[var18].u.size() > 0) {
                        for(byte var23 = 0; var23 < GlobalStatus.M[var18].u.size(); ++var23) {
                           ck var8;
                           MainCanvas.f.a(var5, (Frame0) GlobalStatus.M[var18].u.elementAt(var23), (int[])null, 0, 0, 0, GlobalConfig.R[GlobalStatus.M[var18].a][0] - ((var8 = GlobalStatus.M[var18]).m != null && var8.m.g != null ? var8.m.g[0] : 0) / 2, GlobalConfig.R[GlobalStatus.M[var18].a][1] + var23 * 11 - GlobalStatus.M[var18].d(), 0, 0);
                        }
                     }
                  }
               }
            }
         }

         var5 = var2;
         var4 = this;
         if (GlobalStatus.H != null && this.f != 7) {
            for(byte var19 = 0; var19 < GlobalStatus.H.length; ++var19) {
               if (!GlobalStatus.H[var19].d() && GlobalStatus.H[var19].k == 2 && var4.E[0].c >= 0) {
                  if (var4.A != null && var4.A.b.length > 0) {
                     GlobalStatus.H[var19].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[var19].a][0], GlobalConfig.Q[GlobalStatus.H[var19].a][1], (byte)0);
                  } else {
                     byte var24 = 0;
                     if (GlobalStatus.H[var19].n) {
                        if ((var24 = (byte)a(var4.E[0].c)) >= 0 && var24 <= GlobalStatus.H.length - 1) {
                           GlobalStatus.H[var19].a(var5, MainCanvas.f, GlobalConfig.Q[GlobalStatus.H[a(var4.E[0].c)].a][0], GlobalConfig.Q[GlobalStatus.H[a(var4.E[0].c)].a][1], (byte)0);
                        }
                     } else if ((var24 = (byte)c((int)var4.E[0].c)) >= 0 && var24 <= GlobalStatus.M.length - 1) {
                        GlobalStatus.H[var19].a(var5, MainCanvas.f, GlobalConfig.R[GlobalStatus.M[c((int)var4.E[0].c)].a][0] + GlobalStatus.M[c((int)var4.E[0].c)].c() / 2, GlobalConfig.R[GlobalStatus.M[c((int)var4.E[0].c)].a][1], (byte)0);
                     }
                  }
               }
            }
         }

         Graphics var3 = var2;
         bq_1 var9 = this;
         if (this.d != 4 && this.d != 5 && this.d != 6) {
            if (this.d != 0 && this.d != 1) {
               if (this.d == 2 || this.d == 3) {
                  Graphics var21 = var2;

                  for(byte var27 = 0; var27 < GlobalStatus.H.length; ++var27) {
                     if (GlobalStatus.H[var27].e > 0 && GlobalStatus.H[var27].b != 0 && GlobalStatus.H[var27].a == i() + 3) {
                        LoadingPage.e(var21, GlobalConfig.Q[GlobalStatus.H[var27].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var27].a][1] - 9 - GlobalStatus.H[var27].i(), GlobalStatus.H[var27].e * 19 / (GlobalStatus.H[var27].f <= 0 ? 1 : GlobalStatus.H[var27].f), 0);
                        LoadingPage.e(var21, GlobalConfig.Q[GlobalStatus.H[var27].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var27].a][1] - 4 - GlobalStatus.H[var27].i(), GlobalStatus.H[var27].g * 19 / (GlobalStatus.H[var27].h <= 0 ? 1 : GlobalStatus.H[var27].h), 1);
                     }
                  }
               }
            } else {
               var5 = var2;

               for(byte var20 = 0; var20 < GlobalStatus.H.length; ++var20) {
                  if (GlobalStatus.H[var20].e > 0 && GlobalStatus.H[var20].b == 0 && GlobalStatus.H[var20].c.equals(GlobalStatus.ad)) {
                     if (GlobalStatus.H[var20].i == 291) {
                        LoadingPage.e(var5, GlobalConfig.Q[GlobalStatus.H[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var20].a][1] - 2 - GlobalStatus.H[var20].i(), GlobalStatus.H[var20].e * 19 / (GlobalStatus.H[var20].f <= 0 ? 1 : GlobalStatus.H[var20].f), 0);
                        LoadingPage.e(var5, GlobalConfig.Q[GlobalStatus.H[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var20].a][1] + 3 - GlobalStatus.H[var20].i(), GlobalStatus.H[var20].g * 19 / (GlobalStatus.H[var20].h <= 0 ? 1 : GlobalStatus.H[var20].h), 1);
                     } else {
                        LoadingPage.e(var5, GlobalConfig.Q[GlobalStatus.H[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var20].a][1] - 9 - GlobalStatus.H[var20].i(), GlobalStatus.H[var20].e * 19 / (GlobalStatus.H[var20].f <= 0 ? 1 : GlobalStatus.H[var20].f), 0);
                        LoadingPage.e(var5, GlobalConfig.Q[GlobalStatus.H[var20].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var20].a][1] - 4 - GlobalStatus.H[var20].i(), GlobalStatus.H[var20].g * 19 / (GlobalStatus.H[var20].h <= 0 ? 1 : GlobalStatus.H[var20].h), 1);
                     }
                  }
               }
            }
         }

         for(byte var12 = 0; var12 < GlobalStatus.H.length; ++var12) {
            if (GlobalStatus.H != null && var12 >= 0 && var12 <= GlobalStatus.H.length - 1 && var12 >= 0 && !GlobalStatus.H[var12].d()) {
               if (var9.i == var12 && (var9.d == 4 || var9.d == 5)) {
                  LoadingPage.a(var3, (String) GlobalStatus.H[var9.i].d, (int)2, 2, 20, 14337302, 0);
               }

               if (GlobalStatus.H[var12].b == 0) {
                  if (GlobalStatus.H[var12].i == 291) {
                     LoadingPage.e(var3, GlobalConfig.Q[GlobalStatus.H[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var12].a][1] - 2 - GlobalStatus.H[var12].i(), GlobalStatus.H[var12].e * 19 / GlobalStatus.H[var12].f, 0);
                     LoadingPage.e(var3, GlobalConfig.Q[GlobalStatus.H[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var12].a][1] + 3 - GlobalStatus.H[var12].i(), GlobalStatus.H[var12].g * 19 / GlobalStatus.H[var12].h, 1);
                  } else {
                     LoadingPage.e(var3, GlobalConfig.Q[GlobalStatus.H[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var12].a][1] - 9 - GlobalStatus.H[var12].i(), GlobalStatus.H[var12].e * 19 / GlobalStatus.H[var12].f, 0);
                     LoadingPage.e(var3, GlobalConfig.Q[GlobalStatus.H[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var12].a][1] - 4 - GlobalStatus.H[var12].i(), GlobalStatus.H[var12].g * 19 / GlobalStatus.H[var12].h, 1);
                  }
               } else if (GlobalStatus.H[var12].b == 2) {
                  LoadingPage.e(var3, GlobalConfig.Q[GlobalStatus.H[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var12].a][1] - 9 - GlobalStatus.H[var12].i(), GlobalStatus.H[var12].e * 19 / GlobalStatus.H[var12].f, 0);
                  LoadingPage.e(var3, GlobalConfig.Q[GlobalStatus.H[var12].a][0] - 10, GlobalConfig.Q[GlobalStatus.H[var12].a][1] - 4 - GlobalStatus.H[var12].i(), GlobalStatus.H[var12].g * 19 / GlobalStatus.H[var12].h, 1);
               }
            }
         }

         for(byte var13 = 0; var13 < GlobalStatus.M.length; ++var13) {
            if (var13 >= 0 && !GlobalStatus.M[var13].a()) {
               LoadingPage.e(var3, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 4 - GlobalStatus.M[var13].d(), GlobalStatus.M[var13].e * 19 / GlobalStatus.M[var13].f, 0);
               if (var9.h == var13 && (var9.d == 1 || var9.d == 0 || var9.d == 2 || var9.d == 3 || var9.d == 9)) {
                  LoadingPage.a(var3, (String) GlobalStatus.M[var13].d, (int)2, 2, 20, 14337302, 0);
                  LoadingPage.a(var3, (String)("" + GlobalConfig.K[GlobalStatus.M[var13].k]), (int)(GlobalConfig.defaultWidth - 2), 2, 24, 14337302, 0);
               }

               if (GlobalStatus.M[var13].i > 99) {
                  MainCanvas.f.a(var3, ao_1.B, (int[])null, GlobalStatus.M[var13].i / 100 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 15, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                  MainCanvas.f.a(var3, ao_1.B, (int[])null, (GlobalStatus.M[var13].i - 100) / 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                  MainCanvas.f.a(var3, ao_1.B, (int[])null, GlobalStatus.M[var13].i % 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 7, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
               } else if (GlobalStatus.M[var13].i > 9) {
                  MainCanvas.f.a(var3, ao_1.B, (int[])null, GlobalStatus.M[var13].i / 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
                  MainCanvas.f.a(var3, ao_1.B, (int[])null, GlobalStatus.M[var13].i % 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 7, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
               } else if (GlobalStatus.M[var13].i > 1) {
                  MainCanvas.f.a(var3, ao_1.B, (int[])null, GlobalStatus.M[var13].i % 10 + 1, 0, 0, GlobalConfig.R[GlobalStatus.M[var13].a][0] - 11, GlobalConfig.R[GlobalStatus.M[var13].a][1] - 11 - GlobalStatus.M[var13].d(), 0, 0);
               }

               if (var9.h == var13 && GlobalStatus.M[var13].l == 1) {
                  MainCanvas.f.a(var3, ao_1.D, (int[])null, -1, 0, 0, 4 + GlobalConfig.i.stringWidth(GlobalStatus.M[var13].d), 6, 0, 0);
               }
            }
         }
      }

      if (this.f == 0 || this.f == 1) {
         if (this.d != 4 && this.d != 5 && this.d != 6 && this.d != 7 && this.d != 8) {
            if (this.h >= 0 && this.h <= GlobalStatus.M.length - 1) {
               PngUtil.a(ao_1.r, this.y.ak);
               MainCanvas.f.a(var2, (Frame1) ao_1.r, (int[])null, 0, 0, GlobalConfig.R[GlobalStatus.M[this.h].a][0], GlobalConfig.R[GlobalStatus.M[this.h].a][1] - 10 - GlobalStatus.M[this.h].d(), 20, 0);
            }
         } else if (this.i >= 0 && this.i <= GlobalStatus.H.length - 1 && GlobalStatus.H[this.i].j != null) {
            PngUtil.a(ao_1.r, this.y.ak);
            MainCanvas.f.a(var2, (Frame1) ao_1.r, (int[])null, 0, 0, GlobalConfig.Q[GlobalStatus.H[this.i].a][0], GlobalConfig.Q[GlobalStatus.H[this.i].a][1] - 10 - GlobalStatus.H[this.i].i(), 20, 0);
         }
      }

      if (this.f == 0) {
         if (this.d == 0) {
            this.b(var2);
         } else if (this.d == 2) {
            this.c(var2);
         }

         if ((GlobalStatus.bs >= 0 && GlobalStatus.s == 0 || t == 1 || t == 2) && s >= 0) {
            LoadingPage.a(var2, (String)String.valueOf(s), (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh / 2 - (GlobalConfig.defaultHigh <= 240 ? GlobalConfig.j : GlobalConfig.j / 2), 17, 16711680, 0);
         }
      } else if (this.f == 3) {
         this.a(var2);
         this.e(var2);
      } else if (this.f != 4) {
         if (this.f == 5) {
            if (this.F != null && this.A != null) {
               this.A.a(var2, MainCanvas.f, 0, 0);
            }
         } else if (this.f == 6) {
            this.a(var2);
         } else if (this.f == -1) {
            this.a(var2, "请等待......");
         } else if (this.f == 9) {
            this.a(var2, "等待队友......");
         }
      }

      this.d(var2);
      if (GlobalStatus.bt && c > 0) {
         LoadingPage.a(var2, (String)("自动回合:" + c), (int)(GlobalConfig.defaultWidth - GlobalConfig.i.stringWidth("自动回合:" + c) / 2 - 45), 2, 17, 16777215, 0);
      }

      if (GlobalConfig.o) {
         var2.drawImage(MainCanvas.U.pngImage, GlobalConfig.defaultWidth - MainCanvas.U.b, GlobalConfig.defaultHigh - MainCanvas.U.c, 20);
      }

      var2.setClip(0, 0, GlobalConfig.defaultWidth, GlobalConfig.defaultHigh);
   }

   private void n() {
      for(byte var1 = 0; var1 < this.F.length; ++var1) {
         if (this.F[var1].k >= 0 && this.F[var1].b == 1) {
            for(byte var2 = 0; var2 < GlobalStatus.M.length; ++var2) {
               if (GlobalStatus.M[var2] != null && !GlobalStatus.M[var2].a() && this.F[var1].c == GlobalStatus.M[var2].a) {
                  GlobalStatus.M[var2].b((byte)4);
               }
            }
         }
      }

      this.B = this.y.ak;
      this.f = 3;
   }

   private void o() {
      if (this.E[0].a == 0) {
         byte var4 = 0;

         while(true) {
            if (var4 >= GlobalStatus.H.length) {
               return;
            }

            GlobalStatus.H[var4].l = false;
            if (GlobalStatus.H[var4].a == this.E[0].b) {
               if (this.E[0].d != 1 && this.E[0].d != 5 && this.E[0].d != 8 && this.E[0].d != 10) {
                  if (this.E[0].d == 2) {
                     GlobalStatus.H[var4].l = true;
                     this.f = 6;
                  } else if (this.E[0].d == 3) {
                     GlobalStatus.H[var4].m = true;
                  } else {
                     if (this.E[0].d != -1) {
                        return;
                     }

                     this.B = this.y.ak;
                     this.f = 3;
                  }
                  break;
               }

               if (this.E[0].d == 8) {
                  GlobalStatus.H[var4].n = true;
               }

               this.A = null;
               if (this.E[0].d == 5) {
                  if (this.E[0].e >= 10) {
                     this.A = new cj(this.E[0].e, this.v());

                     for(byte var9 = 0; var9 < this.A.b.length; ++var9) {
                        if (this.F != null) {
                           for(byte var12 = 0; var12 < this.F.length; ++var12) {
                              if (this.F[var12].b == 1 && this.F[var12].l == 0) {
                                 this.F[var12].l = 1;
                                 if (c((int)this.F[var12].c) >= 0 && c((int)this.F[var12].c) < GlobalStatus.M.length && GlobalStatus.M[c((int)this.F[var12].c)].m != null) {
                                    this.A.a(var9, GlobalConfig.R[this.F[var12].c][0], GlobalConfig.R[this.F[var12].c][1]);
                                 }
                                 break;
                              }

                              if (this.F[var12].b == 0 && this.F[var12].l == 0) {
                                 this.F[var12].l = 1;
                                 if (GlobalStatus.H[a(this.F[var12].c)].j != null) {
                                    this.A.a(var9, GlobalConfig.Q[this.F[var12].c][0], GlobalConfig.Q[this.F[var12].c][1]);
                                 }
                                 break;
                              }
                           }
                        }
                     }
                  }
               } else if (this.E[0].d == 10) {
                  if (this.E[0].e >= 10) {
                     this.A = new cj(this.E[0].e, 1);
                     if (this.F != null) {
                        for(byte var8 = 0; var8 < this.F.length; ++var8) {
                           if (this.F[var8].b >= 0) {
                              if (this.F[var8].b == 1) {
                                 this.A.a(0, GlobalConfig.R[1][0], GlobalConfig.R[1][1]);
                              } else if (this.F[var8].b == 0) {
                                 this.A.a(0, GlobalConfig.Q[1][0], GlobalConfig.Q[1][1]);
                              }
                              break;
                           }
                        }
                     }
                  }
               } else if (this.E[0].e >= 10) {
                  this.A = new cj(this.E[0].e, this.E[0].e == 22 ? 1 : this.w());

                  for(byte var7 = 0; var7 < this.A.b.length; ++var7) {
                     if (this.F != null) {
                        for(byte var11 = 0; var11 < this.F.length; ++var11) {
                           if (this.F[var11].b == 1 && this.F[var11].l == 0 || this.E[0].e == 22) {
                              this.F[var11].l = 1;
                              if (c((int)this.F[var11].c) >= 0 && c((int)this.F[var11].c) < GlobalStatus.M.length && GlobalStatus.M[c((int)this.F[var11].c)].m != null) {
                                 this.A.a(var7, GlobalConfig.R[this.F[var11].c][0], GlobalConfig.R[this.F[var11].c][1]);
                              }
                              break;
                           }
                        }
                     }
                  }
               }

               GlobalStatus.H[var4].b((byte)2);
               this.f = 2;
               this.D = this.y.ak;
               break;
            }

            ++var4;
         }
      } else if (this.E[0].a == 1) {
         for(byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
            GlobalStatus.M[var1].o = false;
            if (GlobalStatus.M[var1].a == this.E[0].b) {
               if (this.E[0].d == 6) {
                  break;
               }

               if (t == 0 || this.E[0].d == 8 || t == 1 && (this.E[0].d == 1 || this.E[0].d == 5) || t == 2 && (this.E[0].d == 1 || this.E[0].d == 5) || t == 1 && (this.E[0].d == 1 || this.E[0].d == 10) || t == 2 && (this.E[0].d == 1 || this.E[0].d == 10)) {
                  if (this.E[0].d == 8) {
                     GlobalStatus.M[var1].q = true;
                  }

                  GlobalStatus.M[var1].b((byte)2);
                  this.A = null;
                  if (this.E[0].d == 5) {
                     if (this.E[0].e >= 10) {
                        this.A = new cj(this.E[0].e, this.v());

                        for(byte var2 = 0; var2 < this.A.b.length; ++var2) {
                           if (this.F != null) {
                              for(byte var3 = 0; var3 < this.F.length; ++var3) {
                                 if (this.F[var3].b == 0 && this.F[var3].l == 0) {
                                    this.F[var3].l = 1;
                                    if (a(this.F[var3].c) >= 0 && a(this.F[var3].c) <= GlobalStatus.H.length - 1 && GlobalStatus.H[a(this.F[var3].c)].j != null) {
                                       this.A.a(var2, GlobalConfig.Q[this.F[var3].c][0], GlobalConfig.Q[this.F[var3].c][1]);
                                       break;
                                    }
                                 } else if (this.F[var3].b == 1 && this.F[var3].l == 0) {
                                    this.F[var3].l = 1;
                                    if (c((int)this.F[var3].c) >= 0 && c((int)this.F[var3].c) <= GlobalStatus.M.length - 1 && GlobalStatus.M[c((int)this.F[var3].c)].m != null) {
                                       this.A.a(var2, GlobalConfig.R[this.F[var3].c][0], GlobalConfig.R[this.F[var3].c][1]);
                                       break;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  } else if (this.E[0].d == 10) {
                     if (this.E[0].e >= 10) {
                        this.A = new cj(this.E[0].e, 1);
                        if (this.F != null) {
                           for(byte var5 = 0; var5 < this.F.length; ++var5) {
                              if (this.F[var5].b >= 0) {
                                 if (this.F[var5].b == 1) {
                                    this.A.a(0, GlobalConfig.R[1][0], GlobalConfig.R[1][1]);
                                 } else if (this.F[var5].b == 0) {
                                    this.A.a(0, GlobalConfig.Q[1][0], GlobalConfig.Q[1][1]);
                                 }
                                 break;
                              }
                           }
                        }
                     }
                  } else if (this.E[0].e >= 10) {
                     this.A = new cj(this.E[0].e, this.w());

                     for(byte var6 = 0; var6 < this.A.b.length; ++var6) {
                        if (this.F != null) {
                           for(byte var10 = 0; var10 < this.F.length; ++var10) {
                              if (this.F[var10].b == 0 && this.F[var10].l == 0 && a(this.F[var10].c) >= 0 && a(this.F[var10].c) <= GlobalStatus.H.length - 1 && GlobalStatus.H[a(this.F[var10].c)].j != null) {
                                 this.F[var10].l = 1;
                                 this.A.a(var6, GlobalConfig.Q[this.F[var10].c][0], GlobalConfig.Q[this.F[var10].c][1]);
                                 break;
                              }
                           }
                        }
                     }
                  }

                  this.f = 2;
                  this.D = this.y.ak;
                  return;
               }

               if (this.E[0].d == 2) {
                  GlobalStatus.M[var1].o = true;
                  this.f = 6;
                  return;
               }

               if (this.E[0].d == 3) {
                  GlobalStatus.M[var1].p = true;
                  return;
               }

               if (this.E[0].d == -1) {
                  this.B = this.y.ak;
                  this.f = 3;
                  return;
               }
               break;
            }
         }
      }

   }

   private static void a(Vector var0, Vector var1) {
      Object var2 = null;

      for(int var3 = 0; var3 < var0.size(); ++var3) {
         Frame0 var4 = (Frame0)var0.elementAt(var3);
         if (!var1.contains(var4)) {
            var0.removeElementAt(var3);
            var3 = 0;
         }
      }

      for(int var6 = 0; var6 < var1.size(); ++var6) {
         Frame0 var5 = (Frame0)var1.elementAt(var6);
         if (!var0.contains(var5)) {
            var0.addElement(var5);
         }
      }

   }

   private void p() {
      if (this.I - this.C >= 1000L) {
         this.C = this.y.ak;
         if (--s <= 0) {
            if (GlobalStatus.bt && c <= 0) {
               this.z.O();
               c = 0;
               this.e = 5;
               return;
            }

            this.j = 0;
            this.z.az = this.z.az <= GlobalStatus.ej.length - 1 && this.z.az >= 0 ? this.z.az : 0;
            this.p = GlobalStatus.ej[this.z.az];
            this.n = 1;
            this.h = this.h <= GlobalStatus.M.length - 1 && this.h >= 0 ? this.h : 0;
            this.a((byte)(GlobalStatus.bt ? 0 : 1), GlobalStatus.bt ? 0 : 1, (byte)1, GlobalStatus.M[this.h].a, (byte)(GlobalStatus.bt ? 0 : 1), GlobalStatus.bt ? 0 : 1, (byte)1, GlobalStatus.M[this.h].a);
            this.f = -1;
            this.e = 5;
            if (!ab_1.c()) {
               c = (byte)(GlobalStatus.bt ? c - 1 : 0);
            }
         }
      }

   }

   private void q() {
      if (GlobalStatus.en[this.z.az] != -1 && this.z.az >= 0 && this.z.az < 8) {
         this.j = 0;
         this.p = GlobalStatus.ej[this.z.az];
         if (h() && GlobalStatus.ek[this.z.az] != 2) {
            this.y.b("只能使用复活道具");
            return;
         }

         if (GlobalStatus.el[this.z.az] == 2) {
            this.n = 1;
            this.o = GlobalStatus.M[this.h].a;
            if (c() > 1 && c() > GlobalStatus.em[this.z.az]) {
               this.d = 1;
               return;
            }

            if (this.j()) {
               this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, GlobalStatus.M[this.h].a);
               this.f = -1;
               this.e = 5;
               return;
            }

            this.d = 2;
            this.e = 3;
            return;
         }

         if (GlobalStatus.el[this.z.az] == 1) {
            this.n = 0;
            this.i = f() < 0 ? this.i : f();
            this.d = 7;
            return;
         }

         if (GlobalStatus.el[this.z.az] == 0) {
            this.n = 0;
            this.o = this.i = i();
            if (this.j()) {
               this.a(this.j, this.p, this.n, this.o, (byte)1, 1, (byte)1, (byte)-1);
               this.f = -1;
               this.e = 5;
               return;
            }

            this.d = 2;
            this.e = 3;
         }
      }

   }

   private void r() {
      if (GlobalStatus.er[this.z.az] == 2) {
         this.l = 1;
         if (c() > 1 && c() > GlobalStatus.es[this.z.az]) {
            this.k = 0;
            this.q = GlobalStatus.ep[this.z.az];
            this.d = 3;
         } else {
            this.a(this.j, this.p, this.n, this.o, (byte)0, this.z.az, (byte)1, GlobalStatus.M[this.h].a);
            this.f = -1;
            this.e = 5;
         }
      } else if (GlobalStatus.er[this.z.az] == 1) {
         this.l = 0;
         this.k = 0;
         this.q = GlobalStatus.ep[this.z.az];
         if (b() > 1 && b() > GlobalStatus.es[this.z.az]) {
            this.i = this.g();
            this.d = 8;
         } else {
            this.m = this.i = (byte)(i() + 3);
            this.l = 0;
            this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
            this.f = -1;
            this.e = 5;
         }
      } else {
         if (GlobalStatus.er[this.z.az] == 0) {
            this.k = 0;
            this.q = GlobalStatus.ep[this.z.az];
            this.m = (byte)(i() + 3);
            this.l = 0;
            this.i = this.g();
            this.a(this.j, this.p, this.n, this.o, this.k, this.q, this.l, this.m);
            this.f = -1;
            this.e = 5;
         }

      }
   }

   private boolean b(int var1) {
      return c() <= 1 || GlobalStatus.ek != null && c() <= GlobalStatus.em[this.z.az];
   }

   public static int b() {
      byte var0 = 0;

      for(byte var1 = 0; var1 < GlobalStatus.H.length; ++var1) {
         if (GlobalStatus.H[var1].e > 0) {
            ++var0;
         }
      }

      return var0;
   }

   public static int c() {
      int var0 = 0;

      for(byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
         if (GlobalStatus.M[var1].e > 0) {
            ++var0;
         }
      }

      return var0;
   }

   public final void a(byte var1, int var2, byte var3, byte var4, byte var5, int var6, byte var7, byte var8) {
      if (var1 != 4 && a(var3, var4) && var3 == 0) {
         boolean var10000;
         label104: {
            int var10 = var2;
            if (var1 == 2) {
               Object var9 = null;

               for(int var11 = 0; var11 < GlobalStatus.bC.size(); ++var11) {
                  bn var13;
                  if ((var13 = (bn) GlobalStatus.bC.elementAt(var11)) != null && var10 == var13.a && var13.f == 2) {
                     var10000 = true;
                     break label104;
                  }
               }
            } else if (var1 == 0) {
               if (GlobalStatus.ek[var2] == 2) {
                  var10000 = true;
                  break label104;
               }

               if (GlobalStatus.ek[var2] == 6 && GlobalStatus.el[var2] == 1) {
                  var10000 = true;
                  break label104;
               }
            } else if (var1 == 1) {
               for(int var14 = 0; var14 < GlobalStatus.dy.length; ++var14) {
                  if (var10 == GlobalStatus.dv[var14] && GlobalStatus.dy[var14] == 1) {
                     var10000 = true;
                     break label104;
                  }
               }
            }

            var10000 = false;
         }

         if (!var10000) {
            this.y.b("不能对死亡目标使用");
            return;
         }
      }

      if (var5 != 4 && a(var7, var8) && var3 == 0) {
         boolean var17;
         label73: {
            int var16 = var6;
            if (var5 != 2) {
               if (var5 == 0) {
                  if (GlobalStatus.eq != null && GlobalStatus.eq[var6] == 2) {
                     var17 = true;
                     break label73;
                  }
               } else if (var5 == 1 && GlobalStatus.cU != null) {
                  for(int var15 = 0; var15 < GlobalStatus.cU.length; ++var15) {
                     if (var16 == GlobalStatus.cR[var15] && GlobalStatus.cU[var15] == 1) {
                        var17 = true;
                        break label73;
                     }
                  }
               }
            }

            var17 = false;
         }

         if (!var17) {
            this.y.b("不能对死亡目标使用");
            return;
         }
      }

      byte[] var12;
      if ((var12 = NetPayloadBuilder.a((short)4180, GlobalStatus.ad, GlobalStatus.v, g, t, var1, var2, var3, var4, (short)var5, var6, var7, var8)) != null) {
         MainCanvas.netUtils.sendPacket(new NetPacket((short)4180, var12));
         this.J = false;
         this.d = 0;
      } else {
         this.y.b("获取上传指令数据错误!");
      }
   }

   private static boolean a(byte var0, byte var1) {
      if (var0 == 0) {
         for(int var2 = 0; var2 < GlobalStatus.H.length; ++var2) {
            if (GlobalStatus.H[var2].a == var1 && GlobalStatus.H[var2].e <= 0) {
               return true;
            }
         }
      } else if (var0 == 1) {
         for(int var3 = 0; var3 < GlobalStatus.M.length; ++var3) {
            if (GlobalStatus.M[var3].a == var1 && GlobalStatus.M[var3].e <= 0) {
               return true;
            }
         }
      }

      return false;
   }

   private void a(Graphics var1) {
      if (this.F != null && this.F.length > 0) {
         byte var2 = 0;
         byte var3 = 0;
         byte var4 = 0;
         byte var5 = 0;

         for(byte var6 = 0; var6 < this.F.length; ++var6) {
            if (this.F[var6].b == 1 && this.F[var6].d != 0 && c((int)this.F[var6].c) >= 0 && c((int)this.F[var6].c) < GlobalStatus.M.length) {
               int var10002 = this.F[var6].d;
               short var10003 = GlobalConfig.R[this.F[var6].c][0];
               int var10004 = GlobalConfig.R[this.F[var6].c][1] - GlobalStatus.M[c((int)this.F[var6].c)].d();
               int var16;
               if (this.F[var6].f <= 24) {
                  ae var10005 = this.F[var6];
                  var16 = var10005.f += 4;
               } else {
                  var16 = 24;
               }

               this.a(var1, var10002, var10003, var10004 - var16 + var2 * 10, 1, 0, 0);
               ++var2;
            }

            if (this.F[var6].b == 1 && this.F[var6].e != 0 && c((int)this.F[var6].c) >= 0 && c((int)this.F[var6].c) < GlobalStatus.M.length) {
               int var7 = this.F[var6].e;
               short var10 = GlobalConfig.R[this.F[var6].c][0];
               int var13 = GlobalConfig.R[this.F[var6].c][1] - GlobalStatus.M[c((int)this.F[var6].c)].d();
               int var18;
               if (this.F[var6].f <= 24) {
                  ae var17 = this.F[var6];
                  var18 = var17.f += 4;
               } else {
                  var18 = 24;
               }

               this.a(var1, var7, var10, var13 - var18 + var3 * 10, 0, 0, 0);
               ++var3;
            }

            if (this.F[var6].b == 0 && this.F[var6].d != 0 && a(this.F[var6].c) >= 0 && a(this.F[var6].c) < GlobalStatus.H.length) {
               int var8 = this.F[var6].d;
               int var11 = GlobalConfig.Q[this.F[var6].c][0] + 10;
               int var14 = GlobalConfig.Q[this.F[var6].c][1] - GlobalStatus.H[a(this.F[var6].c)].i();
               int var20;
               if (this.F[var6].f <= 24) {
                  ae var19 = this.F[var6];
                  var20 = var19.f += 4;
               } else {
                  var20 = 24;
               }

               this.a(var1, var8, var11, var14 - var20 + var4 * 10, 1, 0, 1);
               ++var4;
            }

            if (this.F[var6].b == 0 && this.F[var6].e != 0 && a(this.F[var6].c) >= 0 && a(this.F[var6].c) < GlobalStatus.H.length) {
               int var9 = this.F[var6].e;
               int var12 = GlobalConfig.Q[this.F[var6].c][0] + 10;
               int var15 = GlobalConfig.Q[this.F[var6].c][1] - GlobalStatus.H[a(this.F[var6].c)].i();
               int var22;
               if (this.F[var6].f <= 24) {
                  ae var21 = this.F[var6];
                  var22 = var21.f += 4;
               } else {
                  var22 = 24;
               }

               this.a(var1, var9, var12, var15 - var22 + var5 * 10, 0, 0, 1);
               ++var5;
            }
         }

      }
   }

   private void a(Graphics var1, String var2) {
      if (this.y.touchPageCase != 2) {
         if (this.K == null) {
            this.K = LoadingPage.a(var2, GlobalConfig.i, GlobalConfig.defaultWidth / 2 - 20, "/t");
         }

         if (this.K != null) {
            LoadingPage.a(var1, (GlobalConfig.defaultWidth - GlobalConfig.k * 10) / 2, (GlobalConfig.defaultHigh - GlobalConfig.j * this.K.length - 20) / 2, GlobalConfig.k * 10, GlobalConfig.j * this.K.length + 20);

            for(int var3 = 0; var3 < this.K.length; ++var3) {
               LoadingPage.a(var1, (String)this.K[var3], (int)(GlobalConfig.defaultWidth / 2), (GlobalConfig.defaultHigh - GlobalConfig.j * this.K.length - 20) / 2 + 10 + var3 * GlobalConfig.j, 17, LoadingPage.a, 0);
            }
         }
      }

   }

   public final void d() {
      this.y.p = true;
      this.y.b();
      if (this.v != null) {
         this.v.removeAllElements();
         this.v = null;
      }

      if (this.w != null) {
         this.w.removeAllElements();
         this.w = null;
      }

      if (this.A != null) {
         this.A = null;
      }

      e();
      this.y.b();
      GlobalStatus.p();
      this.y.b();
      this.z.c = false;
      this.y.b();
      this.u = null;
      this.z.T();
      this.y.b();
      GlobalStatus.g();
      this.y.b();
      MainCanvas.f.a(this.z.f, ao_1.h, ao_1.i, true, false, 1283472);
      this.y.b();
      this.z.j();
      this.y.b();
      this.y.p = false;
      r = System.currentTimeMillis();
      g = -1;
   }

   public static void e() {
      if (GlobalStatus.M != null) {
         for(byte var0 = 0; var0 < GlobalStatus.M.length; ++var0) {
            if (GlobalStatus.M[var0] != null) {
               GlobalStatus.M[var0].b();
               GlobalStatus.M[var0] = null;
            }
         }

         GlobalStatus.M = null;
      }

      if (GlobalStatus.H != null) {
         for(byte var1 = 0; var1 < GlobalStatus.H.length; ++var1) {
            if (GlobalStatus.H[var1] != null) {
               GlobalStatus.H[var1].e();
               GlobalStatus.H[var1] = null;
            }
         }

         GlobalStatus.H = null;
      }

   }

   private static void a(p var0, ae var1) {
      var0.e = var1.g;
      var0.g = var1.h;
      var0.f = var1.i;
      var0.h = var1.j;
      if (var0.c.equals(GlobalStatus.ad) && GlobalStatus.x != -1) {
         GlobalStatus.aN = var0.e;
         GlobalStatus.aP = var0.g;
         GlobalStatus.aM = var0.f;
         GlobalStatus.aO = var0.h;
      }

   }

   public final int a(int var1, int var2) {
      if (this.L != null) {
         for(int var3 = 0; var3 < this.L.length; ++var3) {
            if (var1 >= this.L[var3][0] && var1 <= this.L[var3][0] + this.L[var3][2] && var2 >= this.L[var3][1] && var2 <= this.L[var3][1] + this.L[var3][3]) {
               this.e = var3;
               return 1073741824;
            }
         }
      }

      return 0;
   }

   private void b(Graphics var1) {
      if (ao_1.Z != null) {
         for(byte var2 = 0; var2 < 5; ++var2) {
            int var10003 = GlobalConfig.defaultHigh - 102 + (var2 << 4);
            short var6 = ao_1.Z.c;
            boolean var3 = true;
            int var5 = var10003;
            var3 = true;
            if (this.L != null && this.L.length > var2) {
               this.L[var2][0] = 1;
               this.L[var2][1] = var5;
               this.L[var2][2] = 25;
               this.L[var2][3] = var6;
            }

            MainCanvas.f.a(var1, ao_1.Z, (int[])null, var2 + 1, 0, 0, 1, GlobalConfig.defaultHigh - 102 + (var2 << 4), 0, 0);
            if (var2 == this.e) {
               var1.setColor(16711680);
               LoadingPage.d(var1, 1, GlobalConfig.defaultHigh - 102 + (this.e << 4), 25, 15);
               switch (this.e) {
                  case 0:
                     LoadingPage.a(var1, (String)"攻击", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                     break;
                  case 1:
                     LoadingPage.a(var1, (String)"防御", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                     break;
                  case 2:
                     LoadingPage.a(var1, (String)"技能", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                     break;
                  case 3:
                     LoadingPage.a(var1, (String)"道具", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                     break;
                  case 4:
                     LoadingPage.a(var1, (String)"逃跑", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
               }
            }
         }
      }

   }

   public final int b(int var1, int var2) {
      if (this.M != null) {
         for(int var3 = 0; var3 < this.M.length; ++var3) {
            if (var1 >= this.M[var3][0] && var1 <= this.M[var3][0] + this.M[var3][2] && var2 >= this.M[var3][1] && var2 <= this.M[var3][1] + this.M[var3][3]) {
               this.e = var3;
               return 1073741824;
            }
         }
      }

      return 0;
   }

   private void c(Graphics var1) {
      if (ao_1.Z != null) {
         for(byte var2 = 0; var2 < 3; ++var2) {
            int var10003 = GlobalConfig.defaultHigh - 70 + (var2 << 4);
            short var6 = ao_1.Z.c;
            boolean var3 = true;
            int var5 = var10003;
            var3 = true;
            if (this.M != null && this.M.length > var2) {
               this.M[var2][0] = 1;
               this.M[var2][1] = var5;
               this.M[var2][2] = 25;
               this.M[var2][3] = var6;
            }

            MainCanvas.f.a(var1, ao_1.Z, (int[])null, var2 + 1, 0, 0, 1, GlobalConfig.defaultHigh - 70 + (var2 << 4), 0, 0);
            if (var2 == this.e) {
               var1.setColor(16711680);
               LoadingPage.d(var1, 1, GlobalConfig.defaultHigh - 70 + (var2 << 4), 25, 15);
               switch (this.e) {
                  case 0:
                     LoadingPage.a(var1, (String)"攻击", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                     break;
                  case 1:
                     LoadingPage.a(var1, (String)"防御", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                     break;
                  case 2:
                     LoadingPage.a(var1, (String)"技能", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
               }
            }
         }
      }

   }

   public final int a(int var1, int var2, int var3) {
      if (this.N != null) {
         if ((var1 = var1 == 0 ? 5 : (var1 == 2 ? 3 : 0)) == 0) {
            return 0;
         }

         for(int var4 = 0; var4 < this.N.length; ++var4) {
            if (var2 >= this.N[var4][0] && var2 <= this.N[var4][0] + this.N[var4][2] && var3 >= this.N[var4][1] && var3 <= this.N[var4][1] + this.N[var4][3]) {
               if (this.z.az != var4 || this.e != var1) {
                  this.e = var1;
                  this.z.az = (byte)(var4 - 1);
                  return 2;
               }

               if (this.z.az == var4 && this.e == var1) {
                  return this.O[var4];
               }
            }
         }
      }

      return 0;
   }

   private void d(Graphics var1) {
      if (GlobalStatus.ej != null) {
         if (this.d != 0 && this.d != 1 && this.d != 4) {
            this.z.a(var1, 0, GlobalConfig.defaultHigh - 22, 1);
         } else {
            this.z.a(var1, 0, GlobalConfig.defaultHigh - 22, 0);
         }

         for(byte var2 = 0; var2 < GlobalStatus.ej.length; ++var2) {
            PngUtil var10000;
            Graphics var10001;
            Frame0 var10002;
            Object var10003;
            int var10004;
            if (var2 >= 0 && var2 < 8) {
               var10000 = MainCanvas.f;
               var10001 = var1;
               var10002 = MainCanvas.n;
               var10003 = null;
               var10004 = var2 + 1;
            } else {
               MainCanvas.f.a(var1, ao_1.F, (int[])null, var2 == 8 ? 0 : 2, 0, 0, 3 + GlobalStatus.ej[var2] * 17, GlobalConfig.defaultHigh - 19, 0, 0);
               var10000 = MainCanvas.f;
               var10001 = var1;
               var10002 = ao_1.G;
               var10003 = null;
               var10004 = var2 == 8 ? 0 : 1;
            }

            var10000.a(var10001, var10002, (int[])var10003, var10004, 0, 0, 3 + GlobalStatus.ej[var2] * 17, GlobalConfig.defaultHigh - 19, 0, 0);
            int var9 = 3 + var2 * 17;
            int var10 = GlobalConfig.defaultHigh - 19;
            boolean var3 = true;
            var3 = true;
            int var6 = var10;
            int var5 = var9;
            if (this.N != null && this.N.length > var2) {
               this.N[var2][0] = var5;
               this.N[var2][1] = var6;
               this.N[var2][2] = 17;
               this.N[var2][3] = 17;
            }
         }

         if (this.e == 5 && GlobalStatus.ej != null || this.e == 3 && GlobalStatus.ej != null && this.d > 1) {
            for(byte var7 = 0; var7 < GlobalStatus.ej.length; ++var7) {
               if (var7 == this.z.az) {
                  var1.setColor(16711680);
                  LoadingPage.d(var1, 2 + var7 * 17, GlobalConfig.defaultHigh - 20, 17, 17);
                  if (this.f == 0) {
                     switch (this.z.az) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                           if (this.d == 0) {
                              if (GlobalStatus.en[this.z.az] == -1) {
                                 return;
                              }

                              LoadingPage.a(var1, (String) GlobalStatus.eo[this.z.az], (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                           } else {
                              if (this.d != 2 || GlobalStatus.et[this.z.az] == -1) {
                                 return;
                              }

                              LoadingPage.a(var1, (String) GlobalStatus.eu[this.z.az], (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                           }

                           return;
                        case 8:
                           LoadingPage.a(var1, (String)"聊天记录", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                           return;
                        case 9:
                           LoadingPage.a(var1, (String)"自动打怪", (int)(GlobalConfig.defaultWidth / 2), GlobalConfig.defaultHigh - 22 - GlobalConfig.j, 17, 16776960, 0);
                           return;
                        default:
                           return;
                     }
                  }
                  break;
               }
            }
         }

      }
   }

   private void e(Graphics var1) {
      if (this.u != null) {
         for(byte var2 = 0; var2 < this.u.length; ++var2) {
            LoadingPage.a(var1, (String)this.u[var2], (int)(GlobalConfig.defaultWidth / 2), (GlobalConfig.defaultHigh - this.u.length * GlobalConfig.j) / 2 + var2 * GlobalConfig.j, 17, 15849739, 0);
         }
      }

   }

   private int s() {
      if (this.A != null) {
         cj var10000 = this.A;
         long var3 = this.y.ak;
         PngUtil var5 = MainCanvas.f;
         return PngUtil.a(var10000.a, var3);
      } else {
         return 0;
      }
   }

   public final void a(i[] var1) {
      if (this.v != null) {
         for(int var2 = 0; var2 < GlobalStatus.H.length; ++var2) {
            if (GlobalStatus.H[var2] != null) {
               GlobalStatus.H[var2].m = false;
               GlobalStatus.H[var2].l = false;
            }
         }

         synchronized(this.v) {
            this.v.addElement(var1);
         }
      }
   }

   public final void a(ae[] var1) {
      if (this.w != null) {
         synchronized(this.w) {
            this.w.addElement(var1);
         }
      }
   }

   public final void a(String var1) {
      if (this.x != null) {
         synchronized(this.x) {
            this.x.addElement(LoadingPage.a(var1, GlobalConfig.i, GlobalConfig.defaultWidth * 5 / 7, "\t"));
         }
      }
   }

   public static byte f() {
      for(byte var0 = 0; var0 < GlobalStatus.H.length; ++var0) {
         if (GlobalStatus.H[var0].c.equals(GlobalStatus.ad)) {
            return var0;
         }
      }

      return -1;
   }

   public final byte g() {
      for(byte var1 = 0; var1 < GlobalStatus.H.length; ++var1) {
         if (GlobalStatus.H[var1].b != 0 && GlobalStatus.H[var1].a == i() + 3) {
            return var1;
         }
      }

      return -1;
   }

   private static boolean t() {
      if (GlobalStatus.M != null) {
         for(byte var0 = 0; var0 < GlobalStatus.M.length; ++var0) {
            if (GlobalStatus.M[var0] != null && GlobalStatus.M[var0].e > 0) {
               return false;
            }
         }
      }

      return true;
   }

   private static boolean u() {
      if (GlobalStatus.H != null) {
         for(byte var0 = 0; var0 < GlobalStatus.H.length; ++var0) {
            if (GlobalStatus.H[var0] != null && GlobalStatus.H[var0].e > 0 && GlobalStatus.H[var0].b != 2) {
               return false;
            }
         }
      }

      return true;
   }

   private static int a(byte var0) {
      for(byte var1 = 0; var1 < GlobalStatus.H.length; ++var1) {
         if (GlobalStatus.H[var1].a == var0) {
            return var1;
         }
      }

      return -1;
   }

   private static int c(int var0) {
      for(byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
         if (GlobalStatus.M[var1].a == var0) {
            return var1;
         }
      }

      return -1;
   }

   public static boolean h() {
      for(byte var0 = 0; var0 < GlobalStatus.H.length; ++var0) {
         if (GlobalStatus.H[var0].b == 0 && GlobalStatus.H[var0].c.equals(GlobalStatus.ad) && GlobalStatus.H[var0].e <= 0) {
            return true;
         }
      }

      return false;
   }

   public static byte i() {
      for(byte var0 = 0; var0 < GlobalStatus.H.length; ++var0) {
         if (GlobalStatus.H[var0].b == 0 && GlobalStatus.H[var0].c.equals(GlobalStatus.ad)) {
            return GlobalStatus.H[var0].a;
         }
      }

      return -1;
   }

   public final boolean j() {
      for(byte var1 = 0; var1 < GlobalStatus.H.length; ++var1) {
         if (GlobalStatus.H[var1].b != 0 && GlobalStatus.H[var1].a == i() + 3 && GlobalStatus.H[var1].e > 0) {
            return false;
         }
      }

      return true;
   }

   private static byte b(byte var0) {
      if (--var0 < 0) {
         var0 = (byte)(GlobalStatus.M.length - 1);
      }

      while(GlobalStatus.M[var0].a()) {
         if (--var0 < 0) {
            var0 = (byte)(GlobalStatus.M.length - 1);
         }
      }

      return var0;
   }

   private static byte c(byte var0) {
      if (--var0 < 0) {
         var0 = (byte)(GlobalStatus.H.length - 1);
      }

      return var0;
   }

   private byte v() {
      byte var1 = 0;
      if (this.F != null) {
         for(byte var2 = 0; var2 < this.F.length; ++var2) {
            if (this.F[var2].a >= 5) {
               ++var1;
            }
         }
      }

      return var1;
   }

   private int w() {
      int var1 = 0;
      if (this.F != null) {
         for(byte var2 = 0; var2 < this.F.length; ++var2) {
            if (this.F[var2].b != this.E[0].a) {
               ++var1;
            }
         }
      }

      return var1;
   }

   private static boolean x() {
      for(byte var0 = 0; var0 < GlobalStatus.H.length; ++var0) {
         if (!GlobalStatus.H[var0].d() && GlobalStatus.H[var0].k != 1) {
            return false;
         }
      }

      for(byte var1 = 0; var1 < GlobalStatus.M.length; ++var1) {
         if (!GlobalStatus.M[var1].a() && GlobalStatus.M[var1].n != 1) {
            return false;
         }
      }

      return true;
   }

   public static void k() {
      if (GlobalStatus.bt) {
         if ((P = s) <= 0) {
            P = 1;
         }

         b = 1;
         s = 1;
      } else {
         s = P;
      }

      short var10000 = GlobalStatus.bt ? 1 : (short)a;
      b = var10000;
      s = var10000;
      c = (short)(GlobalStatus.bt ? 25 : 0);
      ao_1.aW[15] = (byte)(GlobalStatus.bt ? 0 : 1);
   }

   public final void l() {
      this.d();
      this.z.j = this.z.k = 0;
   }

   public final void m() {
      for(int var1 = 0; var1 < GlobalStatus.H.length; ++var1) {
         if (GlobalStatus.H[var1].c.equals(GlobalStatus.ad)) {
            this.i = (byte)var1;
            return;
         }
      }

   }

   private static boolean y() {
      for(int var0 = 0; var0 < GlobalStatus.H.length; ++var0) {
         if (GlobalStatus.H[var0].c.equals(GlobalStatus.ad) && GlobalStatus.H[var0].o) {
            return true;
         }
      }

      return false;
   }

   private static boolean d(byte var0) {
      return var0 == 4 || var0 == 6 || var0 == 7 || var0 == 5;
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var9 = 0;
      var6 = var2 >= 0 ? var2 : -var2;

      for(int var8 = 0; var6 > 0; var9 = var8++) {
         var6 /= 10;
      }

      int var13;
      if (var7 == 0) {
         var13 = (var9 + 2) / 2 * 7;
      } else {
         var13 = (var9 + 2) * 7;
      }

      var1.drawRegion(ao_1.E.pngImage, var2 >= 0 ? 8 : 0, var5 == 0 ? 0 : 10, 8, 10, 0, var3 - var13, var4, 0);
      var6 = var2 >= 0 ? var2 : -var2;

      for(int var10 = var9; var10 >= 0; --var10) {
         var1.drawRegion(ao_1.E.pngImage, 16 + var6 / d(var10) * 7, var5 == 0 ? 0 : 10, 7, 10, 0, var3 + 8 + (var9 - var10) * 7 - var13, var4, 0);
         var6 %= d(var10);
      }

   }

   private static int d(int var0) {
      int var1 = 1;

      for(int var2 = 0; var2 < var0; ++var2) {
         var1 *= 10;
      }

      return var1;
   }

   static {
      s = b;
      P = (short)a;
   }
}
