package mapped;

import com.google.gson.JsonObject;
import java.io.IOException;
import javax.annotation.Nullable;

public class Class7545 implements Class7544 {
   private final ResourceLocation field32363;
   private final String field32364;

   public Class7545(ResourceLocation var1, String var2) {
      this.field32363 = var1;
      this.field32364 = var2;
   }

   public static Class7544 method24665(JsonObject var0) {
      return new Class7545(new ResourceLocation(Class8963.method32763(var0, "sizes")), Class8963.method32763(var0, "template"));
   }

   @Nullable
   @Override
   public Class1768 method24664(Class191 var1) {
      try (Class1783 var4 = Minecraft.getInstance().method1537().method580(this.field32363)) {
         byte[] var6 = new byte[65536];
         var4.method7763().read(var6);
         return new Class1770(var1, var6, this.field32364);
      } catch (IOException var19) {
         Class1770.method7747().error("Cannot load {}, unicode glyphs will not render correctly", this.field32363);
         return null;
      }
   }
}