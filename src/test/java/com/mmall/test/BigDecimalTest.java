package com.mmall.test;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by hongyan on 2019/11/20.
 */
public class BigDecimalTest {

    @Test
    public void test1(){
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }//java自带的浮点数存在精度丢失的问题

    @Test
    public void test2(){
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
    }//double构造器还是会存在精度丢失的问题

    @Test
    public void test3(){
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));
    }//必须使用String类型的构造器

}
