package com.dmos.dmos_common.util;

import com.google.gson.Gson;

import java.lang.reflect.Type;

// 用于从DMOSResponse和DMOSRequest的data中解析对象
public class ParseUtil {
    private static Gson gson = new Gson();
    public static <T> T parse(Object o, Class<T> type){
        return gson.fromJson(gson.toJson(o), type);
    }
    public static <T> T parse(Object o, Type type){
        return gson.fromJson(gson.toJson(o), type);
    }
}
