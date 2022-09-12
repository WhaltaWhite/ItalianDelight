
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.italiandelight.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ItalianDelightModTabs {
	public static CreativeModeTab TAB_ITALIAN_DELIGHT;

	public static void load() {
		TAB_ITALIAN_DELIGHT = new CreativeModeTab("tabitalian_delight") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ItalianDelightModItems.PIZZA_MARGEHRITA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
