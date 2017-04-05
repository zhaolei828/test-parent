package com.apec.a;

import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/4/1 11:14
 * 编码作者：zhaolei
 */
@FeignClient(name = "a-service", fallback = AServiceFallback.class)
public interface AService {
    @RequestMapping(method = RequestMethod.GET, value ="/foo")
    List<User> contributors();
}
