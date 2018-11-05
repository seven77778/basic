package com.basic.duotai.extend;

/**
 * Created by lsh on 2018/10/27.
 *
 * @author lsh
 * @date 2018/10/27
 */
public class Wind extends Instrument {
    @Override
    void play(Node n){
        System.out.println("wind play " + n);
    }
}
