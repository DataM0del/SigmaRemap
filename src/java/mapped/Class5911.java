package mapped;

import javax.annotation.Nullable;

public class Class5911 {
   private static String[] field25720;
   private final PlayerEntity field25721;
   private final Class79 field25722;
   private final Class8711 field25723;
   private final Class1655 field25724;
   private final Class8848 field25725;

   public Class5911(PlayerEntity var1, Class79 var2, Class8711 var3) {
      this(var1.field5024, var1, var2, var1.method3094(var2), var3);
   }

   public Class5911(Class1655 var1, PlayerEntity var2, Class79 var3, Class8848 var4, Class8711 var5) {
      this.field25721 = var2;
      this.field25722 = var3;
      this.field25723 = var5;
      this.field25725 = var4;
      this.field25724 = var1;
   }

   public final Class8711 method18353() {
      return this.field25723;
   }

   public BlockPos method18345() {
      return this.field25723.method31423();
   }

   public Direction method18354() {
      return this.field25723.method31424();
   }

   public Vector3d method18355() {
      return this.field25723.method31419();
   }

   public boolean method18356() {
      return this.field25723.method31425();
   }

   public Class8848 method18357() {
      return this.field25725;
   }

   @Nullable
   public PlayerEntity method18358() {
      return this.field25721;
   }

   public Class79 method18359() {
      return this.field25722;
   }

   public Class1655 method18360() {
      return this.field25724;
   }

   public Direction method18350() {
      return this.field25721 != null ? this.field25721.method3386() : Direction.NORTH;
   }

   public boolean method18351() {
      return this.field25721 != null && this.field25721.method2851();
   }

   public float method18352() {
      return this.field25721 != null ? this.field25721.field5031 : 0.0F;
   }
}