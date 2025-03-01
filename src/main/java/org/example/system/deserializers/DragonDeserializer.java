package org.example.system.deserializers;

import com.google.gson.*;
import org.example.data.Coordinates;
import org.example.data.Dragon;
import org.example.data.DragonCave;
import org.example.data.DragonType;

import java.lang.reflect.Type;
import java.time.LocalDateTime;

public class DragonDeserializer implements JsonDeserializer<Dragon> {
    @Override
    public Dragon deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        JsonObject jsonObject = json.getAsJsonObject();

        Dragon dragon = new Dragon();
        dragon.setID(jsonObject.get("id").getAsLong());
        dragon.setName(jsonObject.get("name").getAsString());
        dragon.setCoordinates((Coordinates) context.deserialize(jsonObject.get("coordinates"), Coordinates.class));
        dragon.setCreationDate((LocalDateTime) context.deserialize(jsonObject.get("creationDate"), LocalDateTime.class));
        dragon.setAge(jsonObject.get("age").getAsLong());
        dragon.setWeight(jsonObject.get("weight").getAsInt());
        dragon.setSpeaking(jsonObject.get("speaking").getAsBoolean());
        dragon.setType((DragonType) context.deserialize(jsonObject.get("dragonType"), DragonType.class));
        dragon.setCave((DragonCave) context.deserialize(jsonObject.get("dragonCave"), DragonCave.class));

        return dragon;
    }
}
