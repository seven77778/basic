package com.designmode.learnfromspring;

import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 *
 * 通过redistemplate 学习设计模式
 * 模板方法模式
 *
 */
public class LearnFromRedisTemplate {
    @Test
    public void test(){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.execute(new RedisCallback(){

            @Override
            public Object doInRedis(RedisConnection connection) throws DataAccessException {
                //return connection
                return null;
            }
        } );
    }
}
