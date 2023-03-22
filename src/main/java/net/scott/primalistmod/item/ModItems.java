package net.scott.primalistmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scott.primalistmod.Primalistmod;
import net.scott.primalistmod.fluid.ModFluids;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Primalistmod.MOD_ID);


    public static final RegistryObject<Item> ENERGY_FLUX = ITEMS.register("energy_flux",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));

    public static final RegistryObject<Item> MOTE_OF_WATER = ITEMS.register("mote_of_water",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_FIRE = ITEMS.register("mote_of_fire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_EARTH = ITEMS.register("mote_of_earth",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_AIR = ITEMS.register("mote_of_air",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_BLOOD = ITEMS.register("mote_of_blood",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_NATURE = ITEMS.register("mote_of_nature",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_LIGHT = ITEMS.register("mote_of_light",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> FORSAKEN_MOTE = ITEMS.register("forsaken_mote",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> WITHERING_MOTE = ITEMS.register("withering_mote",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_LIGHTNING = ITEMS.register("mote_of_lightning",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_CHAOS = ITEMS.register("mote_of_chaos",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_ICE = ITEMS.register("mote_of_ice",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_ARCANE = ITEMS.register("mote_of_arcane",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_TIME = ITEMS.register("mote_of_time",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_SPACE = ITEMS.register("mote_of_space",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> PSYCHIC_MOTE = ITEMS.register("psychic_mote",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_TOXINS = ITEMS.register("mote_of_toxins",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_WITCHERY = ITEMS.register("mote_of_witchery",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> MOTE_OF_SPORES = ITEMS.register("mote_of_spores",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));



    public static final RegistryObject<Item> ESSENCE_OF_THE_TIDE = ITEMS.register("essence_of_the_tide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_PYROMANCER = ITEMS.register("essence_of_the_pyromancer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_VOID = ITEMS.register("essence_of_the_void",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_CAVERNS = ITEMS.register("essence_of_the_caverns",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_SOULS = ITEMS.register("essence_of_souls",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_SKY = ITEMS.register("essence_of_the_sky",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> BLOOMING_ESSENCE = ITEMS.register("blooming_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_INFINITE_SANDS = ITEMS.register("essence_of_the_infinite_sands",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_GLACIER = ITEMS.register("essence_of_the_glacier",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> HOLY_ESSENCE = ITEMS.register("holy_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> PSYHCIC_ESSENCE = ITEMS.register("psychic_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_POISON = ITEMS.register("essence_of_poison",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_BLACK_MAGIC = ITEMS.register("essence_of_black_magic",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> CELESTIAL_ESSENCE = ITEMS.register("celestial_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> SANGUINE_ESSENCE = ITEMS.register("sanguine_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> FUNGAL_ESSENCE = ITEMS.register("fungal_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_STORM = ITEMS.register("essence_of_the_storm",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> ESSENCE_OF_THE_ARCANE = ITEMS.register("essence_of_the_arcane",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));
    public static final RegistryObject<Item> CHAOTIC_ESSENCE = ITEMS.register("chaotic_essence",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));

    public static final RegistryObject<Item> STORM_STRIKE = ITEMS.register("storm_strike",
            () -> new SwordItem(Tiers.NETHERITE, 10, 5f,
                    new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB)));


    public static final RegistryObject<Item> LIQUID_HEALING_BUCKET = ITEMS.register("liquid_healing_bucket",
            () -> new BucketItem(ModFluids.SOURCE_LIQUID_HEALING,
                    new Item.Properties().tab(ModCreativeModeTab.PRIMAL_TAB).craftRemainder(Items.BUCKET).stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);


    }
}
