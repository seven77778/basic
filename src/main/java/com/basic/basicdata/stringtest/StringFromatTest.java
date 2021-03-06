package com.basic.basicdata.stringtest;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/8 11:51.
 *
 * @author lsh
 * @date 2018/11/08
 */
public class StringFromatTest {

    /**
     * test string format
     * 1.printf ok，println not ok
     *
     * d% 只能 是数字
     */
    @Test
    public void test() {
        System.out.printf("字母a的大写是：%c %n", 'A');
        System.out.printf("3>7的结果是：%b %n", 3 > 7);
        System.out.printf("100的一半是：%d %n", 100 / 2);
        System.out.printf("hello: %d %n",10/2);
        System.out.printf("hello %d",'A');

        System.out.println();
    }

    /**
     * test stringbuffer lock
     * StringBuilder StringBuffer调用的都是 AbstractStringBuilder 的append
     * 不同的是StringBuffer 所有的方法都有synchronized -- 锁粗化
     * */
    @Test
    public void test2(){
        StringBuffer stringBuffer = new StringBuffer();
        //synchronized
        stringBuffer.append("1");
        stringBuffer.append("2");
        stringBuffer.append("3");
        //unlock
        new StringBuilder().append("a");
    }
}
