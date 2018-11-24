package com.basic.duotai.outerandinner;

/**
 * Created by lsh on 2018/11/24 17:03
 */
public class InnerTest {

    //成员内部类
    private class Inner{

    }

    //静态内部类
    static class StaticClass{

    }

    public static void main(String[] args) {

        //匿名内部类
        (new Thread(new Runnable() {
            @Override
            public void run() {

            }
        })).start();

        (new Thread()).start();

        //方法内部类，不允许拥有修饰符
        class Method1Class{

        }

        (new Runnable(){
            @Override
            public void run(){

            }
        }).run();
    }
}
