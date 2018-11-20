package com.designmode.strategy;

import org.springframework.stereotype.Service;

/**
 * Created by LSH on 2018/11/14.
 *
 * @author LSH
 * @date 2018/11/14
 */
@Service("svip")
public class SvipDiscount implements IDiscount {
    @Override
    public String getType() {
        return "svip";
    }

    @Override
    public Double discount(  double cost) {
        return cost * 0.5;
    }
}
