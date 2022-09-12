package net.mcreator.italiandelight.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.italiandelight.init.ItalianDelightModItems;
import net.mcreator.italiandelight.init.ItalianDelightModBlocks;

public class PizzaalProsciutooRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(ItalianDelightModItems.HAM_PIZZA.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		world.setBlock(new BlockPos(x, y + 1, z), ItalianDelightModBlocks.HAM_PIZZA_PLACED.get().defaultBlockState(), 3);
	}
}
