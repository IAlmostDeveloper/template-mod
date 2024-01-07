package com.almostdeveloper.templatemod.crafting;

import com.almostdeveloper.templatemod.items.ModItems;
import com.almostdeveloper.templatemod.main.CraftingManager;
import net.minecraft.item.ItemStack;

public class BlockRecipes {
    public static void register(){
        CraftingManager.addRecipeAuto(new ItemStack(ModItems.templateBlock), "TT","TT", 'T', ModItems.templateItem);
    }
}
