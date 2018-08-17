package com.yf.annotationdemo.annotation_define;

/**
 * FileName :  AnnotationMemberUsage
 * Author   :  zhizhongbiao
 * Date     :  2018/8/17
 * Describe :
 */


/**
 * 此处展示给class类AnnotationMemberUsage使用AnnotationTest注解，并给注解的成员变量赋值；
 * 如果注解部分或者全部的成员变量设置了默认值，在使用该注解时候可以不给成员变量赋值，
 * 就是括号部分不要了，如果注解没有任何成员变量的时候，使用该注解的时候，也可以把括号去掉；
 */
@AnnotationTest(name = "alv_chi",age = 25)
public class AnnotationMemberUsage {



    //展示注解使用在类的变量上，其实跟使用在类上一样的；
    @AnnotationInTheVariation(sayHello = "hi")
    public int temp=-1;
}
