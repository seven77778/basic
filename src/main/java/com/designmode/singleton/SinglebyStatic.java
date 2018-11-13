package com.designmode.singleton;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/13 17:20.
 *
 * @author lsh
 * @date 2018/11/13
 *
 * 使用静态内部类 实现 单例模式
 *
 * 缺点：1.都需要额外的工作(Serializable、transient、readResolve())来实现序列化，否则每次反序列化一个序列化的对象实例时都会创建一个新的实例
 * 2.可能会有人使用反射强行调用我们的私有构造器（如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）
 */
public class SinglebyStatic {

    private SinglebyStatic(){

    }

    private static class Holder{
        private static SinglebyStatic singlebyStatic = new SinglebyStatic();
    }

    private static SinglebyStatic getSingle(){
        return Holder.singlebyStatic;
    }

    /**
     *  Test class should have exactly one public constructor
     *
     */
    @Test
    public void  test(){
        SinglebyStatic singlebyStatic = SinglebyStatic.getSingle();
        SinglebyStatic singlebyStatic2 = SinglebyStatic.getSingle();
        System.out.println(singlebyStatic == singlebyStatic2);
    }

    public static void main(String[] args) {
        SinglebyStatic singlebyStatic = SinglebyStatic.getSingle();
        SinglebyStatic singlebyStatic2 = SinglebyStatic.getSingle();
        SinglebyStatic singlebyStatic3 = new SinglebyStatic();

        System.out.println(singlebyStatic == singlebyStatic2);//true
        System.out.println(singlebyStatic == singlebyStatic3);//false
    }
}
