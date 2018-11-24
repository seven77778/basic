package com.basic;

/**
 * Created by lsh on 2018/11/24 18:04
 *
 * 形参和实参
 */
public class methodparams {

    boolean b;

    public void setB(boolean b) {
        this.b = b;
    }

    //布尔类型，is和get的坑
    public boolean isB() {
        return b;
    }

    private static int a =222;
    private static String str = "old str";
    private static StringBuilder stringBuilder = new StringBuilder("old stringbuilder");

    //a=333 ，这里修改的是传入的参数a
    public static void method(int a){
        a = 333;
    }

    //全局变量a
    public static void method(){
        a=555;
    }

    public static void method(String str){
        str = "new String";
    }

    public static void method(StringBuilder stringBuilder1){
        stringBuilder1 = new StringBuilder("11");
    }




}
