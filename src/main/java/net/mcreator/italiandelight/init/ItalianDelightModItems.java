
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.italiandelight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.italiandelight.item.WineSalamiItem;
import net.mcreator.italiandelight.item.SweetBerryWineItem;
import net.mcreator.italiandelight.item.SpumanteItem;
import net.mcreator.italiandelight.item.SalamiPiecesItem;
import net.mcreator.italiandelight.item.SalamiItem;
import net.mcreator.italiandelight.item.RosewineItem;
import net.mcreator.italiandelight.item.RawMushroomPizzaItem;
import net.mcreator.italiandelight.item.RawMargheritaItem;
import net.mcreator.italiandelight.item.RawDiavolaItem;
import net.mcreator.italiandelight.item.PizzaalProsciutooItem;
import net.mcreator.italiandelight.item.PizzaProsciuttoSliceItem;
import net.mcreator.italiandelight.item.PizzaMargheritaSliceItem;
import net.mcreator.italiandelight.item.PizzaMargehritaItem;
import net.mcreator.italiandelight.item.PizzaDiavolaSliceItem;
import net.mcreator.italiandelight.item.PizzaDiavolaItem;
import net.mcreator.italiandelight.item.PizzaAlProsciuttoItem;
import net.mcreator.italiandelight.item.MushroomPizzaSliceItem;
import net.mcreator.italiandelight.item.MushroomPizzaItem;
import net.mcreator.italiandelight.item.IronPizzaPeelItem;
import net.mcreator.italiandelight.item.GrapeSeedsItem;
import net.mcreator.italiandelight.item.GrapeBunchItem;
import net.mcreator.italiandelight.item.GlowberryWineItem;
import net.mcreator.italiandelight.item.BottleWineItem;
import net.mcreator.italiandelight.ItalianDelightMod;

public class ItalianDelightModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ItalianDelightMod.MODID);
	public static final RegistryObject<Item> PIZZA_MARGEHRITA = REGISTRY.register("pizza_margehrita", () -> new PizzaMargehritaItem());
	public static final RegistryObject<Item> PIZZA_MARGHERITA = block(ItalianDelightModBlocks.PIZZA_MARGHERITA, null);
	public static final RegistryObject<Item> PIZZA_MARGHERITA_1QUARTER = block(ItalianDelightModBlocks.PIZZA_MARGHERITA_1QUARTER, null);
	public static final RegistryObject<Item> PIZZA_MARGHERITA_SLICE = REGISTRY.register("pizza_margherita_slice",
			() -> new PizzaMargheritaSliceItem());
	public static final RegistryObject<Item> PIZZA_DIAVOLA = REGISTRY.register("pizza_diavola", () -> new PizzaDiavolaItem());
	public static final RegistryObject<Item> PIZZA_DIAVOLA_PLACED = block(ItalianDelightModBlocks.PIZZA_DIAVOLA_PLACED, null);
	public static final RegistryObject<Item> PIZZA_DIAVOLA_SLICE = REGISTRY.register("pizza_diavola_slice", () -> new PizzaDiavolaSliceItem());
	public static final RegistryObject<Item> SWEET_BERRY_WINE = REGISTRY.register("sweet_berry_wine", () -> new SweetBerryWineItem());
	public static final RegistryObject<Item> GLOWBERRY_WINE = REGISTRY.register("glowberry_wine", () -> new GlowberryWineItem());
	public static final RegistryObject<Item> GRAPE_SEEDS = REGISTRY.register("grape_seeds", () -> new GrapeSeedsItem());
	public static final RegistryObject<Item> CROP_0 = block(ItalianDelightModBlocks.CROP_0, null);
	public static final RegistryObject<Item> CROP_1 = block(ItalianDelightModBlocks.CROP_1, null);
	public static final RegistryObject<Item> CROP_2 = block(ItalianDelightModBlocks.CROP_2, null);
	public static final RegistryObject<Item> CROP_3 = block(ItalianDelightModBlocks.CROP_3, null);
	public static final RegistryObject<Item> CROP_4 = block(ItalianDelightModBlocks.CROP_4, null);
	public static final RegistryObject<Item> CROP_5 = block(ItalianDelightModBlocks.CROP_5, null);
	public static final RegistryObject<Item> CROP_6 = block(ItalianDelightModBlocks.CROP_6, null);
	public static final RegistryObject<Item> CROP_7 = block(ItalianDelightModBlocks.CROP_7, null);
	public static final RegistryObject<Item> GRAPE_BUNCH = REGISTRY.register("grape_bunch", () -> new GrapeBunchItem());
	public static final RegistryObject<Item> WOODE_OVEN = block(ItalianDelightModBlocks.WOODE_OVEN, null);
	public static final RegistryObject<Item> RAW_MARGHERITA = REGISTRY.register("raw_margherita", () -> new RawMargheritaItem());
	public static final RegistryObject<Item> SALAMI = REGISTRY.register("salami", () -> new SalamiItem());
	public static final RegistryObject<Item> SALAMI_PIECES = REGISTRY.register("salami_pieces", () -> new SalamiPiecesItem());
	public static final RegistryObject<Item> RAW_DIAVOLA = REGISTRY.register("raw_diavola", () -> new RawDiavolaItem());
	public static final RegistryObject<Item> WINE_SALAMI = REGISTRY.register("wine_salami", () -> new WineSalamiItem());
	public static final RegistryObject<Item> ROSEWINE = REGISTRY.register("rosewine", () -> new RosewineItem());
	public static final RegistryObject<Item> PIZZA_AL_PROSCIUTTO = REGISTRY.register("pizza_al_prosciutto", () -> new PizzaAlProsciuttoItem());
	public static final RegistryObject<Item> HAM_PIZZA = REGISTRY.register("ham_pizza", () -> new PizzaalProsciutooItem());
	public static final RegistryObject<Item> HAM_PIZZA_PLACED = block(ItalianDelightModBlocks.HAM_PIZZA_PLACED, null);
	public static final RegistryObject<Item> BOTTLE_WINE = REGISTRY.register("bottle_wine", () -> new BottleWineItem());
	public static final RegistryObject<Item> RAW_MUSHROOM_PIZZA = REGISTRY.register("raw_mushroom_pizza", () -> new RawMushroomPizzaItem());
	public static final RegistryObject<Item> MUSHROOM_PIZZA = REGISTRY.register("mushroom_pizza", () -> new MushroomPizzaItem());
	public static final RegistryObject<Item> MUCHROOM_PIZZA_BLOCK = block(ItalianDelightModBlocks.MUCHROOM_PIZZA_BLOCK,
			ItalianDelightModTabs.TAB_ITALIAN_DELIGHT);
	public static final RegistryObject<Item> MUSHROOM_PIZZA_SLICE = REGISTRY.register("mushroom_pizza_slice", () -> new MushroomPizzaSliceItem());
	public static final RegistryObject<Item> PIZZA_PROSCIUTTO_SLICE = REGISTRY.register("pizza_prosciutto_slice",
			() -> new PizzaProsciuttoSliceItem());
	public static final RegistryObject<Item> SPUMANTE = REGISTRY.register("spumante", () -> new SpumanteItem());
	public static final RegistryObject<Item> IRON_PIZZA_PEEL = REGISTRY.register("iron_pizza_peel", () -> new IronPizzaPeelItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
