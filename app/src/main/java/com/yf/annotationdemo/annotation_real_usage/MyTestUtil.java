package com.yf.annotationdemo.annotation_real_usage;

import com.yf.annotationdemo.utils.LogUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * FileName :  MyTestUtil
 * Author   :  zhizhongbiao
 * Date     :  2018/8/20
 * Describe :
 */

public class MyTestUtil {


    public void testCode() {

        WaitForMycheck waitForMycheck = new WaitForMycheck();
        Method[] declaredMethods = WaitForMycheck.class.getDeclaredMethods();
        //用来记录测试产生的 log 信息
        StringBuilder log = new StringBuilder();
        // 记录异常的次数
        int errorNum = 0;

        for (Method declaredMethod : declaredMethods) {
            boolean annotationPresent = declaredMethod.isAnnotationPresent(MyCheck.class);

            if (annotationPresent) {
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(waitForMycheck,null);
                } catch (Exception e) {
                    errorNum++;
                    log.append(declaredMethod.getName());
                    log.append(" ");
                    log.append("has error:");
                    log.append("\n\r  caused by ");
                    //记录测试过程中，发生的异常的名称
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    //记录测试过程中，发生的异常的具体信息
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");
                }
            }
        }

        log.append(WaitForMycheck.class.getSimpleName());
        log.append(" has  ");
        log.append(errorNum);
        log.append(" error.");

        // 生成测试报告
        LogUtils.e(log.toString());

    }
}
