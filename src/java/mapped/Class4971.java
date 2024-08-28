package mapped;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;

public class Class4971 extends Class4928<Class133> {
   public void method15246(JsonObject var1, Class133 var2, JsonSerializationContext var3) {
      super.method15246(var1, var2, var3);
      if (!Class133.method390(var2).isEmpty()) {
         JsonArray var6 = new JsonArray();

         for (Class7144 var8 : Class133.method390(var2).keySet()) {
            JsonObject var9 = new JsonObject();
            ResourceLocation var10 = Class2348.field16071.method9181(var8);
            if (var10 == null) {
               throw new IllegalArgumentException("Don't know how to serialize mob effect " + var8);
            }

            var9.add("type", new JsonPrimitive(var10.toString()));
            var9.add("duration", var3.serialize(Class133.method390(var2).get(var8)));
            var6.add(var9);
         }

         var1.add("effects", var6);
      }
   }

   public Class133 method15244(JsonObject var1, JsonDeserializationContext var2, Class122[] var3) {
      HashMap var6 = Maps.newHashMap();
      if (var1.has("effects")) {
         for (JsonElement var8 : Class8963.method32785(var1, "effects")) {
            String var9 = Class8963.method32763(var8.getAsJsonObject(), "type");
            Class7144 var10 = Class2348.field16071
               .method9187(new ResourceLocation(var9))
               .orElseThrow(() -> new JsonSyntaxException("Unknown mob effect '" + var9 + "'"));
            Class6872 var11 = Class8963.<Class6872>method32788(var8.getAsJsonObject(), "duration", var2, Class6872.class);
            var6.put(var10, var11);
         }
      }

      return new Class133(var3, var6);
   }
}