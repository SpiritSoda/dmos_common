package com.dmos.dmos_common.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeDTO {
    private int id;
    private String token;
    // 以下字段注册时最好填写
    // 0：服务器， 1：客户机
    private int type;
    // 机器名用于显示，如不设置则为Machine + id
    private String name;
    // ip地址，如不设置为unset
    private String ip;
    // 刷新间隔，必须设置
    private int interval;
}
