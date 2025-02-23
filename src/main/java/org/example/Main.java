package org.example;

import org.example.a.CollectionManager;
import org.example.commands.Commands;

import java.util.Arrays;
import java.util.Scanner;

import static a.CommandManager.commandList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        a.CommandManager commandManager = new a.CommandManager();
        CollectionManager collectionManager = new CollectionManager();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] commandArguments = line.split(" ");
            String lineCommand = commandArguments[0];
            String[] arguments = Arrays.copyOfRange(commandArguments, 1, commandArguments.length);

            if (commandList.containsKey(lineCommand)) { // либо через keySet().contains
                Commands command = commandList.get(lineCommand);
                command.execute();
            } else {
                System.err.println("Unknown command: " + lineCommand);
            }
        }

    }
}