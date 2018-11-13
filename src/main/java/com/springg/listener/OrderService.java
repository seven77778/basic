package com.springg.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * Created by LSH on 2018/11/13.
 *
 * @author LSH
 * @date 2018/11/13
 */


public class OrderService {

    @Autowired
    ApplicationContext applicationContext;


   /**
    *
    * */
    public void createOrder(){
        System.out.println("产生订单");

        applicationContext.publishEvent(new OrderEvent(""));
    }



}
