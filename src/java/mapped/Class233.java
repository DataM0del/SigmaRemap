package mapped;

public class Class233<T extends Class880, M extends Class2894<T>> extends Class231<T, M> {
   private static final ResourceLocation field879 = new ResourceLocation("textures/entity/bee/bee_stinger.png");

   public Class233(Class5712<T, M> var1) {
      super(var1);
   }

   @Override
   public int method835(T var1) {
      return var1.method3078();
   }

   @Override
   public void method836(Class9332 var1, Class7733 var2, int var3, Entity var4, float var5, float var6, float var7, float var8) {
      float var11 = Class9679.method37765(var5 * var5 + var7 * var7);
      float var12 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      float var13 = (float)(Math.atan2((double)var6, (double)var11) * 180.0F / (float)Math.PI);
      var1.method35291(0.0, 0.0, 0.0);
      var1.method35293(Class7680.field32900.method25286(var12 - 90.0F));
      var1.method35293(Class7680.field32902.method25286(var13));
      float var14 = 0.0F;
      float var15 = 0.125F;
      float var16 = 0.0F;
      float var17 = 0.0625F;
      float var18 = 0.03125F;
      var1.method35293(Class7680.field32898.method25286(45.0F));
      var1.method35292(0.03125F, 0.03125F, 0.03125F);
      var1.method35291(2.5, 0.0, 0.0);
      Class5422 var19 = var2.method25597(Class4520.method14312(field879));

      for (int var20 = 0; var20 < 4; var20++) {
         var1.method35293(Class7680.field32898.method25286(90.0F));
         Class8892 var21 = var1.method35296();
         Class9367 var22 = var21.method32361();
         Class8967 var23 = var21.method32362();
         method837(var19, var22, var23, -4.5F, -1, 0.0F, 0.0F, var3);
         method837(var19, var22, var23, 4.5F, -1, 0.125F, 0.0F, var3);
         method837(var19, var22, var23, 4.5F, 1, 0.125F, 0.0625F, var3);
         method837(var19, var22, var23, -4.5F, 1, 0.0F, 0.0625F, var3);
      }
   }

   private static void method837(Class5422 var0, Class9367 var1, Class8967 var2, float var3, int var4, float var5, float var6, int var7) {
      var0.method17040(var1, var3, (float)var4, 0.0F)
         .method17026(255, 255, 255, 255)
         .method17027(var5, var6)
         .method17035(Class213.field798)
         .method17034(var7)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .method17031();
   }
}