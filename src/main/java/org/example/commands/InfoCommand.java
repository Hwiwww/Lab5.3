package org.example.commands;

public class InfoCommand extends Commands {
    public InfoCommand() {
        super("Info");
    }

    @Override
    public void execute() {
        System.out.println("Collection type: dragon \n I" );

    }

    @Override
    public String getDescription() {
        return "show information about collection";
    }

}
