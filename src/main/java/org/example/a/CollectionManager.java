package org.example.a;

import org.example.a.IdGenerator;
import org.example.data.Dragon;

import java.util.Hashtable;

public class CollectionManager {
    Hashtable<String, Dragon> hashTable;

    public CollectionManager() {
        new IdGenerator();
        hashTable = new Hashtable<>();
    }

    // Добавление нового дракона
    public void add(String key, Dragon dragon) {
        if (hashTable == null) {
            hashTable = new Hashtable<>();
        } hashTable.put(key, dragon);
    }
}
