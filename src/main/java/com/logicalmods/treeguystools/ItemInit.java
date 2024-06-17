package com.logicalmods.treeguystools;

import com.logicalmods.treeguystools.fuel.FuelItemBase;
import com.logicalmods.treeguystools.item.ClipperBase;
import com.logicalmods.treeguystools.item.SplitterBase;
import com.logicalmods.treeguystools.util.Tiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TreeGuysTools.MODID);

    public static final RegistryObject<Item> T1_CLIPPERS = ITEMS.register("t1_clippers", () -> new ClipperBase(new Item.Properties().defaultDurability(56)));
    public static final RegistryObject<Item> T2_CLIPPERS = ITEMS.register("t2_clippers", () -> new ClipperBase(new Item.Properties().defaultDurability(112)));
    public static final RegistryObject<Item> T3_CLIPPERS = ITEMS.register("t3_clippers", () -> new ClipperBase(new Item.Properties().defaultDurability(672)));
    public static final RegistryObject<Item> T4_CLIPPERS = ITEMS.register("t4_clippers", () -> new ClipperBase(new Item.Properties().defaultDurability(1120)));

    public static final RegistryObject<Item> T1_SPLITTER = ITEMS.register("t1_splitter", () -> new SplitterBase(Tiers.T1, 1.0f, 1.0f, new Item.Properties().defaultDurability(112)));
    public static final RegistryObject<Item> T2_SPLITTER = ITEMS.register("t2_splitter", () -> new SplitterBase(Tiers.T2, 1.0f, 1.0f, new Item.Properties().defaultDurability(224)));
    public static final RegistryObject<Item> T3_SPLITTER = ITEMS.register("t3_splitter", () -> new SplitterBase(Tiers.T3, 1.0f, 1.0f, new Item.Properties().defaultDurability(1344)));
    public static final RegistryObject<Item> T4_SPLITTER = ITEMS.register("t4_splitter", () -> new SplitterBase(Tiers.T4, 1.0f, 1.0f, new Item.Properties().defaultDurability(2240)));

    public static final RegistryObject<Item> FIREWOOD_LOG = ITEMS.register("firewood", () -> new FuelItemBase(new Item.Properties().stacksTo(16), 400));
    public static final RegistryObject<Item> CHOPPED_LEAVES = ITEMS.register("chopped_leaves", () -> new FuelItemBase(new Item.Properties().stacksTo(32), 285));
}