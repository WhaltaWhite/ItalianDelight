
package net.mcreator.italiandelight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class RawMargheritaItem extends Item {
	public RawMargheritaItem() {
		super(new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT).stacksTo(1).rarity(Rarity.COMMON));
	}
}
