package mapped;

import java.util.Random;

public abstract class Class4209 extends Class4178 {
   public final int field20516;
   public final int field20517;
   public final int field20518;
   public int field20519 = -1;

   public Class4209(Class7792 var1, Random var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, 0);
      this.field20516 = var6;
      this.field20517 = var7;
      this.field20518 = var8;
      this.method12939(Class76.field161.method247(var2));
      if (this.method12938().method544() != Class113.field415) {
         this.field20444 = new Class9764(var3, var4, var5, var3 + var8 - 1, var4 + var7 - 1, var5 + var6 - 1);
      } else {
         this.field20444 = new Class9764(var3, var4, var5, var3 + var6 - 1, var4 + var7 - 1, var5 + var8 - 1);
      }
   }

   public Class4209(Class7792 var1, Class39 var2) {
      super(var1, var2);
      this.field20516 = var2.method122("Width");
      this.field20517 = var2.method122("Height");
      this.field20518 = var2.method122("Depth");
      this.field20519 = var2.method122("HPos");
   }

   @Override
   public void method12897(Class39 var1) {
      var1.method102("Width", this.field20516);
      var1.method102("Height", this.field20517);
      var1.method102("Depth", this.field20518);
      var1.method102("HPos", this.field20519);
   }

   public boolean method13002(Class1660 var1, Class9764 var2, int var3) {
      if (this.field20519 >= 0) {
         return true;
      } else {
         int var6 = 0;
         int var7 = 0;
         Mutable var8 = new Mutable();

         for (int var9 = this.field20444.field45680; var9 <= this.field20444.field45683; var9++) {
            for (int var10 = this.field20444.field45678; var10 <= this.field20444.field45681; var10++) {
               var8.method8372(var10, 64, var9);
               if (var2.method38396(var8)) {
                  var6 += var1.method7006(Class101.field300, var8).getY();
                  var7++;
               }
            }
         }

         if (var7 != 0) {
            this.field20519 = var6 / var7;
            this.field20444.method38393(0, this.field20519 - this.field20444.field45679 + var3, 0);
            return true;
         } else {
            return false;
         }
      }
   }
}