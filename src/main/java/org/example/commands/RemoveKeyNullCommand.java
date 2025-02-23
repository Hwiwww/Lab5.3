package org.example.commands;

import org.example.a.CollectionManager;

public class RemoveKeyNullCommand extends Commands{
    public RemoveKeyNullCommand(){
        super("remove_key null");
    }

    @Override
    public void execute(String[] args) {
       CollectionManager.getCollection().remove(args[0]);
        System.out.println("you have removed an item from the collection.");
    }

    @Override
    public String getDescription() {
        return "this command removes an item from a collection by its key.";
    }
}
