package mapped;

import com.google.common.collect.ImmutableList;

public class Class4116 extends Class4057 {
   public Class4116() {
      super(Class8992.field41011, "boat", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2883();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2883) {
         Class2883 var5 = (Class2883)var1;
         ImmutableList var6 = var5.method11015();
         if (var6 != null) {
            if (var2.equals("bottom")) {
               return Class8542.method30391(var6, 0);
            }

            if (var2.equals("back")) {
               return Class8542.method30391(var6, 1);
            }

            if (var2.equals("front")) {
               return Class8542.method30391(var6, 2);
            }

            if (var2.equals("right")) {
               return Class8542.method30391(var6, 3);
            }

            if (var2.equals("left")) {
               return Class8542.method30391(var6, 4);
            }

            if (var2.equals("paddle_left")) {
               return Class8542.method30391(var6, 5);
            }

            if (var2.equals("paddle_right")) {
               return Class8542.method30391(var6, 6);
            }
         }

         return !var2.equals("bottom_no_water") ? null : var5.method11199();
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5725 var6 = new Class5725(var5);
      if (Class9299.field43136.method20238()) {
         Class9299.method35082(var6, Class9299.field43136, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: RenderBoat.modelBoat");
         return null;
      }
   }
}