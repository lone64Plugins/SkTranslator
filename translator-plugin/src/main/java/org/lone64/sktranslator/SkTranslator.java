package org.lone64.sktranslator;

import ch.njol.skript.Skript;
import ch.njol.skript.SkriptAddon;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkTranslator extends JavaPlugin {

    private SkriptAddon addon;

    @Override
    public void onEnable() {
        try {
            this.addon = Skript.registerAddon(this);
            this.addon.loadClasses("org.lone64.sktranslator", "skript");
        } catch (Exception ignored) { }
    }

    @Override
    public void onDisable() {

    }

}
