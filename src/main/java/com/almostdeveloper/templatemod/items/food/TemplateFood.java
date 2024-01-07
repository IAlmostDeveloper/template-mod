package com.almostdeveloper.templatemod.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TemplateFood extends ItemFood {
    public TemplateFood(int healAmount, float saturationModifier, boolean isWolfsFavoriteMeat) {
        super(healAmount, saturationModifier, isWolfsFavoriteMeat);
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        entityPlayer.addPotionEffect(new PotionEffect(1, 1000, 4, false));
        entityPlayer.addPotionEffect(new PotionEffect(21, 1000, 4, false));
        entityPlayer.addPotionEffect(new PotionEffect(10, 1000, 4, false));
        super.onFoodEaten(itemStack, world, entityPlayer);
    }
}
