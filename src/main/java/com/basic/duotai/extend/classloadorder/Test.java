package com.basic.duotai.extend.classloadorder;

/**
 * Created by lsh on 2018/11/2.
 *
 * @author lsh
 * @date 2018/11/02
 */
public class Test {

    /**
     * father static
     Sun static
     father constructor
     Sun constructor
     * */
    @org.junit.Test
    public void test(){
        new Sun();
    }

    /**
     * father static
     privateName
     * */
    @org.junit.Test
    public void test2(){
    }
}
