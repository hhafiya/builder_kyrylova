package com.builder.tasktwo;

public class Greeting implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Hello!");
    }
    
}
