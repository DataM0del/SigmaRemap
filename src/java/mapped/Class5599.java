package mapped;

import java.io.IOException;

public class Class5599 implements Packet<Class5116> {
   private boolean field24846;
   private boolean field24847;
   private boolean field24848;
   private boolean field24849;
   private float field24850;
   private float field24851;

   public Class5599() {
   }

   public Class5599(Class6799 var1) {
      this.field24846 = var1.field29606;
      this.field24847 = var1.field29607;
      this.field24848 = var1.field29608;
      this.field24849 = var1.field29609;
      this.field24850 = var1.method20714();
      this.field24851 = var1.method20716();
   }

   @Override
   public void method17175(PacketBuffer buf) throws IOException {
        byte b0 = buf.readByte();
        this.field24846  = (b0 & 1) != 0;
        this.field24847  = (b0 & 2) != 0;
        this.field24848  = (b0 & 4) != 0;
        this.field24849 = (b0 & 8) != 0;
        this.field24850  = buf.readFloat();
        this.field24851  = buf.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      byte var4 = 0;
      if (this.field24846) {
         var4 = (byte)(var4 | 1);
      }

      if (this.field24847) {
         var4 = (byte)(var4 | 2);
      }

      if (this.field24848) {
         var4 = (byte)(var4 | 4);
      }

      if (this.field24849) {
         var4 = (byte)(var4 | 8);
      }

      var1.writeByte(var4);
      var1.writeFloat(this.field24850);
      var1.writeFloat(this.field24851);
   }

   public void method17180(Class5116 var1) {
      var1.method15730(this);
   }

   public boolean method17602() {
      return this.field24846;
   }

   public boolean method17603() {
      return this.field24847;
   }

   public boolean method17604() {
      return this.field24848;
   }

   public boolean method17605() {
      return this.field24849;
   }

   public float method17606() {
      return this.field24850;
   }

   public float method17607() {
      return this.field24851;
   }
}