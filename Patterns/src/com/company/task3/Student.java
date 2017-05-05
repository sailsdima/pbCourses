package com.company.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 05.05.17.
 */
public class Student extends Learner {


    @Override
    public void study() {
        System.out.println("Student is studying..");
        for (TeachingMethod teachingMethod: teachingMethods) {
            teachingMethod.learn();
        }
    }
}
