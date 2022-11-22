package com.dmos.dmos_common.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Objects;

@Data
public class DMOSResponse {
    private int code;
    private HashMap<String, Object> data;
    public DMOSResponse(int code, HashMap<String, Object> data){
        this.code = code;
        this.data = data;
    }
    public static DMOSResponse buildSuccessResponse(HashMap<String, Object> data) { return new DMOSResponse(0, data); }
    public static DMOSResponse buildFailsResponse(HashMap<String, Object> data) { return new DMOSResponse(-1, data); }
}