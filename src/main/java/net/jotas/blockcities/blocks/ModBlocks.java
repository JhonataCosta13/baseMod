package net.jotas.blockcities.blocks;

import net.jotas.blockcities.BlockCities;
import net.jotas.blockcities.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BlockCities.MOD_ID);

    //TODO; Just copy this for more Blocks
    //TODO: The name in the .register must be lower case, words separated 'like_this'
    //TODO: You can change the block properties: new Block(BlockBehaviour.Properties.copy(Blocks.chooseanyblockyouwant).youcanchoosethepropertyhere
    /*public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE) //When you mine ore it drops exp, that's why DropExperienceBlock
                    .strength(2f) //Defines the block thoughness
                    .requiresCorrectToolForDrops(), UniformInt.of(3, 6))); //We will get between 3 and 6 exp orbs*/

    //TODO: Go to Custom package before
    //TODO: Copy this and change: () -> new yourcustomblockclass(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
    /*public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));*/

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
