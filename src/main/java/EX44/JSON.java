package EX44;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSON {
    public static List<Products> jsonScan(File file) throws IOException {
        var gson = new Gson();
        JsonObject jObject;
        try (JsonReader jReader = new JsonReader(new FileReader(file))) {
            jObject = gson.fromJson(jReader, JsonObject.class);
        }
        var jArray = (JsonArray) jObject.get("products");

        return gson.fromJson(jArray.toString(), new TypeToken<ArrayList<Products>>(){}.getType());
    }
}
