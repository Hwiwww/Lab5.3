package org.example.commands;

public class InsertNullCommand extends Commands {
    public InsertNullCommand(){
        super("insertNullCommand");
    }

    @Override
    public void execute(String[] args) {
        System.out.println("добавить новый элемент с заданным ключом");

    }

    @Override
    public String getDescription() {
        return "this command adds a new element with the given key.";
    }
}
