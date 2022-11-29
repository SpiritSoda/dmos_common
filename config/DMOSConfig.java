package com.dmos.dmos_common.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class DMOSConfig {
    // 本地token
    // 每个机器有自己的token，连接非register机器前向register发送token(http请求)，register会返回一个限时的连接token用于向非register机器连接
    // 从而避免机器自己的token泄漏到非register机器
    private String localToken;
    // 父服务器 IP + 端口
    private String socketIP;
    // 注册服务器 域名 或 IP + 端口
    private String register;
    // 数据服务器 域名 或 IP + 端口
    private String storage;
    // 本地IP
    private String localhost;
    public DMOSConfig() {
        localToken = "";
        socketIP = "127.0.0.1:8082";
        register = "127.0.0.1:8081";
        storage = "127.0.0.1:8085";
        localhost = "192.168.1.1";
    }
}
