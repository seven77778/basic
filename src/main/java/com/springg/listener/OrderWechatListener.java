package com.springg.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * Created by LSH on 2018/11/13.
 *
 * @author LSH
 * @date 2018/11/13
 */
@Service
public class OrderWechatListener implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("send wechat");
    }
}
