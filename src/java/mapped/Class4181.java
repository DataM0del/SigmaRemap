package mapped;

import java.util.Random;

public class Class4181 extends Class4180 {
   private final Class80 field20447;
   private final ResourceLocation field20456;
   private final boolean field20457;

   public Class4181(Class8761 var1, ResourceLocation var2, BlockPos var3, Class80 var4, boolean var5) {
      super(Class7792.field33478, 0);
      this.field20455 = var3;
      this.field20447 = var4;
      this.field20456 = var2;
      this.field20457 = var5;
      this.method12945(var1);
   }

   public Class4181(Class8761 var1, Class39 var2) {
      super(Class7792.field33478, var2);
      this.field20456 = new ResourceLocation(var2.method126("Template"));
      this.field20457 = var2.method132("isBeached");
      this.field20447 = Class80.valueOf(var2.method126("Rot"));
      this.method12945(var1);
   }

   @Override
   public void method12897(Class39 var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20456.toString());
      var1.method115("isBeached", this.field20457);
      var1.method109("Rot", this.field20447.name());
   }

   private void method12945(Class8761 var1) {
      Class8969 var4 = var1.method31603(this.field20456);
      Class9463 var5 = new Class9463()
         .method36426(this.field20447)
         .method36425(Class2089.field13614)
         .method36427(Class8628.method30927())
         .method36434(Class7095.field30528);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
      if (!"map_chest".equals(var1)) {
         if (!"treasure_chest".equals(var1)) {
            if ("supply_chest".equals(var1)) {
               Class939.method3740(var3, var4, var2.method8313(), Class8793.field39567);
            }
         } else {
            Class939.method3740(var3, var4, var2.method8313(), Class8793.field39568);
         }
      } else {
         Class939.method3740(var3, var4, var2.method8313(), Class8793.field39566);
      }
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, Class5646 var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      int var10 = 256;
      int var11 = 0;
      BlockPos var12 = this.field20453.method32886();
      Class101 var13 = !this.field20457 ? Class101.field297 : Class101.field295;
      int var14 = var12.method8304() * var12.method8306();
      if (var14 != 0) {
         BlockPos var15 = this.field20455.method8336(var12.method8304() - 1, 0, var12.method8306() - 1);

         for (BlockPos var17 : BlockPos.method8359(this.field20455, var15)) {
            int var18 = var1.method6736(var13, var17.method8304(), var17.method8306());
            var11 += var18;
            var10 = Math.min(var10, var18);
         }

         var11 /= var14;
      } else {
         var11 = var1.method6736(var13, this.field20455.method8304(), this.field20455.method8306());
      }

      int var20 = !this.field20457 ? var11 : var10 - var12.getY() / 2 - var4.nextInt(3);
      this.field20455 = new BlockPos(this.field20455.method8304(), var20, this.field20455.method8306());
      return super.method12896(var1, var2, var3, var4, var5, var6, var7);
   }
}