package com.apec.a.impl;

import com.apec.a.AService;
import com.apec.a.Sex;
import com.apec.a.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：
 * 创建日期：2017/4/1 11:44
 * 编码作者：zhaolei
 */
@RestController
public class AServiceController implements AService {
    @Override
    @RequestMapping("/foo")
    public List<User> contributors() {
        System.out.println(" //// A服务");
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setId(1L);
        user.setName("乐迪");
        user.setAge(1800);
        user.setSex(Sex.MAN);
        list.add(user);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("小爱");
        user2.setAge(1600);
        user2.setSex(Sex.WOMAN);
        list.add(user2);

        return list;
    }
}
