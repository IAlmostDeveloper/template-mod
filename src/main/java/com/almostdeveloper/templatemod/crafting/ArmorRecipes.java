package com.almostdeveloper.templatemod.crafting;

import com.almostdeveloper.templatemod.items.ModItems;
import com.almostdeveloper.templatemod.main.CraftingManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorRecipes {

    public static void register(){
        addHelmet(ModItems.templateItem, ModItems.templateHelmet);
        addChest(ModItems.templateItem, ModItems.templateChestplate);
        addLegs(ModItems.templateItem, ModItems.templateLeggings);
        addBoots(ModItems.templateItem, ModItems.templateBoots);
    }

    public static void addHelmet(Object ingot, Item helm) {
        addArmor(ingot, helm, patternHelmet);
    }
    public static void addChest(Object ingot, Item chest) {
        addArmor(ingot, chest, patternChestplate);
    }
    public static void addLegs(Object ingot, Item legs) {
        addArmor(ingot, legs, patternLeggings);
    }
    public static void addBoots(Object ingot, Item boots) {
        addArmor(ingot, boots, patternBoots);
    }

    private static void addArmor(Object ingot, Item armor, String[] pattern) {
        CraftingManager.addRecipeAuto(new ItemStack(armor), pattern, 'X', ingot);
    }

    public static final String[] patternHelmet = new String[] {"XXX", "X X"};
    public static final String[] patternChestplate = new String[] {"X X", "XXX", "XXX"};
    public static final String[] patternLeggings = new String[] {"XXX", "X X", "X X"};
    public static final String[] patternBoots = new String[] {"X X", "X X"};
}
