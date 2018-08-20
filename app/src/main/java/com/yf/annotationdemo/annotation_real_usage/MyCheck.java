package com.yf.annotationdemo.annotation_real_usage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName :  MyCheck
 * Author   :  zhizhongbiao
 * Date     :  2018/8/20
 * Describe :
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyCheck {
}
