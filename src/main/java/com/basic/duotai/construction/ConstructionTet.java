package com.basic.duotai.construction;

/**
 * Created by lsh on 2018/11/15 20:18.
 *
 * @author lsh
 * @date 2018/11/15
 *
 *测试构造方法执行顺序
 *
 */
public class ConstructionTet {
    public ConstructionTet() {
        System.out.println("wucan");

    }

    public ConstructionTet(String name){
        System.out.println("you can");
    }

    public static void main(String[] args) {
        new ConstructionTet();
        new ConstructionTet("");
    }
}
