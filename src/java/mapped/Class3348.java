package mapped;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class Class3348 extends Class3346<Class941> implements Class3207 {
   private static String[] field18864;
   public static final Class8553 field18865 = Class3198.field18484;
   public static final Class8552<Class111> field18866 = Class8820.field39765;
   public static final Class8551 field18867 = Class8820.field39710;
   public static final Class6408 field18868 = Block.method11539(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
   public static final Class6408 field18869 = Block.method11539(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
   public static final Class6408 field18870 = Block.method11539(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   public static final Class6408 field18871 = Block.method11539(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
   public static final Class6408 field18872 = Block.method11539(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final Class6139<Class941, Optional<Class920>> field18873 = new Class6140();
   private static final Class6139<Class941, Optional<Class949>> field18874 = new Class6142();

   public Class3348(AbstractBlock var1, Supplier<Class4387<? extends Class941>> var2) {
      super(var1, var2);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18865, Direction.NORTH)
            .method23465(field18866, Class111.field379)
            .method23465(field18867, Boolean.valueOf(false))
      );
   }

   public static Class1895 method11907(Class7380 var0) {
      Class111 var3 = var0.<Class111>method23463(field18866);
      if (var3 != Class111.field379) {
         return var3 != Class111.field381 ? Class1895.field11111 : Class1895.field11110;
      } else {
         return Class1895.field11109;
      }
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9886;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18867)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      if (var3.method23448(this) && var2.method544().method324()) {
         Class111 var9 = var3.<Class111>method23463(field18866);
         if (var1.<Class111>method23463(field18866) == Class111.field379
            && var9 != Class111.field379
            && var1.<Direction>method23463(field18865) == var3.<Direction>method23463(field18865)
            && method11908(var3) == var2.method536()) {
            return var1.method23465(field18866, var9.method308());
         }
      } else if (method11908(var1) == var2) {
         return var1.method23465(field18866, Class111.field379);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      if (var1.<Class111>method23463(field18866) == Class111.field379) {
         return field18872;
      } else {
         switch (Class8810.field39644[method11908(var1).ordinal()]) {
            case 1:
            default:
               return field18868;
            case 2:
               return field18869;
            case 3:
               return field18870;
            case 4:
               return field18871;
         }
      }
   }

   public static Direction method11908(Class7380 var0) {
      Direction var3 = var0.<Direction>method23463(field18865);
      return var0.method23463(field18866) != Class111.field380 ? var3.method538() : var3.method537();
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class111 var4 = Class111.field379;
      Direction var5 = var1.method18350().method536();
      Class7379 var6 = var1.method18360().method6739(var1.method18345());
      boolean var7 = var1.method18351();
      Direction var8 = var1.method18354();
      if (var8.method544().method324() && var7) {
         Direction var9 = this.method11909(var1, var8.method536());
         if (var9 != null && var9.method544() != var8.method544()) {
            var5 = var9;
            var4 = var9.method538() != var8.method536() ? Class111.field380 : Class111.field381;
         }
      }

      if (var4 == Class111.field379 && !var7) {
         if (var5 != this.method11909(var1, var5.method537())) {
            if (var5 == this.method11909(var1, var5.method538())) {
               var4 = Class111.field381;
            }
         } else {
            var4 = Class111.field380;
         }
      }

      return this.method11579()
         .method23465(field18865, var5)
         .method23465(field18866, var4)
         .method23465(field18867, Boolean.valueOf(var6.method23472() == Class9479.field44066));
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18867) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Nullable
   private Direction method11909(Class5909 var1, Direction var2) {
      Class7380 var5 = var1.method18360().method6738(var1.method18345().method8349(var2));
      return var5.method23448(this) && var5.method23463(field18866) == Class111.field379 ? var5.<Direction>method23463(field18865) : null;
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class941) {
            ((Class941)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class920) {
            Class7236.method22721(var2, var3, (Class920)var8);
            var2.method6806(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         Class949 var9 = this.method11528(var1, var2, var3);
         if (var9 != null) {
            var4.method2766(var9);
            var4.method2913(this.method11910());
            Class4388.method13832(var4, true);
         }

         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   public Class9007<ResourceLocation> method11910() {
      return Class8876.field40104.method172(Class8876.field40161);
   }

   @Nullable
   public static Class920 method11911(Class3348 var0, Class7380 var1, Class1655 var2, BlockPos var3, boolean var4) {
      return var0.method11904(var1, var2, var3, var4).<Optional<Class920>>method27292(field18873).orElse((Class920)null);
   }

   @Override
   public Class7995<? extends Class941> method11904(Class7380 var1, Class1655 var2, BlockPos var3, boolean var4) {
      BiPredicate<Class1660, BlockPos> var7;
      if (!var4) {
         var7 = Class3348::method11913;
      } else {
         var7 = (var0, var1x) -> false;
      }

      return Class9324.method35243(this.field18859.get(), Class3348::method11907, Class3348::method11908, field18865, var1, var2, var3, var7);
   }

   @Nullable
   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return this.method11904(var1, var2, var3, false).<Optional<Class949>>method27292(field18874).orElse((Class949)null);
   }

   public static Class6139<Class941, Float2FloatFunction> method11912(Class942 var0) {
      return new Class6141(var0);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class941();
   }

   public static boolean method11913(Class1660 var0, BlockPos var1) {
      return method11914(var0, var1) || method11915(var0, var1);
   }

   private static boolean method11914(Class1665 var0, BlockPos var1) {
      BlockPos var4 = var1.method8311();
      return var0.method6738(var4).method23400(var0, var4);
   }

   private static boolean method11915(Class1660 var0, BlockPos var1) {
      List<Class1098> var4 = var0.method7182(
         Class1098.class,
         new Class6488(
            (double)var1.method8304(),
            (double)(var1.getY() + 1),
            (double)var1.method8306(),
            (double)(var1.method8304() + 1),
            (double)(var1.getY() + 2),
            (double)(var1.method8306() + 1)
         )
      );
      if (!var4.isEmpty()) {
         for (Class1098 var6 : var4) {
            if (var6.method4395()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return Class5812.method18152(method11911(this, var1, var2, var3, false));
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18865, var2.method252(var1.<Direction>method23463(field18865)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18865)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18865, field18866, field18867);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}