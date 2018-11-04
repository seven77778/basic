package com.basic.jvm.volatiletest;

import org.junit.Test;

public class VolatileTest {
    public static volatile int num;

    public void add(){
        for(int i=0;i<1000;i++)
        num++;
    }


    @Test
    public void test() throws Exception{
        Thread[] threads = new Thread[20];
        for(int i =0;i<20;i++){
            threads[i] = new Thread(()-> add());
            threads[i].start();
        }

        while (Thread.activeCount()>2){
            System.out.println(Thread.activeCount());
            Thread.yield();
        }
//        Thread.sleep(1000);

        System.out.println("num : "+num);
        Thread.currentThread().getThreadGroup().list();
    }

}
