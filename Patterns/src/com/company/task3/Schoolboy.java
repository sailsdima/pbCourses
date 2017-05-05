package com.company.task3;

/**
 * Created by dima on 05.05.17.
 */
public class Schoolboy extends Learner {


    @Override
    public void study() {
        System.out.println("Schoolboy is studying..");
        for (TeachingMethod teachingMethod: teachingMethods) {
            teachingMethod.learn();
        }
    }
}
