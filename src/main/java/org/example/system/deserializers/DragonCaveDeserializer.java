package org.example.system.deserializers;

import com.google.gson.*;
import org.example.data.DragonCave;

import java.lang.reflect.Type;

public class DragonCaveDeserializer implements JsonDeserializer<DragonCave> {
    @Override
    public DragonCave deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        JsonObject jsonObject = json.getAsJsonObject();

        DragonCave dragonCave = new DragonCave();
        dragonCave.setDepth(jsonObject.get("dragonCaveDepth").getAsFloat());
        dragonCave.setNumberOfTreasures(jsonObject.get("dragonCaveNumberOfTreasures").getAsInt());

        return dragonCave;
    }
}
