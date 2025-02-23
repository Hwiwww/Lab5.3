package org.example.commands;


import static a.CommandManager.commandList;


// Выводит справку по доступным командам
public class Help extends Commands {

    public Help() {
        super("help");
    }
    @Override
    public void execute(String[] args) {
        // System.out.println(commandList.get("help").getName() + ": " + commandList.get("help").getDescription());
        commandList.forEach((s, command) -> {
            System.out.println(s + ": " + command.getDescription());
        });
    }

    @Override
    public String getDescription() {
        return "show information about available commands";
    }
}
