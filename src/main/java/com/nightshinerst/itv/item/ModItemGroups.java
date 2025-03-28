package com.nightshinerst.itv.item;

import com.nightshinerst.itv.IntoTheVoid;
import com.nightshinerst.itv.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BEYOND_THE_VOID_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(IntoTheVoid.MOD_ID, "beyond_the_void_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ALPHA_SCALES))
                    .displayName(Text.translatable("itemgroup.itv.beyond_the_void_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ALPHA_SCALES);
                        entries.add(ModItems.BETA_SCALES);
                        entries.add(ModItems.CHARLIE_SCALES);
                        entries.add(ModItems.DELTA_SCALES);
                        entries.add(ModItems.VOID_STICK);
                        entries.add(ModItems.RAW_SKLANKO_WING);
                        entries.add(ModItems.COOKED_SKLANKO_WING);
                    }).build());

    public static final ItemGroup BEYOND_THE_VOID_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(IntoTheVoid.MOD_ID, "beyond_the_void_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.VOID_LOG_BLOCK))
                    .displayName(Text.translatable("itemgroup.itv.beyond_the_void_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.VOID_LOG_BLOCK);
                        entries.add(ModBlocks.VOID_PLANKS_BLOCK);
                        entries.add(ModBlocks.VOID_WOOD_BLOCK);
                        entries.add(ModBlocks.QUARTZITE_BLOCK);
                        entries.add(ModBlocks.COBBLED_QUARTZITE_BLOCK);
                        entries.add(ModBlocks.ASH_SAND_BLOCK);
                        entries.add(ModBlocks.TAN_SAND_BLOCK);
                    }).build());



    public static void registerItemGroups () {
        IntoTheVoid.LOGGER.info("Registering Item Groups for " + IntoTheVoid.MOD_ID);
    }
}
