package net.thesneakycrafter.stellarityendhanced.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thesneakycrafter.stellarityendhanced.block.ModBlocks;
import net.thesneakycrafter.stellarityendhanced.stellarityendhanced;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, stellarityendhanced.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STELLARITY_TAB = CREATIVE_MODE_TABS.register("stellarity_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PIXIE_DUST.get()))
                    .title(Component.translatable("creativetab.stellarity_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PIXIE_DUST.get());
                        output.accept(ModItems.HALLOWED_INGOT.get());

                        output.accept(ModBlocks.AMELIUM_LOG.get());
                        output.accept(ModBlocks.AMELIUM_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_AMELIUM_LOG.get());

                        output.accept(ModBlocks.STRIPPED_AMELIUM_WOOD.get());

                        output.accept(ModBlocks.AMELIUM_PLANK.get());

                        output.accept(ModBlocks.AMELIUM_STAIRS.get());
                        output.accept(ModBlocks.AMELIUM_SLAB.get());
                        output.accept(ModBlocks.AMELIUM_BUTTON.get());
                        output.accept(ModBlocks.AMELIUM_PRESSURE_PLATE.get());

                        output.accept(ModBlocks.AMELIUM_FENCE.get());
                        output.accept(ModBlocks.AMELIUM_FENCE_GATE.get());

                        output.accept(ModBlocks.AMELIUM_LEAVES.get());

                        output.accept(ModBlocks.ENDERITE_ORE.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
