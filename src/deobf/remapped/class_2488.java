package remapped;

import javax.annotation.Nullable;

public class class_2488 extends class_1094 {
   private static String[] field_12383;
   private Screen field_12384;

   public void method_11390(Screen var1) {
      this.field_12384 = var1;
      MinecraftClient.getInstance().method_8609(new class_7039(this));
   }

   @Nullable
   public class_1094 method_11391(Screen var1) {
      this.field_12384 = var1;
      return new class_772();
   }

   @Override
   public void method_1163() {
      MinecraftClient.getInstance().method_8609(this.field_12384);
   }
}
