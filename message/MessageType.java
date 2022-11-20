package com.dmos.dmos_common.message;

public class MessageType {
    // client2server: 心跳
    public static final int HEARTBEAT = 0;
    // client2server: 客户机状态报告
    public static final int CLIENT_REPORT = 1;
    // server2client: 配置变更
    public static final int CONFIG = 2;
    // client2server: 通道身份验证信息
    public static final int IDENTIFY = 3;
    // client2server: 服务器状态报告
    public static final int SERVER_REPORT = 4;
}
