package mapped;

public final class Class6472 implements Class6466<Class7921> {
   private static String[] field28419;

   public void method19646(PacketBuffer var1, Class7921 var2) {
      var1.writeVarInt(Class2348.field16089.method9171(var2.method26570()));
      var1.writeVarInt(Class2348.field16090.method9171(var2.method26571()));
      var1.writeVarInt(var2.method26572());
   }

   public Class7921 method19645(PacketBuffer var1) {
      return new Class7921(Class2348.field16089.method9172(var1.method35714()), Class2348.field16090.method9172(var1.method35714()), var1.method35714());
   }

   public Class7921 method19644(Class7921 var1) {
      return var1;
   }
}