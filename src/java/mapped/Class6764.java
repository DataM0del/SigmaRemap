package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class Class6764 {
   public Class1667 field29475;
   public Class1006 field29476;
   public final Int2ObjectMap<Class7176> field29477 = new Int2ObjectOpenHashMap();
   public int field29478;
   public int field29479;
   public int field29480;
   public boolean field29481;
   public boolean field29482;
   public boolean field29483;

   public void method20613(Class1667 var1, Class1006 var2) {
      this.field29475 = var1;
      this.field29476 = var2;
      this.field29477.clear();
      this.field29478 = Class9679.method37767(var2.method3429() + 1.0F);
      this.field29479 = Class9679.method37767(var2.method3430() + 1.0F);
      this.field29480 = Class9679.method37767(var2.method3429() + 1.0F);
   }

   public void method20614() {
      this.field29475 = null;
      this.field29476 = null;
   }

   public Class7176 method20643(BlockPos var1) {
      return this.method20641(var1.method8304(), var1.getY(), var1.method8306());
   }

   public Class7176 method20641(int var1, int var2, int var3) {
      return (Class7176)this.field29477.computeIfAbsent(Class7176.method22526(var1, var2, var3), var3x -> new Class7176(var1, var2, var3));
   }

   public abstract Class7176 method20615();

   public abstract Class7175 method20616(double var1, double var3, double var5);

   public abstract int method20617(Class7176[] var1, Class7176 var2);

   public abstract Class2163 method20629(
      Class1665 var1, int var2, int var3, int var4, Class1006 var5, int var6, int var7, int var8, boolean var9, boolean var10
   );

   public abstract Class2163 method20621(Class1665 var1, int var2, int var3, int var4);

   public void method20644(boolean var1) {
      this.field29481 = var1;
   }

   public void method20645(boolean var1) {
      this.field29482 = var1;
   }

   public void method20646(boolean var1) {
      this.field29483 = var1;
   }

   public boolean method20647() {
      return this.field29481;
   }

   public boolean method20648() {
      return this.field29482;
   }

   public boolean method20649() {
      return this.field29483;
   }
}