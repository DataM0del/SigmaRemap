package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class Class251 extends Class219<Class1058, Class2880<Class1058>> {
   private static final Map<Class2286, ResourceLocation> field908 = ImmutableMap.of(
      Class2286.field15132,
      new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      Class2286.field15133,
      new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      Class2286.field15134,
      new ResourceLocation("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public Class251(Class5714<Class1058, Class2880<Class1058>> var1) {
      super(var1);
   }

   public void method820(Class9332 var1, Class7733 var2, int var3, Class1058 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method3342()) {
         Class2286 var13 = var4.method4865();
         if (var13 != Class2286.field15131) {
            ResourceLocation var14 = field908.get(var13);
            method824(this.method825(), var14, var1, var2, var3, var4, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}