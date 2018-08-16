package com.yf.annotationdemo.meta_annotation;

/**
 * FileName :  TargetTest
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface TargetTest {

    //Target 也是一个元注解，顾名思义就是给本注解的作用位置做了限定
    //，就是具体本注解的具体位置，比如方法上，class类上，包名上，另一个注解上....等
    //，括号中的参数决定了本注解作用的位置，其中包含有：


    /**
     *
     *  ElementType.ANNOTATION_TYPE 可以给一个注解进行注解
     *  ElementType.CONSTRUCTOR 可以给构造方法进行注解
     *  ElementType.FIELD 可以给属性进行注解
     *  ElementType.LOCAL_VARIABLE 可以给局部变量进行注解
     *  ElementType.METHOD 可以给方法进行注解
     *  ElementType.PACKAGE 可以给一个包进行注解
     *  ElementType.PARAMETER 可以给一个方法内的参数进行注解
     *  ElementType.TYPE 可以给一个类型进行注解，比如类、接口、枚举
     *
     */

}
