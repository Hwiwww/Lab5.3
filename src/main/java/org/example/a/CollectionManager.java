package org.example.a;

import org.example.a.IdGenerator;
import org.example.data.Dragon;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Hashtable;

public class CollectionManager {
    public static Hashtable<String, Dragon> hashTable;
    private static LocalDate date;
    public static long sumOfAges;

    public CollectionManager() {
        new IdGenerator();
        hashTable = new Hashtable<>();
    }

    public static Hashtable<String, Dragon> getCollection() {
        return hashTable;
    }

    // Добавление нового дракона
    public void add(Dragon dragon) {
        if (hashTable == null) {
            hashTable = new Hashtable<>();
        } hashTable.put(dragon.getName(), dragon);
    }

    public static long getSumOfAges() {
        hashTable.forEach((s, dragon) -> {
            sumOfAges = sumOfAges + dragon.getAge();
        });
        return sumOfAges;
    }

    public static LocalDate getInitializationDate() {
        return date;
    }
}
