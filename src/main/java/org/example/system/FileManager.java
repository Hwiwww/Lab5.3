package org.example.system;

import org.example.data.Dragon;

import java.util.Collection;
import java.util.Hashtable;

public class FileManager {
    public static void readFile() {
        CollectionManager.getCollection().putAll(JsonReader.read());
    }

    public static void saveToFile() {
        JsonWriter.write();
    }
}
