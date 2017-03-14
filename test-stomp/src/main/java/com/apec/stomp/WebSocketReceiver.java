package com.apec.stomp;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.MessageMapping;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/3/13 16:16
 * 编码作者：zhaolei
 */

@Configuration
public class WebSocketReceiver {
    @MessageMapping("/test")
    void test(String message){
        System.out.println(message);
    }
}
