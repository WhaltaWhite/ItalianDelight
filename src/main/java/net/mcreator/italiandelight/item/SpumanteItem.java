
package net.mcreator.italiandelight.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.italiandelight.procedures.SpumantePlayerFinishesUsingItemProcedure;
import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class SpumanteItem extends Item {
	public SpumanteItem() {
		super(new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0.7f)

						.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SpumantePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
