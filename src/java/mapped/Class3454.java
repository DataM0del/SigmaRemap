package mapped;

import java.util.Random;

public class Class3454 extends Class3452 {
   private static String[] field19271;
   public static final Class6408 field19272 = Block.method11539(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   public Class3454(AbstractBlock var1) {
      super(var1, Direction.field672, field19272, false, 0.1);
   }

   @Override
   public int method12128(Random var1) {
      return Class8633.method31015(var1);
   }

   @Override
   public Block method12125() {
      return Blocks.field37087;
   }

   @Override
   public boolean method12127(Class7380 var1) {
      return Class8633.method31014(var1);
   }
}