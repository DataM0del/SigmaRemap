package mapped;

import java.util.List;

public class Class3328 extends Class3257 {
   private static String[] field18836;

   public Class3328(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      List var6 = var1.<Class999>method6772(
         Class999.class, var2.method3389().method19664(2.0), var0 -> var0 != null && var0.method3066() && var0.method4114() instanceof Class1007
      );
      Class8848 var7 = var2.method3094(var3);
      if (var6.isEmpty()) {
         Class8711 var10 = method11735(var1, var2, Class1985.field12963);
         if (var10.method31417() != Class2100.field13689) {
            if (var10.method31417() == Class2100.field13690) {
               BlockPos var9 = var10.method31423();
               if (!var1.method6785(var2, var9)) {
                  return Class6794.<Class8848>method20698(var7);
               }

               if (var1.method6739(var9).method23486(Class8953.field40469)) {
                  var1.method6743(var2, var2.getPosX(), var2.getPosY(), var2.getPosZ(), Class6067.field26418, Class2266.field14734, 1.0F, 1.0F);
                  return Class6794.<Class8848>method20700(
                     this.method11878(var7, var2, Class9741.method38187(new Class8848(Class8514.field37971), Class8137.field34977)), var1.method6714()
                  );
               }
            }

            return Class6794.<Class8848>method20698(var7);
         } else {
            return Class6794.<Class8848>method20698(var7);
         }
      } else {
         Class999 var8 = (Class999)var6.get(0);
         var8.method4097(var8.method4098() - 0.5F);
         var1.method6743((PlayerEntity)null, var2.getPosX(), var2.getPosY(), var2.getPosZ(), Class6067.field26419, Class2266.field14734, 1.0F, 1.0F);
         return Class6794.<Class8848>method20700(this.method11878(var7, var2, new Class8848(Class8514.field38114)), var1.method6714());
      }
   }

   public Class8848 method11878(Class8848 var1, PlayerEntity var2, Class8848 var3) {
      var2.method2913(Class8876.field40098.method172(this));
      return Class8482.method29979(var1, var2, var3);
   }
}