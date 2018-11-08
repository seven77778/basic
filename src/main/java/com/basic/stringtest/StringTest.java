package com.basic.stringtest;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/8 09:43.
 *
 * @author lsh
 * @date 2018/11/08
 */
public class StringTest {

    /**
     * test +]
     *
     * out:
     * String a = "ab";
     String b = "c";
     (new StringBuilder()).append(a).append(b).toString();
     String c = "1";
     String d = "1";
     (new StringBuilder()).append(c).append(d).toString();
     String s = "aaaaaasccccccccccccccddddddddddddddccccccccccccccccccccccccc";
     *
     * 1.字面常量的相加，直接拼接好
     * 2.String 对象相加，new StringBuilder
     *
     * */
    @Test
    public void test(){
        String a = "a" + "b";
        String b = "c";
        String str = a+b;
        String c = "1";
        String d = "1";
        String e = c + d;
        String s = "aaaaaascccccccccccccc"+"ddddddddddddddccccccccccccccccccccccccc";
    }


    @Test
    public void test2(){
        String s = new String("a" +"b");
        String a = new String("a") +"b";
        String b = "ab";
        System.out.println(s.intern() == b);
        System.out.println(a.intern() == b);

        String c = "aa";
        String d = "a" +"a";
        System.out.println(c == d);
    }
}
