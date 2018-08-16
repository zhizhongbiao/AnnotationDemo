package com.yf.annotationdemo.meta_annotation;

import java.lang.annotation.Documented;

/**
 * FileName :  DocumentedTest
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */

@Documented
public @interface DocumentedTest {
    //Documented 注解也是一个元注解，被Documented注解注解的注解表示，它的作用是能够将注解中的元素包含到 Javadoc 中去
}
