package mapped;

import java.util.Arrays;

public class Class9682 {
   private ResourceLocation field45275;
   private float[] field45276;

   public Class9682(ResourceLocation var1, float[] var2) {
      this.field45275 = var1;
      this.field45276 = (float[])var2.clone();
      Arrays.sort(this.field45276);
   }

   public Integer method37908(Class8848 var1, Class1656 var2, Class880 var3) {
      Class3257 var6 = var1.method32107();
      Class8176 var7 = Class9065.method33752(var6, this.field45275);
      if (var7 != null) {
         float var8 = var7.method28467(var1, var2, var3);
         int var9 = Arrays.binarySearch(this.field45276, var8);
         return var9;
      } else {
         return null;
      }
   }

   public ResourceLocation method37909() {
      return this.field45275;
   }

   public float[] method37910() {
      return this.field45276;
   }

   @Override
   public String toString() {
      return "location: " + this.field45275 + ", values: [" + Class7944.method26858(this.field45276) + "]";
   }
}