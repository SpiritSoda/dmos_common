package com.dmos.dmos_common.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

// 用于从DMOSResponse和DMOSRequest的data中解析对象
public class ParseUtil {
    private static Gson gson = new Gson();
    private static Gson gson_pretty = new GsonBuilder().setPrettyPrinting().create();
    public static <T> T parse(Object o, Class<T> type){
        return gson.fromJson(gson.toJson(o), type);
    }
    public static <T> T parse(Object o, Type type){
        return gson.fromJson(gson.toJson(o), type);
    }
    public static String encode(Object o, boolean pretty) {
        if(pretty)
            return gson_pretty.toJson(o);
        return gson.toJson(o);
    }
    public static <T> T decode(String json, Class<T> type){
        return gson.fromJson(json, type);
    }
    public static <T> T decode(String json, Type type){
        return gson.fromJson(json, type);
    }
}
