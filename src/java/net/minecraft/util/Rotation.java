package net.minecraft.util;

import com.google.common.collect.Lists;
import mapped.Class178;
import mapped.Class8568;
import net.minecraft.client.util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Rotation {
   field185(Class178.field565),
   field186(Class178.field585),
   field187(Class178.field567),
   field188(Class178.field586);

   private final Class178 field189;
   private static final Rotation[] field190 = new Rotation[]{field185, field186, field187, field188};

   private Rotation(Class178 var3) {
      this.field189 = var3;
   }

   public Rotation method250(Rotation var1) {
      switch (Class8568.field38525[var1.ordinal()]) {
         case 3:
            switch (Class8568.field38525[this.ordinal()]) {
               case 1:
                  return field187;
               case 2:
                  return field188;
               case 3:
                  return field185;
               case 4:
                  return field186;
            }
         case 4:
            switch (Class8568.field38525[this.ordinal()]) {
               case 1:
                  return field188;
               case 2:
                  return field185;
               case 3:
                  return field186;
               case 4:
                  return field187;
            }
         case 2:
            switch (Class8568.field38525[this.ordinal()]) {
               case 1:
                  return field186;
               case 2:
                  return field187;
               case 3:
                  return field188;
               case 4:
                  return field185;
            }
         default:
            return this;
      }
   }

   public Class178 method251() {
      return this.field189;
   }

   public Direction rotate(Direction var1) {
      if (var1.getAxis() == Direction.Axis.Y) {
         return var1;
      } else {
         switch (Class8568.field38525[this.ordinal()]) {
            case 2:
               return var1.rotateY();
            case 3:
               return var1.getOpposite();
            case 4:
               return var1.rotateYCCW();
            default:
               return var1;
         }
      }
   }

   public int method253(int var1, int var2) {
      switch (Class8568.field38525[this.ordinal()]) {
         case 2:
            return (var1 + var2 / 4) % var2;
         case 3:
            return (var1 + var2 / 2) % var2;
         case 4:
            return (var1 + var2 * 3 / 4) % var2;
         default:
            return var1;
      }
   }

   public static Rotation method254(Random var0) {
      return Util.<Rotation>getRandomObject(values(), var0);
   }

   public static List<Rotation> method255(Random var0) {
      ArrayList var3 = Lists.newArrayList(values());
      Collections.shuffle(var3, var0);
      return var3;
   }
}