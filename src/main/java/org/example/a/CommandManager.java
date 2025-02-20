package a;

import org.example.commands.Commands;
import org.example.commands.Commands;
import org.example.commands.Help;

import java.util.HashMap;

public class CommandManager {
    public static HashMap<String, Commands> commandList;

    public CommandManager() {
        commandList = new HashMap<>();
        commandList.put("help", new Help());
    }

    public HashMap<String, Commands> getCommandList() {
        return commandList;
    }
}
