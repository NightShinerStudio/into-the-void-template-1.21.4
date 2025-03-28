package com.nightshinerst.itv.block;

import com.mojang.serialization.MapCodec;
import com.nightshinerst.itv.IntoTheVoid;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block VOID_LOG_BLOCK = registerBlock("void_log_block",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "void_log_block"))).strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VOID_PLANKS_BLOCK = registerBlock("void_planks_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "void_planks_block"))).strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VOID_WOOD_BLOCK = registerBlock("void_wood_block",
            new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "void_wood_block"))).strength(2f, 2f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block ASH_SAND_BLOCK = registerBlock("ash_sand_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "ash_sand_block"))).strength(.5f, .6f)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block TAN_SAND_BLOCK = registerBlock("tan_sand_block",
            new FallingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "tan_sand_block"))).strength(.5f, .6f)
                    .sounds(BlockSoundGroup.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null;
                }
            });

    public static final Block QUARTZITE_BLOCK = registerBlock("quartzite_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "quartzite_block"))).strength(1.5f, 6f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_QUARTZITE_BLOCK = registerBlock("cobbled_quartzite_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, "cobbled_quartzite_block"))).strength(2f, 6f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(IntoTheVoid.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(IntoTheVoid.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        IntoTheVoid.LOGGER.info("Registering Mod Blocks for " + IntoTheVoid.MOD_ID);
    }
}
