package org.example.system;

import org.example.commands.Commands;

import java.util.Scanner;

import static org.example.system.CommandManager.commandList;

public class Console {
    String fileName;

    public void start(String fileName) {

        CommandManager commandManager = new CommandManager();
        Scanner scanner = new Scanner(System.in);
        CollectionManager collectionManager = new CollectionManager();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] commandArgs = line.split(" ");
            if (commandArgs.length > 1) {
                String commandLine = commandArgs[0];
                String[] args = commandArgs;
                if (commandList.containsKey(commandLine)) { // либо через keySet().contains
                    Commands command = commandList.get(commandLine);
                    command.execute(args);
                } else {
                    System.err.println("Unknown command: " + line);
                }
            }

        }
    }

}
