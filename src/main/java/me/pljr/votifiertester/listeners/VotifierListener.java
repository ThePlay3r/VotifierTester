package me.pljr.votifiertester.listeners;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VotifierEvent;
import me.pljr.pljrapispigot.utils.ChatUtil;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class VotifierListener implements Listener {
    private final ConsoleCommandSender console;

    public VotifierListener(ConsoleCommandSender console){
        this.console = console;
    }

    @EventHandler
    public void onVote(VotifierEvent event){
        Vote vote = event.getVote();
        ChatUtil.sendMessageClean(console, "[VotifierTester] Listened to a VotifierEvent:");
        ChatUtil.sendMessageClean(console, "Service: " + vote.getServiceName());
        ChatUtil.sendMessageClean(console, "User: " + vote.getUsername());
        ChatUtil.sendMessageClean(console, "Address: " + vote.getAddress());
        ChatUtil.sendMessageClean(console, "Time: " + vote.getTimeStamp());
    }
}
