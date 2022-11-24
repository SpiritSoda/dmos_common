package com.dmos.dmos_common.util;

import com.dmos.dmos_common.message.Message;
import com.dmos.dmos_common.message.MessageType;
import io.netty.channel.Channel;


public class ChannelUtil {
    public static void heartbeat(Channel channel){
        if(channel == null || !channel.isActive())
            return;
        Message message = new Message();
        message.setType(MessageType.HEARTBEAT);
        channel.write(ParseUtil.encode(message, false) + "\r");
        channel.flush();
    }
}
