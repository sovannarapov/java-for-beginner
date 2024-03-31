package com.sovannara.accessModifier;

public class Student {
    String name;
    String gender;
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String toData() {
        return "Name = " + name + " Gender = " + gender + " Age = " + age;
    }
}
