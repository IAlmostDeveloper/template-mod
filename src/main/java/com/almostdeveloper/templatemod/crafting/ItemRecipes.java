package com.almostdeveloper.templatemod.crafting;

import com.almostdeveloper.templatemod.items.ModItems;
import com.almostdeveloper.templatemod.main.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ItemRecipes {
    public static void register(){
        CraftingManager.addShapelessAuto(new ItemStack(ModItems.templateItem, 4), ModItems.templateBlock);

        CraftingManager.addRecipeAuto(new ItemStack(ModItems.templateItem), "BBB",
                " B ",
                "PBP",
                'B', new ItemStack(Blocks.wool, 1, 15),
                'P', new ItemStack(Blocks.wool, 1, 2));

        GameRegistry.addSmelting(ModItems.templateItem, new ItemStack(ModItems.templateBlock), 500.0f);
    }
}
