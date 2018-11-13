package com.basic.enumtest;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/13 18:57.
 *
 * @author lsh
 * @date 2018/11/13
 */
public class EnumTest {

    /**
     * switch
     */
    @Test
    public void test(){
        int i = 1;
        switch (i){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            default:
                System.out.println("default");
        }
    }

    /**
     * switch + enum
     *
     */
    @Test
    public void test2(){
        Color color =Color.Red;
        switch (color){
            case Red:
                System.out.println("red");
            case Bule:
                System.out.println("blue");
        }
    }


}

