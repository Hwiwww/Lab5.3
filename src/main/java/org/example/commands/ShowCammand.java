package org.example.commands;

public class ShowCammand extends Commands {
    public ShowCammand () {
        super("Show");
    }

    @Override
    public void execute() {
        System.out.println("вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    @Override
    public String getDescription() {
        return "This is a command that shows the elements of a collection.";
    }
}