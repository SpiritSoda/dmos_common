package com.dmos.dmos_common.data;

import lombok.Data;

import java.util.HashMap;

@Data
public class DMOSRequest {
    private HashMap<String, Object> data;
    public void put(String key, Object value){
        data.put(key, value);
    }
}
