package com.basic.exception;

import org.junit.Test;

/**
 * Created by lsh on 2018/10/31.
 *
 * @author lsh
 * @date 2018/10/31
 */
public class FinallyTest {

    /**
     * return 3
     * 结论：finally中的return 会覆盖 try 或者catch中的返回值
     * 分析：try…catch…finally中的return，他们共同向同一个内存地址写入返回值，后执行的将覆盖先执行的数据
     * */
    public int getNum(int num){
        try{
            int result = 10/num;
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 2;
        }finally {
            return 3;
        }
    }

    /**
     * return 2
     *
     * */
    public int getNum2(int num){
        try{
            int result = 10/num;
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return 2;
        }finally {
        }
    }

    /**
     * return 1
     *
     * */
    public int getNum3(int num){
        try{
            int result = 10/num;
            return 1;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
        }
        return 0;
    }

    @Test
    public void test(){
        System.out.println(getNum(0));
        System.out.println(getNum2(0));
        System.out.println(getNum3(0));
    }
}
