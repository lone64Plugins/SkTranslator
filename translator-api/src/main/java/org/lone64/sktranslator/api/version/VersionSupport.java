package org.lone64.sktranslator.api.version;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.lone64.sktranslator.support.version.v1_12_R1.v1_12_R1;
import org.lone64.sktranslator.support.version.v1_16_R3.v1_16_R3;
import org.lone64.sktranslator.support.version.v1_17_R1.v1_17_R1;
import org.lone64.sktranslator.support.version.v1_18_R2.v1_18_R2;
import org.lone64.sktranslator.support.version.v1_19_R2.v1_19_R2;
import org.lone64.sktranslator.support.version.v1_19_R3.v1_19_R3;
import org.lone64.sktranslator.support.version.v1_20_R1.v1_20_R1;

public class VersionSupport {

    public static String getItemName(ItemStack stack) {
        String version = Bukkit.getServer().getBukkitVersion().replace("-R0.1-SNAPSHOT", "");
        return switch (version.toLowerCase()) {
            case "1.12", "1.12.1", "1.12.2", "1.13", "1.13.1", "1.13.2", "1.14", "1.14.1", "1.14.2", "1.14.3", "1.14.4", "1.15", "1.15.1", "1.15.2" -> v1_12_R1.of(stack).q();
            case "1.16.1", "1.16.2", "1.16.3", "1.16.4", "1.16.5" -> v1_16_R3.of(stack).q();
            case "1.17", "1.17.1" -> v1_17_R1.of(stack).q();
            case "1.18", "1.18.1", "1.18.2" -> v1_18_R2.of(stack).q();
            case "1.19", "1.19.1", "1.19.2", "1.19.3" -> v1_19_R2.of(stack).q();
            case "1.19.4" -> v1_19_R3.of(stack).q();
            case "1.20", "1.20.1" -> v1_20_R1.of(stack).q();
            default -> null;
        };
    }

    public static String getVersion() {
        String version = Bukkit.getServer().getBukkitVersion().replace("-R0.1-SNAPSHOT", "");
        return switch (version.toLowerCase()) {
            case "1.12", "1.12.1", "1.12.2" -> "1.12";
            case "1.13", "1.13.1", "1.13.2" -> "1.13";
            case "1.14", "1.14.1", "1.14.2", "1.14.3", "1.14.4" -> "1.14";
            case "1.15", "1.15.1", "1.15.2" -> "1.15";
            case "1.16.1", "1.16.2", "1.16.3", "1.16.4", "1.16.5" -> "1.16";
            case "1.17", "1.17.1" -> "1.17";
            case "1.18", "1.18.1", "1.18.2" -> "1.18";
            case "1.19", "1.19.1", "1.19.2", "1.19.3", "1.19.4" -> "1.19";
            case "1.20", "1.20.1" -> "1.20";
            default -> null;
        };
    }

}
