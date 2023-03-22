package net.scott.primalistmod.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scott.primalistmod.Primalistmod;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Primalistmod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ElementalInfuserRecipe>> ELEMENTAL_INFUSING_SERIALIZER =
            SERIALIZERS.register("element_infusing", () -> ElementalInfuserRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
