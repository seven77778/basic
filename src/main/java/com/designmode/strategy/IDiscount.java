package com.designmode.strategy;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 *
 * 策略模式 定义接口
 *
 */
public interface IDiscount {

    String getType();
    Double discount(double cost);
}
