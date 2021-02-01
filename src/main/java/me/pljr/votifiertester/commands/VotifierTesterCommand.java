package me.pljr.votifiertester.commands;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;
import me.pljr.pljrapispigot.utils.CommandUtil;
import org.bukkit.command.ConsoleCommandSender;

public class VotifierTesterCommand extends CommandUtil {

    public VotifierTesterCommand(){
        super("votifiertester", "votifiertester.use");
    }

    public void onConsoleCommand(ConsoleCommandSender sender, String[] args){
        String serviceName = "ServiceName";
        String userName = "UserName";
        String address = "Address";
        String timeStamp = System.currentTimeMillis() + "";
        if (args[0] != null) serviceName = args[0];
        if (args[1] != null) userName = args[1];
        if (args[2] != null) address = args[2];
        if (args[3] != null) timeStamp = args[3];
        new VotifierEvent(new Vote(serviceName, userName, address, timeStamp));
        sendMessageClean(sender, "Successfully send a test VotifierEvent.");
        sendMessageClean(sender, "Service: " + serviceName);
        sendMessageClean(sender, "User: " + userName);
        sendMessageClean(sender, "Address: " + address);
        sendMessageClean(sender, "Time: " + timeStamp);
    }
}
