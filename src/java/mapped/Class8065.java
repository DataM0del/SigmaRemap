package mapped;

public class Class8065 {
   private static String[] field34607;
   private static long field34608 = 0L;

   private Class8065() {
   }

   public static long method27705() {
      return field34608;
   }

   public static void method27706(long var0) {
      field34608 += var0;
   }

   public static void method27707(long var0) {
      field34608 -= var0;
      if (field34608 < 0L) {
         field34608 = 0L;
      }
   }
}