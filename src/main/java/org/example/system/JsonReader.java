package org.example.system;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.example.data.Coordinates;
import org.example.data.Dragon;
import org.example.data.DragonCave;
import org.example.data.DragonType;
import org.example.system.deserializers.*;



import java.io.*;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

import java.util.*;


// читает данные из json файла
public class JsonReader {



    static Hashtable<Long, Dragon> read() {
        String path = "data.json";
        Hashtable<Long, Dragon> hashtable = new Hashtable<>();
        List<Dragon> dragons;

        try {
//            FileInputStream fis = new FileInputStream(path); //path - путь до файла
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader br = new BufferedReader(isr);

            InputStreamReader reader = new InputStreamReader(new FileInputStream(path));

//            String line;
//            StringBuilder text = new StringBuilder();
//
//            while((line = br.readLine()) != null) {
//                text.append(line);
//            }

            Gson gson = new GsonBuilder().registerTypeAdapter(Dragon.class, new DragonDeserializer())
                    .registerTypeAdapter(Coordinates.class, new CoordinatesDeserializer())
                    .registerTypeAdapter(DragonType.class, new DragonTypeDeserializer())
                    .registerTypeAdapter(DragonCave.class, new DragonCaveDeserializer())
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateDeserializer())
                    .create();


            Type listType = new TypeToken<List<Dragon>>() {}.getType();
            dragons = gson.fromJson(reader, listType);

            for (Dragon dragon : dragons) {
                hashtable.put(dragon.getID(), dragon);
            }

        } catch (IOException e) {
            throw new RuntimeException();
        }
        return hashtable;
    }
}

