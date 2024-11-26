package com.builder.tasktwo;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import com.mailjet.client.MailjetResponse;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailSender {

    private static final int RESPONSE = 200;
    private MailjetClient client;

    public MailSender() {
        String apiKey = "6b7";
        String apiSecret = "ba84e8";

        System.out.println("API Key: " + apiKey);
        System.out.println("API Secret: " + apiSecret);

        if (apiKey.isEmpty() || apiSecret.isEmpty()) {
            throw new IllegalArgumentException(
                "API Key or Secret is missing");
        }

        ClientOptions options = ClientOptions.builder()
                .apiKey(apiKey)
                .apiSecretKey(apiSecret)
                .build();
        client = new MailjetClient(options);
    }

    public void sendMail(MailInfo mailInfo) {
        try {
            String mailContent = mailInfo.generate();

            JSONObject emailData = new JSONObject();
            emailData.put(Emailv31.Message.FROM, new JSONObject()
                    .put("Email", "kyrylova.pn@ucu.edu.ua")
                    .put("Name", "Sender Name"));
            emailData.put(Emailv31.Message.TO, new JSONArray()
                    .put(new JSONObject()
                            .put("Email",
                             "ira.kirillova0806@gmail.com")
                            .put("Name",
                             "Recipient Name")));
            emailData.put(Emailv31.Message.SUBJECT, "Test Email");
            emailData.put(Emailv31.Message.TEXTPART, mailContent);
            emailData.put(Emailv31.Message.HTMLPART,
             "<h3>" + mailContent + "</h3>");

            JSONArray messages = new JSONArray();
            messages.put(emailData);


            MailjetResponse response = client.post(
                new MailjetRequest(Emailv31.resource)
                    .property(Emailv31.MESSAGES, messages));

            if (response.getStatus() == RESPONSE) {
                System.out.println("Email sent successfully");
            } else {
                System.out.println(
                    "Failed to send email. Response: "
                     + response.getStatus());
            }
        } catch (MailjetException e) {
            e.printStackTrace();
        }
    }
}
