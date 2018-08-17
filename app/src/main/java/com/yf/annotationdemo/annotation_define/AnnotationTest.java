package com.yf.annotationdemo.annotation_define;

/**
 * FileName :  AnnotationTest
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */



public @interface AnnotationTest {
    //这里声明了一个名为Annotation的注解
    //注解有点像接口一样的声明方式，只不过要在interface前面加一个@标志符号


    /**
     * 注解只有成员变量，没有方法，并且成员变量的声明
     * 与class类的成员变量有一点点不同就是变量后面要加括号，
     * 变量前面还是变量类型,并且都是public的，
     * 设置成员变量默认值的时候，和class类不同，
     * 注解的成员变量设置默认值时候要用到default关键字，位置是在class中“=”的位置
     */

    //没默认值得成员变量
    String name();

    //有默认值的变量
    int age() default 24;

}
