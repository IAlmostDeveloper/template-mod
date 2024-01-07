package com.almostdeveloper.templatemod.main;

import com.almostdeveloper.templatemod.crafting.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class CraftingManager {

    public static void register(){
        ArmorRecipes.register();
        FoodRecipes.register();
        ToolRecipes.register();
        WeaponRecipes.register();
        BlockRecipes.register();
        ItemRecipes.register();
    }

    public static void addRecipeAuto(ItemStack result, Object... ins) {
        boolean shouldUseOD = false;
        boolean engage = false;

        for (Object ingredient : ins) {
            if (ingredient instanceof String) {
                if (engage) {
                    shouldUseOD = true;
                    break;
                }
            } else {
                engage = true;
            }
        }

        if(shouldUseOD)
            GameRegistry.addRecipe(new ShapedOreRecipe(result, ins));
        else
            GameRegistry.addRecipe(result, ins);
    }

    public static void addShapelessAuto(ItemStack result, Object... ins) {
        boolean shouldUseOD = false;

        for (Object ingredient : ins) {
            if (ingredient instanceof String) {
                shouldUseOD = true;
                break;
            }
        }

        if(shouldUseOD)
            GameRegistry.addRecipe(new ShapelessOreRecipe(result, ins));
        else
            GameRegistry.addShapelessRecipe(result, ins);
    }
}
