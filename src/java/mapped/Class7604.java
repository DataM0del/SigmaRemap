package mapped;

import java.util.List;

public class Class7604 implements Class7601 {
   private static String[] field32643;
   private final Class7952 field32644;
   private boolean field32645;

   public Class7604(Class7952 var1) {
      this.field32644 = var1;
   }

   @Override
   public Class2139 method24894(Class9332 var1, Class1264 var2, long var3) {
      var2.method5915().getTextureManager().bindTexture(field32630);
      RenderSystem.method27890(1.0F, 1.0F, 1.0F);
      Class9272 var7 = this.field32644.method27027();
      var2.method5696(var1, 0, 0, 0, 0, this.method24898(), this.method24899());
      if (var7 == null) {
         return Class2139.field14004;
      } else {
         List<Class9125> var8 = var2.method5915().field1294.method38828(var7.method34934(), 125);
         int var9 = var7.method34938() != Class1965.field12815 ? 16776960 : 16746751;
         if (var8.size() != 1) {
            short var10 = 1500;
            float var11 = 300.0F;
            if (var3 >= 1500L) {
               int var12 = Class9679.method37767(Class9679.method37777((float)(var3 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 67108864;
               int var13 = this.method24899() / 2 - var8.size() * 9 / 2;

               for (Class9125 var15 : var8) {
                  var2.method5915().field1294.method38804(var1, var15, 30.0F, (float)var13, 16777215 | var12);
                  var13 += 9;
               }
            } else {
               int var16 = Class9679.method37767(Class9679.method37777((float)(1500L - var3) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 67108864;
               var2.method5915().field1294.method38805(var1, var7.method34938().method8245(), 30.0F, 11.0F, var9 | var16);
            }
         } else {
            var2.method5915().field1294.method38805(var1, var7.method34938().method8245(), 30.0F, 7.0F, var9 | 0xFF000000);
            var2.method5915().field1294.method38804(var1, (Class9125)var8.get(0), 30.0F, 18.0F, -1);
         }

         if (!this.field32645 && var3 > 0L) {
            this.field32645 = true;
            if (var7.method34938() == Class1965.field12815) {
               var2.method5915().method1546().method1000(Class6339.method19293(Class6067.field27182, 1.0F, 1.0F));
            }
         }

         var2.method5915().method1555().method794(var7.method34936(), 8, 8);
         return var3 < 5000L ? Class2139.field14003 : Class2139.field14004;
      }
   }
}