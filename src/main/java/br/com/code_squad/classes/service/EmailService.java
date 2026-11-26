package br.com.code_squad.classes.service;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.lang.System;

public class EmailService {
    public void enviarEmail(String assunto, String texto) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(
            props,
            new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(
                            System.getenv("EMAIL_USER"),
                            System.getenv("EMAIL_PASS")
                    );
                }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(System.getenv("EMAIL_USER")));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(System.getenv("EMAIL_DESTINO")));
            message.setSubject(assunto);
            message.setText(texto);

            Transport.send(message);
        } catch (MessagingException e) {
            System.out.println(e);
        }
    }
}