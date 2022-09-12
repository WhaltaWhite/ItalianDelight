
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.italiandelight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.italiandelight.block.WoodeOvenBlock;
import net.mcreator.italiandelight.block.PizzaMargheritaBlock;
import net.mcreator.italiandelight.block.PizzaMargherita1quarterBlock;
import net.mcreator.italiandelight.block.PizzaDiavolaPlacedBlock;
import net.mcreator.italiandelight.block.MuchroomPizzaBlockBlock;
import net.mcreator.italiandelight.block.HamPizzaPlacedBlock;
import net.mcreator.italiandelight.block.Crop7Block;
import net.mcreator.italiandelight.block.Crop6Block;
import net.mcreator.italiandelight.block.Crop5Block;
import net.mcreator.italiandelight.block.Crop4Block;
import net.mcreator.italiandelight.block.Crop3Block;
import net.mcreator.italiandelight.block.Crop2Block;
import net.mcreator.italiandelight.block.Crop1Block;
import net.mcreator.italiandelight.block.Crop0Block;
import net.mcreator.italiandelight.ItalianDelightMod;

public class ItalianDelightModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ItalianDelightMod.MODID);
	public static final RegistryObject<Block> PIZZA_MARGHERITA = REGISTRY.register("pizza_margherita", () -> new PizzaMargheritaBlock());
	public static final RegistryObject<Block> PIZZA_MARGHERITA_1QUARTER = REGISTRY.register("pizza_margherita_1quarter",
			() -> new PizzaMargherita1quarterBlock());
	public static final RegistryObject<Block> PIZZA_DIAVOLA_PLACED = REGISTRY.register("pizza_diavola_placed", () -> new PizzaDiavolaPlacedBlock());
	public static final RegistryObject<Block> CROP_0 = REGISTRY.register("crop_0", () -> new Crop0Block());
	public static final RegistryObject<Block> CROP_1 = REGISTRY.register("crop_1", () -> new Crop1Block());
	public static final RegistryObject<Block> CROP_2 = REGISTRY.register("crop_2", () -> new Crop2Block());
	public static final RegistryObject<Block> CROP_3 = REGISTRY.register("crop_3", () -> new Crop3Block());
	public static final RegistryObject<Block> CROP_4 = REGISTRY.register("crop_4", () -> new Crop4Block());
	public static final RegistryObject<Block> CROP_5 = REGISTRY.register("crop_5", () -> new Crop5Block());
	public static final RegistryObject<Block> CROP_6 = REGISTRY.register("crop_6", () -> new Crop6Block());
	public static final RegistryObject<Block> CROP_7 = REGISTRY.register("crop_7", () -> new Crop7Block());
	public static final RegistryObject<Block> WOODE_OVEN = REGISTRY.register("woode_oven", () -> new WoodeOvenBlock());
	public static final RegistryObject<Block> HAM_PIZZA_PLACED = REGISTRY.register("ham_pizza_placed", () -> new HamPizzaPlacedBlock());
	public static final RegistryObject<Block> MUCHROOM_PIZZA_BLOCK = REGISTRY.register("muchroom_pizza_block", () -> new MuchroomPizzaBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PizzaMargheritaBlock.registerRenderLayer();
			PizzaMargherita1quarterBlock.registerRenderLayer();
			PizzaDiavolaPlacedBlock.registerRenderLayer();
			Crop0Block.registerRenderLayer();
			Crop1Block.registerRenderLayer();
			Crop2Block.registerRenderLayer();
			Crop3Block.registerRenderLayer();
			Crop4Block.registerRenderLayer();
			Crop5Block.registerRenderLayer();
			Crop6Block.registerRenderLayer();
			Crop7Block.registerRenderLayer();
			HamPizzaPlacedBlock.registerRenderLayer();
			MuchroomPizzaBlockBlock.registerRenderLayer();
		}
	}
}
