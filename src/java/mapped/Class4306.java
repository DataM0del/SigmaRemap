package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4306 extends Class4305 {
   private static String[] field20927;
   public float field20928;
   public float field20929;
   public float field20930;
   public float field20931;
   public float field20932 = -9999.0F;
   public float field20933 = -9999.0F;
   public float field20934;
   public int field20935 = 0;
   public int field20936;
   public int field20937;
   public int field20938 = 114;

   public Class4306(Class4305 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var5);
      this.field20928 = this.field20930 = (float)var6;
      this.field20929 = this.field20931 = (float)var7;
      this.field20932 = (float)var3;
      this.field20933 = (float)var4;
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.field20932 == -9999.0F || this.field20933 == -9999.0F) {
         this.field20932 = (float)this.field20895;
         this.field20933 = (float)this.field20896;
      }

      this.field20932 = this.field20932 + this.field20928 * Class4310.field20982;
      this.field20933 = this.field20933 + this.field20929 * Class4310.field20982;
      this.field20895 = Math.round(this.field20932);
      this.field20896 = Math.round(this.field20933);
      if (!(this.field20932 + (float)this.field20897 < 0.0F)) {
         if (this.field20932 > (float) Minecraft.getInstance().field1283.method8043()) {
            this.field20932 = (float)(0 - this.field20897);
         }
      } else {
         this.field20932 = (float) Minecraft.getInstance().field1283.method8043();
      }

      if (!(this.field20933 + (float)this.field20898 < 0.0F)) {
         if (this.field20933 > (float) Minecraft.getInstance().field1283.method8044()) {
            this.field20933 = (float)(0 - this.field20898);
         }
      } else {
         this.field20933 = (float) Minecraft.getInstance().field1283.method8044();
      }

      float var5 = (float)(var1 - this.method13271());
      float var6 = (float)(var2 - this.method13272());
      this.field20934 = (float)(1.0 - Math.sqrt((double)(var5 * var5 + var6 * var6)) / (double)this.field20938);
      if (!(Math.sqrt((double)(var5 * var5 + var6 * var6)) < (double)this.field20938)) {
         this.field20928 = this.field20928 - (this.field20928 - this.field20930) * 0.05F * Class4310.field20982;
         this.field20929 = this.field20929 - (this.field20929 - this.field20931) * 0.05F * Class4310.field20982;
      } else {
         float var7 = this.field20932 - (float)var1;
         float var8 = this.field20933 - (float)var2;
         float var9 = (float)Math.sqrt((double)(var7 * var7 + var8 * var8));
         float var10 = var9 / 2.0F;
         float var11 = var7 / var10;
         float var12 = var8 / var10;
         this.field20928 = this.field20928 + var11 / (1.0F + this.field20934) * Class4310.field20982;
         this.field20929 = this.field20929 + var12 / (1.0F + this.field20934) * Class4310.field20982;
      }

      this.field20936 = var1;
      this.field20937 = var2;
   }

   @Override
   public void method13027(float var1) {
      float var4 = 0.07F;
      float var5 = 0.3F;
      Class3192.method11436(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.method13267(),
         Class5628.method17688(Class1979.field12896.field12910, 0.07F + (!(this.field20934 > 0.0F) ? 0.0F : this.field20934 * 0.3F))
      );
      float var6 = (float)(this.field20936 - this.method13271());
      float var7 = (float)(this.field20937 - this.method13272());
      super.method13027(var1);
   }
}