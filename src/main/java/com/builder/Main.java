package com.builder;

import java.util.Arrays;

import com.builder.task1.Student;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
        .firstName("John")
        .lastName("Doe")
        .grades(Arrays.asList(85, 90, 78))
        .grade(10)
        .group("A1")
        .age(20)
        .height(175)
        .build();
    System.out.println(student);
    }
}