package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;

public class Class7957 {
   private int field34204 = -1;
   private Object field34205;

   public Class7957(JSONObject var1) {
      this.method27050(var1);
   }

   public Class7957(int var1, Module var2) {
      this.field34204 = var1;
      this.field34205 = var2;
   }

   public Class7957(int var1, Class<? extends Screen> var2) {
      this.field34204 = var1;
      this.field34205 = var2;
   }

   public void method27050(JSONObject var1) {
      if (var1.has("target")) {
         if (var1.has("key")) {
            this.field34204 = var1.method21767("key");
         }

         if (var1.has("type")) {
            String var4 = var1.method21773("type");
            switch (var4) {
               case "mod":
                  for (Module var7 : Client.getInstance().getModuleManager().method14664().values()) {
                     if (var1.method21773("target").equals(var7.method15991())) {
                        this.field34205 = var7;
                     }
                  }
               case "screen":
                  Class var8 = Client.getInstance().getGuiManager().method33477(var1.method21773("target"));
                  if (var8 != null) {
                     this.field34205 = var8;
                  }
            }
         }
      }
   }

   public JSONObject method27051() {
      JSONObject var3 = new JSONObject();
      switch (Class8251.field35450[this.method27055().ordinal()]) {
         case 1:
            var3.method21806("type", "mod");
            var3.method21806("target", ((Module)this.field34205).method15991());
            break;
         case 2:
            var3.method21806("type", "screen");
            var3.method21806("target", Client.getInstance().getGuiManager().method33478((Class<? extends Screen>)this.field34205));
      }

      var3.method21803("key", this.field34204);
      return var3;
   }

   public boolean method27052() {
      return this.field34205 != null;
   }

   public int method27053() {
      return this.field34204;
   }

   public void method27054(int var1) {
      this.field34204 = var1;
   }

   public Class2067 method27055() {
      return !(this.field34205 instanceof Module) ? Class2067.field13470 : Class2067.field13469;
   }

   public Object method27056() {
      return this.field34205;
   }

   public Class<? extends Screen> method27057() {
      return (Class<? extends Screen>)this.field34205;
   }

   public Module method27058() {
      return (Module)this.field34205;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (var1 instanceof Class7957) {
            Class7957 var4 = (Class7957)var1;
            return this.method27056().equals(var4.method27056());
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}