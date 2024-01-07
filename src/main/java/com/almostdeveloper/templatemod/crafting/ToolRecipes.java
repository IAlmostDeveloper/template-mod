package com.almostdeveloper.templatemod.crafting;

import com.almostdeveloper.templatemod.items.ModItems;
import com.almostdeveloper.templatemod.main.CraftingManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ToolRecipes {
    public static void register(){
        addPickaxe(ModItems.templateItem, ModItems.templatePickaxe);
        addAxe(ModItems.templateItem, ModItems.templateAxe);
        addShovel(ModItems.templateItem, ModItems.templateShovel);
        addHoe(ModItems.templateItem, ModItems.templateHoe);
    }

    public static void addPickaxe(Object ingot, Item sword){
        addTool(ingot, sword, pickaxePattern);
    }

    public static void addAxe(Object ingot, Item sword){
        addTool(ingot, sword, axePattern);
    }

    public static void addShovel(Object ingot, Item sword){
        addTool(ingot, sword, shovelPattern);
    }

    public static void addHoe(Object ingot, Item sword){
        addTool(ingot, sword, hoePattern);
    }

    public static void addTool(Object ingot, Item weapon, String[] pattern){
        CraftingManager.addRecipeAuto(new ItemStack(weapon), pattern, 'X', ingot, 'S', "stickWood");
    }

    public static final String[] pickaxePattern = new String[] {"XXX", " S ", " S "};
    public static final String[] axePattern = new String[] {" XX", " SX", " S "};
    public static final String[] shovelPattern = new String[] {" X ", " S ", " S "};
    public static final String[] hoePattern = new String[] {" XX", " S ", " S "};
}
