package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Class7331 implements Class7329 {
   private static String[] field31415;
   private final Class8796 field31416;
   private final Class8796 field31417;
   private final Class8796 field31418;

   public Class7331(Class8796 var1, Class8796 var2, Class8796 var3) {
      this.field31416 = var1;
      this.field31417 = var2;
      this.field31418 = var3;
   }

   @Override
   public Vector3d method23228(Class6619 var1) {
      Vector3d var4 = var1.method20171();
      return new Vector3d(
         this.field31416.method31754(var4.field18048), this.field31417.method31754(var4.field18049), this.field31418.method31754(var4.field18050)
      );
   }

   @Override
   public Class8513 method23229(Class6619 var1) {
      Class8513 var4 = var1.method20176();
      return new Class8513((float)this.field31416.method31754((double)var4.field37220), (float)this.field31417.method31754((double)var4.field37221));
   }

   @Override
   public boolean method23231() {
      return this.field31416.method31758();
   }

   @Override
   public boolean method23232() {
      return this.field31417.method31758();
   }

   @Override
   public boolean method23233() {
      return this.field31418.method31758();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class7331) {
            Class7331 var4 = (Class7331)var1;
            if (this.field31416.equals(var4.field31416)) {
               return this.field31417.equals(var4.field31417) ? this.field31418.equals(var4.field31418) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static Class7331 method23236(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();
      Class8796 var4 = Class8796.method31756(var0);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Class8796 var5 = Class8796.method31756(var0);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Class8796 var6 = Class8796.method31756(var0);
            return new Class7331(var4, var5, var6);
         } else {
            var0.setCursor(var3);
            throw Class6851.field29766.createWithContext(var0);
         }
      } else {
         var0.setCursor(var3);
         throw Class6851.field29766.createWithContext(var0);
      }
   }

   public static Class7331 method23237(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var4 = var0.getCursor();
      Class8796 var5 = Class8796.method31755(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Class8796 var6 = Class8796.method31755(var0, false);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Class8796 var7 = Class8796.method31755(var0, var1);
            return new Class7331(var5, var6, var7);
         } else {
            var0.setCursor(var4);
            throw Class6851.field29766.createWithContext(var0);
         }
      } else {
         var0.setCursor(var4);
         throw Class6851.field29766.createWithContext(var0);
      }
   }

   public static Class7331 method23238() {
      return new Class7331(new Class8796(true, 0.0), new Class8796(true, 0.0), new Class8796(true, 0.0));
   }

   @Override
   public int hashCode() {
      int var3 = this.field31416.hashCode();
      var3 = 31 * var3 + this.field31417.hashCode();
      return 31 * var3 + this.field31418.hashCode();
   }
}