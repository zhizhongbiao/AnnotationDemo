package com.yf.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.yf.annotationdemo.annotation_usage.Poor;
import com.yf.annotationdemo.annotation_usage.Student;
import com.yf.annotationdemo.annotation_usage.SubjectType;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.security.auth.Subject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        boolean hasPoorAnnotation = Student.class.isAnnotationPresent(Poor.class);
        LogUtils.e("hasPoorAnnotation=" + hasPoorAnnotation);
        if (hasPoorAnnotation) {
            Poor poor = Student.class.getAnnotation(Poor.class);
            LogUtils.e("poor=" + poor);
            tv.setText("income=" + poor.income() + "   ---  outcome=" + poor.outcome());
        }

        try {
            Field declaredField = Student.class.getDeclaredField("subject");
            declaredField.setAccessible(true);
            SubjectType declaredFieldAnnotation = declaredField.getAnnotation(SubjectType.class);
            LogUtils.e("declaredFieldAnnotation=" + declaredFieldAnnotation);
            if (declaredFieldAnnotation != null) {
                LogUtils.e("subject=" + declaredFieldAnnotation.subject());
            }


            Method declaredMethod = Student.class.getDeclaredMethod("getSubject");
            SubjectType declaredMethodAnnotation = declaredMethod.getAnnotation(SubjectType.class);
            LogUtils.e("declaredMethodAnnotation=" + declaredMethodAnnotation);
            if (declaredMethodAnnotation != null) {
                LogUtils.e("major=" + declaredMethodAnnotation.major());
            }

        } catch (Exception e) {
            LogUtils.e("Exception=" + e.getMessage());
            e.printStackTrace();
        }
    }
}
