package mapped;

import java.util.BitSet;

public class Class9010 {
   private static String[] field41214;
   private final Class1658 field41215;
   private final Class5646 field41216;

   public Class9010(Class1658 var1, Class5646 var2) {
      this.field41215 = var1;
      this.field41216 = var2;
   }

   public int method33296(Class101 var1, int var2, int var3) {
      return this.field41215.method6736(var1, var2, var3);
   }

   public int method33297() {
      return this.field41216.method17806();
   }

   public int method33298() {
      return this.field41216.method17807();
   }

   public BitSet method33299(Class7481 var1, Class97 var2) {
      return ((Class1672)this.field41215.method6824(var1.field32174, var1.field32175)).method7117(var2);
   }

   public Class7380 method33300(BlockPos var1) {
      return this.field41215.method6738(var1);
   }
}