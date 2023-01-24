package net.scott.primalistmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PRIMAL_TAB = new CreativeModeTab("primal_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MOTE_OF_WATER.get());
        }
    };
}