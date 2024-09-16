package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class Class3398 extends AbstractFireBlock {
   private static String[] field19036;

   public Class3398(AbstractBlock var1) {
      super(var1, 2.0F);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !this.method11492(var1, var4, var5) ? Blocks.AIR.method11579() : this.method11579();
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method12014(var2.getBlockState(var3.down()).getBlock());
   }

   public static boolean method12014(Block var0) {
      return var0.isIn(BlockTags.field32807);
   }

   @Override
   public boolean method12010(BlockState var1) {
      return true;
   }
}
