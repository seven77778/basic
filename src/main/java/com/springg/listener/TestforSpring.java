package com.springg.listener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LSH on 2018/11/13.
 *
 * @author LSH
 * @date 2018/11/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class TestforSpring {

    @Autowired
    OrderService orderService;
    @Test
    public void test(){
        orderService.createOrder();
    }

}
