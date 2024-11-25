package com.builder.task2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString @AllArgsConstructor @Getter @NoArgsConstructor
public class Client {

    private static int counter;
    private int id = counter++;
    private String name;
    private LocalDate dob;
    private String gender;
    private MailBox mailBox = new MailBox(this);
}
