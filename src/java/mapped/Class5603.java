package mapped;

import java.io.IOException;

public class Class5603 implements Packet<Class5110> {
   private static String[] field24877;
   public double field24878;
   public double field24879;
   public double field24880;
   public float field24881;
   public float field24882;
   public boolean field24883;
   public boolean field24884;
   public boolean field24885;

   public Class5603() {
   }

   public Class5603(boolean var1) {
      this.field24883 = var1;
   }

   public void method17180(Class5110 var1) {
      var1.method15622(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24883 = var1.readUnsignedByte() != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(!this.field24883 ? 0 : 1);
   }

   public double method17625(double var1) {
      return !this.field24884 ? var1 : this.field24878;
   }

   public double method17626(double var1) {
      return !this.field24884 ? var1 : this.field24879;
   }

   public double method17627(double var1) {
      return !this.field24884 ? var1 : this.field24880;
   }

   public float method17628(float var1) {
      return !this.field24885 ? var1 : this.field24881;
   }

   public float method17629(float var1) {
      return !this.field24885 ? var1 : this.field24882;
   }

   public boolean method17630() {
      return this.field24883;
   }
}