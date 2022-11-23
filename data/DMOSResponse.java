package com.dmos.dmos_common.data;

import lombok.Data;

import java.util.HashMap;

@Data
public class DMOSResponse {
    private int code;
    private String msg;
    private HashMap<String, Object> data = new HashMap<>();
    public DMOSResponse(){

    }
    public DMOSResponse(int code, String msg, HashMap<String, Object> data){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
    public static DMOSResponse buildSuccessResponse(HashMap<String, Object> data) { return new DMOSResponse(0, "操作成功", data); }
    public static DMOSResponse buildFailsResponse(String msg, HashMap<String, Object> data) { return new DMOSResponse(-1, msg, data); }
}