package spectatorcontrol.bsh.spectatorcontrol;

import org.bukkit.plugin.java.JavaPlugin;
import spectatorcontrol.bsh.spectatorcontrol.commands.TestCommand;

public class SpectatorControl extends JavaPlugin {
    @Override
    public void onEnable(){
        this.getCommand("spectator").setExecutor(new TestCommand());

    }
    @Override
    public void onDisable(){
        getLogger().info("onEnable is called");
    }
}
