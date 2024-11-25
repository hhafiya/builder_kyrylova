package com.builder.task2;

public class Greeting implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Hello!");
    }
    
}
