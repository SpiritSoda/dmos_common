package com.dmos.dmos_common.data;

import lombok.Data;

import java.util.HashMap;

@Data
public class DMOSRequest {
    private HashMap<String, String> data;
    public void put(String key, String value){
        data.put(key, value);
    }
}
