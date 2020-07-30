package com.hjy.treehole;

import com.alibaba.fastjson.JSON;
import com.hjy.treehole.mapper.UserMapper;
import com.hjy.treehole.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
@Slf4j
class TreeHoleApplicationTests {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        log.info("--test--");
        User user = new User("张三", 13);
        log.error(JSON.toJSONString(user));
        int i = mapper.insert(user);
        log.info("" + i);
    }

    @Test
    void redisTest() {
        stringRedisTemplate.opsForValue().set("hjy","111222");
    }
}


