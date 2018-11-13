package com.basic.maptest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LSH on 2018/11/8.
 *
 * @author LSH
 * @date 2018/11/8
 */
public class MapTest {
    /**
     * map basic test
     */
    @Test
    public void test(){
        Map map = new HashMap();
        map.put(1,1);
        /**
         * class java.lang.Integer
         */
        System.out.println(map.get(1).getClass());
        System.out.println(new A().name);
    }
}

class A{
    String name = "lsh";
}
