package com.almostdeveloper.templatemod.crafting;

import com.almostdeveloper.templatemod.items.ModItems;
import com.almostdeveloper.templatemod.main.CraftingManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WeaponRecipes {
    public static void register(){
        addSword(ModItems.templateItem, ModItems.templateSword);
    }

    public static void addSword(Object ingot, Item sword){
        addWeapon(ingot, sword, swordPattern);
    }

    public static void addWeapon(Object ingot, Item weapon, String[] pattern){
        CraftingManager.addRecipeAuto(new ItemStack(weapon), pattern, 'X', ingot, 'S', "stickWood");
    }

    public static final String[] swordPattern = new String[] {" X ", " X ", " S "};
}
