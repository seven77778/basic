package com.basic.lock.jvmlock;

import com.basic.lock.task.OrderTask;
import com.basic.lock.util.OrderLockServer;
import com.basic.lock.util.OrderService;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by LSH on 2018/11/6.
 *
 * @author LSH
 * @date 2018/11/6
 */
public class JvmLockOrder {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final CountDownLatch latch  = new CountDownLatch(1);
        //todo 这个写法感觉不对啊
//        OrderService orderService = new OrderLockServer();
        for(int i=0;i<10;i++) {
            OrderService orderService = new OrderLockServer();
            executorService.submit(new OrderTask(latch, orderService));
        }
        latch.countDown();
        executorService.shutdown();
    }

    @Test
    public void test(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        final CountDownLatch latch = new CountDownLatch(1);
        final OrderService orderService = new OrderLockServer();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    executorService.submit(new OrderTask(latch, orderService));
                    System.out.println("jj");
                }

            }
        });
        latch.countDown();
        executorService.shutdown();
    }
}
