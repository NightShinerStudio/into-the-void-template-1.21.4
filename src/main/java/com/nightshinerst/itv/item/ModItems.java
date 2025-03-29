package com.nightshinerst.itv.item;

import com.nightshinerst.itv.IntoTheVoid;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ALPHA_SCALES = registerItem("alpha_scales", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "alpha_scales")))));
    public static final Item BETA_SCALES = registerItem("beta_scales", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "beta_scales")))));
    public static final Item CHARLIE_SCALES = registerItem("charlie_scales", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "charlie_scales")))));
    public static final Item DELTA_SCALES = registerItem("delta_scales", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "delta_scales")))));
    public static final Item VOID_STICK = registerItem("void_stick", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "void_stick")))));
    public static final Item RAW_SKLANKO_WING = registerItem("raw_sklanko_wing", new Item(new Item.Settings().food(ModFoodComponents.RAW_SKLANKO_WING, ModConsumableComponents.RAW_SKLANKO_WING).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "raw_sklanko_wing")))));
    public static final Item COOKED_SKLANKO_WING = registerItem("cooked_sklanko_wing", new Item(new Item.Settings().food(ModFoodComponents.COOKED_SKLANKO_WING).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "cooked_sklanko_wing")))));
    public static final Item RAW_PETROL = registerItem("raw_petrol", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(IntoTheVoid.MOD_ID, "raw_petrol")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(IntoTheVoid.MOD_ID, name), item);
    }

    private static void customIngredients(FabricItemGroupEntries entries) {
        entries.add(ALPHA_SCALES);
        entries.add(BETA_SCALES);
        entries.add(CHARLIE_SCALES);
        entries.add(DELTA_SCALES);
        entries.add(VOID_STICK);
        entries.add(RAW_SKLANKO_WING);
        entries.add(COOKED_SKLANKO_WING);
        entries.add(RAW_PETROL);
    }

    public static void registerModItems() {
        IntoTheVoid.LOGGER.info("Registering Mod Items for " + IntoTheVoid.MOD_ID);
    }

    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register(((builder, context) -> builder.add(RAW_PETROL, 1600)));
    }
}