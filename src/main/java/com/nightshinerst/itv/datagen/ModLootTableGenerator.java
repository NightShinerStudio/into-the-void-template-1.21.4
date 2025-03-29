package com.nightshinerst.itv.datagen;

import com.nightshinerst.itv.block.ModBlocks;
import com.nightshinerst.itv.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    protected ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COBBLED_QUARTZITE_BLOCK); ///if it drops itself
        addDrop(ModBlocks.PETROL_QUARTZITE_ORE_BLOCK, oreDrops(ModBlocks.PETROL_QUARTZITE_ORE_BLOCK, ModItems.RAW_PETROL)); ///if it is a basic ore
        addDrop(ModBlocks.PETROL_QUARTZITE_ORE_BLOCK, copperOreDrops(ModBlocks.PETROL_QUARTZITE_ORE_BLOCK, ModItems.RAW_PETROL)); ///if it is a basic ore

    }
    public LootTable.Builder multipleOreDrops(Block drop) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ItemEntry.builder(Items.RAW_COPPER).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 5.0F)))
                        .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
    }
}
