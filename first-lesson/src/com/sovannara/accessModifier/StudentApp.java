package com.sovannara.accessModifier;

import com.sovannara.accessModifier.Student;

public class StudentApp {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(-10);
        System.out.println(student.toData());
    }
}
