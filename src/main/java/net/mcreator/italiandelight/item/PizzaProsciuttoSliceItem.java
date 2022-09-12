
package net.mcreator.italiandelight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class PizzaProsciuttoSliceItem extends Item {
	public PizzaProsciuttoSliceItem() {
		super(new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f)

						.build()));
	}
}
