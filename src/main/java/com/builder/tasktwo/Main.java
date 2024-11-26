package com.builder.tasktwo;
import com.mailjet.client.errors.MailjetException;


public class Main {
    public static void main(String[] args) throws MailjetException {

        
        Client clientOne = new Client();
        MailInfo mailInfoOne = new MailInfo(clientOne, new Happy());
        
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfoOne);

        MailBox mailBoxOne = clientOne.getMailBox();
        mailBoxOne.addMailInfo(mailInfoOne);
        mailBoxOne.sendAll();
    }
}
