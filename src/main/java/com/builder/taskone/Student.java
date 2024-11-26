package com.builder.taskone;

import java.util.List;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter @SuperBuilder @ToString
public class Student extends Human {
    private String firstName;
    private String lastName;
    @Singular
    private List<Integer> grades;
    private String group;
    private int age;
    private int height;

}