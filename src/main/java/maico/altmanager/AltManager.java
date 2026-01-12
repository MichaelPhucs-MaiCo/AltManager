package maico.altmanager;

import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import net.minecraft.item.Items;
import org.slf4j.Logger;

public class AltManager extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category ALTMANAGER = new Category("AltManager", Items.POPPED_CHORUS_FRUIT.getDefaultStack());
    public static final HudGroup HUD_GROUP = new HudGroup("AltManager");

    @Override
    public void onInitialize() {
        LOG.info("Addon đang khởi chạy... Sẵn sàng quẩy Minecraft! 🔥");

        // Modules


        // Commands


        // HUD

    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(ALTMANAGER);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("MeteorDevelopment", "meteor-addon-template");
    }
}
