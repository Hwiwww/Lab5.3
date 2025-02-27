package org.example.system;

import org.example.data.Coordinates;
import org.example.data.Dragon;
import org.example.data.DragonCave;
import org.example.data.DragonType;

import java.util.Scanner;

public class DragonGenerator {
    public static Dragon createDragon(Long id) {
        System.out.println("Welcome to dragon creator!");


        String input, a, b;

        Dragon dragon;
        Coordinates coordinates;

        DragonCave dragonCave;

        Scanner scanner = new Scanner(System.in);

        dragon = new Dragon(id);

        {
            System.out.println("Write a String for dragon's name");
            scanner.nextLine();
            input = scanner.nextLine();
            dragon.setName(input);
        }

        {
            System.out.println("Write a double for X coordinate");
            input = scanner.nextLine();
            a = input;
        }

        {
            System.out.println("Write a long for Y coordinate");
            input = scanner.nextLine();
            b = input;
        }
        coordinates = new Coordinates(Double.parseDouble(a), Long.parseLong(b));
        dragon.setCoordinates(coordinates);

        {
            System.out.println("Write a long for dragon's age");
            input = scanner.nextLine();
            dragon.setAge(Long.parseLong(input));
        }

        {
            System.out.println("Write an int for dragon's weight");
            input = scanner.nextLine();
            dragon.setWeight(Integer.parseInt(input));
        }

        {
            System.out.println("Write a boolean for dragon's ability to speaking");
            input = scanner.nextLine();
            dragon.setSpeaking(Boolean.parseBoolean(input));
        }

        {
            System.out.println("Write dragon's type (WATER,\n" +
                    "    UNDERGROUND,\n" +
                    "    AIR,\n" +
                    "    FIRE;");
            input = scanner.nextLine();
            dragon.setType(DragonType.valueOf(input));
        }

        {
            System.out.println("Write a float for dragon cave's depth");
            input = scanner.nextLine();
            a = input;
        }

        {
            System.out.println("Write an int for dragon cave's number of treasures");
            input = scanner.nextLine();
            b = input;
        }
        dragonCave = new DragonCave(Integer.parseInt(b), Float.parseFloat(a));
        dragon.setCave(dragonCave);

        return dragon;
    }
}