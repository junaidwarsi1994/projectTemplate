package app.invision.template.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;


public class GsonUtils {

    public static <T> JSONObject toJSON(T obj)throws JSONException {
        GsonBuilder builder = new GsonBuilder();
        builder.excludeFieldsWithoutExposeAnnotation();
        Gson gson = builder.create();
        return new JSONObject(gson.toJson(obj));
    }

    public static <T> T fromJSON(String json, Class<T> classOfT){
        Gson gson = new Gson();
        return gson.fromJson(json,classOfT);
    }

    public static <T> T fromJSON(JSONObject json, Class<T> classOfT){
        Gson gson = new Gson();
        return gson.fromJson(json.toString(),classOfT);
    }

}