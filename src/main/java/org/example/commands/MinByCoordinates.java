package org.example.commands;

import org.example.data.Dragon;
import org.example.system.CollectionManager;

import java.util.Hashtable;

public class MinByCoordinates extends Commands {
    public MinByCoordinates() {
        super("min_by_coordinates");
    }

    @Override
    public void execute(String[] args) {
        Hashtable dragonCollection = CollectionManager.getCollection();
        CollectionManager.getCollection().forEach((key, dragon) -> {
            Dragon dragonWithMinCoordinates = (Dragon) dragonCollection.get("1");
            int minSumOfCoordinates = (int) dragonWithMinCoordinates.getCoordinates().getX() + (int) dragonWithMinCoordinates.getCoordinates().getY();
            int sumOfCoordinates = (int) dragon.getCoordinates().getX() + (int) dragon.getCoordinates().getY();;
            if (minSumOfCoordinates > sumOfCoordinates) {
                dragonWithMinCoordinates = dragon;
            }
        });
    }

    @Override
    public String getDescription() {
        return "outputs element from collection which coordinates is min";
    }
}
