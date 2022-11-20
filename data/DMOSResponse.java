package com.dmos.dmos_common.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
public class DMOSResponse {
    private int code;
    private HashMap<String, String> data;
    public DMOSResponse(int code, HashMap<String, String> data){
        this.code = code;
        this.data = data;
    }
    public static DMOSResponse buildSuccessResponse(HashMap<String, String> data) { return new DMOSResponse(0, data); }
    public static DMOSResponse buildFailsResponse(HashMap<String, String> data) { return new DMOSResponse(-1, data); }
}