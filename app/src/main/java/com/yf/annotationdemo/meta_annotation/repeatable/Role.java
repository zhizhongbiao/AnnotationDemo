package com.yf.annotationdemo.meta_annotation.repeatable;

import java.lang.annotation.Repeatable;

/**
 * FileName :  Role
 * Author   :  zhizhongbiao
 * Date     :  2018/8/16
 * Describe :
 */

@Repeatable(value = Roles.class)
public @interface Role {
    String roleId() default "";

}
