package com.hjy.treehole.controller;

import com.alibaba.fastjson.JSON;
import com.hjy.treehole.mapper.UserMapper;
import com.hjy.treehole.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hjy
 * @date 2020/8/8 16:37
 */
@RestController
@RequestMapping("/test")
public class HelloTestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/redis")
    public String redisTest() {
        stringRedisTemplate.opsForValue().set("hjy","111222");
        return stringRedisTemplate.opsForValue().get("hjy");
    }

    @RequestMapping("/mysql")
    public String mysqlTest() {
        User user = new User("张三", 13);
        int i = userMapper.insert(user);
        return i + "";
    }
}
