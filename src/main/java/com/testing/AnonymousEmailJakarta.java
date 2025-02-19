package com.testing;

import java.util.Properties;
import jakarta.mail.*;
import jakarta.mail.internet.*;

public class AnonymousEmailJakarta {

    public static void sendAnonymousEmail(String to, String subject, String message) throws MessagingException {

        // 1. Disposable Email (REPLACE with your disposable email service details)
        String from = "From Mail Id";
        String password = "email_password";
        String smtpHost = "mail.example.com"; // Your disposable email service's SMTP host
        int smtpPort = 587; // Or the appropriate port

        // 2. Configure Properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Use TLS if available

        // 3. Create Session (Authenticator if needed)
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        // 4. Create MimeMessage
        Message mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(from));
        mimeMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        mimeMessage.setSubject(subject);
        mimeMessage.setText(message);

        // 5. Send Email
        Transport.send(mimeMessage);
        System.out.println("Email sent (anonymity not guaranteed).");
    }

    public static void main(String[] args) {
        try {
            sendAnonymousEmail("recipient@example.com", "Hello", "This is an anonymous email.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}