package mapped;

import java.util.Arrays;

public class Class3436 extends Class3433 {
   private static String[] field19210;
   public static final Class8552<Class180> field19211 = Class8820.field39769;
   public static final Class8551 field19212 = Class8820.field39705;
   public static final Class6408 field19213 = Block.method11539(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final Class6408 field19214 = Block.method11539(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   public static final Class6408 field19215 = Block.method11539(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   public static final Class6408 field19216 = Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   public static final Class6408 field19217 = Block.method11539(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   public static final Class6408 field19218 = Block.method11539(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   public static final Class6408 field19219 = Block.method11539(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   public static final Class6408 field19220 = Block.method11539(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   public static final Class6408 field19221 = Block.method11539(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   public static final Class6408 field19222 = Block.method11539(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   public static final Class6408 field19223 = Block.method11539(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   public static final Class6408 field19224 = Block.method11539(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   public static final Class6408 field19225 = Block.method11539(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   public static final Class6408 field19226 = Block.method11539(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   public static final Class6408 field19227 = Block.method11539(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   public static final Class6408 field19228 = Block.method11539(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   public static final Class6408 field19229 = Block.method11539(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   public static final Class6408 field19230 = Block.method11539(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final Class6408[] field19231 = method12106(true);
   private static final Class6408[] field19232 = method12106(false);

   private static Class6408[] method12106(boolean var0) {
      return Arrays.<Direction>stream(Direction.values()).<Class6408>map(var1 -> method12107(var1, var0)).<Class6408>toArray(Class6408[]::new);
   }

   private static Class6408 method12107(Direction var0, boolean var1) {
      switch (Class7528.field32314[var0.ordinal()]) {
         case 1:
         default:
            return Class8022.method27431(field19218, var1 ? field19226 : field19220);
         case 2:
            return Class8022.method27431(field19217, var1 ? field19225 : field19219);
         case 3:
            return Class8022.method27431(field19216, var1 ? field19228 : field19222);
         case 4:
            return Class8022.method27431(field19215, var1 ? field19227 : field19221);
         case 5:
            return Class8022.method27431(field19214, var1 ? field19230 : field19224);
         case 6:
            return Class8022.method27431(field19213, var1 ? field19229 : field19223);
      }
   }

   public Class3436(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19198, Direction.NORTH)
            .method23465(field19211, Class180.field638)
            .method23465(field19212, Boolean.valueOf(false))
      );
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return (!var1.<Boolean>method23463(field19212) ? field19232 : field19231)[var1.<Direction>method23463(field19198).ordinal()];
   }

   private boolean method12108(Class7380 var1, Class7380 var2) {
      Block var5 = var1.method23463(field19211) != Class180.field638 ? Blocks.STICKY_PISTON : Blocks.PISTON;
      return var2.method23448(var5)
         && var2.<Boolean>method23463(Class3435.field19202)
         && var2.<Direction>method23463(field19198) == var1.<Direction>method23463(field19198);
   }

   @Override
   public void method11574(Class1655 var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      if (!var1.field9020 && var4.field4919.field29609) {
         BlockPos var7 = var2.method8349(var3.<Direction>method23463(field19198).method536());
         if (this.method12108(var3, var1.method6738(var7))) {
            var1.method7179(var7, false);
         }
      }

      super.method11574(var1, var2, var3, var4);
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         super.method11513(var1, var2, var3, var4, var5);
         BlockPos var8 = var3.method8349(var1.<Direction>method23463(field19198).method536());
         if (this.method12108(var1, var2.method6738(var8))) {
            var2.method7179(var8, true);
         }
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2.method536() == var1.method23463(field19198) && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Class7380 var6 = var2.method6738(var3.method8349(var1.<Direction>method23463(field19198).method536()));
      return this.method12108(var1, var6)
         || var6.method23448(Blocks.MOVING_PISTON) && var6.<Direction>method23463(field19198) == var1.<Direction>method23463(field19198);
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (var1.method23443(var2, var3)) {
         BlockPos var9 = var3.method8349(var1.<Direction>method23463(field19198).method536());
         var2.method6738(var9).method23423(var2, var9, var4, var5, false);
      }
   }

   @Override
   public Class8848 method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return new Class8848(var3.method23463(field19211) != Class180.field639 ? Blocks.PISTON : Blocks.STICKY_PISTON);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field19198, var2.method252(var1.<Direction>method23463(field19198)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19198)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19198, field19211, field19212);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}