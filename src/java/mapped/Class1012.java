package mapped;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class Class1012 extends Class1013 implements Class1011 {
   private static final Class9289<Boolean> field5656 = Class9361.<Boolean>method35441(Class1012.class, Class7784.field33398);
   private static final Class9289<Integer> field5657 = Class9361.<Integer>method35441(Class1012.class, Class7784.field33391);
   private static final Class9289<Integer> field5658 = Class9361.<Integer>method35441(Class1012.class, Class7784.field33391);
   public static final Predicate<Class880> field5659 = var0 -> {
      Class8992 var3 = var0.method3204();
      return var3 == Class8992.field41074 || var3 == Class8992.field41071 || var3 == Class8992.field41033;
   };
   private float field5660;
   private float field5661;
   private boolean field5662;
   private boolean field5663;
   private float field5664;
   private float field5665;
   private static final Class8369 field5666 = Class8763.method31620(20, 39);
   private UUID field5667;

   public Class1012(Class8992<? extends Class1012> var1, Class1655 var2) {
      super(var1, var2);
      this.method4379(false);
   }

   @Override
   public void method4219() {
      this.field5600.method20002(1, new Class2603(this));
      this.field5600.method20002(2, new Class2778(this));
      this.field5600.method20002(3, new Class2773(this, Class1064.class, 24.0f, 1.5, 1.5));
      this.field5600.method20002(4, new Class2745(this, 0.4F));
      this.field5600.method20002(5, new Class2647(this, 1.0, true));
      this.field5600.method20002(6, new Class2725(this, 1.0, 10.0F, 2.0F, false));
      this.field5600.method20002(7, new Class2785(this, 1.0));
      this.field5600.method20002(8, new Class2737(this, 1.0));
      this.field5600.method20002(9, new Class2618(this, 8.0F));
      this.field5600.method20002(10, new Class2612(this, PlayerEntity.class, 8.0F));
      this.field5600.method20002(10, new Class2668(this));
      this.field5601.method20002(1, new Class2702(this));
      this.field5601.method20002(2, new Class2703(this));
      this.field5601.method20002(3, new Class2704(this).method10918());
      this.field5601.method20002(4, new Class2709<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method4367));
      this.field5601.method20002(5, new Class2716<Class1018>(this, Class1018.class, false, field5659));
      this.field5601.method20002(6, new Class2716<Class1088>(this, Class1088.class, false, Class1088.field5963));
      this.field5601.method20002(7, new Class2709<Class1082>(this, Class1082.class, false));
      this.field5601.method20002(8, new Class2779<Class1012>(this, true));
   }

   public static Class7037 method4373() {
      return Class1006.method4220().method21849(Class9173.field42108, 0.3F).method21849(Class9173.field42105, 8.0).method21849(Class9173.field42110, 2.0);
   }

   @Override
   public void method2850() {
      super.method2850();
      this.field5063.method35442(field5656, false);
      this.field5063.method35442(field5657, Class112.field400.method309());
      this.field5063.method35442(field5658, 0);
   }

   @Override
   public void method3241(BlockPos var1, Class7380 var2) {
      this.method2863(Class6067.field27256, 0.15F, 1.0F);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method100("CollarColor", (byte)this.method4382().method309());
      this.method4364(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("CollarColor", 99)) {
         this.method4383(Class112.method315(var1.method122("CollarColor")));
      }

      this.method4365((Class1657)this.field5024, var1);
   }

   @Override
   public Class9455 method4241() {
      if (!this.method4369()) {
         if (this.field5054.nextInt(3) != 0) {
            return Class6067.field27249;
         } else {
            return this.method4393() && this.method3042() < 10.0F ? Class6067.field27257 : Class6067.field27254;
         }
      } else {
         return Class6067.field27251;
      }
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field27253;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field27250;
   }

   @Override
   public float method3099() {
      return 0.4F;
   }

   @Override
   public void method2871() {
      super.method2871();
      if (!this.field5024.field9020 && this.field5662 && !this.field5663 && !this.method4772() && this.field5036) {
         this.field5663 = true;
         this.field5664 = 0.0F;
         this.field5665 = 0.0F;
         this.field5024.method6786(this, (byte)8);
      }

      if (!this.field5024.field9020) {
         this.method4366((Class1657)this.field5024, true);
      }
   }

   @Override
   public void tick() {
      super.tick();
      if (this.method3066()) {
         this.field5661 = this.field5660;
         if (!this.method4387()) {
            this.field5660 = this.field5660 + (0.0F - this.field5660) * 0.4F;
         } else {
            this.field5660 = this.field5660 + (1.0F - this.field5660) * 0.4F;
         }

         if (!this.method3254()) {
            if ((this.field5662 || this.field5663) && this.field5663) {
               if (this.field5664 == 0.0F) {
                  this.method2863(Class6067.field27255, this.method3099(), (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.2F + 1.0F);
               }

               this.field5665 = this.field5664;
               this.field5664 += 0.05F;
               if (this.field5665 >= 2.0F) {
                  this.field5662 = false;
                  this.field5663 = false;
                  this.field5665 = 0.0F;
                  this.field5664 = 0.0F;
               }

               if (this.field5664 > 0.4F) {
                  float var3 = (float)this.getPosY();
                  int var4 = (int)(Class9679.method37763((this.field5664 - 0.4F) * (float) Math.PI) * 7.0F);
                  Vector3d var5 = this.method3433();

                  for (int var6 = 0; var6 < var4; var6++) {
                     float var7 = (this.field5054.nextFloat() * 2.0F - 1.0F) * this.method3429() * 0.5F;
                     float var8 = (this.field5054.nextFloat() * 2.0F - 1.0F) * this.method3429() * 0.5F;
                     this.field5024
                        .method6746(
                           Class7940.field34099,
                           this.getPosX() + (double)var7,
                           (double)(var3 + 0.8F),
                           this.getPosZ() + (double)var8,
                           var5.field18048,
                           var5.field18049,
                           var5.field18050
                        );
                  }
               }
            }
         } else {
            this.field5662 = true;
            if (this.field5663 && !this.field5024.field9020) {
               this.field5024.method6786(this, (byte)56);
               this.method4374();
            }
         }
      }
   }

   private void method4374() {
      this.field5663 = false;
      this.field5664 = 0.0F;
      this.field5665 = 0.0F;
   }

   @Override
   public void method2737(Class8654 var1) {
      this.field5662 = false;
      this.field5663 = false;
      this.field5665 = 0.0F;
      this.field5664 = 0.0F;
      super.method2737(var1);
   }

   public boolean method4375() {
      return this.field5662;
   }

   public float method4376(float var1) {
      return Math.min(0.5F + Class9679.method37821(var1, this.field5665, this.field5664) / 2.0F * 0.5F, 1.0F);
   }

   public float method4377(float var1, float var2) {
      float var5 = (Class9679.method37821(var1, this.field5665, this.field5664) + var2) / 1.8F;
      if (!(var5 < 0.0F)) {
         if (var5 > 1.0F) {
            var5 = 1.0F;
         }
      } else {
         var5 = 0.0F;
      }

      return Class9679.method37763(var5 * (float) Math.PI) * Class9679.method37763(var5 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float method4378(float var1) {
      return Class9679.method37821(var1, this.field5661, this.field5660) * 0.15F * (float) Math.PI;
   }

   @Override
   public float method2957(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.8F;
   }

   @Override
   public int method4259() {
      return !this.method4395() ? super.method4259() : 20;
   }

   @Override
   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         Entity var5 = var1.method31109();
         this.method4403(false);
         if (var5 != null && !(var5 instanceof PlayerEntity) && !(var5 instanceof Class884)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.method2741(var1, var2);
      } else {
         return false;
      }
   }

   @Override
   public boolean method3114(Entity var1) {
      boolean var4 = var1.method2741(Class8654.method31115(this), (float)((int)this.method3086(Class9173.field42110)));
      if (var4) {
         this.method3399(this, var1);
      }

      return var4;
   }

   @Override
   public void method4379(boolean var1) {
      super.method4379(var1);
      if (!var1) {
         this.method3085(Class9173.field42105).method38661(8.0);
      } else {
         this.method3085(Class9173.field42105).method38661(20.0);
         this.method3043(20.0F);
      }

      this.method3085(Class9173.field42110).method38661(4.0);
   }

   @Override
   public Class2274 method4285(PlayerEntity var1, Class79 var2) {
      Class8848 var5 = var1.method3094(var2);
      Class3257 var6 = var5.method32107();
      if (!this.field5024.field9020) {
         if (!this.method4393()) {
            if (var6 == Class8514.field37935 && !this.method4369()) {
               if (!var1.field4919.field29609) {
                  var5.method32182(1);
               }

               if (this.field5054.nextInt(3) != 0) {
                  this.field5024.method6786(this, (byte)6);
               } else {
                  this.method4399(var1);
                  this.field5599.method21666();
                  this.method4233((Class880)null);
                  this.method4403(true);
                  this.field5024.method6786(this, (byte)7);
               }

               return Class2274.field14818;
            }
         } else {
            if (this.method4381(var5) && this.method3042() < this.method3075()) {
               if (!var1.field4919.field29609) {
                  var5.method32182(1);
               }

               this.method3041((float)var6.method11745().method36157());
               return Class2274.field14818;
            }

            if (!(var6 instanceof Class3321)) {
               Class2274 var9 = super.method4285(var1, var2);
               if ((!var9.method9000() || this.method3005()) && this.method4401(var1)) {
                  this.method4403(!this.method4402());
                  this.field4981 = false;
                  this.field5599.method21666();
                  this.method4233((Class880)null);
                  return Class2274.field14818;
               }

               return var9;
            }

            Class112 var8 = ((Class3321)var6).method11876();
            if (var8 != this.method4382()) {
               this.method4383(var8);
               if (!var1.field4919.field29609) {
                  var5.method32182(1);
               }

               return Class2274.field14818;
            }
         }

         return super.method4285(var1, var2);
      } else {
         boolean var7 = this.method4401(var1) || this.method4393() || var6 == Class8514.field37935 && !this.method4393() && !this.method4369();
         return !var7 ? Class2274.field14820 : Class2274.field14819;
      }
   }

   @Override
   public void method2866(byte var1) {
      if (var1 != 8) {
         if (var1 != 56) {
            super.method2866(var1);
         } else {
            this.method4374();
         }
      } else {
         this.field5663 = true;
         this.field5664 = 0.0F;
         this.field5665 = 0.0F;
      }
   }

   public float method4380() {
      if (!this.method4369()) {
         return !this.method4393() ? (float) (Math.PI / 5) : (0.55F - (this.method3075() - this.method3042()) * 0.02F) * (float) Math.PI;
      } else {
         return 1.5393804F;
      }
   }

   @Override
   public boolean method4381(Class8848 var1) {
      Class3257 var4 = var1.method32107();
      return var4.method11744() && var4.method11745().method36159();
   }

   @Override
   public int method4267() {
      return 8;
   }

   @Override
   public int method4348() {
      return this.field5063.<Integer>method35445(field5658);
   }

   @Override
   public void method4347(int var1) {
      this.field5063.method35446(field5658, var1);
   }

   @Override
   public void method4346() {
      this.method4347(field5666.method29319(this.field5054));
   }

   @Nullable
   @Override
   public UUID method4350() {
      return this.field5667;
   }

   @Override
   public void method4349(UUID var1) {
      this.field5667 = var1;
   }

   public Class112 method4382() {
      return Class112.method315(this.field5063.<Integer>method35445(field5657));
   }

   public void method4383(Class112 var1) {
      this.field5063.method35446(field5657, var1.method309());
   }

   public Class1012 method4389(Class1657 var1, Class1045 var2) {
      Class1012 var5 = Class8992.field41105.method33215(var1);
      UUID var6 = this.method4397();
      if (var6 != null) {
         var5.method4398(var6);
         var5.method4379(true);
      }

      return var5;
   }

   public void method4385(boolean var1) {
      this.field5063.method35446(field5656, var1);
   }

   @Override
   public boolean method4386(Class1018 var1) {
      if (var1 == this) {
         return false;
      } else if (this.method4393()) {
         if (!(var1 instanceof Class1012)) {
            return false;
         } else {
            Class1012 var4 = (Class1012)var1;
            if (var4.method4393()) {
               return var4.method4395() ? false : this.method4507() && var4.method4507();
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean method4387() {
      return this.field5063.<Boolean>method35445(field5656);
   }

   @Override
   public boolean method4388(Class880 var1, Class880 var2) {
      if (var1 instanceof Class1081 || var1 instanceof Class1112) {
         return false;
      } else if (!(var1 instanceof Class1012)) {
         if (var1 instanceof PlayerEntity && var2 instanceof PlayerEntity && !((PlayerEntity)var2).method2742((PlayerEntity)var1)) {
            return false;
         } else {
            return var1 instanceof Class1068 && ((Class1068)var1).method4932() ? false : !(var1 instanceof Class1013) || !((Class1013)var1).method4393();
         }
      } else {
         Class1012 var5 = (Class1012)var1;
         return !var5.method4393() || var5.method4400() != var2;
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return !this.method4369() && super.method4295(var1);
   }

   @Override
   public Vector3d method3394() {
      return new Vector3d(0.0, (double)(0.6F * this.method3393()), (double)(this.method3429() * 0.4F));
   }

   // $VF: synthetic method
   public static Random method4391(Class1012 var0) {
      return var0.field5054;
   }

   public class Class2773<T extends Class880> extends Class2770<T> {
      private final Class1012 field17362;

      public Class2773(Class1012 var1, Class<T> var2, float var3, double var4, double var5) {
         super(var1, var2, var3, var4, var5);
         this.field17362 = var1;
      }

      @Override
      public boolean method10803() {
         return super.method10803() && this.field17352 instanceof Class1064
            ? !this.field17362.method4393() && this.method10966((Class1064)this.field17352)
            : false;
      }

      private boolean method10966(Class1064 var1) {
         return var1.method4887() >= method4391(Class1012.this).nextInt(5);
      }

      @Override
      public void method10804() {
         Class1012.this.method4233(null);
         super.method10804();
      }

      @Override
      public void method10805() {
         Class1012.this.method4233(null);
         super.method10805();
      }
   }
}