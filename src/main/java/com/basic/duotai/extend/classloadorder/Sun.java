package com.basic.duotai.extend.classloadorder;

import org.junit.*;

/**
 * Created by lsh on 2018/11/2.
 *
 * @author lsh
 * @date 2018/11/02
 */
public class Sun extends Father {
    static {
        System.out.println("Sun static");
    }

    public Sun() {
        System.out.println("Sun constructor");
    }

    /**
     * 输出：father static
     Sun static
     father constructor
     Sun constructor
     father constructor
     Sun constructor
     * */
    // TODO: 2018/11/2  6 ?
    @org.junit.Test
    public void test(){
        new Sun();
    }

}
