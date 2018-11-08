package com.basic.thread;

import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by lsh on 2018/11/8 17:59.
 *
 * @author lsh
 * @date 2018/11/08
 */
public class FromJavaThread {

    /**
     * ThreadPoolTaskExecutor from Spring
     * */
    @Test
    public void test(){
        ThreadPoolTaskExecutor taskExecutor  = new ThreadPoolTaskExecutor();
        taskExecutor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
