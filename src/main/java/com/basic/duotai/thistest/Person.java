package com.basic.duotai.thistest;

/**
 * Created by lsh on 2018/10/27.
 *
 * @author lsh
 * @date 2018/10/27
 *
 *栈内存和堆内存来分析
 *
 */

public class Person {
    private String name;
    private int age;

    public Person(int age){
        this.age = age;
    }

    public Person add(){
        age++;
        return this;
    }

    public void showAge(){
        System.out.println("年龄 = "+ age);
    }

    void speak(){
        System.out.println("hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.speak();
        speak();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person t = new Person(25);
        t.add().add().showAge();
    }
}
