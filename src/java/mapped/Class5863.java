package mapped;

import java.util.Map;
import java.util.Map.Entry;

public class Class5863 extends Class5839 {
   private static String[] field25629;
   public final Class8786 field25630;
   public final Class5815 field25631;

   public Class5863(Class5815 var1, Class920 var2, int var3, int var4, int var5, Class8786 var6) {
      super(var2, var3, var4, var5);
      this.field25631 = var1;
      this.field25630 = var6;
   }

   @Override
   public boolean method18259(Class8848 var1) {
      return false;
   }

   @Override
   public Class8848 method18264(PlayerEntity var1, Class8848 var2) {
      this.field25630.method31716((var1x, var2x) -> {
         int var5 = this.method18279(var1x);

         while (var5 > 0) {
            int var6 = Class1003.method4179(var5);
            var5 -= var6;
            var1x.method6916(new Class1003(var1x, (double)var2x.method8304(), (double)var2x.getY() + 0.5, (double)var2x.method8306() + 0.5, var6));
         }

         var1x.method6999(1042, var2x, 0);
      });
      Class5815.method18171(this.field25631).method3621(0, Class8848.field39973);
      Class5815.method18171(this.field25631).method3621(1, Class8848.field39973);
      return var2;
   }

   private int method18279(Class1655 var1) {
      int var4 = 0;
      var4 += this.method18280(Class5815.method18171(this.field25631).method3618(0));
      var4 += this.method18280(Class5815.method18171(this.field25631).method3618(1));
      if (var4 <= 0) {
         return 0;
      } else {
         int var5 = (int)Math.ceil((double)var4 / 2.0);
         return var5 + var1.field9016.nextInt(var5);
      }
   }

   private int method18280(Class8848 var1) {
      int var4 = 0;
      Map<Class6069, Integer> var5 = Class7858.method26312(var1);

      for (Entry<Class6069, Integer> var7 : var5.entrySet()) {
         Class6069 var8 = var7.getKey();
         Integer var9 = var7.getValue();
         if (!var8.method18825()) {
            var4 += var8.method18807(var9);
         }
      }

      return var4;
   }
}