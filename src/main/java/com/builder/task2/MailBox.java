package com.builder.task2;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private Client owner;
    private List<MailInfo> infos = new ArrayList<>();

    public MailBox(Client owner) {
        this.owner = owner;
    }

    public void addMailInfo(MailInfo mailInfo) {
        if (mailInfo.getClient().equals(owner)) {
            infos.add(mailInfo);
        } else {
            throw new IllegalArgumentException("This MailInfo does not belong to the owner of this MailBox.");
        }
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo mailInfo : infos) {
            sender.sendMail(mailInfo);
        }
    }
}
