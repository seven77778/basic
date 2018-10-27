package com.basic.duotai.Outerandinner;

/**
 * Created by lsh on 2018/10/27.
 *
 * @author lsh
 * @date 2018/10/27
 */
public class Outer {
    private String name = "outer";


    class Inner{
        private String name = "inner";
        /**
         * 如果外部类和内部类具有相同的成员变量或方法
         * 内部类默认访问自己的成员变量或方法
         * 如果要访问外部类的成员变量，可以使用 this 关键字
         * */
        void test(){
            System.out.println("外部类的name " + Outer.this.name);
            System.out.println("内部部类的name " + name);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.test();
    }
}
