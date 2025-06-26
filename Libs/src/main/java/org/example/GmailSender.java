package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class GmailSender {

    public static void main(String[] args) {
        try {
            // Carrega configurações do .env
            Dotenv dotenv = Dotenv.configure()
                    .ignoreIfMalformed()
                    .ignoreIfMissing()
                    .load();
            String username = dotenv.get("GMAIL_USERNAME");
            String password = dotenv.get("GMAIL_PASSWORD");

            if(username == null || password == null){
                throw new RuntimeException("Username and/or password are missing");
            }

            String to = "plgonzales4760@gmail.com";
            String subject = "Teste de e-mail funcionando";
            String body = "Este e-mail foi enviado com sucesso!";

            sendGmail(username, password, to, subject, body);

            System.out.println("E-mail enviado com sucesso!");
        } catch (Exception e) {
            System.err.println("Falha ao enviar e-mail:");
            e.printStackTrace();
        }
    }

    public static void sendGmail(String username, String password,
                                 String to, String subject, String body)
            throws MessagingException {

        // Verificação adicional de parâmetros
        if(username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username não pode ser nulo ou vazio");
        }
        if(to == null || to.isBlank()) {
            throw new IllegalArgumentException("Destinatário não pode ser nulo ou vazio");
        }

        // Configurações fixas para Gmail - não usa variáveis de ambiente aqui
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.auth.mechanisms", "PLAIN LOGIN");
        props.put("mail.smtp.connectiontimeout", "10000");
        props.put("mail.smtp.timeout", "10000");
        props.put("mail.smtp.writetimeout", "10000");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        session.setDebug(true);

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
        } catch (MessagingException e) {
            throw new MessagingException("Falha na autenticação. Verifique:\n" +
                    "1. Seu nome de usuário/senha\n" +
                    "2. Se 'Acesso a app menos seguro' está ativado\n" +
                    "3. Se você está usando Senha de App (se 2FA ativado)", e);
        }
    }
}