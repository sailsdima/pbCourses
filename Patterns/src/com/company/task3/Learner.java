package com.company.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 05.05.17.
 */
public abstract class Learner {

    protected List<TeachingMethod> teachingMethods = new ArrayList<>();

    public abstract void study();

    public void addTeachingMethod(TeachingMethod teachingMethod){
        teachingMethods.add(teachingMethod);
    }

    public void removeTeachingMethod(TeachingMethod teachingMethod){
        teachingMethods.remove(teachingMethod);
    }

}
