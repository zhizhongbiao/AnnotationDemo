package com.yf.annotationdemo.annotation_usage;

/**
 * FileName :  Student
 * Author   :  zhizhongbiao
 * Date     :  2018/8/17
 * Describe :
 */


@Poor
public class Student {


    @SubjectType
    private String subject;

    @SubjectType
    private String getSubject() {
        return subject;
    }

}
