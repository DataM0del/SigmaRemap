package mapped;

public class Class774 implements Runnable {
   public final Class4315 field4039;
   public final int field4040;
   public final int field4041;
   public final Class1998 field4042;
   public final Class4315 field4043;

   public Class774(Class4315 var1, Class4315 var2, int var3, int var4, Class1998 var5) {
      this.field4043 = var1;
      this.field4039 = var2;
      this.field4040 = var3;
      this.field4041 = var4;
      this.field4042 = var5;
   }

   @Override
   public void run() {
      if (this.field4043.field21041 == null) {
         this.field4039.method13230(this.field4043.field21041 = new Class4276(this.field4039, "popover", this.field4040, this.field4041, this.field4042));
         Class4315.method13394(this.field4043, this.field4043.field21041);
      }
   }
}