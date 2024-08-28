package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Class8811 {
   public static final Class8811 field39645 = new Class8811((Class39)null);
   private final Class39 field39646;

   public Class8811(Class39 var1) {
      this.field39646 = var1;
   }

   public boolean method31808(ItemStack var1) {
      return this != field39645 ? this.method31810(var1.method32142()) : true;
   }

   public boolean method31809(Entity var1) {
      return this != field39645 ? this.method31810(method31813(var1)) : true;
   }

   public boolean method31810(Class30 var1) {
      return var1 == null ? this == field39645 : this.field39646 == null || Class8354.method29280(this.field39646, var1, true);
   }

   public JsonElement method31811() {
      return (JsonElement)(this != field39645 && this.field39646 != null ? new JsonPrimitive(this.field39646.toString()) : JsonNull.INSTANCE);
   }

   public static Class8811 method31812(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         Class39 var3;
         try {
            var3 = Class7671.method25188(Class8963.method32762(var0, "nbt"));
         } catch (CommandSyntaxException var5) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var5.getMessage());
         }

         return new Class8811(var3);
      } else {
         return field39645;
      }
   }

   public static Class39 method31813(Entity var0) {
      Class39 var3 = var0.method3294(new Class39());
      if (var0 instanceof PlayerEntity) {
         ItemStack var4 = ((PlayerEntity)var0).field4902.method4028();
         if (!var4.method32105()) {
            var3.method99("SelectedItem", var4.method32112(new Class39()));
         }
      }

      return var3;
   }
}
