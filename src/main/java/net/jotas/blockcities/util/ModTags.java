package net.jotas.blockcities.util;

import net.jotas.blockcities.BlockCities;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{ //TODO: Here you create your own tags for Blocks

        //TODO: For more tags, just copy this and edit it
        //public static final TagKey<Block> GEMS_DETECTOR_VALUABLES = tag("gems_detector_valuables");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(BlockCities.MOD_ID, name));
        }
    }

    public static class Items{ //TODO: Here you create your own tags for Items
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(BlockCities.MOD_ID, name));
        }
    }
}
