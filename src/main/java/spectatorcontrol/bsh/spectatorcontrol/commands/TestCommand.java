package spectatorcontrol.bsh.spectatorcontrol.commands;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        String errorMsg = "You do not have permissions to execute this command.";

        if ( commandSender instanceof Player ){
            Player player = (Player) commandSender;

            // If the player is op, let them execute the command.
            if(!commandSender.isOp()) {
                player.sendMessage(errorMsg);
            }

            // If the player is op.
            else{
//                switch(args[1]){
//                    case "test":
//                        player.sendMessage(Color.GREEN + "Testing!");
//                }
//                player.sendMessage(player.getDisplayName() + ", my friend.");
                player.sendMessage(s);
            }
            return true;
        }
        return true;
    }
}
