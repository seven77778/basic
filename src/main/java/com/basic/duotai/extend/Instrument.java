package com.basic.duotai.extend;

import org.junit.Test;

/**
 * Created by lsh on 2018/10/27.
 *
 * @author lsh
 * @date 2018/10/27
 */
public class Instrument {
    void play(Node n){
        System.out.println("instrument play");
    }

    @Test
    public void test(){
        System.out.println(new Music());
    }
}
