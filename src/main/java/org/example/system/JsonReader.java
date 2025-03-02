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



    static Hashtable<Long, Dragon> read(String filePath) {
        String path = filePath;
        Hashtable<Long, Dragon> hashtable = new Hashtable<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"))) {
//

            // InputStreamReader reader = new InputStreamReader(new FileInputStream(path));

            // BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            // String line;
            // StringBuilder text = new StringBuilder();

//            while((line = reader.readLine()) != null) {
//                text.append(line);
//            }
//            if (text.isEmpty()){
//                System.out.println("No element to add, your collection is clear");
//            }


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
            List<Dragon> dragons = gson.fromJson(reader, listType);

            for (Dragon dragon : dragons) {
                hashtable.put(dragon.getID(), dragon);
            }

        } catch (IOException e) {
            System.err.println("Something wrong with reading a file");
            throw new RuntimeException("Не удалось прочитать файл JSON", e);
        }
        return hashtable;
    }
}

