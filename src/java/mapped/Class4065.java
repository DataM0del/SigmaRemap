package mapped;

public class Class4065 extends Class4057 {
   public Class4065() {
      super(Class8992.field41008, "bat", 0.25F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2811();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2811) {
         Class2811 var5 = (Class2811)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("right_wing")) {
                  if (!var2.equals("left_wing")) {
                     if (!var2.equals("outer_right_wing")) {
                        return !var2.equals("outer_left_wing") ? null : (Class7219)Class9299.method35075(var5, Class9299.field43026, 5);
                     } else {
                        return (Class7219)Class9299.method35075(var5, Class9299.field43026, 4);
                     }
                  } else {
                     return (Class7219)Class9299.method35075(var5, Class9299.field43026, 3);
                  }
               } else {
                  return (Class7219)Class9299.method35075(var5, Class9299.field43026, 2);
               }
            } else {
               return (Class7219)Class9299.method35075(var5, Class9299.field43026, 1);
            }
         } else {
            return (Class7219)Class9299.method35075(var5, Class9299.field43026, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "right_wing", "left_wing", "outer_right_wing", "outer_left_wing"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5653 var6 = new Class5653(var5);
      var6.field25086 = (Class2811)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}