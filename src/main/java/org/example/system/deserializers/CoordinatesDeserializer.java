package org.example.system.deserializers;

import com.google.gson.*;
import org.example.data.Coordinates;

import java.lang.reflect.Type;

public class CoordinatesDeserializer implements JsonDeserializer<Coordinates> {
    @Override
    public Coordinates deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        JsonObject jsonObject = json.getAsJsonObject();

        Coordinates coordinates = new Coordinates();
        coordinates.setX(jsonObject.get("coordinatesX").getAsDouble());
        coordinates.setY(jsonObject.get("coordinatesY").getAsLong());

        return coordinates;
    }
}