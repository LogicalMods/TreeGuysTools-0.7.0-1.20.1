package com.logicalmods.treeguystools.item;

import com.logicalmods.treeguystools.util.Tags;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class SplitterBase extends AxeItem {

    public SplitterBase(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, @NotNull BlockState state) {
        return stack.is(Tags.Items.SPLITTERS) && state.is(BlockTags.LOGS);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        final ItemStack copy = itemStack.copy();
        if(copy.hurt(9, RandomSource.createNewThreadLocalInstance(), null)){
            copy.shrink(1);
        }
        return copy;
    }

}