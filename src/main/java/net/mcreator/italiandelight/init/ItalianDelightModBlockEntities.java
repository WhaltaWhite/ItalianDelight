
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.italiandelight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.italiandelight.block.entity.WoodeOvenBlockEntity;
import net.mcreator.italiandelight.block.entity.Crop7BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop6BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop5BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop4BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop3BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop2BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop1BlockEntity;
import net.mcreator.italiandelight.block.entity.Crop0BlockEntity;
import net.mcreator.italiandelight.ItalianDelightMod;

public class ItalianDelightModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			ItalianDelightMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CROP_0 = register("crop_0", ItalianDelightModBlocks.CROP_0, Crop0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_1 = register("crop_1", ItalianDelightModBlocks.CROP_1, Crop1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_2 = register("crop_2", ItalianDelightModBlocks.CROP_2, Crop2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_3 = register("crop_3", ItalianDelightModBlocks.CROP_3, Crop3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_4 = register("crop_4", ItalianDelightModBlocks.CROP_4, Crop4BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_5 = register("crop_5", ItalianDelightModBlocks.CROP_5, Crop5BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_6 = register("crop_6", ItalianDelightModBlocks.CROP_6, Crop6BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CROP_7 = register("crop_7", ItalianDelightModBlocks.CROP_7, Crop7BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WOODE_OVEN = register("woode_oven", ItalianDelightModBlocks.WOODE_OVEN,
			WoodeOvenBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
