package com.company.task3;

/**
 * Created by dima on 05.05.17.
 */

//3. Создать суперкласс Учащийся и подклассы Школьник и Студент. Определить способы
//        обучения и возможности его продолжения.
// паттерн Компоновщик
public class Launcher {

    public static void main(String[] args) {


        Learner student = new Student();
        student.addTeachingMethod(new Write());
        student.addTeachingMethod(new Read());
        student.addTeachingMethod(new Write());
        student.addTeachingMethod(new Read());
        student.study();

        Learner schoolboy = new Schoolboy();
        schoolboy.addTeachingMethod(new Read());
        schoolboy.addTeachingMethod(new Read());
        schoolboy.study();

    }
}
