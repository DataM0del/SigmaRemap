package net.minecraft.network.play.server;

import java.io.IOException;

import mapped.SoundCategory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.util.SoundEvent;
import org.apache.commons.lang3.Validate;

public class SPlaySoundEffectPacket implements IPacket<IClientPlayNetHandler> {
   private SoundEvent field24776;
   private SoundCategory field24777;
   private int field24778;
   private int field24779;
   private int field24780;
   private float field24781;
   private float field24782;

   public SPlaySoundEffectPacket() {
   }

   public SPlaySoundEffectPacket(SoundEvent var1, SoundCategory var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.field24776 = var1;
      this.field24777 = var2;
      this.field24778 = (int)(var3 * 8.0);
      this.field24779 = (int)(var5 * 8.0);
      this.field24780 = (int)(var7 * 8.0);
      this.field24781 = var9;
      this.field24782 = var10;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24776 = Registry.field16069.getByValue(var1.readVarInt());
      this.field24777 = var1.<SoundCategory>readEnumValue(SoundCategory.class);
      this.field24778 = var1.readInt();
      this.field24779 = var1.readInt();
      this.field24780 = var1.readInt();
      this.field24781 = var1.readFloat();
      this.field24782 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(Registry.field16069.getId(this.field24776));
      var1.writeEnumValue(this.field24777);
      var1.writeInt(this.field24778);
      var1.writeInt(this.field24779);
      var1.writeInt(this.field24780);
      var1.writeFloat(this.field24781);
      var1.writeFloat(this.field24782);
   }

   public SoundEvent method17549() {
      return this.field24776;
   }

   public SoundCategory method17550() {
      return this.field24777;
   }

   public double method17551() {
      return (double)((float)this.field24778 / 8.0F);
   }

   public double method17552() {
      return (double)((float)this.field24779 / 8.0F);
   }

   public double method17553() {
      return (double)((float)this.field24780 / 8.0F);
   }

   public float method17554() {
      return this.field24781;
   }

   public float method17555() {
      return this.field24782;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleSoundEffect(this);
   }
}
