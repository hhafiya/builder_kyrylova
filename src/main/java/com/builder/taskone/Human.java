package com.builder.taskone;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter @SuperBuilder
public class Human {
    private String firstName;
    private String lastName;
}
