package org.example.data;

public class DragonCave {
    private Float depth; //Поле не может быть null
    private int numberOfTreasures; //Значение поля должно быть больше 0

    public DragonCave(int numberOfTreasures, Float depth) {
        this.numberOfTreasures = numberOfTreasures;
        this.depth = depth;
    }
}
