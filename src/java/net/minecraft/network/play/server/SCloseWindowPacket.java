package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SCloseWindowPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24789;
   private int field24790;

   public SCloseWindowPacket() {
   }

   public SCloseWindowPacket(int var1) {
      this.field24790 = var1;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleCloseWindow(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24790 = var1.readUnsignedByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24790);
   }
}