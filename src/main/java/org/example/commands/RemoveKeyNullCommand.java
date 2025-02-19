package org.example.commands;

public class RemoveKeyNullCommand extends Commands{
    public RemoveKeyNullCommand(){
        super("Remove_key null");
    }

    @Override
    public void execute() {
        System.out.println("удалить элемент из коллекции по его ключу");

    }

    @Override
    public String getDescription() {
        return "This command removes an item from a collection by its key.";
    }
}
