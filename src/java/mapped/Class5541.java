package mapped;

import java.io.IOException;

public class Class5541 implements Packet<Class5110> {
   private static String[] field24598;
   private int field24599;

   public Class5541() {
   }

   public Class5541(int var1) {
      this.field24599 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24599 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24599);
   }

   public void method17180(Class5110 var1) {
      var1.method15647(this);
   }

   public int method17420() {
      return this.field24599;
   }
}