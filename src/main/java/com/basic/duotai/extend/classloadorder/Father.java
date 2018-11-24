package com.basic.duotai.extend.classloadorder;

/**
 * Created by lsh on 2018/11/2.
 *
 * @author lsh
 * @date 2018/11/02
 */
public class Father {
      String fatherName = "fatherName";
    static {
        System.out.println("father static");
    }
    public Father(String name){

        System.out.println("father constructor");
        this.fatherName="5555";
    }

    public void test(int a){
        this.fatherName = a+"";
    }
}
