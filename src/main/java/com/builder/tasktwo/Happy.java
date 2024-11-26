package com.builder.tasktwo;

public class Happy implements MailCode {
    @Override
    public String generate(Client client) {
        return String.format("Happy birthday!");
    }
    
}
