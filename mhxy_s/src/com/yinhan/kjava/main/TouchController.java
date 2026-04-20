package com.yinhan.kjava.main;

import com.cc.*;
//public final class f_3 {
public final class TouchController {
   public GameSceneController gameSceneController;
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
      if (this.gameSceneController != null && this.canvas.pageStatus == 7) {
         switch (this.gameSceneController.currentSceneModeId) {
            case 0:
               var2 = var2;
               var1 = var1;
               if (this.gameSceneController.currentSceneModeId == 0 && this.gameSceneController.J != null) {
                  this.canvas.inputAction = LoadingPage.b(var1, var2);
               } else {
                  if (GlobalStatus.npcObjects != null) {
                     for(int var37 = 0; var37 < GlobalStatus.npcObjects.length; ++var37) {
                        if (GlobalStatus.npcObjects[var37] != null && GlobalStatus.npcObjects[var37].x && GameSceneController.dialog != null && (var1 >= GlobalStatus.npcObjects[var37].c -
                        GameSceneController.h + this.gameSceneController.g() - GlobalStatus.npcObjects[var37].c() / 2 && var1 <= GlobalStatus.npcObjects[var37].c - GameSceneController.h + this.gameSceneController.g() + GlobalStatus.npcObjects[var37].c() / 2 && var2 >= GlobalStatus.npcObjects[var37].d -
                        GameSceneController.i_1 + this.gameSceneController.h() - GlobalStatus.npcObjects[var37].d() && var2 <= GlobalStatus.npcObjects[var37].d - GameSceneController.i_1 + this.gameSceneController.h() || var1 >= GlobalStatus.npcObjects[var37].c -
                        GameSceneController.h + this.gameSceneController.g() + GlobalStatus.npcObjects[var37].c() / 2 && var1 <= GlobalStatus.npcObjects[var37].c - GameSceneController.h + this.gameSceneController.g() + GlobalStatus.npcObjects[var37].c() / 2 +
                        GameSceneController.dialog.i() && var2 >= GlobalStatus.npcObjects[var37].d - GameSceneController.i_1 + this.gameSceneController.h() - GlobalStatus.npcObjects[var37].d() && var2 <= GlobalStatus.npcObjects[var37].d -
                        GameSceneController.i_1 + this.gameSceneController.h() - GlobalStatus.npcObjects[var37].d() + GameSceneController.dialog.j() || var1 >= GlobalStatus.npcObjects[var37].c - GameSceneController.h + this.gameSceneController.g() -
                        GameSceneController.wenhao.i() / 2 && var1 <= GlobalStatus.npcObjects[var37].c - GameSceneController.h + this.gameSceneController.g() + GameSceneController.wenhao.i() / 2 && var2 >= GlobalStatus.npcObjects[var37].d -
                        GameSceneController.i_1 + this.gameSceneController.h() - GlobalStatus.npcObjects[var37].d() - GlobalConfig.font2_h - GameSceneController.wenhao.j() && var2 <= GlobalStatus.npcObjects[var37].d - GameSceneController.i_1 + this.gameSceneController.h() - GlobalStatus.npcObjects[var37].d() - GlobalConfig.font2_h)) {
                           this.gameSceneController.a(1073741824);
                           if (!this.gameSceneController.sceneRefreshCoordinator.c.isEmpty()) {
                              this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                              this.gameSceneController.sceneRefreshCoordinator.a(true);
                           }

                           return;
                        }
                     }
                  }

                  boolean var42;
                  label749: {
                     if (GameSceneController.notInFighting() && this.gameSceneController.sceneRefreshCoordinator.frame1 != null) {
                        switch (this.gameSceneController.sceneRefreshCoordinator.h_1) {
                           case 0:
                              if (var1 >= this.gameSceneController.sceneRefreshCoordinator.j + 16 - this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) - 3 && var1 <= this.gameSceneController.sceneRefreshCoordinator.j + 16 + this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) - 5 && var2 >= this.gameSceneController.sceneRefreshCoordinator.k + 16 - this.gameSceneController.sceneRefreshCoordinator.frame1.h() - (GameSceneController.i_1 - this.gameSceneController.h()) && var2 <= this.gameSceneController.sceneRefreshCoordinator.k + 16 - (GameSceneController.i_1 - this.gameSceneController.h())) {
                                 this.canvas.inputAction = 536870912;
                                 this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                 this.gameSceneController.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                              break;
                           case 1:
                              if (var1 >= this.gameSceneController.sceneRefreshCoordinator.j + 8 - this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) && var1 <= this.gameSceneController.sceneRefreshCoordinator.j + 8 + this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) && var2 >= this.gameSceneController.sceneRefreshCoordinator.k - (GameSceneController.i_1 - this.gameSceneController.h()) - 12 && var2 <= this.gameSceneController.sceneRefreshCoordinator.k + this.gameSceneController.sceneRefreshCoordinator.frame1.h() - (GameSceneController.i_1 - this.gameSceneController.h()) - 5) {
                                 this.canvas.inputAction = 536870912;
                                 this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                 this.gameSceneController.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                              break;
                           case 2:
                              if (var1 >= this.gameSceneController.sceneRefreshCoordinator.j - this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) + 4 && var1 <= this.gameSceneController.sceneRefreshCoordinator.j + this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) + 4 && var2 >= this.gameSceneController.sceneRefreshCoordinator.k + 16 - this.gameSceneController.sceneRefreshCoordinator.frame1.h() - (GameSceneController.i_1 - this.gameSceneController.h()) && var2 <= this.gameSceneController.sceneRefreshCoordinator.k + 16 - (GameSceneController.i_1 - this.gameSceneController.h())) {
                                 this.canvas.inputAction = 536870912;
                                 this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                 this.gameSceneController.sceneRefreshCoordinator.a(true);
                                 var42 = true;
                                 break label749;
                              }
                              break;
                           case 3:
                              if (var1 >= this.gameSceneController.sceneRefreshCoordinator.j + 8 - this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) && var1 <= this.gameSceneController.sceneRefreshCoordinator.j + 8 + this.gameSceneController.sceneRefreshCoordinator.frame1.g() / 2 - (GameSceneController.h - this.gameSceneController.g()) && var2 >= this.gameSceneController.sceneRefreshCoordinator.k + 8 - this.gameSceneController.sceneRefreshCoordinator.frame1.h() - (GameSceneController.i_1 - this.gameSceneController.h()) - 4 && var2 <= this.gameSceneController.sceneRefreshCoordinator.k + 8 - (GameSceneController.i_1 - this.gameSceneController.h()) + 4) {
                                 this.canvas.inputAction = 536870912;
                                 this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                 this.gameSceneController.sceneRefreshCoordinator.a(true);
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
                  if (GlobalStatus.fz != null && GlobalStatus.fz.length > 0 && GlobalStatus.followStatus != 0) {
                     label719:
                     for(int var6 = 0; var6 < GlobalStatus.fz.length; ++var6) {
                        if (GlobalStatus.fz[var6] == 1 && var40.gameSceneController.sceneRefreshCoordinator.d.f != null) {
                           switch (var40.gameSceneController.sceneRefreshCoordinator.d.j) {
                              case 0:
                                 if (var38 >= var40.gameSceneController.sceneRefreshCoordinator.d.h + 16 - var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var38 <= var40.gameSceneController.sceneRefreshCoordinator.d.h + 16 + var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var5 >= var40.gameSceneController.sceneRefreshCoordinator.d.i + 16 - var40.gameSceneController.sceneRefreshCoordinator.d.f.h() - (GameSceneController.i_1 - var40.gameSceneController.h()) && var5 <= var40.gameSceneController.sceneRefreshCoordinator.d.i + 16 - (GameSceneController.i_1 - var40.gameSceneController.h())) {
                                    var40.canvas.inputAction = 48;
                                    var40.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.gameSceneController.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                                 break;
                              case 1:
                                 if (var38 >= var40.gameSceneController.sceneRefreshCoordinator.d.h + 8 - var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var38 <= var40.gameSceneController.sceneRefreshCoordinator.d.h + 8 + var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var5 >= var40.gameSceneController.sceneRefreshCoordinator.d.i - (GameSceneController.i_1 - var40.gameSceneController.h()) && var5 <= var40.gameSceneController.sceneRefreshCoordinator.d.i + var40.gameSceneController.sceneRefreshCoordinator.d.f.h() - (GameSceneController.i_1 - var40.gameSceneController.h())) {
                                    var40.canvas.inputAction = 48;
                                    var40.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.gameSceneController.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                                 break;
                              case 2:
                                 if (var38 >= var40.gameSceneController.sceneRefreshCoordinator.d.h - var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var38 <= var40.gameSceneController.sceneRefreshCoordinator.d.h + var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var5 >= var40.gameSceneController.sceneRefreshCoordinator.d.i + 16 - var40.gameSceneController.sceneRefreshCoordinator.d.f.h() - (GameSceneController.i_1 - var40.gameSceneController.h()) && var5 <= var40.gameSceneController.sceneRefreshCoordinator.d.i + 16 - (GameSceneController.i_1 - var40.gameSceneController.h())) {
                                    var40.canvas.inputAction = 48;
                                    var40.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.gameSceneController.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                                 break;
                              case 3:
                                 if (var38 >= var40.gameSceneController.sceneRefreshCoordinator.d.h + 8 - var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var38 <= var40.gameSceneController.sceneRefreshCoordinator.d.h + 8 + var40.gameSceneController.sceneRefreshCoordinator.d.f.g() / 2 - (GameSceneController.h - var40.gameSceneController.g()) && var5 >= var40.gameSceneController.sceneRefreshCoordinator.d.i + 8 - var40.gameSceneController.sceneRefreshCoordinator.d.f.h() - (GameSceneController.i_1 - var40.gameSceneController.h()) && var5 <= var40.gameSceneController.sceneRefreshCoordinator.d.i + 8 - (GameSceneController.i_1 - var40.gameSceneController.h())) {
                                    var40.canvas.inputAction = 48;
                                    var40.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                                    var40.gameSceneController.sceneRefreshCoordinator.a(true);
                                    break label719;
                                 }
                           }
                        }
                     }
                  }

                  if (GameSceneController.roleConfig[6] == 0 && var1 >= 2 && var1 <= 2 + MainCanvas.pngUtil.e && var2 >= 2 + GlobalConfig.font2_h && var2 <= 2 + GlobalConfig.font2_h + MainCanvas.pngUtil.f) {
                     this.canvas.inputAction = 519;
                     if (!this.gameSceneController.sceneRefreshCoordinator.c.isEmpty()) {
                        this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                        this.gameSceneController.sceneRefreshCoordinator.a(true);
                     }
                  } else {
                     if (this.gameSceneController.currentSceneModeId != 25) {
                       boolean var38_ = false;
                        if (var1 >= GlobalConfig.defaultWidth - bo_1.g[0].getWidth() - 10 && var1 <= GlobalConfig.defaultWidth - 10 && var2 >= 40 && var2 <= 40 + bo_1.g[0].getHeight()) {
                           var38_ = true;
                        }

                        if (var38_) {
                           if (GlobalStatus.P.o) {
                              this.gameSceneController.d((byte)1);
                              return;
                           }

                           if (GlobalStatus.O.u) {
                              this.gameSceneController.d((byte)0);
                              return;
                           }

                           if (this.gameSceneController.n && GameSceneController.notInFighting()) {
                              this.canvas.inputAction = 1024;
                           }
                           break;
                        }
                     }

                     if (GameSceneController.L != null && var1 >= GameSceneController.L.e - GameSceneController.h && var1 <= GameSceneController.L.e - GameSceneController.h + GameSceneController.L.d.g() && var2 >=
                     GameSceneController.L.f - GameSceneController.i_1 && var2 <= GameSceneController.L.f - GameSceneController.i_1 + GameSceneController.L.d.h()) {
                        this.canvas.inputAction = 1073741824;
                        if (!this.gameSceneController.sceneRefreshCoordinator.c.isEmpty()) {
                           this.gameSceneController.sceneRefreshCoordinator.c.removeAllElements();
                           this.gameSceneController.sceneRefreshCoordinator.a(true);
                        }
                     } else if (var1 >= GlobalConfig.defaultWidth - 67 + 37 && var1 <= GlobalConfig.defaultWidth - 67 + 37 + GameSceneController.avatar.image.getWidth() && var2 >= 8 && var2 <=
                     GameSceneController.avatar.image.getHeight() + 8) {
                        this.canvas.inputAction = 2048;
                     } else if (var1 >= GlobalConfig.defaultWidth - 67 && var1 <= GlobalConfig.defaultWidth - 67 + 33 && var2 >= 5 && var2 <= 18) {
                        this.canvas.inputAction = 515;
                     } else if (var1 >= 20 && var1 <= 20 + GlobalConfig.font2.stringWidth(GlobalStatus.mapName) && var2 >= 2 && var2 <= 2 + GlobalConfig.font2_h) {
                        this.canvas.inputAction = 513;
                     } else if (var1 >= GlobalConfig.defaultWidth - 67 && var1 <= GlobalConfig.defaultWidth - 67 + 16 && var2 >= 24 && var2 <= 34) {
                        if (GlobalStatus.bf == 0) {
                           return;
                        }

                        this.gameSceneController.startAttributeAssignment();
                     } else {
                        if (var1 >= 1 && var1 <= 1 + GlobalConfig.font2.stringWidth("菜单") && var2 >= GlobalConfig.defaultHigh - GlobalConfig.font2_h - 1 && var2 <= GlobalConfig.defaultHigh - 1) {
                           this.canvas.inputAction = 268435456;
                           break;
                        }

                        if (var1 < GlobalConfig.defaultWidth - GlobalConfig.font2.stringWidth("聊天") || var1 > GlobalConfig.defaultWidth || var2 < GlobalConfig.defaultHigh - GlobalConfig.font2_h - 1 || var2 > GlobalConfig.defaultHigh - 1) {
                           if (!GlobalStatus.bu) {
                              this.gameSceneController.shuangjiAction = -1;
                              this.canvas.b(var1 + GameSceneController.h - this.gameSceneController.g(), var2 + GameSceneController.i_1 - this.gameSceneController.h());
                           }

                           return;
                        }

                        this.canvas.inputAction = 1024;
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
               if (this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }

               return;
            case 4:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                  this.canvas.inputAction = this.gameSceneController.b(this.canvas.inputAction, var1, var2);
               } else if (this.gameSceneController.sceneSubState != 1 && this.gameSceneController.sceneSubState != 3 && this.gameSceneController.sceneSubState != 9 && this.gameSceneController.sceneSubState != 14 && this.gameSceneController.sceneSubState != 15 && this.gameSceneController.sceneSubState != 16) {
                  if (this.gameSceneController.sceneSubState != 2 && this.gameSceneController.sceneSubState != 4 && this.gameSceneController.sceneSubState != 7 && this.gameSceneController.sceneSubState != 12) {
                     if (this.gameSceneController.sceneSubState != 6 && this.gameSceneController.sceneSubState != 11) {
                        if (this.gameSceneController.sceneSubState != 5 && this.gameSceneController.sceneSubState != 18) {
                           if (this.gameSceneController.sceneSubState == 8) {
                              this.canvas.inputAction = this.gameSceneController.e(var1, var2);
                           } else {
                              if (this.gameSceneController.sceneSubState != 10 && this.gameSceneController.sceneSubState != 13) {
                                 if (this.gameSceneController.sceneSubState == 17) {
                                    this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                                 }

                                 return;
                              }

                              this.canvas.inputAction = LoadingPage.b(var1, var2);
                           }
                        } else {
                           this.canvas.inputAction = LoadingPage.b(var1, var2);
                        }
                     } else {
                        this.canvas.inputAction = LoadingPage.d(var1, var2);
                        if (!LoadingPage.e(var1, var2)) {
                           return;
                        }

                        this.canvas.a((String)"拍卖价格", (int)2);
                     }
                  } else {
                     this.canvas.inputAction = LoadingPage.d(var1, var2);
                  }
               } else {
                  this.canvas.inputAction = LoadingPage.c(var1, var2);
               }
               break;
            case 5:
               if (this.gameSceneController.sceneSubState == 0) {
                  this.canvas.inputAction = this.gameSceneController.b(var1, var2);
               } else {
                  if (this.gameSceneController.sceneSubState != 1) {
                     if (this.gameSceneController.sceneSubState == 2 && this.canvas.mixedUi != null) {
                        this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.c(var1, var2);
               }
               break;
            case 6:
               if (this.gameSceneController.sceneSubState != 0 && this.gameSceneController.sceneSubState != 3) {
                  if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2) {
                     this.canvas.inputAction = LoadingPage.c(var1, var2);
                  }

                  return;
               }

               if (this.canvas.mixedUi == null) {
                  return;
               }

               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               break;
            case 7:
               this.v(var1, var2);
               return;
            case 8:
               if (this.gameSceneController.sceneSubState != 0) {
                  if (this.gameSceneController.sceneSubState == 2) {
                     this.canvas.inputAction = LoadingPage.d(var1, var2);
                  }

                  return;
               }

               if (this.canvas.mixedUi == null) {
                  return;
               }

               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               this.canvas.inputAction = this.gameSceneController.b(this.canvas.inputAction, var1, var2);
               break;
            case 9:
               if (this.gameSceneController.sceneSubState != 0) {
                  if (this.gameSceneController.sceneSubState == 2) {
                     this.canvas.inputAction = LoadingPage.d(var1, var2);
                  }

                  return;
               }

               if (this.canvas.mixedUi == null) {
                  return;
               }

               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               this.canvas.inputAction = this.gameSceneController.b(this.canvas.inputAction, var1, var2);
               break;
            case 10:
               if (this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }

               return;
            case 11:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                  this.canvas.inputAction = this.gameSceneController.b(this.canvas.inputAction, var1, var2);
               } else {
                  if (this.gameSceneController.sceneSubState != 2) {
                     if (this.gameSceneController.sceneSubState == 4) {
                        this.canvas.inputAction = LoadingPage.c(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.d(var1, var2);
               }
               break;
            case 12:
               this.m(var1, var2);
               return;
            case 13:
               if (this.gameSceneController.sceneSubState != 0 && this.gameSceneController.sceneSubState != 10 && this.gameSceneController.sceneSubState != 5 && this.gameSceneController.sceneSubState != 6) {
                  if (this.gameSceneController.sceneSubState != 1 && this.gameSceneController.sceneSubState != 2 && this.gameSceneController.sceneSubState != 8 && this.gameSceneController.sceneSubState != 9) {
                     if (this.gameSceneController.sceneSubState == 3) {
                        this.canvas.inputAction = LoadingPage.d(var1, var2);
                        if (!LoadingPage.e(var1, var2)) {
                           return;
                        }

                        this.canvas.a((String)"请输入拍卖价格", (int)2);
                     } else if (this.gameSceneController.sceneSubState == 4) {
                        this.canvas.inputAction = LoadingPage.b(var1, var2);
                     } else {
                        if (this.gameSceneController.sceneSubState != 7) {
                           if (this.gameSceneController.sceneSubState == 11) {
                              this.canvas.inputAction = LoadingPage.b(var1, var2);
                           }

                           return;
                        }

                        this.canvas.inputAction = this.gameSceneController.c(var1, var2);
                     }
                  } else {
                     this.canvas.inputAction = LoadingPage.c(var1, var2);
                  }
               } else {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }
               break;
            case 14:
               if (this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }

               return;
            case 15:
               if (this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
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
               this.canvas.inputAction = LoadingPage.a(var1, var2);
               return;
            case 21:
               this.o(var1, var2);
               return;
            case 22:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                  this.canvas.inputAction = this.gameSceneController.e(this.canvas.inputAction, var1, var2);
               } else if (this.gameSceneController.sceneSubState == 6) {
                  this.canvas.inputAction = LoadingPage.d(var1, var2);
                  if (!LoadingPage.e(var1, var2)) {
                     return;
                  }

                  this.canvas.a((String)"输入交易银两", (int)2);
               } else {
                  if (this.gameSceneController.sceneSubState != 1 && this.gameSceneController.sceneSubState != 2 && this.gameSceneController.sceneSubState != 3) {
                     if (this.gameSceneController.sceneSubState == 5) {
                        this.canvas.inputAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.c(var1, var2);
               }
               break;
            case 23:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               } else if (this.gameSceneController.sceneSubState == 1) {
                  this.canvas.inputAction = LoadingPage.c(var1, var2);
               } else {
                  if (this.gameSceneController.sceneSubState != 2) {
                     if (this.gameSceneController.sceneSubState == 3 || this.gameSceneController.sceneSubState == 4) {
                        this.canvas.inputAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.d(var1, var2);
               }
               break;
            case 24:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               } else {
                  if (this.gameSceneController.sceneSubState != 1) {
                     if (this.gameSceneController.sceneSubState == 2) {
                        this.canvas.inputAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.c(var1, var2);
               }
               break;
            case 25:
               var2 = var2;
               var1 = var1;
               if (this.gameSceneController.overlayDialogController.d == 0 || this.gameSceneController.overlayDialogController.d == 2 || this.gameSceneController.overlayDialogController.f > 1) {
                  this.canvas.inputAction = this.gameSceneController.overlayDialogController.a(this.gameSceneController.overlayDialogController.d, var1, var2);
                  if (this.canvas.inputAction != 0) {
                     return;
                  }
               }

               if (this.gameSceneController.overlayDialogController.f == 0) {
                  if (this.gameSceneController.overlayDialogController.d == 0) {
                     this.canvas.inputAction = this.gameSceneController.overlayDialogController.a(var1, var2);
                  } else if (this.gameSceneController.overlayDialogController.d == 2) {
                     this.canvas.inputAction = this.gameSceneController.overlayDialogController.b(var1, var2);
                  }

                  if (this.canvas.inputAction != 0) {
                     return;
                  }
               }

               if (this.gameSceneController.overlayDialogController.d != 1 && this.gameSceneController.overlayDialogController.d != 3) {
                  if (this.gameSceneController.overlayDialogController.d == 4) {
                     if (GlobalStatus.fightData != null) {
                        for(byte var36 = (byte)(GlobalStatus.fightData.length - 1); var36 >= 0; --var36) {
                           if (GlobalStatus.fightData[var36].j != null && var1 >= GlobalConfig.Q[GlobalStatus.fightData[var36].a][0] - GlobalStatus.fightData[var36].f() / 2 && var1 <= GlobalConfig.Q[GlobalStatus.fightData[var36].a][0] + GlobalStatus.fightData[var36].f() / 2 && var2 >= GlobalConfig.Q[GlobalStatus.fightData[var36].a][1] - GlobalStatus.fightData[var36].g() && var2 <= GlobalConfig.Q[GlobalStatus.fightData[var36].a][1]) {
                              if (FightModel.h()) {
                                 this.canvas.showTips("只能对自己使用复活道具");
                              } else if (this.gameSceneController.overlayDialogController.i != var36) {
                                 this.gameSceneController.overlayDialogController.i = var36;
                              } else {
                                 this.canvas.inputAction = 1073741824;
                              }
                           }
                        }
                     }
                  } else if ((this.gameSceneController.overlayDialogController.d == 5 || this.gameSceneController.overlayDialogController.d == 6 || this.gameSceneController.overlayDialogController.d == 7 || this.gameSceneController.overlayDialogController.d == 8) && GlobalStatus.fightData != null) {
                     for(byte var35 = (byte)(GlobalStatus.fightData.length - 1); var35 >= 0; --var35) {
                        if (GlobalStatus.fightData[var35].j != null && var1 >= GlobalConfig.Q[GlobalStatus.fightData[var35].a][0] - GlobalStatus.fightData[var35].f() / 2 && var1 <= GlobalConfig.Q[GlobalStatus.fightData[var35].a][0] + GlobalStatus.fightData[var35].f() / 2 && var2 >= GlobalConfig.Q[GlobalStatus.fightData[var35].a][1] - GlobalStatus.fightData[var35].g() && var2 <= GlobalConfig.Q[GlobalStatus.fightData[var35].a][1]) {
                           if (FightModel.h()) {
                              this.canvas.showTips("只能对自己使用复活道具");
                           } else if (this.gameSceneController.overlayDialogController.i != var35) {
                              this.gameSceneController.overlayDialogController.i = var35;
                           } else {
                              this.canvas.inputAction = 1073741824;
                           }
                        }
                     }
                  }
               } else if (GlobalStatus.M != null) {
                  for(byte var3 = (byte)(GlobalStatus.M.length - 1); var3 >= 0; --var3) {
                     ck var4;
                     if (GlobalStatus.M[var3].m != null && !GlobalStatus.M[var3].a() && (GlobalStatus.M[var3].n == 1 || GlobalStatus.M[var3].n == 4) && var1 >= GlobalConfig.R[GlobalStatus.M[var3].a][0] - GlobalStatus.M[var3].c() / 2 && var1 <= GlobalConfig.R[GlobalStatus.M[var3].a][0] + GlobalStatus.M[var3].c() / 2 && var2 >= GlobalConfig.R[GlobalStatus.M[var3].a][1] - ((var4 = GlobalStatus.M[var3]).m != null && var4.m.frameH != null ? var4.m.frameH[var4.m.currentFrameIndex] : 0) && var2 <= GlobalConfig.R[GlobalStatus.M[var3].a][1]) {
                        if (this.gameSceneController.overlayDialogController.h != var3) {
                           this.gameSceneController.overlayDialogController.h = var3;
                        } else {
                           this.canvas.inputAction = 1073741824;
                        }
                     }
                  }
               }

               if (var1 >= GlobalConfig.defaultWidth - MainCanvas.button_back.w && var1 <= GlobalConfig.defaultWidth && var2 >= GlobalConfig.defaultHigh - MainCanvas.button_back.h && var2 <= GlobalConfig.defaultHigh) {
                  this.canvas.inputAction = 536870912;
               }

               return;
            case 27:
               this.u(var1, var2);
               return;
            case 28:
               this.t(var1, var2);
               return;
            case 29:
               if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }

               return;
            case 30:
               this.w(var1, var2);
               return;
            case 31:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               } else {
                  if (this.gameSceneController.sceneSubState != 1) {
                     if (this.gameSceneController.sceneSubState == 2) {
                        this.canvas.inputAction = LoadingPage.c(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.d(var1, var2);
               }
               break;
            case 32:
               TouchController var12 = this;
               var12.canvas.inputAction = var12.gameSceneController.d(var1, var2);
               return;
            case 33:
               this.ap(var1, var2);
               return;
            case 34:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               } else if (this.gameSceneController.sceneSubState != 1 && this.gameSceneController.sceneSubState != 2) {
                  if (this.gameSceneController.sceneSubState != 3 && this.gameSceneController.sceneSubState != 5) {
                     if (this.gameSceneController.sceneSubState == 4) {
                        this.canvas.inputAction = LoadingPage.d(var1, var2);
                        if (LoadingPage.e(var1, var2)) {
                           this.canvas.a((String)"请输入拍卖价格", (int)2);
                           return;
                        }
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.b(var1, var2);
               } else {
                  this.canvas.inputAction = LoadingPage.c(var1, var2);
               }
               break;
            case 35:
               if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }

               return;
            case 36:
               if (this.gameSceneController.sceneSubState == 0) {
                  if (this.canvas.mixedUi == null) {
                     return;
                  }

                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               } else if (this.gameSceneController.sceneSubState == 2) {
                  this.canvas.inputAction = this.gameSceneController.e(var1, var2);
               } else {
                  if (this.gameSceneController.sceneSubState != 1 && this.gameSceneController.sceneSubState != 3 && this.gameSceneController.sceneSubState != 5) {
                     if (this.gameSceneController.sceneSubState == 4) {
                        this.canvas.inputAction = LoadingPage.b(var1, var2);
                     }

                     return;
                  }

                  this.canvas.inputAction = LoadingPage.c(var1, var2);
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
               if (this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               }

               return;
            case 96:
               if (this.canvas.mixedUi != null) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                  this.canvas.inputAction = this.gameSceneController.a(this.canvas.inputAction, var1, var2);
               }

               return;
            case 98:
               this.canvas.inputAction = LoadingPage.a(var1, var2);
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
               if (this.canvas.popUpWindow != null) {
                  this.canvas.inputAction = this.canvas.popUpWindow.touchAction(var1, var2);
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
               this.canvas.inputAction = MainCanvas.gameSceneController.bc.a((byte)0, var1, var2);
               return;
            case 120:
               if (this.gameSceneController.sceneSubState == 0) {
                  this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
                  return;
               }

               if (this.gameSceneController.sceneSubState == 1) {
                  this.canvas.inputAction = LoadingPage.c(var1, var2);
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
               this.canvas.inputAction = MainCanvas.gameSceneController.g(var1, var2);
               return;
            case 126:
               this.l(var1, var2);
               return;
            case 127:
               this.canvas.inputAction = MainCanvas.gameSceneController.h(var1, var2);
               return;
            case 128:
               this.at(var1, var2);
               return;
            case 130:
               this.au(var1, var2);
               return;
            case 131:
               this.canvas.inputAction = MainCanvas.gameSceneController.W.a(var1, var2);
         }
      }

   }

   private void b(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
         }

      }
   }

   private void c(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void d(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void e(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void f(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            this.canvas.inputAction = this.gameSceneController.b(this.canvas.inputAction, var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 2) {
            if (this.canvas.mixedUi != null) {
               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               return;
            }
         } else {
            if (this.gameSceneController.sceneSubState == 3 || this.gameSceneController.sceneSubState == 6) {
               this.canvas.inputAction = LoadingPage.d(var1, var2);
               return;
            }

            if (this.gameSceneController.sceneSubState == 5 || this.gameSceneController.sceneSubState == 4) {
               this.canvas.inputAction = LoadingPage.b(var1, var2);
            }
         }
      }

   }

   private void g(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         int var3 = this.canvas.mixedUi.hintCheck(var1, var2);
         this.canvas.inputAction = var3 == 1073741824 ? 0 : var3;
         this.canvas.inputAction = this.gameSceneController.M.a(this.canvas.inputAction, var1, var2);
      }

   }

   private void h(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      } else if (this.gameSceneController.sceneSubState == 1 && this.canvas.popUpWindow != null) {
         this.canvas.inputAction = this.canvas.popUpWindow.touchAction(var1, var2);
      } else {
         if (this.gameSceneController.sceneSubState == 2) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }

      }
   }

   private void i(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void j(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void k(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = LoadingPage.a(var1, var2);
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }

      }
   }

   private void l(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         if (this.canvas.inputAction == 0) {
            this.canvas.inputAction = this.gameSceneController.b(this.canvas.inputAction, var1, var2);
         }
      }

   }

   private void m(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 6) {
            this.canvas.inputAction = this.gameSceneController.e(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 7) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
         }
      }

   }

   private void n(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         this.canvas.keyCombination = this.canvas.inputAction = this.gameSceneController.a(this.canvas.inputAction, var1, var2);
      }

   }

   private void o(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 3) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 4) {
            if (this.canvas.mixedUi != null) {
               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               return;
            }
         } else if (this.gameSceneController.sceneSubState == 5) {
            this.canvas.inputAction = this.gameSceneController.c(var1, var2);
         }
      }

   }

   private void p(int var1, int var2) {
      if (this.gameSceneController.sceneSubState != 0 && this.gameSceneController.sceneSubState != 10) {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 3 || this.gameSceneController.sceneSubState == 4 || this.gameSceneController.sceneSubState == 5 || this.gameSceneController.sceneSubState == 6 || this.gameSceneController.sceneSubState == 7 || this.gameSceneController.sceneSubState == 9) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 8) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      } else if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         return;
      }

   }

   private void q(int var1, int var2) {
      if (this.gameSceneController.sceneSubState != 0 && this.gameSceneController.sceneSubState != 1) {
         if (this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 3 || this.gameSceneController.sceneSubState == 4 || this.gameSceneController.sceneSubState == 5 || this.gameSceneController.sceneSubState == 6) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
         }
      } else if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         this.canvas.aw = this.canvas.topUi.selectTabIndex;
         this.canvas.inputAction = this.gameSceneController.d(this.canvas.inputAction, var1, var2);
         if (this.canvas.inputAction == 0 && GameSceneController.aP.size() == 0) {
            this.canvas.inputAction = 1073741824;
         }
      }

      if (MainCanvas.close != null && var1 >= GlobalConfig.defaultWidth - 4 - MainCanvas.close.image.getWidth() && var1 < GlobalConfig.defaultWidth - 4 && var2 >= 4 && var2 <= MainCanvas.close.image.getHeight() + 4) {
         this.canvas.inputAction = 536870912;
      }

   }

   private void r(int var1, int var2) {
      if (this.gameSceneController.sceneSubState != 6 && this.gameSceneController.sceneSubState != 7) {
         if (this.gameSceneController.sceneSubState == 8) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
         } else {
            this.canvas.inputAction = this.gameSceneController.a(var1, var2);
         }
      } else {
         this.canvas.inputAction = LoadingPage.b(var1, var2);
      }
   }

   private void s(int var1, int var2) {
      if (this.gameSceneController.sceneSubState != 0) {
         if (this.gameSceneController.sceneSubState != 1 && this.gameSceneController.sceneSubState != 3 && this.gameSceneController.sceneSubState != 4 && this.gameSceneController.sceneSubState != 5 && this.gameSceneController.sceneSubState != 7 && this.gameSceneController.sceneSubState != 9 && this.gameSceneController.sceneSubState != 10) {
            return;
         }

         if (this.gameSceneController.sceneSubMode == 1 || this.gameSceneController.sceneSubMode == 2) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)(this.gameSceneController.sceneSubMode == 1 ? "请输入取出银两" : "请输入存入银两"), (int)2);
               return;
            }

            return;
         }

         if (this.gameSceneController.sceneSubMode == 3) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)"请输入竞标银两", (int)2);
               return;
            }

            return;
         }

         if (this.gameSceneController.sceneSubMode == 4) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubMode == 5 || this.gameSceneController.sceneSubMode == 6) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
            return;
         }
      }

      this.canvas.inputAction = LoadingPage.a(var1, var2);
   }

   private void t(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         int var3;
         if ((var3 = this.canvas.mixedUi.hintCheck(var1, var2)) == 1073741824) {
            if (this.canvas.gunDongListUi.g() != 0 && this.canvas.gunDongListUi.g() != 1) {
               var3 = 8;
            } else {
               var3 = this.gameSceneController.f(this.canvas.gunDongListUi.g(), var1, var2);
            }
         }

         this.canvas.inputAction = var3;
      }

   }

   private void u(int var1, int var2) {
      if ((this.gameSceneController.sceneSubState == 0 || this.gameSceneController.sceneSubState == 1) && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void v(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState != 3 && this.gameSceneController.sceneSubState != 11) {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 5 || this.gameSceneController.sceneSubState == 6 || this.gameSceneController.sceneSubState == 8 || this.gameSceneController.sceneSubState == 9 || this.gameSceneController.sceneSubState == 10) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 4 || this.gameSceneController.sceneSubState == 12) {
            if (this.gameSceneController.sceneSubMode == 1) {
               this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
               return;
            }

            this.canvas.inputAction = this.gameSceneController.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 7) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)"请输入决斗金额", (int)2);
            }
         }
      } else if (this.gameSceneController.mixedUi != null) {
         this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
         return;
      }

   }

   private void w(int var1, int var2) {
      if (var1 < this.gameSceneController.aB || var1 > this.gameSceneController.aB + this.gameSceneController.currentMap.mapW * this.gameSceneController.aD / 16 || var2 < this.gameSceneController.aC || var2 > this.gameSceneController.aC + this.gameSceneController.currentMap.mapH * this.gameSceneController.aD / 16) {
         this.canvas.inputAction = 536870912;
      }

   }

   private void x(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 3 || this.gameSceneController.sceneSubState == 4 || this.gameSceneController.sceneSubState == 5 || this.gameSceneController.sceneSubState == 6 || this.gameSceneController.sceneSubState == 7 || this.gameSceneController.sceneSubState == 8 || this.gameSceneController.sceneSubState == 10) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 9) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void y(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = LoadingPage.a(var1, var2);
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         }

      }
   }

   private void z(int var1, int var2) {
      if (var1 >= this.gameSceneController.ba.e - GameSceneController.h + this.gameSceneController.g() && var1 <= this.gameSceneController.ba.e - GameSceneController.h + this.gameSceneController.g() + this.gameSceneController.ba.a() && var2 >= this.gameSceneController.ba.f -
      GameSceneController.i_1 + this.gameSceneController.h() && var2 <= this.gameSceneController.ba.f - GameSceneController.i_1 + this.gameSceneController.h() + this.gameSceneController.ba.b()) {
         this.c = 1;
         ++this.i;
         if (this.i >= 2 && this.k <= 30) {
            this.i = 0;
            this.canvas.inputAction = 1073741824;
            this.gameSceneController.V();
            this.canvas.inputAction = 0;
         }

         this.k = 0;
         this.j = 0;
      } else {
         ++this.j;
         if (this.j >= 2 && this.k <= 30) {
            this.j = 0;
            this.canvas.inputAction = 536870912;
            this.gameSceneController.V();
            this.canvas.inputAction = 0;
         }

         this.k = 0;
         this.i = 0;
      }
   }

   private void A(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 3) {
         this.canvas.inputAction = LoadingPage.b(var1, var2);
      }

   }

   private void B(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void C(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void D(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void E(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 2 && this.gameSceneController.mixedUi != null) {
            this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
         }
      }

   }

   private void F(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 5 || this.gameSceneController.sceneSubState == 6 || this.gameSceneController.sceneSubState == 7 || this.gameSceneController.sceneSubState == 8) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 3) {
            this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 4) {
            if (this.gameSceneController.sceneSubMode == 0) {
               this.canvas.inputAction = this.gameSceneController.c(var1, var2);
               return;
            }

            if (this.gameSceneController.sceneSubMode == 1) {
               this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
               return;
            }
         } else if (this.gameSceneController.sceneSubState == 9) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void G(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 2) {
            if (this.canvas.mixedUi != null) {
               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               return;
            }
         } else if (this.gameSceneController.sceneSubState == 3) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void H(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void I(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.d(var1, var2);
         if (LoadingPage.e(var1, var2)) {
            this.canvas.a((String)"捐献银两数量", (int)2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 2) {
         this.canvas.inputAction = LoadingPage.d(var1, var2);
         if (LoadingPage.e(var1, var2)) {
            this.canvas.a((String)"捐献经验数量", (int)2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 5) {
         this.canvas.inputAction = LoadingPage.d(var1, var2);
         if (LoadingPage.e(var1, var2)) {
            this.canvas.a((String)"取出银两数量", (int)2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState != 3 && this.gameSceneController.sceneSubState != 4) {
            if (this.gameSceneController.sceneSubState != 6 && this.gameSceneController.sceneSubState != 7) {
               return;
            }
         } else {
            if (this.gameSceneController.sceneSubMode == 0) {
               this.canvas.inputAction = LoadingPage.d(var1, var2);
               return;
            }

            if (this.gameSceneController.sceneSubMode != 1) {
               return;
            }
         }

         this.canvas.inputAction = LoadingPage.b(var1, var2);
      }

   }

   private void J(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         MainCanvas var10000;
         int var10001;
         label54: {
            int var3 = this.canvas.mixedUi.hintCheck(var1, var2);
            this.canvas.inputAction = var3 == 1073741824 ? 0 : var3;
            var10000 = this.canvas;
            var3 = var2;
            var2 = var1;
            var1 = this.canvas.inputAction;
            GroupModel var5 = this.gameSceneController.M;
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

         var10000.inputAction = var10001;
      }

   }

   private void K(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void L(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 2) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
         }
      }

   }

   private void M(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void N(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         this.gameSceneController.r(this.canvas.inputAction);
         this.canvas.inputAction = 0;
      }

   }

   private void O(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         this.gameSceneController.q(this.canvas.inputAction);
         this.canvas.inputAction = 0;
      }

   }

   private void P(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 3 || this.gameSceneController.sceneSubState == 5) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 4) {
            this.canvas.inputAction = LoadingPage.d(var1, var2);
            if (LoadingPage.e(var1, var2)) {
               this.canvas.a((String)"拍卖价格", (int)2);
            }
         }
      }

   }

   private void Q(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 3) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void R(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = LoadingPage.b(var1, var2);
      }

   }

   private void S(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   public final void a() {
      if (this.gameSceneController != null) {
         switch (this.gameSceneController.currentSceneModeId) {
            case 0:
               if (this.d != 0) {
                  this.g = this.gameSceneController.sceneRefreshCoordinator.j - GameSceneController.h + this.gameSceneController.g() + 8;
                  this.h = this.gameSceneController.sceneRefreshCoordinator.k - GameSceneController.i_1 + this.gameSceneController.h() + 16;
                  if ((this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF) > 4) {
                     if (this.canvas.aF >= this.g) {
                        this.canvas.keyCombination = 2;
                     } else if (this.canvas.aF < this.g) {
                        this.canvas.keyCombination = 8;
                     }
                  } else if ((this.canvas.aG > this.h ? this.canvas.aG - this.h : this.h - this.canvas.aG) > (this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF)) {
                     if (this.canvas.aG >= this.h) {
                        this.canvas.keyCombination = 4;
                     } else if (this.canvas.aG < this.h) {
                        this.canvas.keyCombination = 1;
                     }
                  }

                  if (this.canvas.aF <= this.g + 5 && this.canvas.aF >= this.g - 5 && this.canvas.aG <= this.h + 5 & this.canvas.aG >= this.h - 5) {
                     this.canvas.keyCombination = 0;
                     return;
                  }
               }
               break;
            case 39:
               if (this.d == 1) {
                  this.g = this.gameSceneController.ba.e - GameSceneController.h + this.gameSceneController.g() + this.gameSceneController.ba.a() / 2;
                  this.h = this.gameSceneController.ba.f - GameSceneController.i_1 + this.gameSceneController.h() + this.gameSceneController.ba.b() / 2;
                  if ((this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF) > 4) {
                     if (this.canvas.aF >= this.g) {
                        this.canvas.keyCombination = 2;
                     } else if (this.canvas.aF < this.g) {
                        this.canvas.keyCombination = 8;
                     }

                     this.i = 0;
                  } else if ((this.canvas.aG > this.h ? this.canvas.aG - this.h : this.h - this.canvas.aG) > (this.canvas.aF > this.g ? this.canvas.aF - this.g : this.g - this.canvas.aF)) {
                     if (this.canvas.aG >= this.h) {
                        this.canvas.keyCombination = 4;
                     } else if (this.canvas.aG < this.h) {
                        this.canvas.keyCombination = 1;
                     }

                     this.i = 0;
                  }

                  if (this.canvas.aF <= this.g + 5 && this.canvas.aF >= this.g - 5 && this.canvas.aG <= this.h + 5 & this.canvas.aG >= this.h - 5) {
                     this.canvas.keyCombination = 0;
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
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void U(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            this.canvas.inputAction = this.gameSceneController.O.a(this.canvas.inputAction, var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 3) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      }

   }

   private void V(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void W(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void X(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            int var8;
            MainCanvas var10000;
            label37: {
               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               var10000 = this.canvas;
               ch var10001 = this.gameSceneController.V;
               int var3 = var2;
               var2 = var1;
               var1 = this.canvas.inputAction;
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

            var10000.inputAction = var8;
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void Y(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            this.canvas.inputAction = this.gameSceneController.O.b(this.canvas.inputAction, var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void Z(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            int var8;
            MainCanvas var10000;
            label44: {
               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               var10000 = this.canvas;
               r var10001 = this.gameSceneController.P;
               int var3 = var2;
               var2 = var1;
               var1 = this.canvas.inputAction;
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

            var10000.inputAction = var8;
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void aa(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            int var8;
            MainCanvas var10000;
            label42: {
               this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
               var10000 = this.canvas;
               k var10001 = this.gameSceneController.Q;
               int var3 = var2;
               var2 = var1;
               var1 = this.canvas.inputAction;
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

            var10000.inputAction = var8;
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void ab(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void ac(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.d(var1, var2);
      }

   }

   private void ad(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void ae(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
            return;
         }

         if (this.gameSceneController.sceneSubState == 2 && this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         }
      }

   }

   private void af(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         int var3 = this.canvas.mixedUi.X + 5;
         int var4 = this.canvas.mixedUi.Y + this.canvas.mixedUi.H - (2 * GlobalConfig.font2_h + 16) - 6;
         int var5 = GlobalConfig.font2.stringWidth("同意(点击申请结婚)");
         int var6 = GlobalConfig.font2.stringWidth("拒绝");
         if (var1 >= var3 + 4 && var2 >= var4 + 5 && var1 <= var3 + 4 + var5 && var2 <= var4 + 5 + GlobalConfig.font2_h) {
            this.canvas.inputAction = this.gameSceneController.marriageModel.d == 0 ? 1073741824 : this.canvas.inputAction;
            this.gameSceneController.marriageModel.d = 0;
         }

         if (var1 >= var3 + 4 && var2 >= var4 + 5 + GlobalConfig.font2_h + 5 && var1 <= var3 + 4 + var6 && var2 <= var4 + 5 + GlobalConfig.font2_h + 5 + GlobalConfig.font2_h) {
            this.canvas.inputAction = this.gameSceneController.marriageModel.d == 1 ? 1073741824 : this.canvas.inputAction;
            this.gameSceneController.marriageModel.d = 1;
         }
      }

   }

   private void ag(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         int var3 = this.canvas.mixedUi.X + 5;
         int var4 = this.canvas.mixedUi.Y + this.canvas.mixedUi.H - (2 * GlobalConfig.font2_h + 16) - 6;
         int var5 = GlobalConfig.font2.stringWidth("离婚(点击申请离婚)");
         int var6 = GlobalConfig.font2.stringWidth("取消离婚");
         if (var1 >= var3 + 4 && var2 >= var4 + 5 && var1 <= var3 + 4 + var5 && var2 <= var4 + 5 + GlobalConfig.font2_h) {
            this.canvas.inputAction = this.gameSceneController.marriageModel.g == 0 ? 1073741824 : this.canvas.inputAction;
            this.gameSceneController.marriageModel.g = 0;
         }

         if (var1 >= var3 + 4 && var2 >= var4 + 5 + GlobalConfig.font2_h + 5 && var1 <= var3 + 4 + var6 && var2 <= var4 + 5 + GlobalConfig.font2_h + 5 + GlobalConfig.font2_h) {
            this.canvas.inputAction = this.gameSceneController.marriageModel.g == 1 ? 1073741824 : this.canvas.inputAction;
            this.gameSceneController.marriageModel.g = 1;
         }
      }

   }

   private void ah(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0 && this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void ai(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = LoadingPage.a(var1, var2);
      }

   }

   private void aj(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void ak(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void al(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      } else {
         if (this.gameSceneController.sceneSubState == 1) {
            this.canvas.inputAction = LoadingPage.c(var1, var2);
         }

      }
   }

   private void am(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1 || this.gameSceneController.sceneSubState == 2) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void an(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
      }

   }

   private void ao(int var1, int var2) {
      if (this.gameSceneController.mixedUi != null) {
         this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
      }

   }

   private void ap(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         this.canvas.inputAction = this.gameSceneController.f(var1, var2);
         if (this.canvas.inputAction == 0) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void aq(int var1, int var2) {
      if (this.gameSceneController.sceneSubState != 0 && this.gameSceneController.sceneSubState != 1) {
         if (this.gameSceneController.sceneSubState == 2 || this.gameSceneController.sceneSubState == 3) {
            this.canvas.inputAction = LoadingPage.b(var1, var2);
         }
      } else if (this.canvas.mixedUi != null) {
         this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
         return;
      }

   }

   private void ar(int var1, int var2) {
      this.canvas.inputAction = LoadingPage.a(var1, var2);
   }

   private void as(int var1, int var2) {
      this.canvas.inputAction = LoadingPage.b(var1, var2);
   }

   private void at(int var1, int var2) {
      if (this.gameSceneController.sceneSubState == 0) {
         if (this.canvas.mixedUi != null) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            return;
         }
      } else if (this.gameSceneController.sceneSubState == 1) {
         this.canvas.inputAction = LoadingPage.c(var1, var2);
      }

   }

   private void au(int var1, int var2) {
      if (this.canvas.mixedUi != null) {
         if (this.gameSceneController.sceneSubState == 0) {
            this.canvas.inputAction = this.canvas.mixedUi.hintCheck(var1, var2);
            if (this.gameSceneController.N.a == 0) {
               this.canvas.inputAction = this.gameSceneController.N.a(this.canvas.inputAction, var1, var2);
               return;
            }

            if (this.gameSceneController.N.a != 1 && this.gameSceneController.N.a == 2) {
               this.canvas.inputAction = this.gameSceneController.N.a(this.canvas.inputAction, var1, var2);
               return;
            }
         } else {
            if (this.gameSceneController.sceneSubState == 1) {
               this.canvas.inputAction = LoadingPage.c(var1, var2);
               return;
            }

            if (this.gameSceneController.sceneSubState == 2) {
               this.canvas.inputAction = LoadingPage.b(var1, var2);
               return;
            }

            if (this.gameSceneController.sceneSubState == 3) {
               this.canvas.inputAction = this.gameSceneController.mixedUi.hintCheck(var1, var2);
            }
         }
      }

   }
}
