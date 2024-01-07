package com.almostdeveloper.templatemod.main;

import com.almostdeveloper.templatemod.items.ModItems;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class TemplateWorldGenerator implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnder(world, random, chunkX, chunkZ);
                break;
            case 0:
                generateOverworld(world, random, chunkX, chunkZ);
                break;
            case -1:
                generateNether(world, random, chunkX, chunkZ);
                break;
        }
    }

    public void generateOverworld(World world, Random random, int x, int z) {
        generateOre(ModItems.templateBlock, world, random, x, z, 4, 16, 16, 0, 100, Blocks.stone);
    }

    public void generateNether(World world, Random random, int x, int z) {

    }

    public void generateEnder(World world, Random random, int x, int z) {

    }

    private void generateOre(Block block, World world, Random random, int chunkX,
                             int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn){
        int vienSize = minVienSize + random.nextInt(maxVienSize-minVienSize);

        int heightRange = maxY - minY;

        WorldGenMinable genMinable = new WorldGenMinable(block, vienSize, generateIn);

        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

        for (int i=0;i<chance; i++){
            int xRand = chunkX * 16 + random.nextInt(16);
            int yRand = random.nextInt(heightRange) + minY;
            int zRand = chunkZ * 16 + random.nextInt(16);

            genMinable.generate(world, random, xRand, yRand, zRand);
        }

    }
}
