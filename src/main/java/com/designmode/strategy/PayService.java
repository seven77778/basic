package com.designmode.strategy;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 *
 * 收费服务
 * 1.没有无参数的构造方法， Caused by: java.lang.NoSuchMethodException: com.designmode.strategy.PayService.<init>()
 * 2.auto + map , 名字是默认类名，加component名字，但是gettype无用
 */
@Component("pay")
public class PayService {

    @Autowired
    Map<String, IDiscount> map = Maps.newHashMap();


    public double payDiscount(String type, double cost){
        return map.get(type).discount(cost);
    }
}
