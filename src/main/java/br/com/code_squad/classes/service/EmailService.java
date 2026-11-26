package br.com.code_squad.classes.service;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.lang.System;

public class EmailService {
    public void enviarEmail(String assunto, String texto) {
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

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
                            dotenv.get("EMAIL_USER"),
                            dotenv.get("EMAIL_PASS")
                    );
                }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(dotenv.get("EMAIL_USER")));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(dotenv.get("EMAIL_DESTINO")));
            message.setSubject(assunto);
            message.setText(texto);

            Transport.send(message);
        } catch (MessagingException e) {
            System.out.println(e);
        }
    }
}