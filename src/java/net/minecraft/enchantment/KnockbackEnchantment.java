package net.minecraft.enchantment;

import net.minecraft.inventory.EquipmentSlotType;

public class KnockbackEnchantment extends Enchantment {
   private static String[] field27327;

   public KnockbackEnchantment(Rarity var1, EquipmentSlotType... var2) {
      super(var1, EnchantmentType.WEAPON, var2);
   }

   @Override
   public int method18807(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 2;
   }
}