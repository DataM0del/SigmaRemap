package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class3318 extends Class3257 {
   public Class3318(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11707(Class5911 var1) {
      Class1655 var4 = var1.method18360();
      if (!var4.field9020) {
         Class8848 var5 = var1.method18357();
         Vector3d var6 = var1.method18355();
         Direction var7 = var1.method18354();
         Class888 var8 = new Class888(
            var4,
            var1.method18358(),
            var6.field18048 + (double)var7.method539() * 0.15,
            var6.field18049 + (double)var7.method540() * 0.15,
            var6.field18050 + (double)var7.method541() * 0.15,
            var5
         );
         var4.method6916(var8);
         var5.method32182(1);
      }

      return Class2274.method9002(var4.field9020);
   }

   @Override
   public Class6794<Class8848> method11700(Class1655 var1, PlayerEntity var2, Class79 var3) {
      if (!var2.method3165()) {
         return Class6794.<Class8848>method20698(var2.method3094(var3));
      } else {
         Class8848 var6 = var2.method3094(var3);
         if (!var1.field9020) {
            var1.method6916(new Class888(var1, var6, var2));
            if (!var2.field4919.field29609) {
               var6.method32182(1);
            }
         }

         return Class6794.<Class8848>method20700(var2.method3094(var3), var1.method6714());
      }
   }

   @Override
   public void method11730(Class8848 var1, Class1655 var2, List<ITextComponent> var3, Class2216 var4) {
      Class39 var7 = var1.method32145("Fireworks");
      if (var7 != null) {
         if (var7.method119("Flight", 99)) {
            var3.add(
               new TranslationTextComponent("item.minecraft.firework_rocket.flight")
                  .appendString(" ")
                  .appendString(String.valueOf(var7.method120("Flight")))
                  .mergeStyle(TextFormatting.GRAY)
            );
         }

         Class41 var8 = var7.method131("Explosions", 10);
         if (!var8.isEmpty()) {
            for (int var9 = 0; var9 < var8.size(); var9++) {
               Class39 var10 = var8.method153(var9);
               ArrayList var11 = Lists.newArrayList();
               Class3320.method11873(var10, var11);
               if (!var11.isEmpty()) {
                  for (int var12 = 1; var12 < var11.size(); var12++) {
                     var11.set(var12, new StringTextComponent("  ").append((ITextComponent)var11.get(var12)).mergeStyle(TextFormatting.GRAY));
                  }

                  var3.addAll(var11);
               }
            }
         }
      }
   }
}