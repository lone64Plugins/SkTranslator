package org.lone64.sktranslator.support.version.v1_19_R2;

import org.bukkit.craftbukkit.v1_19_R2.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class v1_19_R2 {

    private final ItemStack stack;

    public v1_19_R2(ItemStack stack) {
        this.stack = stack;
    }

    public String q() {
        return CraftItemStack.asNMSCopy(getStack()).p();
    }

    public ItemStack getStack() {
        return stack;
    }

    public static v1_19_R2 of(ItemStack stack) {
        return new v1_19_R2(stack);
    }

}
