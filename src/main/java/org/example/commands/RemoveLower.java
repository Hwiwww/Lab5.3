package org.example.commands;

import org.example.system.CollectionManager;

public class RemoveLower extends Commands {
    public RemoveLower() {
        super("remove_lower");
    }

    @Override
    public void execute(String[] args) {
        CollectionManager.getCollection().forEach((w, dragon) -> {
            if (dragon.getWeight() < Integer.parseInt(args[0])) {
                CollectionManager.getCollection().remove(w);
            }
        });
    }

    @Override
    public String getDescription() {
        return "this command removes all items smaller than the specified one from the collection.";
    }
}
