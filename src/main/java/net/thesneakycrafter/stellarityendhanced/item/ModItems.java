package net.thesneakycrafter.stellarityendhanced.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thesneakycrafter.stellarityendhanced.stellarityendhanced;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, stellarityendhanced.MOD_ID);
            public static final RegistryObject<Item> PIXIE_DUST = ITEMS.register("pixie_dust",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> HALLOWED_INGOT = ITEMS.register("hallowed_ingot",
                    () -> new Item(new Item.Properties()));
            public static final RegistryObject<Item> ENDERITE = ITEMS.register("enderite",
                    () -> new Item(new Item.Properties()));

            public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
            }
}
