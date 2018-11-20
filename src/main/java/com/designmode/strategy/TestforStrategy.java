package com.designmode.strategy;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 *
 * 2018年11月20日 -- java.lang.NullPointerException
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class TestforStrategy {

    @Resource(name = "pay")
    PayService payService;

    @Test
    public void test(){
        double result = payService.payDiscount("vip", 100);
        System.out.println(result);
    }

}
