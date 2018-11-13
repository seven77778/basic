package com.springg.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by LSH on 2018/11/13.
 *
 * @author LSH
 * @date 2018/11/13
 */
public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Object source) {
        super(source);

        System.out.println("order event");
    }
}
