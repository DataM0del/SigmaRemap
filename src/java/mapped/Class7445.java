package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.Biome;

public final class Class7445 implements Class7443 {
   private static String[] field32019;

   @Override
   public int method24053(BlockState var1, IBlockDisplayReader var2, BlockPos var3) {
      Biome var6 = Class9680.method37851(var2, var3);
      return Class9680.method37902() != null && var6 == Class8708.field39312 ? Class9680.method37902().method24070(var6, var3) : var6.method32512();
   }

   @Override
   public boolean method24054() {
      return false;
   }
}
