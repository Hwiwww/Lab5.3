package org.example.commands;

import org.example.a.CollectionManager;
import org.example.data.Dragon;

import java.util.Collection;
import java.util.Hashtable;

import static org.example.a.CollectionManager.hashTable;

public class Show extends Commands {
    public Show() {
        super("show");
    }

    @Override
    public void execute() {
        Hashtable<String, Dragon> dragons = hashTable;
        hashTable.forEach((k, v) -> System.out.println(v.toString()));
        System.out.println("вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }

    @Override
    public String getDescription() {
        return "shows the elements of a collection.";
    }
}