package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collectors;

public class Class2739 extends Class2736 {
   private static String[] field17257;

   public Class2739(Class1046 var1, double var2) {
      super(var1, var2, 240, false);
   }

   @Nullable
   @Override
   public Vector3d method10943() {
      float var3 = this.field17258.field5024.field9016.nextFloat();
      if (!(this.field17258.field5024.field9016.nextFloat() < 0.3F)) {
         Vector3d var4;
         if (!(var3 < 0.7F)) {
            var4 = this.method10949();
            if (var4 == null) {
               var4 = this.method10948();
            }
         } else {
            var4 = this.method10948();
            if (var4 == null) {
               var4 = this.method10949();
            }
         }

         return var4 != null ? var4 : this.method10947();
      } else {
         return this.method10947();
      }
   }

   @Nullable
   private Vector3d method10947() {
      return Class8037.method27583(this.field17258, 10, 7);
   }

   @Nullable
   private Vector3d method10948() {
      Class1657 var3 = (Class1657)this.field17258.field5024;
      List var4 = var3.<Class1042>method6771(Class8992.field41098, this.field17258.method3389().method19664(32.0), this::method10952);
      if (!var4.isEmpty()) {
         Class1042 var5 = (Class1042)var4.get(this.field17258.field5024.field9016.nextInt(var4.size()));
         Vector3d var6 = var5.method3431();
         return Class8037.method27586(this.field17258, 10, 7, var6);
      } else {
         return null;
      }
   }

   @Nullable
   private Vector3d method10949() {
      Class2002 var3 = this.method10950();
      if (var3 != null) {
         BlockPos var4 = this.method10951(var3);
         return var4 != null ? Class8037.method27586(this.field17258, 10, 7, Vector3d.method11330(var4)) : null;
      } else {
         return null;
      }
   }

   @Nullable
   private Class2002 method10950() {
      Class1657 var3 = (Class1657)this.field17258.field5024;
      List var4 = Class2002.method8427(Class2002.method8392(this.field17258), 2).filter(var1 -> var3.method6955(var1) == 0).collect(Collectors.toList());
      return !var4.isEmpty() ? (Class2002)var4.get(var3.field9016.nextInt(var4.size())) : null;
   }

   @Nullable
   private BlockPos method10951(Class2002 var1) {
      Class1657 var4 = (Class1657)this.field17258.field5024;
      Class1653 var5 = var4.method6951();
      List var6 = var5.method6666(var0 -> true, var1.method8422(), 8, Class2093.field13636).<BlockPos>map(Class9343::method35355).collect(Collectors.toList());
      return !var6.isEmpty() ? (BlockPos)var6.get(var4.field9016.nextInt(var6.size())) : null;
   }

   private boolean method10952(Class1042 var1) {
      return var1.method4717(this.field17258.field5024.method6783());
   }
}