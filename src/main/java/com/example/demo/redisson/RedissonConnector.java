package com.example.demo.redisson;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**获取RedissonClient连接类**/
@Component
public class RedissonConnector {
    RedissonClient redisson;
    @PostConstruct
    public void init(){

        /*Config config = new Config();

        config.useSentinelServers().addSentinelAddress("127.0.0.1:6369","127.0.0.1:6379", "127.0.0.1:6389")

                .setMasterName("masterName")

                .setPassword("password").setDatabase(0);

        RedissonClient redissonClient = Redisson.create(config);*/


        redisson = Redisson.create();
    }

    public RedissonClient getClient(){
        return redisson;
    }

}