package com.almostdeveloper.templatemod.crafting;

import com.almostdeveloper.templatemod.items.ModItems;
import com.almostdeveloper.templatemod.main.CraftingManager;
import net.minecraft.item.ItemStack;

public class FoodRecipes {
    public static void register(){
        CraftingManager.addRecipeAuto(new ItemStack(ModItems.templateFood, 2), "XXX", " X ", 'X', ModItems.templateItem);
    }
}
