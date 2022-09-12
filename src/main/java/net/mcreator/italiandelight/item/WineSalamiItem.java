
package net.mcreator.italiandelight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class WineSalamiItem extends Item {
	public WineSalamiItem() {
		super(new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
