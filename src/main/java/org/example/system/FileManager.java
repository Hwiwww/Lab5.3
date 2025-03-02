package org.example.system;

import org.example.data.Dragon;

import java.util.Collection;
import java.util.Hashtable;

public class FileManager {
    public static void readFile(String path) {
        CollectionManager.getCollection().putAll(JsonReader.read(path));
    }

    public static void saveToFile() {
        JsonWriter.write();
    }
}
