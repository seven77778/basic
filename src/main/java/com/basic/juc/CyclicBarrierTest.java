package com.basic.juc;

import org.junit.Test;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by lsh on 2018/11/26 16:47
 *
 * definition：循环屏障
 */
public class CyclicBarrierTest {

    @Test
    public void test(){
        CyclicBarrier cyclicBarrier = new CyclicBarrier('a');

        System.out.println((int)'a');

    }


}
