package mapped;

import java.util.List;

public class Class3101 implements Class2982 {
   private static String[] field18290;
   public final Class3834 field18291;

   public Class3101(Class3834 var1) {
      this.field18291 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      List var4 = var1.method30555(Class7593.field32598, 0);
      int var5 = var1.<Integer>method30555(Class4750.field22544, 0);
      Class6057 var6 = var1.method30580().<Class6057>method22438(Class6057.class);
      if (!var6.method18667(var5)) {
         var6.method18751(var5, var4);
         var1.method30578();
      } else {
         this.field18291.field20046.<Class6912>method19373(Class6912.class).method21090(var5, var4, var1.method30580());
      }
   }
}