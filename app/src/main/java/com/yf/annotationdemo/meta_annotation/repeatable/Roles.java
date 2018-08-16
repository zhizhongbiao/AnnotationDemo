package com.yf.annotationdemo.meta_annotation.repeatable;

/**
 * FileName :  Roles
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */

import com.yf.annotationdemo.meta_annotation.inherited.Person;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解在这里作为注解容器，提供能够装载其他注解的容器
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Roles {
    Role[] value();
}
