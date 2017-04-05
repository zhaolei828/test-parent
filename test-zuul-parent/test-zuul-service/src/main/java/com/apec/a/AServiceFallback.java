package com.apec.a;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/4/5 16:56
 * 编码作者：zhaolei
 */
@Component
public class AServiceFallback implements AService {
    @Override
    public List<User> contributors() {
        System.out.println("请求异常");
        return null;
    }
}
