package com.yf.annotationdemo.annotation_usage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * FileName :  SubjectType
 * Author   :  zhizhongbiao
 * Date     :  2018/8/17
 * Describe :
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SubjectType {

    String subject() default "语数英";

    String major() default "Program";
}
