package org.example;

import org.example.system.CollectionManager;
import org.example.commands.Commands;
import org.example.system.CommandManager;
import org.example.system.Console;
import org.example.system.FileManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static org.example.system.CommandManager.commandList;

public class Main {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Something wrong with argument (file_path)");
        }
        else {
            File file = new File(args[0]);
            if (file.canRead() && file.canWrite()){
                Console console = new Console();
                console.start(System.in, args);
            }
            else {
                System.out.println("You do not have enough root");
            }
        }
//
//
//
//        CommandManager commandManager = new CommandManager();
//        CollectionManager collectionManager = new CollectionManager();
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            String[] commandArguments = line.split(" ");
//            String lineCommand = commandArguments[0];
//            String[] arguments = Arrays.copyOfRange(commandArguments, 1, commandArguments.length);
//
//            if (commandList.containsKey(lineCommand)) { // либо через keySet().contains
//                Commands command = commandList.get(lineCommand);
//                command.execute(arguments);
//            } else {
//                System.err.println("Unknown command: " + lineCommand);
//            }
//        }

    }
}