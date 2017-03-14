package com.apec.ws.mq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author zhaolei
 * @create 2016-09-12 9:47
 */
@SpringBootApplication
public class TestWsMqApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TestWsMqApplication.class).web(true).run(args);
    }
}
