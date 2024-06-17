package com.logicalmods.treeguystools.util;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    public static final ForgeTier T1 = new ForgeTier(
            1,
            95,
            7.0f,
            1.0f,
            5,
            Tags.Blocks.TGTOOLS,
            ()-> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)
    );
    public static final ForgeTier T2 = new ForgeTier(
            2,
            175,
            9.0f,
            2.0f,
            14,
            Tags.Blocks.TGTOOLS,
            ()-> Ingredient.of(Items.IRON_INGOT)
    );
    public static final ForgeTier T3 = new ForgeTier(
            0,
            312,
            11.0f,
            0.0f,
            22,
            Tags.Blocks.TGTOOLS,
            ()-> Ingredient.of(Items.GOLD_INGOT)
    );
    public static final ForgeTier T4 = new ForgeTier(
            4,
            1896,
            25.0f,
            3.0f,
            10,
            Tags.Blocks.TGTOOLS,
            ()-> Ingredient.of(Items.DIAMOND)
    );
}