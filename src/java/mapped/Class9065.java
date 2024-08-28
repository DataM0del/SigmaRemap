package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class Class9065 {
   private static final Map<ResourceLocation, Class8176> field41483 = Maps.newHashMap();
   private static final ResourceLocation field41484 = new ResourceLocation("damaged");
   private static final ResourceLocation field41485 = new ResourceLocation("damage");
   private static final Class8176 field41486 = (var0, var1, var2) -> !var0.method32116() ? 0.0F : 1.0F;
   private static final Class8176 field41487 = (var0, var1, var2) -> Class9679.method37777((float)var0.method32117() / (float)var0.method32119(), 0.0F, 1.0F);
   private static final Map<Class3257, Map<ResourceLocation, Class8176>> field41488 = Maps.newHashMap();

   private static Class8176 method33750(ResourceLocation var0, Class8176 var1) {
      field41483.put(var0, var1);
      return var1;
   }

   private static void method33751(Class3257 var0, ResourceLocation var1, Class8176 var2) {
      field41488.computeIfAbsent(var0, var0x -> Maps.newHashMap()).put(var1, var2);
   }

   @Nullable
   public static Class8176 method33752(Class3257 var0, ResourceLocation var1) {
      if (var0.method11711() > 0) {
         if (field41485.equals(var1)) {
            return field41487;
         }

         if (field41484.equals(var1)) {
            return field41486;
         }
      }

      Class8176 var4 = field41483.get(var1);
      if (var4 == null) {
         Map var5 = field41488.get(var0);
         return var5 != null ? (Class8176)var5.get(var1) : null;
      } else {
         return var4;
      }
   }

   static {
      method33750(new ResourceLocation("lefthanded"), (var0, var1, var2) -> var2 != null && var2.method2967() != Class2205.field14418 ? 1.0F : 0.0F);
      method33750(
         new ResourceLocation("cooldown"),
         (var0, var1, var2) -> !(var2 instanceof PlayerEntity) ? 0.0F : ((PlayerEntity)var2).method2976().method19636(var0.method32107(), 0.0F)
      );
      method33750(new ResourceLocation("custom_model_data"), (var0, var1, var2) -> !var0.method32141() ? 0.0F : (float)var0.method32142().method122("CustomModelData"));
      method33751(Class8514.field37796, new ResourceLocation("pull"), (var0, var1, var2) -> {
         if (var2 != null) {
            return var2.method3158() == var0 ? (float)(var0.method32137() - var2.method3159()) / 20.0F : 0.0F;
         } else {
            return 0.0F;
         }
      });
      method33751(
         Class8514.field37796, new ResourceLocation("pulling"), (var0, var1, var2) -> var2 != null && var2.method3148() && var2.method3158() == var0 ? 1.0F : 0.0F
      );
      method33751(Class8514.field37907, new ResourceLocation("time"), new Class8177());
      method33751(Class8514.field37905, new ResourceLocation("angle"), new Class8178());
      method33751(Class8514.field38148, new ResourceLocation("pull"), (var0, var1, var2) -> {
         if (var2 != null) {
            return !Class3261.method11755(var0) ? (float)(var0.method32137() - var2.method3159()) / (float)Class3261.method11767(var0) : 0.0F;
         } else {
            return 0.0F;
         }
      });
      method33751(
         Class8514.field38148,
         new ResourceLocation("pulling"),
         (var0, var1, var2) -> var2 != null && var2.method3148() && var2.method3158() == var0 && !Class3261.method11755(var0) ? 1.0F : 0.0F
      );
      method33751(Class8514.field38148, new ResourceLocation("charged"), (var0, var1, var2) -> var2 != null && Class3261.method11755(var0) ? 1.0F : 0.0F);
      method33751(
         Class8514.field38148,
         new ResourceLocation("firework"),
         (var0, var1, var2) -> var2 != null && Class3261.method11755(var0) && Class3261.method11760(var0, Class8514.field38068) ? 1.0F : 0.0F
      );
      method33751(Class8514.field38120, new ResourceLocation("broken"), (var0, var1, var2) -> !Class3256.method11698(var0) ? 1.0F : 0.0F);
      method33751(Class8514.field37906, new ResourceLocation("cast"), (var0, var1, var2) -> {
         if (var2 != null) {
            boolean var5 = var2.method3090() == var0;
            boolean var6 = var2.method3091() == var0;
            if (var2.method3090().method32107() instanceof Class3259) {
               var6 = false;
            }

            return (var5 || var6) && var2 instanceof PlayerEntity && ((PlayerEntity)var2).field4930 != null ? 1.0F : 0.0F;
         } else {
            return 0.0F;
         }
      });
      method33751(
         Class8514.field38119, new ResourceLocation("blocking"), (var0, var1, var2) -> var2 != null && var2.method3148() && var2.method3158() == var0 ? 1.0F : 0.0F
      );
      method33751(
         Class8514.field38144, new ResourceLocation("throwing"), (var0, var1, var2) -> var2 != null && var2.method3148() && var2.method3158() == var0 ? 1.0F : 0.0F
      );
   }
}