package mapped;

public class Class913 extends Class911 {
   private static String[] field5202;
   public final Class969 field5203;

   public Class913(Class969 var1) {
      this.field5203 = var1;
   }

   @Override
   public void method3562(String var1) {
      super.method3562(var1);
      this.field5203.method3622();
   }

   @Override
   public Class1657 method3567() {
      return (Class1657)this.field5203.field5324;
   }

   @Override
   public void method3568() {
      Class7380 var3 = this.field5203.field5324.method6738(this.field5203.field5325);
      this.method3567().method6731(this.field5203.field5325, var3, var3, 3);
   }

   @Override
   public Vector3d method3573() {
      return Vector3d.method11328(this.field5203.field5325);
   }

   @Override
   public Class6619 method3574() {
      return new Class6619(
         this,
         Vector3d.method11328(this.field5203.field5325),
         Class8513.field37212,
         this.method3567(),
         2,
         this.method3565().getString(),
         this.method3565(),
         this.method3567().method6715(),
         (Entity)null
      );
   }
}