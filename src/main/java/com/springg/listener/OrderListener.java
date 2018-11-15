package com.springg.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by LSH on 2018/11/13.
 *
 * @author LSH
 * @date 2018/11/13
 *
 * <bean id="OrderListener" class="com.springg.listener.OrderListener"></bean>
 * 在spring-test.xml 中加入此配置，才生效 ？
 */
@Component
public class OrderListener implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("send message");
    }
}
