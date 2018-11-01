package com.basic.exception;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by lsh on 2018/10/31.
 *
 * @author lsh
 * @date 2018/10/31
 */
public class ErrorTest {
    private int length =1;

    public void stackLeak(){
        length++;
        stackLeak();
    }

    /**
     * 测试stackerror
     * */
    public static void main(String[] args) {
        ErrorTest errorTest = new ErrorTest();
        try {
            errorTest.stackLeak();
        }catch (Throwable e){
            System.out.println("length : "+ errorTest.length);
            e.printStackTrace();
        }
    }

    /**
     * 测试java.lang.OutOfMemoryError: Java heap space
     * */
    @Test
    public void test(){
        ArrayList list = new ArrayList();
        try {
            while (true){
                list.add(new Object());
            }
        }catch (OutOfMemoryError e){
            e.printStackTrace();
        }
    }

    /**
     * 借助 cglib 测试memoryout
     * */
    @Test
    public void test2(){
        while (true){
            Enhancer enhancer = new Enhancer();
        }
    }
}
