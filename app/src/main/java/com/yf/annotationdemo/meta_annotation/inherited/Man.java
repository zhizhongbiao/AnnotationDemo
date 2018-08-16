package com.yf.annotationdemo.meta_annotation.inherited;

/**
 * FileName :  Man
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */

public class Man extends Person{
    // Man 没有被任何注解注解，并继承了Person类
    // ，而且Person类是被Inherited注解注解过的注解InheritedTest注解注解的
    // ，所以此时Man继承了Person的注解，也就是Man也具有InheritedTest注解
}
