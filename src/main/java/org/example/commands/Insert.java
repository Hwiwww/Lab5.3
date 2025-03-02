package org.example.commands;

import org.example.data.Dragon;
import org.example.system.CollectionManager;
import org.example.system.Console;
import org.example.system.DragonGenerator;

public class Insert extends Commands {
    public Insert(){
        super("insert");
    }

    @Override
    public void execute(String[] args) {
        // if (args.length == 1 && !CollectionManager.getCollection().containsKey(args[0])) {
            DragonGenerator dragonGenerator = new DragonGenerator();
            Object dragon = dragonGenerator.createDragon();
            CollectionManager.add((Dragon) dragon);
            System.out.println("Element was added to collection");
        // } else {
        //    throw new IllegalArgumentException("Something went wrong with element's key");
        // }

    }

    @Override
    public String getDescription() {
        return "this command adds a new element with the given key.";
    }
}
