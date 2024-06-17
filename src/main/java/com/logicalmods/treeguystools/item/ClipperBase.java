package com.logicalmods.treeguystools.item;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;

public class ClipperBase extends ShearsItem {

    public ClipperBase(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        final ItemStack copy = itemStack.copy();
        if(copy.hurt(17, RandomSource.createNewThreadLocalInstance(), null)){
            copy.shrink(1);
        }
        return copy;
    }
}