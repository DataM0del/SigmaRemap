package mapped;

public final class Class9247 {
   private static String[] field42548;
   private static SGL field42549 = Renderer.get();
   private static LineStripRenderer field42550 = Renderer.method28671();

   public static final void method34775(Class2520 var0) {
      Texture var3 = TextureImpl.method36176();
      TextureImpl.bindNone();
      float[] var4 = var0.method10594();
      field42550.method23240();

      for (int var5 = 0; var5 < var4.length; var5 += 2) {
         field42550.method23242(var4[var5], var4[var5 + 1]);
      }

      if (var0.method10612()) {
         field42550.method23242(var4[0], var4[1]);
      }

      field42550.method23241();
      if (var3 != null) {
         var3.bind();
      } else {
         TextureImpl.bindNone();
      }
   }

   public static final void method34776(Class2520 var0, Class8518 var1) {
      float[] var4 = var0.method10594();
      Texture var5 = TextureImpl.method36176();
      TextureImpl.bindNone();
      float[] var6 = var0.method10593();
      field42549.method18369(3);

      for (int var7 = 0; var7 < var4.length; var7 += 2) {
         var1.method30178(var0, var4[var7], var4[var7 + 1]).method10392();
         Class2532 var8 = var1.method30180(var0, var4[var7], var4[var7 + 1]);
         field42549.method18401(var4[var7] + var8.field16737, var4[var7 + 1] + var8.field16738);
      }

      if (var0.method10612()) {
         var1.method30178(var0, var4[0], var4[1]).method10392();
         Class2532 var9 = var1.method30180(var0, var4[0], var4[1]);
         field42549.method18401(var4[0] + var9.field16737, var4[1] + var9.field16738);
      }

      field42549.method18382();
      if (var5 != null) {
         var5.bind();
      } else {
         TextureImpl.bindNone();
      }
   }

   public static boolean method34777(Class2520 var0) {
      return var0.method10609() != null ? var0.method10609().method10703() != 0 : false;
   }

   public static final void method34778(Class2520 var0) {
      if (method34777(var0)) {
         Texture var3 = TextureImpl.method36176();
         TextureImpl.bindNone();
         method34779(var0, new Class6017());
         if (var3 != null) {
            var3.bind();
         } else {
            TextureImpl.bindNone();
         }
      }
   }

   private static final void method34779(Class2520 var0, Class6014 var1) {
      Class2533 var4 = var0.method10609();
      field42549.method18369(4);

      for (int var5 = 0; var5 < var4.method10703(); var5++) {
         for (int var6 = 0; var6 < 3; var6++) {
            float[] var7 = var4.method10704(var5, var6);
            float[] var8 = var1.method18646(var0, var7[0], var7[1]);
            if (var8 != null) {
               field42549.method18401(var8[0], var8[1]);
            } else {
               field42549.method18401(var7[0], var7[1]);
            }
         }
      }

      field42549.method18382();
   }

   public static final void method34780(Class2520 var0, Image var1) {
      method34782(var0, var1, 0.01F, 0.01F);
   }

   public static final void method34781(Class2520 var0, Image var1) {
      method34783(var0, var1, 1.0F, 1.0F);
   }

   public static final void method34782(Class2520 var0, Image var1, float var2, float var3) {
      if (method34777(var0)) {
         Texture var6 = TextureImpl.method36176();
         var1.method23565().bind();
         method34779(var0, new Class6019(var2, var3, var1));
         float[] var7 = var0.method10594();
         if (var6 != null) {
            var6.bind();
         } else {
            TextureImpl.bindNone();
         }
      }
   }

   public static final void method34783(Class2520 var0, Image var1, float var2, float var3) {
      if (method34777(var0)) {
         float[] var6 = var0.method10594();
         Texture var7 = TextureImpl.method36176();
         var1.method23565().bind();
         float var8 = var0.method10579();
         float var9 = var0.method10582();
         float var10 = var0.method10588() - var8;
         float var11 = var0.method10589() - var9;
         method34779(var0, new Class6016(var2, var3, var1));
         if (var7 != null) {
            var7.bind();
         } else {
            TextureImpl.bindNone();
         }
      }
   }

   public static final void method34784(Class2520 var0, Class8518 var1) {
      if (method34777(var0)) {
         Texture var4 = TextureImpl.method36176();
         TextureImpl.bindNone();
         float[] var5 = var0.method10593();
         method34779(var0, new Class6015(var1));
         if (var4 != null) {
            var4.bind();
         } else {
            TextureImpl.bindNone();
         }
      }
   }

   public static final void method34785(Class2520 var0, Image var1, float var2, float var3, Class8518 var4) {
      if (method34777(var0)) {
         Texture var7 = TextureImpl.method36176();
         var1.method23565().bind();
         float[] var8 = var0.method10593();
         method34779(var0, new Class6018(var4, var8, var2, var3, var1));
         if (var7 != null) {
            var7.bind();
         } else {
            TextureImpl.bindNone();
         }
      }
   }

   public static final void method34786(Class2520 var0, Image var1, Class6880 var2) {
      Texture var5 = TextureImpl.method36176();
      var1.method23565().bind();
      float[] var6 = var0.method10593();
      method34779(var0, new Class6013(var2));
      if (var5 != null) {
         var5.bind();
      } else {
         TextureImpl.bindNone();
      }
   }

   // $VF: synthetic method
   public static SGL method34787() {
      return field42549;
   }
}