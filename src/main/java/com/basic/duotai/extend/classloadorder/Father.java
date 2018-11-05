package com.basic.duotai.extend.classloadorder;

/**
 * Created by lsh on 2018/11/2.
 *
 * @author lsh
 * @date 2018/11/02
 */
public class Father {

    protected static String privateName = "privateName";
    protected String pubAge ="18";

    static {
        //System.out.println(pubAge); //静态成员不能直接访问非静态成员
        System.out.println("father static");
    }

    public Father(){
        System.out.println("father constructor");
    }
}
