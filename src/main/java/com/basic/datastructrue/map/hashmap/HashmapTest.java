package com.basic.datastructrue.map.hashmap;

import java.util.*;
import java.util.Map.Entry;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

/**
 * Created by lsh on 2018/11/9 09:51.
 *
 * java数据结构
 *
 * HashMap之所以线程不安全，就是resize出的问题
 *
 *1.initialCapacity 初始44 -> 64  threshold
 *2.HashIterator modCount 作用，遍历map时，会将modcount赋给expectedModCount，如果遍历过程中
 * map被其他线程修改，throw new ConcurrentModificationException()
 */
public class HashmapTest {

    @Test
    public void test(){
        HashMap<String,String> map = new HashMap(44);
        map.put("a","123");
        map.put("a","1234");
        map.put("b","123");
        map.put("c","123");

        //靠后put的覆盖之前的
        map.forEach((k,v)-> System.out.println(k +" " + v));

    }



    /**
     * 测试 map 遍历时被修改
     * yes -- Exception in thread "Thread-0" java.util.ConcurrentModificationException
     */
    @Test
    public void test2() throws Exception{
        Map<String,String> map = new HashMap<String,String>(16){{
                put("a","1"); put("b","2");
        }};
        Iterator iterator = map.entrySet().iterator();
        new Thread(()->{
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }).start();

        new Thread(()->{ map.put("c","3");}).start();

        Thread.sleep(100);
    }

    /**
     * 初始化map并赋值的几种方法
     */
    @Test
    public void test3(){
        //1.static代码块
        //2.匿名内部类
        Map<String,String> map = new HashMap<String,String>(16){
            {
                put("a","1");
                put("b","2");
            }
        };

        //3.guava 不可变的map,of方法 最多5对key-value
        //ImmutableMultimap todo
        Map<String,String> map1 = ImmutableMap.of("a","1","b","2","b","2","b","2","b","2");

    }

    /**
     * 获得不可变map
     */
    @Test
    public void test4(){
        //Collections.unmodifiableMap(map)
        Map map = new HashMap(16);
        map.put(1,1);
        Map unmodifiableMap = Collections.unmodifiableMap(map);
        // UnsupportedOperationException
        unmodifiableMap.put(1, 2);

        //guava 也是不可变 ，抛出 UnsupportedOperationException
        Map<String,String> map1 = ImmutableMap.of("a","1","b","2");
        System.out.println(map1);
        map1.put("a","2");
        System.out.println(map1);
    }

    /**
     * 遍历map
     */
    @Test
    public void test5(){
        HashMap<String,String> map = new HashMap(44);
        map.put("a","a");
        map.put("b","v");
        map.put("c","c");
        //1-iterator
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Entry next = (Entry)iterator.next();
            System.out.println(next.getKey());
        }
        //2-必须加泛型 todo
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }
        //todo map.values()返回值是个啥
        //3-只输出value
        for(String s : map.values()){
            System.out.println(s);
        }

        /**
         * for 泛型
         */
        Set<Integer> set = new HashSet(){
            {
                add(1);
                add(2);
            }
        };
        for(Integer integer : set){
        }

    }
}
