package me.lto.amiss.modules;

import java.util.ArrayList;
import java.util.List;

import me.lto.amiss.commands.Command;
import me.lto.amiss.modules.mods.ClickGUI;
import me.lto.amiss.modules.mods.FullBright;
import me.lto.amiss.modules.mods.HUD;
import me.lto.amiss.modules.mods.Tracers;

public class ModuleManager {

    public static List<Module> modules = new ArrayList<>();

    public void addModules() {
        modules.add(new ClickGUI());
        modules.add(new HUD());
        modules.add(new FullBright());
        modules.add(new Tracers());
    }

    public static List<Module> getModules() {
        return modules;
    }

    public static Module getModule(String name) {
        for (Module module : modules) {
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }
        return null;
    }

    public static List<Module> byCategory(ModuleCategory category) {
        List<Module> catmod = new ArrayList<>();
        for (Module module : modules) {
            if (module.getCategory().equals(category)) {
                catmod.add(module);
            }
        }
        return catmod;
    }

    public static Module byKey(int key) {
        for (Module module: modules) {
            if (module.getKeyCode() == key) {
                return module;
            }
        }
        return null;
    }

}
