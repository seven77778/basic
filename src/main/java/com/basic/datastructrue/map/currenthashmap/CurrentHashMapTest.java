package com.basic.datastructrue.map.currenthashmap;

import java.util.Map;

import com.google.common.collect.Maps;
import org.junit.Test;

/**
 * Created by lsh on 2018/11/14 17:54.
 *
 * @author lsh
 * @date 2018/11/14
 *
 * 源码解读
 * key 和 value 均不能为null
 * 拿到key的hashcode （高位与）
 * 定义volatile 的node数据
 *
 */
public class CurrentHashMapTest {

    @Test
    public void test(){
        Map concurrentMap = Maps.newConcurrentMap();
        concurrentMap.put(null,null);
    }
}
