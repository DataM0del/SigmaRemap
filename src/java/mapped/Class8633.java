package mapped;

import java.util.Random;

public class Class8633 {
   private static String[] field38838;

   public static boolean method31014(Class7380 var0) {
      return var0.method23393();
   }

   public static int method31015(Random var0) {
      double var3 = 1.0;

      int var5;
      for (var5 = 0; var0.nextDouble() < var3; var5++) {
         var3 *= 0.826;
      }

      return var5;
   }
}