package com.basic.gc;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/5.
 *
 * @author lsh
 * @date 2018/11/05
 */
public class LocalGCTest {

    public static int _1mb = 1024*1024;
    @Test
    public void test(){
        byte[] b = new byte[_1mb];
        System.gc();
    }
}
