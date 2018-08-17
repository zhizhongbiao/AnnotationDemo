package com.yf.annotationdemo.annotation_usage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * FileName :  Poor
 * Author   :  zhizhongbiao
 * Date     :  2018/8/17
 * Describe :
 */


/**
 * 需要注意的是，如果一个注解要在运行时被成功提取，那么 @Retention(RetentionPolicy.RUNTIME) 是必须的
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Poor {

    int income() default 0;
    int outcome() default 9999;
}
