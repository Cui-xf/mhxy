package com.yinhan.kjava.main;

import com.cc.*;
//public final class f_3 {
public final class TouchController {
   public UISceneController a;
   public MainCanvas canvas;
   public int c;
   public int d;
   private int g;
   private int h;
   public int pointX;
   public int pointY;
   private int i = 0;
   private int j = 0;
   private int k = 0;

   public TouchController(MainCanvas canvas, PngUtil var2) {
      this.canvas = canvas;
   }

   public final void a(int var1, int var2) {
      if (this.a != null && this.canvas.touchPageCase == 7) {
         switch (this.a.currentSceneModeId) {
            case 0:
               var2 = var2;
               var1 = var1;
               if (this.a.currentSceneModeId == 0 && this.a.J != null) {
                  this.canvas.touchAction = LoadingPage.b(var1, var2);
               } else {
                  if (GlobalStatus.t != null) {
                     for(int var37 = 0; var37 < GlobalStatus.t.length; ++var37) {
                        if (GlobalStatus.t[var37] != null && GlobalStatus.t[var37].x && UISceneController.u != null && (var1 >= GlobalStatus.t[var37].c -
                        UISceneController.h + this.a.g() - GlobalStatus.t[var37].c() / 2 && var1 <= GlobalStatus.t[var37].c - UISceneController.h + this.a.g() + GlobalStatus.t[var37].c() / 2 && var2 >= GlobalStatus.t[var37].d -
                        UISceneController.i + this.a.h() - GlobalStatus.t[var37].d() && var2 <= GlobalStatus.t[var37].d - UISceneController.i + this.a.h() || var1 >= GlobalStatus.t[var37].c -
                        UISceneController.h + this.a.g() + GlobalStatus.t[var37].c() / 2 && var1 <= GlobalStatus.t[var37].c - UISceneController.h + this.a.g() + GlobalStatus.t[var37].c() / 2 +
                        UISceneController.u.i() && var2 >= GlobalStatus.t[var37].d - UISceneController.i + this.a.h() - GlobalStatus.t[var37].d() && var2 <= GlobalStatus.t[var37].d -
                        UISceneController.i + this.a.h() - GlobalStatus.t[var37].d() + UISceneController.u.j() || var1 >= GlobalStatus.t[var37].c - UISceneController.h + this.a.g() -
                        UISceneController.s.i() / 2 && var1 <= GlobalStatus.t[var37].c - UISceneController.h + this.a.g() + UISceneController.s.i() / 2 && var2 >= GlobalStatus.t[var37].d -
                        UISceneController.i + this.a.h() - GlobalStatus.t[var37].d() - GlobalConfig.font2_h - UISceneController.s.j() && var2 <= GlobalStatus.t[var37].d - UISceneController.i + this.a.h() - GlobalStatus.t[var37].d() - GlobalConfig.font2_h)) {
                           this.a.a(1073741824);
                           if (!this.a.sceneRefreshCoordinator.c.isEmpty()) {
                              this.a.sceneRefreshCoordinator.c.removeAllElements();
                              this.a.sceneRefreshCoordinator.a(true);
                           }

                           return;
                        }
                     }
                  }

                  boolean var42;
                  label749: {
                     if (UISceneController.i() && this.a.sceneRefreshCoordinator.g != null) {
                        switch (this.a.sceneRefreshCoordinator.h) {
                           case 0:
                              if (var1 >= this.a.sceneRefreshCoordinator.j + 16 - this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) - 3 && var1 <= this.a.sceneRefreshCoordinator.j + 16 + this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) - 5 && var2 >= this.a.sceneRefreshCoordinator.k + 16 - this.a.sceneRefreshCoordinator.g.h() - (UISceneController.i - this.a.h()) && var2 <= this.a.sceneRefreshCoordinator.k + 16 - (UISceneController.i - this.a.h())) {
                                 this.canvas.touchAction = 536870912;
                                 this.a.sceneRefreshCoordinator.c.removeAllElements();
                                 this.a.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                              break;
                           case 1:
                              if (var1 >= this.a.sceneRefreshCoordinator.j + 8 - this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) && var1 <= this.a.sceneRefreshCoordinator.j + 8 + this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) && var2 >= this.a.sceneRefreshCoordinator.k - (UISceneController.i - this.a.h()) - 12 && var2 <= this.a.sceneRefreshCoordinator.k + this.a.sceneRefreshCoordinator.g.h() - (UISceneController.i - this.a.h()) - 5) {
                                 this.canvas.touchAction = 536870912;
                                 this.a.sceneRefreshCoordinator.c.removeAllElements();
                                 this.a.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                              break;
                           case 2:
                              if (var1 >= this.a.sceneRefreshCoordinator.j - this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) + 4 && var1 <= this.a.sceneRefreshCoordinator.j + this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) + 4 && var2 >= this.a.sceneRefreshCoordinator.k + 16 - this.a.sceneRefreshCoordinator.g.h() - (UISceneController.i - this.a.h()) && var2 <= this.a.sceneRefreshCoordinator.k + 16 - (UISceneController.i - this.a.h())) {
                                 this.canvas.touchAction = 536870912;
                                 this.a.sceneRefreshCoordinator.c.removeAllElements();
                                 this.a.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                              break;
                           case 3:
                              if (var1 >= this.a.sceneRefreshCoordinator.j + 8 - this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) && var1 <= this.a.sceneRefreshCoordinator.j + 8 + this.a.sceneRefreshCoordinator.g.g() / 2 - (UISceneController.h - this.a.g()) && var2 >= this.a.sceneRefreshCoordinator.k + 8 - this.a.sceneRefreshCoordinator.g.h() - (UISceneController.i - this.a.h()) - 4 && var2 <= this.a.sceneRefreshCoordinator.k + 8 - (UISceneController.i - this.a.h()) + 4) {
                                 this.canvas.touchAction = 536870912;
                                 this.a.sceneRefreshCoordinator.c.removeAllElements();
                                 this.a.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                        }
                     }

                     var42 = false;
                  }

                  if (var42) {
                     return;
                  }

                  int var5 = var2;
                  int var38 = var1;
                  TouchController var40 = this;
                  if (GlobalStatus.fz != null && GlobalStatus.fz.length > 0 && GlobalStatus.s != 0) {
                     label719:
                     for(int var6 = 0; var6 < GlobalStatus.fz.length; ++var6) {
                        if (GlobalStatus.fz[var6] == 1 && var40.a.sceneRefreshCoordinator.d.f != null) {
                           switch (var40.a.sceneRefreshCoordinator.d.j) {
                              case 0:
                                 if (var38 >= var40.a.sceneRefreshCoordinator.d.h + 16 - var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var38 <= var40.a.sceneRefreshCoordinator.d.h + 16 + var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var5 >= var40.a.sceneRefreshCoordinator.d.i + 16 - var40.a.sceneRefreshCoordinator.d.f.h() - (UISceneController.i - var40.a.h()) && var5 <= var40.a.sceneRefreshCoordinator.d.i + 16 - (UISceneController.i - var40.a.h())) {
                                    var40.canvas.touchAction = 48;
                                    var40.a.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.a.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                                 break;
                              case 1:
                                 if (var38 >= var40.a.sceneRefreshCoordinator.d.h + 8 - var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var38 <= var40.a.sceneRefreshCoordinator.d.h + 8 + var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var5 >= var40.a.sceneRefreshCoordinator.d.i - (UISceneController.i - var40.a.h()) && var5 <= var40.a.sceneRefreshCoordinator.d.i + var40.a.sceneRefreshCoordinator.d.f.h() - (UISceneController.i - var40.a.h())) {
                                    var40.canvas.touchAction = 48;
                                    var40.a.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.a.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                                 break;
                              case 2:
                                 if (var38 >= var40.a.sceneRefreshCoordinator.d.h - var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var38 <= var40.a.sceneRefreshCoordinator.d.h + var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var5 >= var40.a.sceneRefreshCoordinator.d.i + 16 - var40.a.sceneRefreshCoordinator.d.f.h() - (UISceneController.i - var40.a.h()) && var5 <= var40.a.sceneRefreshCoordinator.d.i + 16 - (UISceneController.i - var40.a.h())) {
                                    var40.canvas.touchAction = 48;
                                    var40.a.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.a.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                                 break;
                              case 3:
                                 if (var38 >= var40.a.sceneRefreshCoordinator.d.h + 8 - var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var38 <= var40.a.sceneRefreshCoordinator.d.h + 8 + var40.a.sceneRefreshCoordinator.d.f.g() / 2 - (UISceneController.h - var40.a.g()) && var5 >= var40.a.sceneRefreshCoordinator.d.i + 8 - var40.a.sceneRefreshCoordinator.d.f.h() - (UISceneController.i - var40.a.h()) && var5 <= var40.a.sceneRefreshCoordinator.d.i + 8 - (UISceneController.i - var40.a.h())) {
                                    var40.canvas.touchAction = 48;
                                    var40.a.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.a.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                           }
                        }
                     }
                  }

                  if (UISceneController.aW[6] == 0 && var1 >= 2 && var1 <= 2 + MainCanvas.pngUtil.e && var2 >= 2 + GlobalConfig.font2_h && var2 <= 2 + GlobalConfig.font2_h + MainCanvas.pngUtil.f) {
                     this.canvas.touchAction = 519;
                     if (!this.a.sceneRefreshCoordinator.c.isEmpty()) {
                        this.a.sceneRefreshCoordinator.c.removeAllElements();
                        this.a.sceneRefreshCoordinator.a(true);
                     }
                  } else {
                     if (this.a.currentSceneModeId != 25) {
                       boolean var38_ = false;
                        if (var1 >= GlobalConfig.defaultWidth - bo_1.g[0].getWidth() - 10 && var1 <= GlobalConfig.defaultWidth - 10 && var2 >= 40 && var2 <= 40 + bo_1.g[0].getHeight()) {
                           var38_ = true;
                        }

                        if (var38_) {
                           if (GlobalStatus.P.o) {
                              this.a.d((byte)1);
                              return;
                           }

                           if (GlobalStatus.O.u) {
                              this.a.d((byte)0);
                              return;
                           }

                           if (this.a.n && UISceneController.i()) {
                              this.canvas.touchAction = 1024;
                           }
                           break;
                        }
                     }

                     if (UISceneController.L != null && var1 >= UISceneController.L.e - UISceneController.h && var1 <= UISceneController.L.e - UISceneController.h + UISceneController.L.d.g() && var2 >=
                     UISceneController.L.f - UISceneController.i && var2 <= UISceneController.L.f - UISceneController.i + UISceneController.L.d.h()) {
                        this.canvas.touchAction = 1073741824;
                        if (!this.a.sceneRefreshCoordinator.c.isEmpty()) {
                           this.a.sceneRefreshCoordinator.c.removeAllElements();
                           this.a.sceneRefreshCoordinator.a(true);
                        }
                     } else if (var1 >= GlobalConfig.defaultWidth - 67 + 37 && var1 <= GlobalConfig.defaultWidth - 67 + 37 + UISceneController.v.pngImage.getWidth() && var2 >= 8 && var2 <=
                     UISceneController.v.pngImage.getHeight() + 8) {
                        this.canvas.touchAction = 2048;
                     } else if (var1 >= GlobalConfig.defaultWidth - 67 && var1 <= GlobalConfig.defaultWidth - 67 + 33 && var2 >= 5 && var2 <= 18) {
                        this.canvas.touchAction = 515;
                     } else if (var1 >= 20 && var1 <= 20 + GlobalConfig.font2.stringWidth(GlobalStatus.ae) && var2 >= 2 && var2 <= 2 + GlobalConfig.font2_h) {
                        this.canvas.touchAction = 513;
                     } else if (var1 >= GlobalConfig.defaultWidth - 67 && var1 <= GlobalConfig.defaultWidth - 67 + 16 && var2 >= 24 && var2 <= 34) {
                        if (GlobalStatus.bf == 0) {
                           return;
                        }

                        this.a.p();
                     } else {
                        if (var1 >= 1 && var1 <= 1 + GlobalConfig.font2.stringWidth("菜单") && var2 >= GlobalConfig.defaultHigh - GlobalConfig.font2_h - 1 && var2 <= GlobalConfig.defaultHigh - 1) {
                           this.canvas.touchAction = 268435456;
                           break;
                        }

                        if (var1 < GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth("聊天") || var1 > GlobalConfig.defaultWidth || var2 < GlobalConfig.defaultHigh - GlobalConfig.font2_h - 1 || var2 > GlobalConfig.defaultHigh - 1) {
                           if (!GlobalStatus.bu) {
                              this.a.d = -1;
                              this.canvas.b(var1 + UISceneController.h - this.a.g(), var2 + UISceneController.i - this.a.h());
                           }

                           return;
                        }

                        this.canvas.touchAction = 1024;
                     }
                  }
               }
               break;
            case 1:
               this.r(var1, var2);
               return;
            case 2:
               this.s(var1, var2);
               return;
            case 3:
               if (this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 4:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                  this.canvas.touchAction = this.a.b(this.canvas.touchAction, var1, var2);
               } else if (this.a.sceneSubState != 1 && this.a.sceneSubState != 3 && this.a.sceneSubState != 9 && this.a.sceneSubState != 14 && this.a.sceneSubState != 15 && this.a.sceneSubState != 16) {
                  if (this.a.sceneSubState != 2 && this.a.sceneSubState != 4 && this.a.sceneSubState != 7 && this.a.sceneSubState != 12) {
                     if (this.a.sceneSubState != 6 && this.a.sceneSubState != 11) {
                        if (this.a.sceneSubState != 5 && this.a.sceneSubState != 18) {
                           if (this.a.sceneSubState == 8) {
                              this.canvas.touchAction = this.a.e(var1, var2);
                           } else {
                              if (this.a.sceneSubState != 10 && this.a.sceneSubState != 13) {
                                 if (this.a.sceneSubState == 17) {
                                    this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                                 }

                                 return;
                              }

                              this.canvas.touchAction = LoadingPage.b(var1, var2);
                           }
                        } else {
                           this.canvas.touchAction = LoadingPage.b(var1, var2);
                        }
                     } else {
                        this.canvas.touchAction = LoadingPage.d(var1, var2);
                        if (!LoadingPage.e(var1, var2)) {
                           return;
                        }

                        this.canvas.a((String)"拍卖价格", (int)2);
                     }
                  } else {
                     this.canvas.touchAction = LoadingPage.d(var1, var2);
                  }
               } else {
                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               }
               break;
            case 5:
               if (this.a.sceneSubState == 0) {
                  this.canvas.touchAction = this.a.b(var1, var2);
               } else {
                  if (this.a.sceneSubState != 1) {
                     if (this.a.sceneSubState == 2 && this.canvas.aq != null) {
                        this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               }
               break;
            case 6:
               if (this.a.sceneSubState != 0 && this.a.sceneSubState != 3) {
                  if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2) {
                     this.canvas.touchAction = LoadingPage.c(var1, var2);
                  }

                  return;
               }

               if (this.canvas.aq == null) {
                  return;
               }

               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               break;
            case 7:
               this.v(var1, var2);
               return;
            case 8:
               if (this.a.sceneSubState != 0) {
                  if (this.a.sceneSubState == 2) {
                     this.canvas.touchAction = LoadingPage.d(var1, var2);
                  }

                  return;
               }

               if (this.canvas.aq == null) {
                  return;
               }

               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               this.canvas.touchAction = this.a.b(this.canvas.touchAction, var1, var2);
               break;
            case 9:
               if (this.a.sceneSubState != 0) {
                  if (this.a.sceneSubState == 2) {
                     this.canvas.touchAction = LoadingPage.d(var1, var2);
                  }

                  return;
               }

               if (this.canvas.aq == null) {
                  return;
               }

               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               this.canvas.touchAction = this.a.b(this.canvas.touchAction, var1, var2);
               break;
            case 10:
               if (this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 11:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                  this.canvas.touchAction = this.a.b(this.canvas.touchAction, var1, var2);
               } else {
                  if (this.a.sceneSubState != 2) {
                     if (this.a.sceneSubState == 4) {
                        this.canvas.touchAction = LoadingPage.c(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.d(var1, var2);
               }
               break;
            case 12:
               this.m(var1, var2);
               return;
            case 13:
               if (this.a.sceneSubState != 0 && this.a.sceneSubState != 10 && this.a.sceneSubState != 5 && this.a.sceneSubState != 6) {
                  if (this.a.sceneSubState != 1 && this.a.sceneSubState != 2 && this.a.sceneSubState != 8 && this.a.sceneSubState != 9) {
                     if (this.a.sceneSubState == 3) {
                        this.canvas.touchAction = LoadingPage.d(var1, var2);
                        if (!LoadingPage.e(var1, var2)) {
                           return;
                        }

                        this.canvas.a((String)"请输入拍卖价格", (int)2);
                     } else if (this.a.sceneSubState == 4) {
                        this.canvas.touchAction = LoadingPage.b(var1, var2);
                     } else {
                        if (this.a.sceneSubState != 7) {
                           if (this.a.sceneSubState == 11) {
                              this.canvas.touchAction = LoadingPage.b(var1, var2);
                           }

                           return;
                        }

                        this.canvas.touchAction = this.a.c(var1, var2);
                     }
                  } else {
                     this.canvas.touchAction = LoadingPage.c(var1, var2);
                  }
               } else {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }
               break;
            case 14:
               if (this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 15:
               if (this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 16:
            case 17:
            case 26:
            case 44:
            case 55:
            case 56:
            case 61:
            case 73:
            case 74:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 97:
            case 99:
            case 112:
            case 124:
            case 129:
            default:
               break;
            case 18:
               this.q(var1, var2);
               return;
            case 19:
               this.p(var1, var2);
               return;
            case 20:
               this.canvas.touchAction = LoadingPage.a(var1, var2);
               return;
            case 21:
               this.o(var1, var2);
               return;
            case 22:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                  this.canvas.touchAction = this.a.e(this.canvas.touchAction, var1, var2);
               } else if (this.a.sceneSubState == 6) {
                  this.canvas.touchAction = LoadingPage.d(var1, var2);
                  if (!LoadingPage.e(var1, var2)) {
                     return;
                  }

                  this.canvas.a((String)"输入交易银两", (int)2);
               } else {
                  if (this.a.sceneSubState != 1 && this.a.sceneSubState != 2 && this.a.sceneSubState != 3) {
                     if (this.a.sceneSubState == 5) {
                        this.canvas.touchAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               }
               break;
            case 23:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               } else if (this.a.sceneSubState == 1) {
                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               } else {
                  if (this.a.sceneSubState != 2) {
                     if (this.a.sceneSubState == 3 || this.a.sceneSubState == 4) {
                        this.canvas.touchAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.d(var1, var2);
               }
               break;
            case 24:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               } else {
                  if (this.a.sceneSubState != 1) {
                     if (this.a.sceneSubState == 2) {
                        this.canvas.touchAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               }
               break;
            case 25:
               var2 = var2;
               var1 = var1;
               if (this.a.overlayDialogController.d == 0 || this.a.overlayDialogController.d == 2 || this.a.overlayDialogController.f > 1) {
                  this.canvas.touchAction = this.a.overlayDialogController.a(this.a.overlayDialogController.d, var1, var2);
                  if (this.canvas.touchAction != 0) {
                     return;
                  }
               }

               if (this.a.overlayDialogController.f == 0) {
                  if (this.a.overlayDialogController.d == 0) {
                     this.canvas.touchAction = this.a.overlayDialogController.a(var1, var2);
                  } else if (this.a.overlayDialogController.d == 2) {
                     this.canvas.touchAction = this.a.overlayDialogController.b(var1, var2);
                  }

                  if (this.canvas.touchAction != 0) {
                     return;
                  }
               }

               if (this.a.overlayDialogController.d != 1 && this.a.overlayDialogController.d != 3) {
                  if (this.a.overlayDialogController.d == 4) {
                     if (GlobalStatus.H != null) {
                        for(byte var36 = (byte)(GlobalStatus.H.length - 1); var36 >= 0; --var36) {
                           if (GlobalStatus.H[var36].j != null && var1 >= GlobalConfig.Q[GlobalStatus.H[var36].a][0] - GlobalStatus.H[var36].f() / 2 && var1 <= GlobalConfig.Q[GlobalStatus.H[var36].a][0] + GlobalStatus.H[var36].f() / 2 && var2 >= GlobalConfig.Q[GlobalStatus.H[var36].a][1] - GlobalStatus.H[var36].g() && var2 <= GlobalConfig.Q[GlobalStatus.H[var36].a][1]) {
                              if (bq_1.h()) {
                                 this.canvas.processException("只能对自己使用复活道具");
                              } else if (this.a.overlayDialogController.i != var36) {
                                 this.a.overlayDialogController.i = var36;
                              } else {
                                 this.canvas.touchAction = 1073741824;
                              }
                           }
                        }
                     }
                  } else if ((this.a.overlayDialogController.d == 5 || this.a.overlayDialogController.d == 6 || this.a.overlayDialogController.d == 7 || this.a.overlayDialogController.d == 8) && GlobalStatus.H != null) {
                     for(byte var35 = (byte)(GlobalStatus.H.length - 1); var35 >= 0; --var35) {
                        if (GlobalStatus.H[var35].j != null && var1 >= GlobalConfig.Q[GlobalStatus.H[var35].a][0] - GlobalStatus.H[var35].f() / 2 && var1 <= GlobalConfig.Q[GlobalStatus.H[var35].a][0] + GlobalStatus.H[var35].f() / 2 && var2 >= GlobalConfig.Q[GlobalStatus.H[var35].a][1] - GlobalStatus.H[var35].g() && var2 <= GlobalConfig.Q[GlobalStatus.H[var35].a][1]) {
                           if (bq_1.h()) {
                              this.canvas.processException("只能对自己使用复活道具");
                           } else if (this.a.overlayDialogController.i != var35) {
                              this.a.overlayDialogController.i = var35;
                           } else {
                              this.canvas.touchAction = 1073741824;
                           }
                        }
                     }
                  }
               } else if (GlobalStatus.M != null) {
                  for(byte var3 = (byte)(GlobalStatus.M.length - 1); var3 >= 0; --var3) {
                     ck var4;
                     if (GlobalStatus.M[var3].m != null && !GlobalStatus.M[var3].a() && (GlobalStatus.M[var3].n == 1 || GlobalStatus.M[var3].n == 4) && var1 >= GlobalConfig.R[GlobalStatus.M[var3].a][0] - GlobalStatus.M[var3].c() / 2 && var1 <= GlobalConfig.R[GlobalStatus.M[var3].a][0] + GlobalStatus.M[var3].c() / 2 && var2 >= GlobalConfig.R[GlobalStatus.M[var3].a][1] - ((var4 = GlobalStatus.M[var3]).m != null && var4.m.h != null ? var4.m.h[var4.m.f] : 0) && var2 <= GlobalConfig.R[GlobalStatus.M[var3].a][1]) {
                        if (this.a.overlayDialogController.h != var3) {
                           this.a.overlayDialogController.h = var3;
                        } else {
                           this.canvas.touchAction = 1073741824;
                        }
                     }
                  }
               }

               if (var1 >= GlobalConfig.defaultWidth - MainCanvas.U.b && var1 <= GlobalConfig.defaultWidth && var2 >= GlobalConfig.defaultHigh - MainCanvas.U.c && var2 <= GlobalConfig.defaultHigh) {
                  this.canvas.touchAction = 536870912;
               }

               return;
            case 27:
               this.u(var1, var2);
               return;
            case 28:
               this.t(var1, var2);
               return;
            case 29:
               if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 30:
               this.w(var1, var2);
               return;
            case 31:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               } else {
                  if (this.a.sceneSubState != 1) {
                     if (this.a.sceneSubState == 2) {
                        this.canvas.touchAction = LoadingPage.c(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.d(var1, var2);
               }
               break;
            case 32:
               TouchController var12 = this;
               var12.canvas.touchAction = var12.a.d(var1, var2);
               return;
            case 33:
               this.ap(var1, var2);
               return;
            case 34:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               } else if (this.a.sceneSubState != 1 && this.a.sceneSubState != 2) {
                  if (this.a.sceneSubState != 3 && this.a.sceneSubState != 5) {
                     if (this.a.sceneSubState == 4) {
                        this.canvas.touchAction = LoadingPage.d(var1, var2);
                        if (LoadingPage.e(var1, var2)) {
                           this.canvas.a((String)"请输入拍卖价格", (int)2);
                           return;
                        }
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.b(var1, var2);
               } else {
                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               }
               break;
            case 35:
               if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 36:
               if (this.a.sceneSubState == 0) {
                  if (this.canvas.aq == null) {
                     return;
                  }

                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               } else if (this.a.sceneSubState == 2) {
                  this.canvas.touchAction = this.a.e(var1, var2);
               } else {
                  if (this.a.sceneSubState != 1 && this.a.sceneSubState != 3 && this.a.sceneSubState != 5) {
                     if (this.a.sceneSubState == 4) {
                        this.canvas.touchAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.touchAction = LoadingPage.c(var1, var2);
               }
               break;
            case 37:
               this.n(var1, var2);
               return;
            case 38:
               this.x(var1, var2);
               return;
            case 39:
               this.z(var1, var2);
               return;
            case 40:
               this.y(var1, var2);
               return;
            case 41:
               this.A(var1, var2);
               return;
            case 42:
               this.B(var1, var2);
               return;
            case 43:
               this.C(var1, var2);
               return;
            case 45:
               this.D(var1, var2);
               return;
            case 46:
               this.E(var1, var2);
               return;
            case 47:
               this.F(var1, var2);
               return;
            case 48:
               this.G(var1, var2);
               return;
            case 49:
               this.H(var1, var2);
               return;
            case 50:
               this.I(var1, var2);
               return;
            case 51:
               this.J(var1, var2);
               return;
            case 52:
               this.K(var1, var2);
               return;
            case 53:
               this.L(var1, var2);
               return;
            case 54:
               this.M(var1, var2);
               return;
            case 57:
               this.N(var1, var2);
               return;
            case 58:
               this.O(var1, var2);
               return;
            case 59:
               this.P(var1, var2);
               return;
            case 60:
               this.Q(var1, var2);
               return;
            case 62:
               this.R(var1, var2);
               return;
            case 63:
               this.S(var1, var2);
               return;
            case 64:
               this.U(var1, var2);
               return;
            case 65:
               this.T(var1, var2);
               return;
            case 66:
               return;
            case 67:
               this.V(var1, var2);
               return;
            case 68:
               this.ad(var1, var2);
               return;
            case 69:
               this.ac(var1, var2);
               return;
            case 70:
               this.ai(var1, var2);
               return;
            case 71:
               this.j(var1, var2);
               return;
            case 72:
               this.k(var1, var2);
               return;
            case 75:
               this.aj(var1, var2);
               return;
            case 76:
               this.i(var1, var2);
               return;
            case 77:
               this.h(var1, var2);
               return;
            case 90:
               this.ae(var1, var2);
               return;
            case 91:
               this.af(var1, var2);
               return;
            case 92:
               this.ag(var1, var2);
               return;
            case 93:
               this.ah(var1, var2);
               return;
            case 94:
               this.ak(var1, var2);
               return;
            case 95:
               if (this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               }

               return;
            case 96:
               if (this.canvas.aq != null) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                  this.canvas.touchAction = this.a.a(this.canvas.touchAction, var1, var2);
               }

               return;
            case 98:
               this.canvas.touchAction = LoadingPage.a(var1, var2);
               return;
            case 100:
               this.al(var1, var2);
               return;
            case 101:
               this.W(var1, var2);
               return;
            case 102:
               this.X(var1, var2);
               return;
            case 103:
               this.am(var1, var2);
               return;
            case 104:
               this.an(var1, var2);
               return;
            case 105:
               this.ao(var1, var2);
               return;
            case 106:
               this.Y(var1, var2);
               return;
            case 107:
               this.ab(var1, var2);
               return;
            case 108:
            case 109:
               this.aq(var1, var2);
               return;
            case 110:
               this.Z(var1, var2);
               return;
            case 111:
               if (this.canvas.av != null) {
                  this.canvas.touchAction = this.canvas.av.a(var1, var2);
                  return;
               }
               break;
            case 113:
               this.e(var1, var2);
               return;
            case 114:
               this.g(var1, var2);
               return;
            case 115:
               this.f(var1, var2);
               return;
            case 116:
               this.as(var1, var2);
               return;
            case 117:
               this.ar(var1, var2);
               return;
            case 118:
               this.aa(var1, var2);
               return;
            case 119:
               this.canvas.touchAction = MainCanvas.uiSceneController.bc.a((byte)0, var1, var2);
               return;
            case 120:
               if (this.a.sceneSubState == 0) {
                  this.canvas.touchAction = this.canvas.aq.b(var1, var2);
                  return;
               }

               if (this.a.sceneSubState == 1) {
                  this.canvas.touchAction = LoadingPage.c(var1, var2);
                  return;
               }
               break;
            case 121:
               this.c(var1, var2);
               return;
            case 122:
               this.d(var1, var2);
               return;
            case 123:
               this.b(var1, var2);
               return;
            case 125:
               this.canvas.touchAction = MainCanvas.uiSceneController.g(var1, var2);
               return;
            case 126:
               this.l(var1, var2);
               return;
            case 127:
               this.canvas.touchAction = MainCanvas.uiSceneController.h(var1, var2);
               return;
            case 128:
               this.at(var1, var2);
               return;
            case 130:
               this.au(var1, var2);
               return;
            case 131:
               this.canvas.touchAction = MainCanvas.uiSceneController.W.a(var1, var2);
         }
      }

   }

   private void b(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
         }

      }
   }

   private void c(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void d(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void e(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void f(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            this.canvas.touchAction = this.a.b(this.canvas.touchAction, var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 2) {
            if (this.canvas.aq != null) {
               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               return;
            }
         } else {
            if (this.a.sceneSubState == 3 || this.a.sceneSubState == 6) {
               this.canvas.touchAction = LoadingPage.d(var1, var2);
               return;
            }

            if (this.a.sceneSubState == 5 || this.a.sceneSubState == 4) {
               this.canvas.touchAction = LoadingPage.b(var1, var2);
            }
         }
      }

   }

   private void g(int var1, int var2) {
      if (this.canvas.aq != null) {
         int var3 = this.canvas.aq.b(var1, var2);
         this.canvas.touchAction = var3 == 1073741824 ? 0 : var3;
         this.canvas.touchAction = this.a.M.a(this.canvas.touchAction, var1, var2);
      }

   }

   private void h(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      } else if (this.a.sceneSubState == 1 && this.canvas.av != null) {
         this.canvas.touchAction = this.canvas.av.a(var1, var2);
      } else {
         if (this.a.sceneSubState == 2) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }

      }
   }

   private void i(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void j(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void k(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = LoadingPage.a(var1, var2);
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }

      }
   }

   private void l(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         if (this.canvas.touchAction == 0) {
            this.canvas.touchAction = this.a.b(this.canvas.touchAction, var1, var2);
         }
      }

   }

   private void m(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 6) {
            this.canvas.touchAction = this.a.e(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 7) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
         }
      }

   }

   private void n(int var1, int var2) {
      if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         this.canvas.b = this.canvas.touchAction = this.a.a(this.canvas.touchAction, var1, var2);
      }

   }

   private void o(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2 || this.a.sceneSubState == 3) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 4) {
            if (this.canvas.aq != null) {
               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               return;
            }
         } else if (this.a.sceneSubState == 5) {
            this.canvas.touchAction = this.a.c(var1, var2);
         }
      }

   }

   private void p(int var1, int var2) {
      if (this.a.sceneSubState != 0 && this.a.sceneSubState != 10) {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2 || this.a.sceneSubState == 3 || this.a.sceneSubState == 4 || this.a.sceneSubState == 5 || this.a.sceneSubState == 6 || this.a.sceneSubState == 7 || this.a.sceneSubState == 9) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 8) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      } else if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         return;
      }

   }

   private void q(int var1, int var2) {
      if (this.a.sceneSubState != 0 && this.a.sceneSubState != 1) {
         if (this.a.sceneSubState == 2 || this.a.sceneSubState == 3 || this.a.sceneSubState == 4 || this.a.sceneSubState == 5 || this.a.sceneSubState == 6) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
         }
      } else if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         this.canvas.aw = this.canvas.as.a;
         this.canvas.touchAction = this.a.d(this.canvas.touchAction, var1, var2);
         if (this.canvas.touchAction == 0 && UISceneController.aP.size() == 0) {
            this.canvas.touchAction = 1073741824;
         }
      }

      if (MainCanvas.u != null && var1 >= GlobalConfig.defaultWidth - 4 - MainCanvas.u.pngImage.getWidth() && var1 < GlobalConfig.defaultWidth - 4 && var2 >= 4 && var2 <= MainCanvas.u.pngImage.getHeight() + 4) {
         this.canvas.touchAction = 536870912;
      }

   }

   private void r(int var1, int var2) {
      if (this.a.sceneSubState != 6 && this.a.sceneSubState != 7) {
         if (this.a.sceneSubState == 8) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
         } else {
            this.canvas.touchAction = this.a.a(var1, var2);
         }
      } else {
         this.canvas.touchAction = LoadingPage.b(var1, var2);
      }
   }

   private void s(int var1, int var2) {
      if (this.a.sceneSubState != 0) {
         if (this.a.sceneSubState != 1 && this.a.sceneSubState != 3 && this.a.sceneSubState != 4 && this.a.sceneSubState != 5 && this.a.sceneSubState != 7 && this.a.sceneSubState != 9 && this.a.sceneSubState != 10) {
            return;
         }

         if (this.a.sceneSubMode == 1 || this.a.sceneSubMode == 2) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)(this.a.sceneSubMode == 1 ? "请输入取出银两" : "请输入存入银两"), (int)2);
               return;
            }

            return;
         }

         if (this.a.sceneSubMode == 3) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)"请输入竞标银两", (int)2);
               return;
            }

            return;
         }

         if (this.a.sceneSubMode == 4) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
            return;
         }

         if (this.a.sceneSubMode == 5 || this.a.sceneSubMode == 6) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
            return;
         }
      }

      this.canvas.touchAction = LoadingPage.a(var1, var2);
   }

   private void t(int var1, int var2) {
      if (this.canvas.aq != null) {
         int var3;
         if ((var3 = this.canvas.aq.b(var1, var2)) == 1073741824) {
            if (this.canvas.ar.g() != 0 && this.canvas.ar.g() != 1) {
               var3 = 8;
            } else {
               var3 = this.a.f(this.canvas.ar.g(), var1, var2);
            }
         }

         this.canvas.touchAction = var3;
      }

   }

   private void u(int var1, int var2) {
      if ((this.a.sceneSubState == 0 || this.a.sceneSubState == 1) && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void v(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState != 3 && this.a.sceneSubState != 11) {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2 || this.a.sceneSubState == 5 || this.a.sceneSubState == 6 || this.a.sceneSubState == 8 || this.a.sceneSubState == 9 || this.a.sceneSubState == 10) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 4 || this.a.sceneSubState == 12) {
            if (this.a.sceneSubMode == 1) {
               this.canvas.touchAction = this.a.T.b(var1, var2);
               return;
            }

            this.canvas.touchAction = this.a.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 7) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)"请输入决斗金额", (int)2);
            }
         }
      } else if (this.a.T != null) {
         this.canvas.touchAction = this.a.T.b(var1, var2);
         return;
      }

   }

   private void w(int var1, int var2) {
      if (var1 < this.a.aB || var1 > this.a.aB + this.a.f.a * this.a.aD / 16 || var2 < this.a.aC || var2 > this.a.aC + this.a.f.b * this.a.aD / 16) {
         this.canvas.touchAction = 536870912;
      }

   }

   private void x(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2 || this.a.sceneSubState == 3 || this.a.sceneSubState == 4 || this.a.sceneSubState == 5 || this.a.sceneSubState == 6 || this.a.sceneSubState == 7 || this.a.sceneSubState == 8 || this.a.sceneSubState == 10) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 9) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void y(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = LoadingPage.a(var1, var2);
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         }

      }
   }

   private void z(int var1, int var2) {
      if (var1 >= this.a.ba.e - UISceneController.h + this.a.g() && var1 <= this.a.ba.e - UISceneController.h + this.a.g() + this.a.ba.a() && var2 >= this.a.ba.f -
      UISceneController.i + this.a.h() && var2 <= this.a.ba.f - UISceneController.i + this.a.h() + this.a.ba.b()) {
         this.c = 1;
         ++this.i;
         if (this.i >= 2 && this.k <= 30) {
            this.i = 0;
            this.canvas.touchAction = 1073741824;
            this.a.V();
            this.canvas.touchAction = 0;
         }

         this.k = 0;
         this.j = 0;
      } else {
         ++this.j;
         if (this.j >= 2 && this.k <= 30) {
            this.j = 0;
            this.canvas.touchAction = 536870912;
            this.a.V();
            this.canvas.touchAction = 0;
         }

         this.k = 0;
         this.i = 0;
      }
   }

   private void A(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2 || this.a.sceneSubState == 3) {
         this.canvas.touchAction = LoadingPage.b(var1, var2);
      }

   }

   private void B(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void C(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void D(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void E(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 2 && this.a.T != null) {
            this.canvas.touchAction = this.a.T.b(var1, var2);
         }
      }

   }

   private void F(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2 || this.a.sceneSubState == 5 || this.a.sceneSubState == 6 || this.a.sceneSubState == 7 || this.a.sceneSubState == 8) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 3) {
            this.canvas.touchAction = this.a.T.b(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 4) {
            if (this.a.sceneSubMode == 0) {
               this.canvas.touchAction = this.a.c(var1, var2);
               return;
            }

            if (this.a.sceneSubMode == 1) {
               this.canvas.touchAction = this.a.T.b(var1, var2);
               return;
            }
         } else if (this.a.sceneSubState == 9) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void G(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 2) {
            if (this.canvas.aq != null) {
               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               return;
            }
         } else if (this.a.sceneSubState == 3) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void H(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void I(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.d(var1, var2);
         if (LoadingPage.e(var1, var2)) {
            this.canvas.a((String)"捐献银两数量", (int)2);
            return;
         }
      } else if (this.a.sceneSubState == 2) {
         this.canvas.touchAction = LoadingPage.d(var1, var2);
         if (LoadingPage.e(var1, var2)) {
            this.canvas.a((String)"捐献经验数量", (int)2);
            return;
         }
      } else if (this.a.sceneSubState == 5) {
         this.canvas.touchAction = LoadingPage.d(var1, var2);
         if (LoadingPage.e(var1, var2)) {
            this.canvas.a((String)"取出银两数量", (int)2);
            return;
         }
      } else {
         if (this.a.sceneSubState != 3 && this.a.sceneSubState != 4) {
            if (this.a.sceneSubState != 6 && this.a.sceneSubState != 7) {
               return;
            }
         } else {
            if (this.a.sceneSubMode == 0) {
               this.canvas.touchAction = LoadingPage.d(var1, var2);
               return;
            }

            if (this.a.sceneSubMode != 1) {
               return;
            }
         }

         this.canvas.touchAction = LoadingPage.b(var1, var2);
      }

   }

   private void J(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         MainCanvas var10000;
         int var10001;
         label54: {
            int var3 = this.canvas.aq.b(var1, var2);
            this.canvas.touchAction = var3 == 1073741824 ? 0 : var3;
            var10000 = this.canvas;
            var3 = var2;
            var2 = var1;
            var1 = this.canvas.touchAction;
            aq var5 = this.a.M;
            if (var1 == 0) {
               for(int var4 = 0; var4 < var5.l.length; ++var4) {
                  if (var2 >= var5.l[var4][0] && var2 <= var5.l[var4][0] + var5.l[var4][2] && var3 >= var5.l[var4][1] && var3 <= var5.l[var4][1] + var5.l[var4][3]) {
                     var10001 = 8;
                     break label54;
                  }

                  if (var2 >= var5.m[var4][0] && var2 <= var5.m[var4][0] + var5.m[var4][2] && var3 >= var5.m[var4][1] && var3 <= var5.m[var4][1] + var5.m[var4][3]) {
                     var10001 = 2;
                     break label54;
                  }
               }

               if (var2 >= var5.n[0] && var2 <= var5.n[0] + var5.n[2] && var3 >= var5.n[1] && var3 <= var5.n[1] + var5.n[3]) {
                  var10001 = 1073741824;
                  break label54;
               }
            }

            var10001 = var1;
         }

         var10000.touchAction = var10001;
      }

   }

   private void K(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void L(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 2) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
         }
      }

   }

   private void M(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void N(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         this.a.r(this.canvas.touchAction);
         this.canvas.touchAction = 0;
      }

   }

   private void O(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         this.a.q(this.canvas.touchAction);
         this.canvas.touchAction = 0;
      }

   }

   private void P(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 3 || this.a.sceneSubState == 5) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 4) {
            this.canvas.touchAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)"拍卖价格", (int)2);
            }
         }
      }

   }

   private void Q(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 3) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void R(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = LoadingPage.b(var1, var2);
      }

   }

   private void S(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   public final void a() {
      if (this.a != null) {
         switch (this.a.currentSceneModeId) {
            case 0:
               if (this.d != 0) {
                  this.g = this.a.sceneRefreshCoordinator.j - UISceneController.h + this.a.g() + 8;
                  this.h = this.a.sceneRefreshCoordinator.k - UISceneController.i + this.a.h() + 16;
                  if ((this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF) > 4) {
                     if (this.canvas.aF >= this.g) {
                        this.canvas.b = 2;
                     } else if (this.canvas.aF < this.g) {
                        this.canvas.b = 8;
                     }
                  } else if ((this.canvas.aG > this.h ? this.canvas.aG - this.h : this.h - this.canvas.aG) > (this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF)) {
                     if (this.canvas.aG >= this.h) {
                        this.canvas.b = 4;
                     } else if (this.canvas.aG < this.h) {
                        this.canvas.b = 1;
                     }
                  }

                  if (this.canvas.aF <= this.g + 5 && this.canvas.aF >= this.g - 5 && this.canvas.aG <= this.h + 5 & this.canvas.aG >= this.h - 5) {
                     this.canvas.b = 0;
                     return;
                  }
               }
               break;
            case 39:
               if (this.d == 1) {
                  this.g = this.a.ba.e - UISceneController.h + this.a.g() + this.a.ba.a() / 2;
                  this.h = this.a.ba.f - UISceneController.i + this.a.h() + this.a.ba.b() / 2;
                  if ((this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF) > 4) {
                     if (this.canvas.aF >= this.g) {
                        this.canvas.b = 2;
                     } else if (this.canvas.aF < this.g) {
                        this.canvas.b = 8;
                     }

                     this.i = 0;
                  } else if ((this.canvas.aG > this.h ? this.canvas.aG - this.h : this.h - this.canvas.aG) > (this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF)) {
                     if (this.canvas.aG >= this.h) {
                        this.canvas.b = 4;
                     } else if (this.canvas.aG < this.h) {
                        this.canvas.b = 1;
                     }

                     this.i = 0;
                  }

                  if (this.canvas.aF <= this.g + 5 && this.canvas.aF >= this.g - 5 && this.canvas.aG <= this.h + 5 & this.canvas.aG >= this.h - 5) {
                     this.canvas.b = 0;
                  }

                  this.k = 0;
                  this.j = 0;
                  return;
               }

               ++this.k;
               if (this.k > 30) {
                  this.j = 0;
               }
         }
      }

   }

   private void T(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void U(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            this.canvas.touchAction = this.a.O.a(this.canvas.touchAction, var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 3) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void V(int var1, int var2) {
      if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void W(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void X(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            int var8;
            MainCanvas var10000;
            label37: {
               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               var10000 = this.canvas;
               ch var10001 = this.a.V;
               int var3 = var2;
               var2 = var1;
               var1 = this.canvas.touchAction;
               ch var5 = var10001;
               if (var10001.a != null) {
                  for(int var4 = 0; var4 < var5.a.length - 3; ++var4) {
                     if (var2 >= var5.a[var4][0] && var2 <= var5.a[var4][0] + var5.a[var4][2] && var3 >= var5.a[var4][1] && var3 <= var5.a[var4][1] + var5.a[var4][3]) {
                        if (var5.b == var4) {
                           var8 = 268435456;
                           break label37;
                        }

                        var5.b = var4;
                        LoadingPage.l = 0;
                        var5.b();
                        break;
                     }
                  }
               }

               var8 = var1;
            }

            var10000.touchAction = var8;
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void Y(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            this.canvas.touchAction = this.a.O.b(this.canvas.touchAction, var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void Z(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            int var8;
            MainCanvas var10000;
            label44: {
               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               var10000 = this.canvas;
               r var10001 = this.a.P;
               int var3 = var2;
               var2 = var1;
               var1 = this.canvas.touchAction;
               r var5 = var10001;
               if (var10001.g != null) {
                  for(int var4 = 0; var4 < var5.g.length; ++var4) {
                     if (var2 >= var5.g[var4][0] && var2 <= var5.g[var4][0] + var5.g[var4][2] && var3 >= var5.g[var4][1] && var3 <= var5.g[var4][1] + var5.g[var4][3]) {
                        if (var4 < 2) {
                           var5.b = 0;
                           if (var5.a == var4) {
                              var8 = 268435456;
                              break label44;
                           }

                           var5.a = (byte)var4;
                           LoadingPage.l = 0;
                           var5.a();
                        } else {
                           var5.b = 1;
                           if (var5.a == var4 - 2) {
                              var8 = 268435456;
                              break label44;
                           }

                           var5.a = (byte)(var4 - 2);
                           LoadingPage.l = 0;
                           var5.a();
                        }
                        break;
                     }
                  }
               }

               var8 = var1;
            }

            var10000.touchAction = var8;
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void aa(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            int var8;
            MainCanvas var10000;
            label42: {
               this.canvas.touchAction = this.canvas.aq.b(var1, var2);
               var10000 = this.canvas;
               k var10001 = this.a.Q;
               int var3 = var2;
               var2 = var1;
               var1 = this.canvas.touchAction;
               k var5 = var10001;
               if (var10001.g != null) {
                  for(int var4 = 0; var4 < var5.g.length; ++var4) {
                     if (var2 >= var5.g[var4][0] && var2 <= var5.g[var4][0] + var5.g[var4][2] && var3 >= var5.g[var4][1] && var3 <= var5.g[var4][1] + var5.g[var4][3]) {
                        if (var4 < 2) {
                           var5.b = 0;
                           if (var5.a == var4) {
                              var8 = 268435456;
                           } else {
                              var5.a = (byte)(var4 - 1);
                              var8 = 2;
                           }
                        } else {
                           var5.b = 1;
                           if (var5.a == var4 - 2) {
                              var8 = 268435456;
                           } else {
                              var5.a = (byte)(var4 - 3);
                              var8 = 2;
                           }
                        }
                        break label42;
                     }
                  }
               }

               var8 = var1;
            }

            var10000.touchAction = var8;
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void ab(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void ac(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.d(var1, var2);
      }

   }

   private void ad(int var1, int var2) {
      if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void ae(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.a.sceneSubState == 2 && this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         }
      }

   }

   private void af(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         int var3 = this.canvas.aq.a + 5;
         int var4 = this.canvas.aq.b + this.canvas.aq.d - (2 * GlobalConfig.font2_h + 16) - 6;
         int var5 = GlobalConfig.font2.stringWidth("同意(点击申请结婚)");
         int var6 = GlobalConfig.font2.stringWidth("拒绝");
         if (var1 >= var3 + 4 && var2 >= var4 + 5 && var1 <= var3 + 4 + var5 && var2 <= var4 + 5 + GlobalConfig.font2_h) {
            this.canvas.touchAction = this.a.S.d == 0 ? 1073741824 : this.canvas.touchAction;
            this.a.S.d = 0;
         }

         if (var1 >= var3 + 4 && var2 >= var4 + 5 + GlobalConfig.font2_h + 5 && var1 <= var3 + 4 + var6 && var2 <= var4 + 5 + GlobalConfig.font2_h + 5 + GlobalConfig.font2_h) {
            this.canvas.touchAction = this.a.S.d == 1 ? 1073741824 : this.canvas.touchAction;
            this.a.S.d = 1;
         }
      }

   }

   private void ag(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         int var3 = this.canvas.aq.a + 5;
         int var4 = this.canvas.aq.b + this.canvas.aq.d - (2 * GlobalConfig.font2_h + 16) - 6;
         int var5 = GlobalConfig.font2.stringWidth("离婚(点击申请离婚)");
         int var6 = GlobalConfig.font2.stringWidth("取消离婚");
         if (var1 >= var3 + 4 && var2 >= var4 + 5 && var1 <= var3 + 4 + var5 && var2 <= var4 + 5 + GlobalConfig.font2_h) {
            this.canvas.touchAction = this.a.S.g == 0 ? 1073741824 : this.canvas.touchAction;
            this.a.S.g = 0;
         }

         if (var1 >= var3 + 4 && var2 >= var4 + 5 + GlobalConfig.font2_h + 5 && var1 <= var3 + 4 + var6 && var2 <= var4 + 5 + GlobalConfig.font2_h + 5 + GlobalConfig.font2_h) {
            this.canvas.touchAction = this.a.S.g == 1 ? 1073741824 : this.canvas.touchAction;
            this.a.S.g = 1;
         }
      }

   }

   private void ah(int var1, int var2) {
      if (this.a.sceneSubState == 0 && this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void ai(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = LoadingPage.a(var1, var2);
      }

   }

   private void aj(int var1, int var2) {
      if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void ak(int var1, int var2) {
      if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void al(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      } else {
         if (this.a.sceneSubState == 1) {
            this.canvas.touchAction = LoadingPage.c(var1, var2);
         }

      }
   }

   private void am(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1 || this.a.sceneSubState == 2) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void an(int var1, int var2) {
      if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
      }

   }

   private void ao(int var1, int var2) {
      if (this.a.T != null) {
         this.canvas.touchAction = this.a.T.b(var1, var2);
      }

   }

   private void ap(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         this.canvas.touchAction = this.a.f(var1, var2);
         if (this.canvas.touchAction == 0) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void aq(int var1, int var2) {
      if (this.a.sceneSubState != 0 && this.a.sceneSubState != 1) {
         if (this.a.sceneSubState == 2 || this.a.sceneSubState == 3) {
            this.canvas.touchAction = LoadingPage.b(var1, var2);
         }
      } else if (this.canvas.aq != null) {
         this.canvas.touchAction = this.canvas.aq.b(var1, var2);
         return;
      }

   }

   private void ar(int var1, int var2) {
      this.canvas.touchAction = LoadingPage.a(var1, var2);
   }

   private void as(int var1, int var2) {
      this.canvas.touchAction = LoadingPage.b(var1, var2);
   }

   private void at(int var1, int var2) {
      if (this.a.sceneSubState == 0) {
         if (this.canvas.aq != null) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            return;
         }
      } else if (this.a.sceneSubState == 1) {
         this.canvas.touchAction = LoadingPage.c(var1, var2);
      }

   }

   private void au(int var1, int var2) {
      if (this.canvas.aq != null) {
         if (this.a.sceneSubState == 0) {
            this.canvas.touchAction = this.canvas.aq.b(var1, var2);
            if (this.a.N.a == 0) {
               this.canvas.touchAction = this.a.N.a(this.canvas.touchAction, var1, var2);
               return;
            }

            if (this.a.N.a != 1 && this.a.N.a == 2) {
               this.canvas.touchAction = this.a.N.a(this.canvas.touchAction, var1, var2);
               return;
            }
         } else {
            if (this.a.sceneSubState == 1) {
               this.canvas.touchAction = LoadingPage.c(var1, var2);
               return;
            }

            if (this.a.sceneSubState == 2) {
               this.canvas.touchAction = LoadingPage.b(var1, var2);
               return;
            }

            if (this.a.sceneSubState == 3) {
               this.canvas.touchAction = this.a.T.b(var1, var2);
            }
         }
      }

   }
}
