package com.almostdeveloper.templatemod.items.block;

import com.almostdeveloper.templatemod.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class TemplateBlock extends Block {
    public TemplateBlock(Material material) {
        super(material);
        this.setHardness(1.0f);
//        this.setHarvestLevel("pickaxe", 4);
        this.setLightLevel(50.0f);
    }

    @Override
    public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_) {
        super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.templateItem;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1 + random.nextInt(4);
    }
}
