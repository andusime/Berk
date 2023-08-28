package net.andu.berkmod.item;

import net.andu.berkmod.berkmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, berkmod.MOD_ID);

    public static final RegistryObject<Item> BEHELIT = ITEMS.register("behelit",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACTIVATED_BEHELIT = ITEMS.register("activated_behelit",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
