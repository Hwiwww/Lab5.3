package a;

import org.example.commands.*;
import org.example.commands.Commands;

import java.util.HashMap;

public class CommandManager {
    public static HashMap<String, Commands> commandList;

    public CommandManager() {
        commandList = new HashMap<>();
        commandList.put("help", new Help());
        commandList.put("exit", new Exit());
        commandList.put("clear", new Clear());
    }

    public HashMap<String, Commands> getCommandList() {
        return commandList;
    }
}
