package com.yf.annotationdemo.meta_annotation.inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * FileName :  InheritedTest
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedTest {

    //Inherited 也是一个元注解，当一个被Inherited注解注解过的注解去注解一个类（比如类Person）
    // ，那么该类（Person）的子类（比如Man），在自身（Man类）没有被其他注解注解的情况下
    // ，该类（Man类）将继承其父类（Person类）的注解
    // ，注意的是Inherited注解的效果只是作用于class类，不作用于其他地方包括接口
}
