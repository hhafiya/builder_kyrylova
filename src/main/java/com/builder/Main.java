package com.builder;

import java.util.Arrays;
import com.builder.taskone.Student;

public class Main {
    private static final int GRADE_ONE = 85;
    private static final int GRADE_TWO = 90;
    private static final int GRADE_THREE = 78;
    private static final int FINAL_GRADE = 10;
    private static final int STUDENT_AGE = 20;
    private static final int STUDENT_HEIGHT = 175;

    public static void main(String[] args) {
        Student student = Student.builder()
                .firstName("John")
                .lastName("Doe")
                .grades(Arrays.asList(GRADE_ONE, GRADE_TWO, GRADE_THREE))
                .grade(FINAL_GRADE)
                .group("A1")
                .age(STUDENT_AGE)
                .height(STUDENT_HEIGHT)
                .build();

        System.out.println(student);
    }
}
