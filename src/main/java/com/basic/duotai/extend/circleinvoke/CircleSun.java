package com.basic.duotai.extend.circleinvoke;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/24 18:23
 */
public class CircleSun extends Circle {


    //java.lang.StackOverflowError 循环调用
    @Test
    public void test(){
        super.dosome();
    }
}
