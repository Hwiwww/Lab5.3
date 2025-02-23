package org.example.commands;

import org.example.a.CollectionManager;

public class SumOfAge extends Commands {
    public SumOfAge() {
        super("sumOfAge");
    }

    @Override
    public void execute() {
        System.out.println("sum of ages for all items in the collection: " + CollectionManager.getSumOfAges());
    }

    @Override
    public String getDescription() {
        return "outputs the sum of age field values for all items in the collection";
    }
}
