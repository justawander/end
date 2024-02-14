package net.thesneakycrafter.stellarityendhanced.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thesneakycrafter.stellarityendhanced.block.ModBlocks;
import net.thesneakycrafter.stellarityendhanced.item.ModItems;
import net.thesneakycrafter.stellarityendhanced.stellarityendhanced;
import org.openjdk.nashorn.internal.ir.Block;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, stellarityendhanced.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.PIXIE_DUST);
        simpleItem(ModItems.HALLOWED_INGOT);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(stellarityendhanced.MOD_ID,"item/" + item.getId().getPath()));

    }
}
