package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class948 extends Class944 implements Class946, Class949 {
   private final Class920 field5333 = new Class989(this);
   private final Class8202 field5334 = new Class8205(this);
   private Class8848 field5335 = Class8848.field39973;
   private int field5336;
   private int field5337;

   public Class948() {
      super(Class4387.field21449);
   }

   public Class8848 method3805() {
      return this.field5335;
   }

   public boolean method3806() {
      Class3257 var3 = this.field5335.method32107();
      return var3 == Class8514.field38047 || var3 == Class8514.field38048;
   }

   public void method3807(Class8848 var1) {
      this.method3809(var1, (PlayerEntity)null);
   }

   private void method3808() {
      this.field5336 = 0;
      this.field5337 = 0;
      Class3354.method11921(this.method3734(), this.method3774(), this.method3775(), false);
   }

   public void method3809(Class8848 var1, PlayerEntity var2) {
      this.field5335 = this.method3813(var1, var2);
      this.field5336 = 0;
      this.field5337 = Class3285.method11819(this.field5335);
      this.method3622();
   }

   private void method3810(int var1) {
      int var4 = Class9679.method37775(var1, 0, this.field5337 - 1);
      if (var4 != this.field5336) {
         this.field5336 = var4;
         this.method3622();
         Class3354.method11922(this.method3734(), this.method3774(), this.method3775());
      }
   }

   public int method3811() {
      return this.field5336;
   }

   public int method3812() {
      float var3 = this.field5337 <= 1 ? 1.0F : (float)this.method3811() / ((float)this.field5337 - 1.0F);
      return Class9679.method37767(var3 * 14.0F) + (!this.method3806() ? 0 : 1);
   }

   private Class8848 method3813(Class8848 var1, PlayerEntity var2) {
      if (this.field5324 instanceof Class1657 && var1.method32107() == Class8514.field38048) {
         Class3285.method11820(var1, this.method3814(var2), var2);
      }

      return var1;
   }

   private Class6619 method3814(PlayerEntity var1) {
      String var4;
      Object var5;
      if (var1 != null) {
         var4 = var1.method2941().getString();
         var5 = var1.method2954();
      } else {
         var4 = "Lectern";
         var5 = new StringTextComponent("Lectern");
      }

      Vector3d var6 = Vector3d.method11328(this.field5325);
      return new Class6619(
         Class909.field5189, var6, Class8513.field37212, (Class1657)this.field5324, 2, var4, (ITextComponent)var5, this.field5324.method6715(), var1
      );
   }

   @Override
   public boolean method3783() {
      return true;
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      if (!var2.method119("Book", 10)) {
         this.field5335 = Class8848.field39973;
      } else {
         this.field5335 = this.method3813(Class8848.method32104(var2.method130("Book")), (PlayerEntity)null);
      }

      this.field5337 = Class3285.method11819(this.field5335);
      this.field5336 = Class9679.method37775(var2.method122("Page"), 0, this.field5337 - 1);
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      if (!this.method3805().method32105()) {
         var1.method99("Book", this.method3805().method32112(new Class39()));
         var1.method102("Page", this.field5336);
      }

      return var1;
   }

   @Override
   public void method3625() {
      this.method3807(Class8848.field39973);
   }

   @Override
   public Class5812 method3627(int var1, Class974 var2, PlayerEntity var3) {
      return new Class5818(var1, this.field5333, this.field5334);
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.lectern");
   }

   // $VF: synthetic method
   public static Class8848 method3815(Class948 var0) {
      return var0.field5335;
   }

   // $VF: synthetic method
   public static void method3816(Class948 var0) {
      var0.method3808();
   }

   // $VF: synthetic method
   public static Class8848 method3817(Class948 var0, Class8848 var1) {
      return var0.field5335 = var1;
   }

   // $VF: synthetic method
   public static int method3818(Class948 var0) {
      return var0.field5336;
   }

   // $VF: synthetic method
   public static void method3819(Class948 var0, int var1) {
      var0.method3810(var1);
   }
}