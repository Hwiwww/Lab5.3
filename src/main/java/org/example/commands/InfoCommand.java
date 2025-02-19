package org.example.commands;

public class InfoCommand extends Commands {
    public InfoCommand() {
        super("Info");
    }

    @Override
    public void execute() {
        System.out.println("вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");

    }

    @Override
    public String getDescription() {
        return "This is the information command";
    }

}
