package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Arrays;

public class Class931 extends Class932 implements Class930, Class935 {
   private static final int[] field5270 = new int[]{3};
   private static final int[] field5271 = new int[]{0, 1, 2, 3};
   private static final int[] field5272 = new int[]{0, 1, 2, 4};
   private Class25<Class8848> field5273 = Class25.<Class8848>method68(5, Class8848.field39973);
   private int field5274;
   private boolean[] field5275;
   private Class3257 field5276;
   private int field5277;
   public final Class8202 field5278 = new Class8203(this);

   public Class931() {
      super(Class4387.field21431);
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.brewing");
   }

   @Override
   public int method3629() {
      return this.field5273.size();
   }

   @Override
   public boolean method3617() {
      for (Class8848 var4 : this.field5273) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void method3647() {
      Class8848 var3 = this.field5273.get(4);
      if (this.field5277 <= 0 && var3.method32107() == Class8514.field37975) {
         this.field5277 = 20;
         var3.method32182(1);
         this.method3622();
      }

      boolean var4 = this.method3688();
      boolean var5 = this.field5274 > 0;
      Class8848 var6 = this.field5273.get(3);
      if (!var5) {
         if (var4 && this.field5277 > 0) {
            this.field5277--;
            this.field5274 = 400;
            this.field5276 = var6.method32107();
            this.method3622();
         }
      } else {
         this.field5274--;
         boolean var7 = this.field5274 == 0;
         if (var7 && var4) {
            this.method3689();
            this.method3622();
         } else if (var4) {
            if (this.field5276 != var6.method32107()) {
               this.field5274 = 0;
               this.method3622();
            }
         } else {
            this.field5274 = 0;
            this.method3622();
         }
      }

      if (!this.field5324.field9020) {
         boolean[] var10 = this.method3687();
         if (!Arrays.equals(var10, this.field5275)) {
            this.field5275 = var10;
            Class7380 var8 = this.field5324.method6738(this.method3774());
            if (!(var8.method23383() instanceof Class3376)) {
               return;
            }

            for (int var9 = 0; var9 < Class3376.field18975.length; var9++) {
               var8 = var8.method23465(Class3376.field18975[var9], Boolean.valueOf(var10[var9]));
            }

            this.field5324.method6725(this.field5325, var8, 2);
         }
      }
   }

   public boolean[] method3687() {
      boolean[] var3 = new boolean[3];

      for (int var4 = 0; var4 < 3; var4++) {
         if (!this.field5273.get(var4).method32105()) {
            var3[var4] = true;
         }
      }

      return var3;
   }

   private boolean method3688() {
      Class8848 var3 = this.field5273.get(3);
      if (!var3.method32105()) {
         if (Class7105.method22132(var3)) {
            for (int var4 = 0; var4 < 3; var4++) {
               Class8848 var5 = this.field5273.get(var4);
               if (!var5.method32105() && Class7105.method22136(var5, var3)) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method3689() {
      Class8848 var3 = this.field5273.get(3);

      for (int var4 = 0; var4 < 3; var4++) {
         this.field5273.set(var4, Class7105.method22139(var3, this.field5273.get(var4)));
      }

      var3.method32182(1);
      BlockPos var6 = this.method3774();
      if (var3.method32107().method11723()) {
         Class8848 var5 = new Class8848(var3.method32107().method11722());
         if (!var3.method32105()) {
            if (!this.field5324.field9020) {
               Class7236.method22725(this.field5324, (double)var6.method8304(), (double)var6.getY(), (double)var6.method8306(), var5);
            }
         } else {
            var3 = var5;
         }
      }

      this.field5273.set(3, var3);
      this.field5324.method6999(1035, var6, 0);
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5273 = Class25.<Class8848>method68(this.method3629(), Class8848.field39973);
      Class7920.method26567(var2, this.field5273);
      this.field5274 = var2.method121("BrewTime");
      this.field5277 = var2.method120("Fuel");
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      var1.method101("BrewTime", (short)this.field5274);
      Class7920.method26565(var1, this.field5273);
      var1.method100("Fuel", (byte)this.field5277);
      return var1;
   }

   @Override
   public Class8848 method3618(int var1) {
      return var1 >= 0 && var1 < this.field5273.size() ? this.field5273.get(var1) : Class8848.field39973;
   }

   @Override
   public Class8848 method3619(int var1, int var2) {
      return Class7920.method26563(this.field5273, var1, var2);
   }

   @Override
   public Class8848 method3620(int var1) {
      return Class7920.method26564(this.field5273, var1);
   }

   @Override
   public void method3621(int var1, Class8848 var2) {
      if (var1 >= 0 && var1 < this.field5273.size()) {
         this.field5273.set(var1, var2);
      }
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return this.field5324.method6759(this.field5325) == this
         ? !(
            var1.method3276((double)this.field5325.method8304() + 0.5, (double)this.field5325.getY() + 0.5, (double)this.field5325.method8306() + 0.5)
               > 64.0
         )
         : false;
   }

   @Override
   public boolean method3633(int var1, Class8848 var2) {
      if (var1 != 3) {
         Class3257 var5 = var2.method32107();
         return var1 == 4
            ? var5 == Class8514.field37975
            : (var5 == Class8514.field37971 || var5 == Class8514.field38115 || var5 == Class8514.field38118 || var5 == Class8514.field37972)
               && this.method3618(var1).method32105();
      } else {
         return Class7105.method22132(var2);
      }
   }

   @Override
   public int[] method3653(Direction var1) {
      if (var1 != Direction.field673) {
         return var1 != Direction.field672 ? field5272 : field5271;
      } else {
         return field5270;
      }
   }

   @Override
   public boolean method3654(int var1, Class8848 var2, Direction var3) {
      return this.method3633(var1, var2);
   }

   @Override
   public boolean method3655(int var1, Class8848 var2, Direction var3) {
      return var1 != 3 ? true : var2.method32107() == Class8514.field37972;
   }

   @Override
   public void method3625() {
      this.field5273.clear();
   }

   @Override
   public Class5812 method3690(int var1, Class974 var2) {
      return new Class5819(var1, var2, this, this.field5278);
   }

   // $VF: synthetic method
   public static int method3691(Class931 var0) {
      return var0.field5274;
   }

   // $VF: synthetic method
   public static int method3692(Class931 var0) {
      return var0.field5277;
   }

   // $VF: synthetic method
   public static int method3693(Class931 var0, int var1) {
      return var0.field5274 = var1;
   }

   // $VF: synthetic method
   public static int method3694(Class931 var0, int var1) {
      return var0.field5277 = var1;
   }
}