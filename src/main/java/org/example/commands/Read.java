package org.example.commands;

import org.example.system.FileManager;

public class Read extends Commands {
    public Read() {
        super("read");
    }

    @Override
    public void execute(String[] args) {
        FileManager.readFile(args[0]);
        System.out.println("Collection was successfully read from file");
    }

    @Override
    public String getDescription() {
        return "";
    }
}
