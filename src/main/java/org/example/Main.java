package org.example;

import org.example.system.CollectionManager;
import org.example.commands.Commands;
import org.example.system.CommandManager;

import java.util.Arrays;
import java.util.Scanner;

import static org.example.system.CommandManager.commandList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommandManager commandManager = new CommandManager();
        CollectionManager collectionManager = new CollectionManager();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] commandArguments = line.split(" ");
            String lineCommand = commandArguments[0];
            String[] arguments = Arrays.copyOfRange(commandArguments, 1, commandArguments.length);

            if (commandList.containsKey(lineCommand)) { // либо через keySet().contains
                Commands command = commandList.get(lineCommand);
                command.execute(arguments);
            } else {
                System.err.println("Unknown command: " + lineCommand);
            }
        }

    }
}