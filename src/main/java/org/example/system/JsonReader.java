package org.example.system;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.example.data.Coordinates;
import org.example.data.Dragon;
import org.example.data.DragonCave;
import org.example.data.DragonType;
import org.example.system.deserializers.*;



import java.io.*;

import java.time.LocalDateTime;

import java.util.Collection;


// читает данные из json файла
public class JsonReader {

    static void read(String path) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(path); //path - путь до файла

        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line;
        StringBuilder text = new StringBuilder();

        while((line = br.readLine()) != null) {
            text.append(line);
        }


        Collection<Dragon> collection;
        Gson gson = new GsonBuilder().registerTypeAdapter(Dragon.class, new DragonDeserializer())
                .registerTypeAdapter(Coordinates.class, new CoordinatesDeserializer())
                .registerTypeAdapter(DragonType.class, new DragonTypeDeserializer())
                .registerTypeAdapter(DragonCave.class, new DragonCaveDeserializer())
                .registerTypeAdapter(LocalDateTime.class, new LocalDateDeserializer())
                .create();
        collection = gson.fromJson(br,
                new TypeToken<Collection<Dragon>>() {
                }.getType());

        for (Dragon dragon : collection) {
            CollectionManager.getCollection().put(dragon.getName(), dragon);
        }


    }

}

