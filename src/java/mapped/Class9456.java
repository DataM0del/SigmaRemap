package mapped;

import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public final class Class9456 {
   private static String[] field43938;

   public static Class8710 method36385(Entity var0, Predicate<Entity> var1) {
      Vector3d var4 = var0.method3433();
      Class1655 var5 = var0.field5024;
      Vector3d var6 = var0.method3431();
      Vector3d var7 = var6.method11338(var4);
      Object var8 = var5.method7036(new Class6809(var6, var7, Class2271.field14774, Class1985.field12962, var0));
      if (((Class8710)var8).method31417() != Class2100.field13689) {
         var7 = ((Class8710)var8).method31419();
      }

      Class8709 var9 = method36387(var5, var0, var6, var7, var0.method3389().method19661(var0.method3433()).method19664(1.0), var1);
      if (var9 != null) {
         var8 = var9;
      }

      return (Class8710)var8;
   }

   @Nullable
   public static Class8709 method36386(Entity var0, Vector3d var1, Vector3d var2, Class6488 var3, Predicate<Entity> var4, double var5) {
      Class1655 var9 = var0.field5024;
      double var10 = var5;
      Entity var12 = null;
      Vector3d var13 = null;

      for (Entity var15 : var9.method6770(var0, var3, var4)) {
         Class6488 var16 = var15.method3389().method19664((double)var15.method3319());
         Optional<Vector3d> var17 = var16.method19680(var1, var2);
         if (!var16.method19673(var1)) {
            if (var17.isPresent()) {
               Vector3d var18 = (Vector3d)var17.get();
               double var19 = var1.method11342(var18);
               if (var19 < var10 || var10 == 0.0) {
                  if (var15.method3415() != var0.method3415()) {
                     var12 = var15;
                     var13 = var18;
                     var10 = var19;
                  } else if (var10 == 0.0) {
                     var12 = var15;
                     var13 = var18;
                  }
               }
            }
         } else if (var10 >= 0.0) {
            var12 = var15;
            var13 = var17.orElse(var1);
            var10 = 0.0;
         }
      }

      return var12 != null ? new Class8709(var12, var13) : null;
   }

   @Nullable
   public static Class8709 method36387(Class1655 var0, Entity var1, Vector3d var2, Vector3d var3, Class6488 var4, Predicate<Entity> var5) {
      double var8 = Double.MAX_VALUE;
      Entity var10 = null;

      for (Entity var12 : var0.method6770(var1, var4, var5)) {
         Class6488 var13 = var12.method3389().method19664(0.3F);
         Optional var14 = var13.method19680(var2, var3);
         if (var14.isPresent()) {
            double var15 = var2.method11342((Vector3d)var14.get());
            if (var15 < var8) {
               var10 = var12;
               var8 = var15;
            }
         }
      }

      return var10 != null ? new Class8709(var10) : null;
   }

   public static final void method36388(Entity var0, float var1) {
      Vector3d var4 = var0.method3433();
      if (var4.method11349() != 0.0) {
         float var5 = Class9679.method37766(Entity.method3234(var4));
         var0.field5031 = (float)(Class9679.method37814(var4.field18050, var4.field18048) * 180.0F / (float)Math.PI) + 90.0F;
         var0.field5032 = (float)(Class9679.method37814((double)var5, var4.field18049) * 180.0F / (float)Math.PI) - 90.0F;

         while (var0.field5032 - var0.field5034 < -180.0F) {
            var0.field5034 -= 360.0F;
         }

         while (var0.field5032 - var0.field5034 >= 180.0F) {
            var0.field5034 += 360.0F;
         }

         while (var0.field5031 - var0.field5033 < -180.0F) {
            var0.field5033 -= 360.0F;
         }

         while (var0.field5031 - var0.field5033 >= 180.0F) {
            var0.field5033 += 360.0F;
         }

         var0.field5032 = Class9679.method37821(var1, var0.field5034, var0.field5032);
         var0.field5031 = Class9679.method37821(var1, var0.field5033, var0.field5031);
      }
   }

   public static Class79 method36389(Class880 var0, Class3257 var1) {
      return var0.method3090().method32107() != var1 ? Class79.field183 : Class79.field182;
   }

   public static Class884 method36390(Class880 var0, Class8848 var1, float var2) {
      Class3308 var5 = (Class3308)(!(var1.method32107() instanceof Class3308) ? Class8514.field37797 : var1.method32107());
      Class884 var6 = var5.method11850(var0.field5024, var1, var0);
      var6.method3490(var0, var2);
      if (var1.method32107() == Class8514.field38117 && var6 instanceof Class887) {
         ((Class887)var6).method3497(var1);
      }

      return var6;
   }
}