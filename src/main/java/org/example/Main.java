package org.example;

import org.example.commands.Commands;

import java.util.Scanner;

import static a.CommandManager.commandList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            a.CommandManager commandManager = new a.CommandManager();
            if (commandList.containsKey(line)) { // либо через keySet().contains
                Commands command = commandList.get(line);
                command.execute();
            } else {
                System.err.println("Unknown command: " + line);
            }
        }

    }
}