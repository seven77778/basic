package com.basic.datastructrue.map.currenthashmap;

import java.util.Map;

import com.google.common.collect.Maps;
import org.junit.Test;

/**
 * Created by lsh on 2018/11/14 17:54.
 *
 * first，load有list，exception，collection，reader
 *
 * 源码解读
 * key 和 value 均不能为null
 * 拿到key的hashcode （高位与）
 * 定义volatile 的node数组 -- table，初始为null
 * int binCount --
 * 怼一个for无限循环
 * 第一次，table为null，初始化 -- tab = initTable()
 *
 *
 *
 *initTable()
 * sizeCtl 初始值，如果小于0，thread.yeild（）
 */
public class CurrentHashMapTest {

    @Test
    public void test(){
        Map concurrentMap = Maps.newConcurrentMap();
        concurrentMap.put("a","1");
    }
}
