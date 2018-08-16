package com.yf.annotationdemo.meta_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * FileName :  RetentionTest
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RetentionTest {
    //Retention  是一个元注解。元注解：用于注解注解的注解称之为元注解
    // ，意思是保留，用于指定该注解生命周期保留时间，其中参数标注保留生命周期的时间
}
