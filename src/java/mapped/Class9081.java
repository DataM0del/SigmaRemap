package mapped;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9081 {
   private static final Logger field41569 = LogManager.getLogger();
   public Class1657 field41570;
   public Class878 field41571;
   private Class1894 field41572 = Class1894.field11101;
   private Class1894 field41573 = Class1894.field11101;
   private boolean field41574;
   private int field41575;
   private BlockPos field41576 = BlockPos.field13032;
   private int field41577;
   private boolean field41578;
   private BlockPos field41579 = BlockPos.field13032;
   private int field41580;
   private int field41581 = -1;

   public Class9081(Class1657 var1) {
      this.field41570 = var1;
   }

   public void method33861(Class1894 var1) {
      this.method33862(var1, var1 == this.field41572 ? this.field41573 : this.field41572);
   }

   public void method33862(Class1894 var1, Class1894 var2) {
      this.field41573 = var2;
      this.field41572 = var1;
      var1.method8155(this.field41571.field4919);
      this.field41571.method2797();
      this.field41571.field4856.method1367().method19456(new Class5503(Class2176.field14282, this.field41571));
      this.field41570.method6902();
   }

   public Class1894 method33863() {
      return this.field41572;
   }

   public Class1894 method33864() {
      return this.field41573;
   }

   public boolean method33865() {
      return this.field41572.method8158();
   }

   public boolean method33866() {
      return this.field41572.method8157();
   }

   public void method33867(Class1894 var1) {
      if (this.field41572 == Class1894.field11101) {
         this.field41572 = var1;
      }

      this.method33861(this.field41572);
   }

   public void method33856() {
      this.field41577++;
      if (!this.field41578) {
         if (this.field41574) {
            Class7380 var3 = this.field41570.method6738(this.field41576);
            if (!var3.method23393()) {
               this.method33868(var3, this.field41576, this.field41575);
            } else {
               this.field41570.method6803(this.field41571.method3205(), this.field41576, -1);
               this.field41581 = -1;
               this.field41574 = false;
            }
         }
      } else {
         Class7380 var5 = this.field41570.method6738(this.field41579);
         if (!var5.method23393()) {
            float var4 = this.method33868(var5, this.field41579, this.field41580);
            if (var4 >= 1.0F) {
               this.field41578 = false;
               this.method33870(this.field41579);
            }
         } else {
            this.field41578 = false;
         }
      }
   }

   private float method33868(Class7380 var1, BlockPos var2, int var3) {
      int var6 = this.field41577 - var3;
      float var7 = var1.method23406(this.field41571, this.field41571.field5024, var2) * (float)(var6 + 1);
      int var8 = (int)(var7 * 10.0F);
      if (var8 != this.field41581) {
         this.field41570.method6803(this.field41571.method3205(), var2, var8);
         this.field41581 = var8;
      }

      return var7;
   }

   public void method33858(BlockPos var1, Class2070 var2, Direction var3, int var4) {
      double var7 = this.field41571.getPosX() - ((double)var1.method8304() + 0.5);
      double var9 = this.field41571.getPosY() - ((double)var1.getY() + 0.5) + 1.5;
      double var11 = this.field41571.getPosZ() - ((double)var1.method8306() + 0.5);
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      if (!(var13 > 36.0)) {
         if (var1.getY() < var4) {
            if (var2 != Class2070.field13484) {
               if (var2 != Class2070.field13486) {
                  if (var2 == Class2070.field13485) {
                     this.field41574 = false;
                     if (!Objects.equals(this.field41576, var1)) {
                        field41569.warn("Mismatch in destroy block pos: " + this.field41576 + " " + var1);
                        this.field41570.method6803(this.field41571.method3205(), this.field41576, -1);
                        this.field41571
                           .field4855
                           .method15671(
                              new Class5585(this.field41576, this.field41570.method6738(this.field41576), var2, true, "aborted mismatched destroying")
                           );
                     }

                     this.field41570.method6803(this.field41571.method3205(), var1, -1);
                     this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, true, "aborted destroying"));
                  }
               } else {
                  if (var1.equals(this.field41576)) {
                     int var15 = this.field41577 - this.field41575;
                     Class7380 var16 = this.field41570.method6738(var1);
                     if (!var16.method23393()) {
                        float var17 = var16.method23406(this.field41571, this.field41571.field5024, var1) * (float)(var15 + 1);
                        if (var17 >= 0.7F) {
                           this.field41574 = false;
                           this.field41570.method6803(this.field41571.method3205(), var1, -1);
                           this.method33869(var1, var2, "destroyed");
                           return;
                        }

                        if (!this.field41578) {
                           this.field41574 = false;
                           this.field41578 = true;
                           this.field41579 = var1;
                           this.field41580 = this.field41575;
                        }
                     }
                  }

                  this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, true, "stopped destroying"));
               }
            } else {
               if (!this.field41570.method6785(this.field41571, var1)) {
                  this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, false, "may not interact"));
                  return;
               }

               if (this.method33866()) {
                  this.method33869(var1, var2, "creative destroy");
                  return;
               }

               if (this.field41571.method2848(this.field41570, var1, this.field41572)) {
                  this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, false, "block action restricted"));
                  return;
               }

               this.field41575 = this.field41577;
               float var18 = 1.0F;
               Class7380 var19 = this.field41570.method6738(var1);
               if (!var19.method23393()) {
                  var19.method23436(this.field41570, var1, this.field41571);
                  var18 = var19.method23406(this.field41571, this.field41571.field5024, var1);
               }

               if (!var19.method23393() && var18 >= 1.0F) {
                  this.method33869(var1, var2, "insta mine");
               } else {
                  if (this.field41574) {
                     this.field41571
                        .field4855
                        .method15671(
                           new Class5585(
                              this.field41576,
                              this.field41570.method6738(this.field41576),
                              Class2070.field13484,
                              false,
                              "abort destroying since another started (client insta mine, server disagreed)"
                           )
                        );
                  }

                  this.field41574 = true;
                  this.field41576 = var1.method8353();
                  int var20 = (int)(var18 * 10.0F);
                  this.field41570.method6803(this.field41571.method3205(), var1, var20);
                  this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, true, "actual start of destroying"));
                  this.field41581 = var20;
               }
            }
         } else {
            this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, false, "too high"));
         }
      } else {
         this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, false, "too far"));
      }
   }

   public void method33869(BlockPos var1, Class2070 var2, String var3) {
      if (!this.method33870(var1)) {
         this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, false, var3));
      } else {
         this.field41571.field4855.method15671(new Class5585(var1, this.field41570.method6738(var1), var2, true, var3));
      }
   }

   public boolean method33870(BlockPos var1) {
      Class7380 var4 = this.field41570.method6738(var1);
      if (!this.field41571.method3090().method32107().method11706(var4, this.field41570, var1, this.field41571)) {
         return false;
      } else {
         Class944 var5 = this.field41570.method6759(var1);
         Block var6 = var4.method23383();
         if ((var6 instanceof Class3355 || var6 instanceof Class3367 || var6 instanceof Class3249) && !this.field41571.method2979()) {
            this.field41570.method6731(var1, var4, var4, 3);
            return false;
         } else if (!this.field41571.method2848(this.field41570, var1, this.field41572)) {
            var6.method11574(this.field41570, var1, var4, this.field41571);
            boolean var7 = this.field41570.method6728(var1, false);
            if (var7) {
               var6.method11551(this.field41570, var1, var4);
            }

            if (!this.method33866()) {
               Class8848 var8 = this.field41571.method3090();
               Class8848 var9 = var8.method32126();
               boolean var10 = this.field41571.method2884(var4);
               var8.method32123(this.field41570, var4, var1, this.field41571);
               if (var7 && var10) {
                  var6.method11562(this.field41570, this.field41571, var1, var4, var5, var9);
               }

               return true;
            } else {
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public Class2274 method33859(Class878 var1, Class1655 var2, Class8848 var3, Class79 var4) {
      if (this.field41572 != Class1894.field11105) {
         if (!var1.method2976().method19635(var3.method32107())) {
            int var7 = var3.method32179();
            int var8 = var3.method32117();
            Class6794 var9 = var3.method32110(var2, var1, var4);
            Class8848 var10 = (Class8848)var9.method20695();
            if (var10 == var3 && var10.method32179() == var7 && var10.method32137() <= 0 && var10.method32117() == var8) {
               return var9.method20694();
            } else if (var9.method20694() == Class2274.field14821 && var10.method32137() > 0 && !var1.method3148()) {
               return var9.method20694();
            } else {
               var1.method3095(var4, var10);
               if (this.method33866()) {
                  var10.method32180(var7);
                  if (var10.method32115() && var10.method32117() != var8) {
                     var10.method32118(var8);
                  }
               }

               if (var10.method32105()) {
                  var1.method3095(var4, Class8848.field39973);
               }

               if (!var1.method3148()) {
                  var1.method2771(var1.field4904);
               }

               return var9.method20694();
            }
         } else {
            return Class2274.field14820;
         }
      } else {
         return Class2274.field14820;
      }
   }

   public Class2274 method33860(Class878 var1, Class1655 var2, Class8848 var3, Class79 var4, Class8711 var5) {
      BlockPos var8 = var5.method31423();
      Class7380 var9 = var2.method6738(var8);
      if (this.field41572 == Class1894.field11105) {
         Class949 var16 = var9.method23445(var2, var8);
         if (var16 == null) {
            return Class2274.field14820;
         } else {
            var1.method2766(var16);
            return Class2274.field14818;
         }
      } else {
         boolean var10 = !var1.method3090().method32105() || !var1.method3091().method32105();
         boolean var11 = var1.method2851() && var10;
         Class8848 var12 = var3.method32126();
         if (!var11) {
            Class2274 var13 = var9.method23435(var2, var1, var4, var5);
            if (var13.method9000()) {
               Class9551.field44503.method15155(var1, var8, var12);
               return var13;
            }
         }

         if (!var3.method32105() && !var1.method2976().method19635(var3.method32107())) {
            Class5911 var17 = new Class5911(var1, var4, var5);
            Class2274 var14;
            if (!this.method33866()) {
               var14 = var3.method32108(var17);
            } else {
               int var15 = var3.method32179();
               var14 = var3.method32108(var17);
               var3.method32180(var15);
            }

            if (var14.method9000()) {
               Class9551.field44503.method15155(var1, var8, var12);
            }

            return var14;
         } else {
            return Class2274.field14820;
         }
      }
   }

   public void method33871(Class1657 var1) {
      this.field41570 = var1;
   }
}