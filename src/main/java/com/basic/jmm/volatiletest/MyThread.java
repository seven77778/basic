package com.basic.jmm.volatiletest;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/5.
 *
 * @author lsh
 * @date 2018/11/05
 */
public class MyThread extends Thread {

    private volatile boolean stop = false;

    public void stopMy(){
        stop = true;
    }

    @Override
    public void run() {
        int i=0;
        while (!stop){
            System.out.println(i++);
        }
        System.out.println("run stop");
    }

    @Test
    public void test() throws Exception{
        MyThread thread = new MyThread();
        thread.start();//start with run , difference
        Thread.sleep(10);
        thread.stopMy();

        while (Thread.activeCount()>2){
            Thread.yield();
        }
    }
}
