package com.basic.enumtest;

/**
 * Created by lsh on 2018/11/5.
 *
 * @author lsh
 * @date 2018/11/05
 */

/**
 * 枚举类构造方法不允许public
 * */
public enum MyEnum {
    /**
     * enum
     */
    PAY(1,"payed"),
    NOTPAY(2,"notpay");

    private String value;
    private int key;

    public String getValue() {
        return value;
    }

    MyEnum(int a, String s) {
        this.key = a;
    }
}
