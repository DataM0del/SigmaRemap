package remapped;

public class class_3602 extends class_2520 {
   public class_3602() {
      super(EntityType.field_34266, "husk", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7939(0.0F, false);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_8263 var6 = new class_8263(var5);
      var6.field_32487 = (class_7939<class_2811>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
