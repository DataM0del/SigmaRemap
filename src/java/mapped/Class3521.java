package mapped;

import javax.annotation.Nullable;

public class Class3521 implements Class3499<Class7439> {
   private static String[] field19415;
   private final Class8975 field19416;

   public Class3521(Class8975 var1) {
      this.field19416 = var1;
   }

   @Nullable
   public Class4587 method12199(Class7439 var1, Class1656 var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      Class7380 var17 = var1.method24026();
      if (!var17.method23393() && var17.method23397() == Class1855.field9885) {
         return null;
      } else {
         BlockPos var18 = new BlockPos(var3, var5, var7);
         int var19 = Minecraft.getInstance().method1564().method29464(var17, var2, var18);
         if (var17.method23383() instanceof Class3213) {
            var19 = ((Class3213)var17.method23383()).method11601(var17, var2, var18);
         }

         float var20 = (float)(var19 >> 16 & 0xFF) / 255.0F;
         float var21 = (float)(var19 >> 8 & 0xFF) / 255.0F;
         float var22 = (float)(var19 & 0xFF) / 255.0F;
         return new Class4612(var2, var3, var5, var7, var20, var21, var22, this.field19416);
      }
   }
}