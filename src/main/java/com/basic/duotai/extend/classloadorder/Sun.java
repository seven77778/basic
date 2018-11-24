package com.basic.duotai.extend.classloadorder;

import org.junit.*;

/**
 * Created by lsh on 2018/11/2.
 *
 * @author lsh
 * @date 2018/11/02
 *
 * There is no default constructor available in 'org.springframework.context.ApplicationEven
 * 父类中只有有参的构造方法时，子类只能显式的调用
 *
 * 先执行父类构造方法，再执行子类构造方法
 *
 *
 * 除非getStr() 是 static ，否则无法调用，因为调用父类构造方法的时候，子类还没实例化
 *
 */
public class Sun extends Father {
    static {
        System.out.println("Sun static");
    }

    /**
     * 父类没有无参构造方法，必须在子类中显示调用
     */
    public Sun() {
        super("");

        this.fatherName="123";
        getStr2();
        System.out.println("sun construct");
        System.out.println(super.fatherName);
    }



    static String getStr(){
        return "";
    }

    String getStr2(){
        this.test();
        return "";
    }

    /**
     * 输出：father static
     Sun static
     father constructor
     Sun constructor
     father constructor
     Sun constructor
     * */
    // TODO: 2018/11/2  6 ?
    @org.junit.Test
    public void test(){
        new Sun();
    }

    /**
     * father static
       Sun static
       father constructor
     *
     * @param args
     */
    public static void main(String[] args) {
       Sun sun = new Sun();
        System.out.println(sun.fatherName);
    }
}
