package net.scott.primalistmod.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scott.primalistmod.Primalistmod;
import net.scott.primalistmod.block.ModBlocks;
import net.scott.primalistmod.item.ModItems;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Primalistmod.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_LIQUID_HEALING = FLUIDS.register("liquid_healing_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_HEALING_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_HEALING = FLUIDS.register("flowing_liquid_healing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_HEALING_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LIQUID_HEALING_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LIQUID_HEALING_FLUID_TYPE, SOURCE_LIQUID_HEALING, FLOWING_LIQUID_HEALING)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.LIQUID_HEALING_BLOCK)
            .bucket(ModItems.LIQUID_HEALING_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
