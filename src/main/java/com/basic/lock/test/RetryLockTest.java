package com.basic.lock.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lsh on 2018/11/6 17:39.
 *
 * @author lsh
 * @date 2018/11/06
 *
 * 线程1持有锁2，线程2持有锁1？？
 *
 */
public class RetryLockTest {

    ReentrantLock lock = new ReentrantLock();

    public void getLock(){
        lock.lock();
    }

    @Test
    public void test() throws Exception{
        boolean ss = lock.tryLock();

        boolean ss2 = lock.tryLock();
        System.out.println(ss);
        System.out.println(ss2);

        new Thread(()->getLock()).start();
        new Thread(()->getLock()).start();
        //lock.lockInterruptibly();
        Thread.sleep(100);

        getLock();
        assert lock.isHeldByCurrentThread():"no lock";
    }
}
