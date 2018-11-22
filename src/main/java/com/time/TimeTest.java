package com.time;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

/**
 * Created by lsh on 2018/11/22 17:54.
 *
 * @author lsh
 * @date 2018/11/22
 *
 * java 有关日期
 * 1.SimpleDateFormat 线程不安全 -- because calendar
 * calendar.setTime(date); 多个线程共享一个实例
 *
 * 2.localdate 线程安全
 *
 */
public class TimeTest {

   @Test
    public void test(){
       Date date = new Date();
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
       String result = simpleDateFormat.format(date);
       System.out.println(result);
       LocalDate localDate = LocalDate.now();
   }

}
