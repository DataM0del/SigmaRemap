package mapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class8901 {
   private static String[] field40283;
   private Class8472 field40284;
   private Class8472 field40285;
   private ArrayList<Class8472> field40286 = new ArrayList<Class8472>();
   private ArrayList<Class8534> field40287 = new ArrayList<Class8534>();
   private ArrayList<Class8534> field40288 = new ArrayList<Class8534>();
   private double field40289 = 9.0;
   private boolean field40290 = true;
   private static Minecraft field40291 = Minecraft.getInstance();
   private static Class8472[] field40292 = new Class8472[]{
      new Class8472(1.0, 0.0, 0.0), new Class8472(-1.0, 0.0, 0.0), new Class8472(0.0, 0.0, 1.0), new Class8472(0.0, 0.0, -1.0)
   };

   public Class8901(Class8472 var1, Class8472 var2) {
      this.field40284 = var1.method29879(0.0, 0.0, 0.0).method29880();
      this.field40285 = var2.method29879(0.0, 0.0, 0.0).method29880();
   }

   public ArrayList<Class8472> method32444() {
      return this.field40286;
   }

   public void method32445() {
      this.method32446(1000, 4);
   }

   public void method32446(int var1, int var2) {
      this.field40286.clear();
      this.field40288.clear();
      ArrayList var5 = new ArrayList();
      var5.add(this.field40284);
      this.field40288.add(new Class8534(this.field40284, null, var5, this.field40284.method29881(this.field40285), 0.0, 0.0));

      label72:
      for (int var6 = 0; var6 < var1; var6++) {
         Collections.sort(this.field40288, new Class3604(this));
         int var7 = 0;
         if (this.field40288.size() == 0) {
            break;
         }

         for (Class8534 var9 : new ArrayList<Class8534>(this.field40288)) {
            if (++var7 <= var2) {
               this.field40288.remove(var9);
               this.field40287.add(var9);

               for (Class8472 var13 : field40292) {
                  Class8472 var14 = var9.method30354().method29882(var13).method29880();
                  if (method32448(var14, false) && this.method32451(var9, var14, 0.0)) {
                     break label72;
                  }
               }

               Class8472 var15 = var9.method30354().method29879(0.0, 1.0, 0.0).method29880();
               if (method32448(var15, false) && this.method32451(var9, var15, 0.0)) {
                  break label72;
               }

               Class8472 var16 = var9.method30354().method29879(0.0, -1.0, 0.0).method29880();
               if (method32448(var16, false) && this.method32451(var9, var16, 0.0)) {
                  break label72;
               }
               continue;
            }
         }
      }

      if (this.field40290) {
         Collections.sort(this.field40287, new Class3604(this));
         this.field40286 = this.field40287.get(0).method30356();
      }
   }

   public static ArrayList<Class8472> method32447(Class8472 var0, Class8472 var1) {
      Class8901 var4 = new Class8901(var0, var1);
      var4.method32445();
      byte var5 = 5;
      int var6 = 0;
      Class8472 var7 = null;
      Class8472 var8 = null;
      ArrayList var9 = new ArrayList();
      List<Class8472> var10 = var4.method32444();

      for (Class8472 var12 : var10) {
         if (var6 != 0 && var6 != var10.size() - 1) {
            boolean var13 = true;
            if (!(var12.method29881(var8) > (double)(var5 * var5))) {
               double var14 = Math.min(var8.method29876(), var12.method29876());
               double var16 = Math.min(var8.method29877(), var12.method29877());
               double var18 = Math.min(var8.method29878(), var12.method29878());
               double var20 = Math.max(var8.method29876(), var12.method29876());
               double var22 = Math.max(var8.method29877(), var12.method29877());
               double var24 = Math.max(var8.method29878(), var12.method29878());

               label62:
               for (int var26 = (int)var14; (double)var26 <= var20; var26++) {
                  for (int var27 = (int)var16; (double)var27 <= var22; var27++) {
                     for (int var28 = (int)var18; (double)var28 <= var24; var28++) {
                        if (!method32449(var26, var27, var28, false)) {
                           var13 = false;
                           break label62;
                        }
                     }
                  }
               }
            } else {
               var13 = false;
            }

            if (!var13) {
               var9.add(var7.method29879(0.5, 0.0, 0.5));
               var8 = var7;
            }
         } else {
            if (var7 != null) {
               var9.add(var7.method29879(0.5, 0.0, 0.5));
            }

            var9.add(var12.method29879(0.5, 0.0, 0.5));
            var8 = var12;
         }

         var7 = var12;
         var6++;
      }

      return var9;
   }

   public static boolean method32448(Class8472 var0, boolean var1) {
      return method32449((int)var0.method29876(), (int)var0.method29877(), (int)var0.method29878(), var1);
   }

   public static boolean method32449(int var0, int var1, int var2, boolean var3) {
      Class6488 var6 = field40291.field1339.method3421() != null ? field40291.field1339.method3421().method3389() : field40291.field1339.method3389();
      Class6488 var7 = new Class6488(
         (double)((float)var0 + 0.5F) - var6.method19676() / 2.0,
         (double)var1,
         (double)((float)var2 + 0.5F) - var6.method19678() / 2.0,
         (double)((float)var0 + 0.5F) + var6.method19676() / 2.0,
         (double)var1 + var6.method19677(),
         (double)((float)var2 + 0.5F) + var6.method19678() / 2.0
      );
      return field40291.field1338.method7055(field40291.field1339, var7).count() == 0L;
   }

   public Class8534 method32450(Class8472 var1) {
      for (Class8534 var5 : this.field40287) {
         if (var5.method30354().method29876() == var1.method29876()
            && var5.method30354().method29877() == var1.method29877()
            && var5.method30354().method29878() == var1.method29878()) {
            return var5;
         }
      }

      for (Class8534 var7 : this.field40288) {
         if (var7.method30354().method29876() == var1.method29876()
            && var7.method30354().method29877() == var1.method29877()
            && var7.method30354().method29878() == var1.method29878()) {
            return var7;
         }
      }

      return null;
   }

   public boolean method32451(Class8534 var1, Class8472 var2, double var3) {
      Class8534 var7 = this.method32450(var2);
      double var8 = var3;
      if (var1 != null) {
         var8 = var3 + var1.method30364();
      }

      if (var7 != null) {
         if (var7.method30358() > var3) {
            ArrayList var11 = new ArrayList<Class8472>(var1.method30356());
            var11.add(var2);
            var7.method30359(var2);
            var7.method30360(var1);
            var7.method30361(var11);
            var7.method30362(var2.method29881(this.field40285));
            var7.method30363(var3);
            var7.method30365(var8);
         }
      } else {
         if (var2.method29876() == this.field40285.method29876()
               && var2.method29877() == this.field40285.method29877()
               && var2.method29878() == this.field40285.method29878()
            || this.field40289 != 0.0 && var2.method29881(this.field40285) <= this.field40289) {
            this.field40286.clear();
            this.field40286 = var1.method30356();
            this.field40286.add(var2);
            return true;
         }

         ArrayList var10 = new ArrayList<Class8472>(var1.method30356());
         var10.add(var2);
         this.field40288.add(new Class8534(var2, var1, var10, var2.method29881(this.field40285), var3, var8));
      }

      return false;
   }
}