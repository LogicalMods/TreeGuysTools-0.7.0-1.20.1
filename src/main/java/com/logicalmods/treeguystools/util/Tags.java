package com.logicalmods.treeguystools.util;

import com.logicalmods.treeguystools.TreeGuysTools;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Tags {
    public static class Blocks{

        public static final TagKey<Block> TGTOOLS = blockTag("tg_tools");

        private static TagKey<Block> blockTag(String name){
            return BlockTags.create(new ResourceLocation(TreeGuysTools.MODID, name));
        }

    }

    public static class Items{

        public static final TagKey<Item> SPLITTERS = itemTag("splitter_tool");
        public static final TagKey<Item> CLIPPERS = itemTag("clipper_tool");
        public static final TagKey<Item> STRIPPED_LOGS = itemTag("stripped_logs");
        public static final TagKey<Item> VANILLA_LEAVES = itemTag("leaves");

        private static TagKey<Item> itemTag(String name){
            return ItemTags.create(new ResourceLocation(TreeGuysTools.MODID, name));
        }

    }

}