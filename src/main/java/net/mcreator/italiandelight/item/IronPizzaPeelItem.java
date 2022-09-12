
package net.mcreator.italiandelight.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class IronPizzaPeelItem extends SwordItem {
	public IronPizzaPeelItem() {
		super(new Tier() {
			public int getUses() {
				return 198;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -1f, new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT));
	}
}
