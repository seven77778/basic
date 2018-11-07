package com.basic.jmm.order;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/7 19:36.
 *
 * @author lsh
 * @date 2018/11/07
 */
public class OrderTest {
    int num = 0;
    /**
     * ordering basic test
     *
     * 1-0,2-1
     * */
    @Test
    public void test() throws Exception{
        new Thread(()->{num=1;}).start();
        new Thread(()->{num=2;}).start();
        System.out.println(num);
    }


}
