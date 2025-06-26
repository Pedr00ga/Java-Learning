package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;


public class SimpleMailSender {

    public static void main(String[] args) {

        try{

            Dotenv dotenv = Dotenv.configure()
                    .ignoreIfMalformed()
                    .ignoreIfMissing()
                    .load();

            String to = "plgonzales4760@gmail.com";
            String subject = "Enviado por um script Java";
            String body = "Teste de projeto utilizando JavaMail";

            sendEmail(
                    dotenv.get("GMAIL_USERNAME"),
                    dotenv.get("GMAIL_PASSWORD"),
                    dotenv.get("SMTP_HOST"),
                    dotenv.get("SMTP_PORT"),
                    to,
                    subject,
                    body
            );
            System.out.println("E-mail enviado com sucesso!");
        }catch (Exception e){
            System.err.println("Erro ao enviar o e-mail:");
            e.printStackTrace();
        }


    }
    public static void sendEmail(String username, String password,
                                 String host, String port, String to,
                                 String subject, String body) throws MessagingException {

        //cria propriedades
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smptp.starttls.enable", "true");
        properties.put("mail.smptp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.ssl.trust", host); // Confia no certificado SSL
        properties.put("mail.smtp.timeout", "5000"); // Timeout de 5 segundos

        //Cria sessão

        Session session = Session.getInstance(properties, new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, password);
            }
        });

        try{
            //Cria mensagem
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
        }catch (MessagingException e){
            throw new MessagingException("Falha ao enviar e-mail para " + to + " via " + host + ":" + port, e);
        }

    }

}