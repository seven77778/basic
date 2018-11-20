package com.designmode.strategy;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 *
 * 收费服务
 * 1.没有无参数的构造方法， Caused by: java.lang.NoSuchMethodException: com.designmode.strategy.PayService.<init>()
 */
@Component
public class PayService {


    static Map<String, IDiscount> map = Maps.newHashMap();
    static List<IDiscount> list;
    //list如何初始化的
//    public PayService(List<IDiscount> list) {
//        for(IDiscount iDiscount:list){
//            map.put(iDiscount.getType(),iDiscount);
//        }
//    }

    static{
        for(IDiscount iDiscount:list){
            map.put(iDiscount.getType(),iDiscount);
        }
    }


    public double payDiscount(String type, double cost){
        return map.get(type).discount(cost);
    }
}
