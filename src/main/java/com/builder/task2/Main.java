package com.builder.task2;
import com.mailjet.client.errors.MailjetException;


public class Main {
    public static void main(String[] args) throws MailjetException {

        
        Client client1 = new Client();
        MailInfo mailInfo1 = new MailInfo(client1, new Happy());
        
        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo1);

        MailBox mailBox1 = client1.getMailBox();
        mailBox1.addMailInfo(mailInfo1);
        mailBox1.sendAll();
    }
}
