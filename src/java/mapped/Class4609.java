package mapped;

public class Class4609 extends Class4566 {
   private static String[] field22116;
   private final Class7380 field22117;
   private BlockPos field22118;
   private final float field22119;
   private final float field22120;

   public Class4609(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12, Class7380 var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field22117 = var14;
      this.method14502(Minecraft.getInstance().method1553().method806().method38152(var14));
      this.field22057 = 1.0F;
      this.field22058 = 0.6F;
      this.field22059 = 0.6F;
      this.field22060 = 0.6F;
      this.field22035 /= 2.0F;
      this.field22119 = this.field22054.nextFloat() * 3.0F;
      this.field22120 = this.field22054.nextFloat() * 3.0F;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29734;
   }

   public Class4609 method14540(BlockPos var1) {
      this.field22118 = var1;
      if (!this.field22117.method23448(Blocks.field36395)) {
         this.method14542(var1);
         return this;
      } else {
         return this;
      }
   }

   public Class4609 method14541() {
      this.field22118 = new BlockPos(this.field22041, this.field22042, this.field22043);
      if (!this.field22117.method23448(Blocks.field36395)) {
         this.method14542(this.field22118);
         return this;
      } else {
         return this;
      }
   }

   public void method14542(BlockPos var1) {
      int var4 = Minecraft.getInstance().method1564().method29465(this.field22117, this.field22037, var1, 0);
      this.field22058 *= (float)(var4 >> 16 & 0xFF) / 255.0F;
      this.field22059 *= (float)(var4 >> 8 & 0xFF) / 255.0F;
      this.field22060 *= (float)(var4 & 0xFF) / 255.0F;
   }

   @Override
   public float method14503() {
      return this.field22004.method7461((double)((this.field22119 + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public float method14504() {
      return this.field22004.method7461((double)(this.field22119 / 4.0F * 16.0F));
   }

   @Override
   public float method14505() {
      return this.field22004.method7464((double)(this.field22120 / 4.0F * 16.0F));
   }

   @Override
   public float method14506() {
      return this.field22004.method7464((double)((this.field22120 + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public int method14499(float var1) {
      int var4 = super.method14499(var1);
      int var5 = 0;
      if (this.field22037.method7017(this.field22118)) {
         var5 = Class264.method944(this.field22037, this.field22118);
      }

      return var4 != 0 ? var4 : var5;
   }
}