package com.apec;

import com.apec.a.AService;
import com.apec.a.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/4/1 11:49
 * 编码作者：zhaolei
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@EnableFeignClients
@RestController
public class BApplication {
    @Autowired
    AService aService;

    public static void main(String[] args) {
        SpringApplication.run(BApplication.class, args);
    }

    @RequestMapping(method = RequestMethod.GET, value ="/bar")
    public List<User> bar(){
        System.out.println(" //// B服务");
        List<User> list = aService.contributors();
        return list;
    }
}
