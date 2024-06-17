package com.logicalmods.treeguystools;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TabInit {
    public static void register(IEventBus bus){
        TG_TAB_REGISTER.register(bus);
    }

    public static final DeferredRegister<CreativeModeTab> TG_TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TreeGuysTools.MODID);

    public static final RegistryObject<CreativeModeTab> TG_TABS = TG_TAB_REGISTER.register("tg_tab", ()-> CreativeModeTab.builder()
            .icon(()-> ItemInit.T1_CLIPPERS.get().getDefaultInstance())
            .title(Component.translatable("creativeTab.tgtools"))
            .displayItems(((pParameters, pOutput) -> {
                pOutput.accept(ItemInit.T1_CLIPPERS.get());
                pOutput.accept(ItemInit.T2_CLIPPERS.get());
                pOutput.accept(ItemInit.T3_CLIPPERS.get());
                pOutput.accept(ItemInit.T4_CLIPPERS.get());

                pOutput.accept(ItemInit.T1_SPLITTER.get());
                pOutput.accept(ItemInit.T2_SPLITTER.get());
                pOutput.accept(ItemInit.T3_SPLITTER.get());
                pOutput.accept(ItemInit.T4_SPLITTER.get());

                pOutput.accept(ItemInit.FIREWOOD_LOG.get());
                pOutput.accept(ItemInit.CHOPPED_LEAVES.get());
            }))
            .build());

}