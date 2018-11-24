package com.basic.duotai.extend.classloadorder;

/**
 * Created by lsh on 2018/11/24 17:55
 */
public class LittleSun extends Sun {

    /**
     * this()必须放在构造方法的第一行
     * 如果父类没有无参构造。。
     */
    public LittleSun(){
        this("ss");

    }

    public LittleSun(String name) {
    }
}
