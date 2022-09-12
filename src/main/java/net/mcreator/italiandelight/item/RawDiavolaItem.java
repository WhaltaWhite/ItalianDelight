
package net.mcreator.italiandelight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class RawDiavolaItem extends Item {
	public RawDiavolaItem() {
		super(new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
