package com.nightshinerst.itv.datagen;

import com.jcraft.jorbis.Block;
import com.nightshinerst.itv.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_QUARTZITE_BLOCK,
                        ModBlocks.QUARTZITE_BLOCK,
                        ModBlocks.DIAMOND_QUARTZITE_ORE_BLOCK,
                        ModBlocks.EMERALD_QUARTZITE_ORE_BLOCK,
                        ModBlocks.GOLD_QUARTZITE_ORE_BLOCK,
                        ModBlocks.IRON_QUARTZITE_ORE_BLOCK,
                        ModBlocks.REDSTONE_QUARTZITE_ORE_BLOCK,
                        ModBlocks.PETROL_QUARTZITE_ORE_BLOCK,
                        ModBlocks.LAPIS_QUARTZITE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.VOID_LOG_BLOCK,
                        ModBlocks.VOID_PLANKS_BLOCK,
                        ModBlocks.VOID_WOOD_BLOCK,
                        ModBlocks.STRIPPED_VOID_LOG_BLOCK,
                        ModBlocks.STRIPPED_VOID_WOOD_BLOCK);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.ASH_SAND_BLOCK,
                        ModBlocks.TAN_SAND_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.IRON_QUARTZITE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GOLD_QUARTZITE_ORE_BLOCK,
                        ModBlocks.DIAMOND_QUARTZITE_ORE_BLOCK,
                        ModBlocks.EMERALD_QUARTZITE_ORE_BLOCK,
                        ModBlocks.LAPIS_QUARTZITE_ORE_BLOCK,
                        ModBlocks.REDSTONE_QUARTZITE_ORE_BLOCK);
    }
}
