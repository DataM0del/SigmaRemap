package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.awt.Color;

public class Class4252 extends Class4247 {
   public int field20618;
   public boolean field20619;
   public Class4367 field20620;
   public Class4264 field20621;
   public Class4371 field20622;

   public Class4252(Class4305 var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20618 = var7;
      Color var11 = new Color(var7);
      float[] var12 = Color.RGBtoHSB(var11.getRed(), var11.getGreen(), var11.getBlue(), null);
      this.method13230(this.field20620 = new Class4367(this, "block", 10, 10, var5 - 20, var6 - 50, var12[0], var12[1], var12[2]));
      this.method13230(this.field20621 = new Class4264(this, "slider", 14, var6 - 25, var5 - 65, 8, var12[0]));
      this.method13230(this.field20622 = new Class4371(this, "bubble", var5 - 40, var6 - 32, 25, 25, var11.getRGB()));
      this.field20620.method13036(var1x -> this.method13050());
      this.field20621.method13036(var1x -> this.method13050());
      this.field20622.method13251((var1x, var2x) -> this.method13045(!this.method13047()));
      this.field20619 = var8;
   }

   public void method13045(boolean var1) {
      this.method13046(var1);
      this.method13037();
   }

   public void method13046(boolean var1) {
      this.field20619 = var1;
   }

   public boolean method13047() {
      return this.field20619;
   }

   public void method13048(int var1) {
      if (var1 != this.field20618) {
         Color var4 = new Color(var1);
         float[] var5 = Color.RGBtoHSB(var4.getRed(), var4.getGreen(), var4.getBlue(), null);
         this.field20620.method13678(var5[0]);
         this.field20620.method13681(var5[1], false);
         this.field20620.method13684(var5[2], false);
         this.field20621.method13098(var5[0], false);
         this.field20622.field21365 = var1;
      }
   }

   public int method13049() {
      return this.field20618;
   }

   private void method13050() {
      this.method13051();
      this.method13037();
   }

   private void method13051() {
      float var3 = this.field20621.method13096();
      this.field20620.method13678(var3);
      this.field20618 = this.field20620.method13685();
      this.field20622.field21365 = this.field20618;
   }

   public static void method13052(int var0, int var1, int var2, float var3) {
      byte var6 = 14;
      Class3192.method11438((float)var0, (float)var1, (float)var6, Class5628.method17688(Class1979.field12891.field12910, 0.1F * var3));
      Class3192.method11438((float)var0, (float)var1, (float)(var6 - 1), Class5628.method17688(Class1979.field12891.field12910, 0.14F * var3));
      Class3192.method11438((float)var0, (float)var1, (float)(var6 - 2), Class5628.method17688(Class1979.field12896.field12910, var3));
      Class3192.method11438(
         (float)var0, (float)var1, (float)(var6 - 6), Class5628.method17688(Class5628.method17690(var2, Class1979.field12891.field12910, 0.7F), var3)
      );
      Class3192.method11438((float)var0, (float)var1, (float)(var6 - 7), Class5628.method17688(var2, var3));
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      if (this.field20619) {
         this.field20621.method13098((float)(System.currentTimeMillis() % 4000L) / 4000.0F, false);
         this.method13051();
      }

      super.method13027(var1);
   }
}