package org.example.commands;

import org.example.system.CollectionManager;

public class FilterLessThanWeight extends Commands {
    public FilterLessThanWeight() {
        super("filter_less_than_weight");
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 1) {
            CollectionManager.getCollection().forEach((key, dragon) -> {
                int comparisonWeight = Integer.parseInt(args[0]);
                if (dragon.getWeight() < comparisonWeight) {
                    System.out.println(dragon.toString());
                }
            });
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public String getDescription() {
        return "outputs elements which value of weight is lower than given";
    }
}
