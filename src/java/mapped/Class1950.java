package mapped;

public enum Class1950 implements Class1949 {
   field12630(0, Class4750.field22518),
   field12631(1, Class4750.field22544),
   field12632(2, Class4750.field22532),
   field12633(3, Class4750.field22539),
   field12634(4, Class4750.field22538),
   field12635(5, Class4750.field22561),
   field12636(6, Class4750.field22524),
   field12637(7, Class4750.field22553),
   field12638(8, Class4750.field22551),
   field12639(9, Class4750.field22559),
   field12640(10, Class4750.field22544),
   field12641(11, Class4750.field22557),
   field12642(12, Class4750.field22544),
   field12643(99, null);

   private final int field12644;
   private final Class4750 field12645;
   private static final Class1950[] field12646 = new Class1950[]{
      field12630,
      field12631,
      field12632,
      field12633,
      field12634,
      field12635,
      field12636,
      field12637,
      field12638,
      field12639,
      field12640,
      field12641,
      field12642,
      field12643
   };

   private Class1950(int var3, Class4750 var4) {
      this.field12644 = var3;
      this.field12645 = var4;
   }

   public static Class1950 method8209(int var0) {
      return values()[var0];
   }

   @Override
   public int method8207() {
      return this.field12644;
   }

   @Override
   public Class4750 method8208() {
      return this.field12645;
   }
}