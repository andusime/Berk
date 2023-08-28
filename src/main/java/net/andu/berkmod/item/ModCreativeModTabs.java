package net.andu.berkmod.item;

import net.andu.berkmod.berkmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, berkmod.MOD_ID);

public static  final RegistryObject<CreativeModeTab> BERSERK_TAB = CREATIVE_MODE_TABS.register("berserk_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ACTIVATED_BEHELIT.get()))
                .title(Component.translatable("creativetab.berserk_tab"))
                .displayItems((pParameters, pOutput) -> {
                    pOutput.accept(ModItems.ACTIVATED_BEHELIT.get());
                    pOutput.accept(ModItems.BEHELIT.get());
                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
