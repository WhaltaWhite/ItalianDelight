
package net.mcreator.italiandelight.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.italiandelight.procedures.PizzaDiavolaPlaceProcedure;
import net.mcreator.italiandelight.init.ItalianDelightModTabs;

public class PizzaDiavolaItem extends Item {
	public PizzaDiavolaItem() {
		super(new Item.Properties().tab(ItalianDelightModTabs.TAB_ITALIAN_DELIGHT).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BLOCK;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		PizzaDiavolaPlaceProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
