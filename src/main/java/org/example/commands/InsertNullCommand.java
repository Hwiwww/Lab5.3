package org.example.commands;

public class InsertNullCommand extends Commands {
    public InsertNullCommand(){
        super("InsertNullCommand");
    }

    @Override
    public void execute() {
        System.out.println("добавить новый элемент с заданным ключом");

    }

    @Override
    public String getDescription() {
        return "This command adds a new element with the given key.";
    }
}
