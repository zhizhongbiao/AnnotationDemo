package com.yf.annotationdemo.annotation_real_usage;

/**
 * FileName :  WaitForMycheck
 * Author   :  zhizhongbiao
 * Date     :  2018/8/20
 * Describe :
 */

public class WaitForMycheck {

    @MyCheck
    public void suanShu(){
        System.out.println("1234567890");
    }
    @MyCheck
    public void jiafa(){
        System.out.println("1+1="+1+1);
    }
    @MyCheck
    public void jianfa(){
        System.out.println("1-1="+(1-1));
    }
    @MyCheck
    public void chengfa(){
        System.out.println("3 x 5="+ 3*5);
    }
    @MyCheck
    public void chufa(){
        System.out.println("6 / 0="+ 6 / 0);
    }

    @MyCheck
    public void ziwojieshao(){
        System.out.println("我写的程序没有 bug!");
    }
}
