package net.minecraft.nbt;

import mapped.*;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.lang3.ArrayUtils;

import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ByteArrayNBT extends CollectionNBT<ByteNBT> {
   public static final INBTType<ByteArrayNBT> TYPE = new Class7058();
   private byte[] field55;

   public ByteArrayNBT(byte[] var1) {
      this.field55 = var1;
   }

   public ByteArrayNBT(List<Byte> var1) {
      this(toArray(var1));
   }

   private static byte[] toArray(List<Byte> var0) {
      byte[] var3 = new byte[var0.size()];

      for (int var4 = 0; var4 < var0.size(); var4++) {
         Byte var5 = (Byte)var0.get(var4);
         var3[var4] = var5 != null ? var5 : 0;
      }

      return var3;
   }

   @Override
   public void write(DataOutput var1) throws IOException {
      var1.writeInt(this.field55.length);
      var1.write(this.field55);
   }

   @Override
   public byte getID() {
      return 7;
   }

   @Override
   public INBTType<ByteArrayNBT> getType() {
      return TYPE;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder("[B;");

      for (int var4 = 0; var4 < this.field55.length; var4++) {
         if (var4 != 0) {
            var3.append(',');
         }

         var3.append(this.field55[var4]).append('B');
      }

      return var3.append(']').toString();
   }

   @Override
   public INBT copy() {
      byte[] var3 = new byte[this.field55.length];
      System.arraycopy(this.field55, 0, var3, 0, this.field55.length);
      return new ByteArrayNBT(var3);
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof ByteArrayNBT && Arrays.equals(this.field55, ((ByteArrayNBT)var1).field55);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.field55);
   }

   @Override
   public ITextComponent toFormattedComponent(String indentation, int indentDepth) {
      IFormattableTextComponent var5 = new StringTextComponent("B").mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER_TYPE);
      IFormattableTextComponent var6 = new StringTextComponent("[").append(var5).appendString(";");

      for (int var7 = 0; var7 < this.field55.length; var7++) {
         IFormattableTextComponent var8 = new StringTextComponent(String.valueOf(this.field55[var7])).mergeStyle(SYNTAX_HIGHLIGHTING_NUMBER);
         var6.appendString(" ").append(var8).append(var5);
         if (var7 != this.field55.length - 1) {
            var6.appendString(",");
         }
      }

      var6.appendString("]");
      return var6;
   }

   public byte[] getByteArray() {
      return this.field55;
   }

   @Override
   public int size() {
      return this.field55.length;
   }

   public ByteNBT get(int var1) {
      return ByteNBT.valueOf(this.field55[var1]);
   }

   public ByteNBT set(int var1, ByteNBT var2) {
      byte var5 = this.field55[var1];
      this.field55[var1] = var2.getByte();
      return ByteNBT.valueOf(var5);
   }

   public void add(int var1, ByteNBT var2) {
      this.field55 = ArrayUtils.add(this.field55, var1, var2.getByte());
   }

   @Override
   public boolean setNBTByIndex(int var1, INBT var2) {
      if (!(var2 instanceof NumberNBT)) {
         return false;
      } else {
         this.field55[var1] = ((NumberNBT)var2).getByte();
         return true;
      }
   }

   @Override
   public boolean addNBTByIndex(int var1, INBT var2) {
      if (!(var2 instanceof NumberNBT)) {
         return false;
      } else {
         this.field55 = ArrayUtils.add(this.field55, var1, ((NumberNBT)var2).getByte());
         return true;
      }
   }

   public ByteNBT remove(int var1) {
      byte var4 = this.field55[var1];
      this.field55 = ArrayUtils.remove(this.field55, var1);
      return ByteNBT.valueOf(var4);
   }

   @Override
   public byte getTagType() {
      return 1;
   }

   @Override
   public void clear() {
      this.field55 = new byte[0];
   }
}
