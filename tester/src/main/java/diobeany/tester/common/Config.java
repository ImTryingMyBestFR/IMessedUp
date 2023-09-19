/*package diobeany.tester.common;



import net.minecraftforge.common.config.Configuration;

public class Config {

    private static final String CONFIG="config";

    public static Boolean cumgood=true;
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            tester.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CONFIG, "General configuration");
        // cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
        cumgood = cfg.getBoolean("Is cum good?", CONFIG, cumgood, "Set to false if you are a disgusting loser");
    }
}*/
