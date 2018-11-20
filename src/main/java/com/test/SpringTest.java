package com.test;

import com.designmode.strategy.PayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-test.xml")
public class SpringTest {

    @Autowired
    PayService payService;

    /**
     * 策略模式实现
     */
    @Test
    public void testForStrategy(){
        System.out.println(payService.payDiscount("vip",100));
    }
}
