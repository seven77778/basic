package com.basic.lock.atomic;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/8 17:23.
 *
 * @author lsh
 * @date 2018/11/08
 */
public class AtomicReferenceTest {

    AtomicReference reference = new AtomicReference();

    /**
     * test AtomicReference
     * */
    @Test
    public void test(){

        System.out.println(reference.compareAndSet(null,1));
        System.out.println(reference.compareAndSet(1,2));
        System.out.println(reference.get());
    }

    public void lock(){
        while (!reference.compareAndSet(null,1)){
            //donothing
            System.out.println("waitting");
        }
    }
    /**
     * test lock()
     */
    @Test
    public void test2(){
        reference.compareAndSet(null,1);
        lock();
        System.out.println("locked");
    }

}
