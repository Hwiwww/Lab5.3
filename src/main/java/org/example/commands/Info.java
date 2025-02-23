package org.example.commands;

import org.example.a.CollectionManager;
import org.example.data.Dragon;

public class Info extends Commands {
    public Info() {
        super("info");
    }

    @Override
    public void execute(String[] args) {
        System.out.println("collection type: " + CollectionManager.getCollection().getClass().getSimpleName());
        System.out.println("element type: " + Dragon.class.getSimpleName());
        System.out.println("initialization date: " + CollectionManager.getInitializationDate());
        System.out.println("amount of elements: " + CollectionManager.getCollection().size());
    }

    @Override
    public String getDescription() {
        return "show information about collection";
    }

}
