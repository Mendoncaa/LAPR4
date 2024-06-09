package jobs4u.server.server;

import core.management.costumer.domain.CustomerCode;
import core.management.costumer.repository.CustomerRepository;
import core.management.jobApplication.domain.jobApplication;
import core.management.jobApplication.repository.ApplicationRepository;
import core.infrastructure.persistence.PersistenceContext;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Properties;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;

public class EmailService {
    static ApplicationRepository application = PersistenceContext.repositories().application();
    static CustomerRepository customerRepository = PersistenceContext.repositories().customer();

    static int ack = 2;
    static int err = 3;
    public static void sendEmailNotification(jobApplication application) {
        try {
            sendEmail(application);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void sendEmail(jobApplication application) {
        // Verificar se os argumentos não são nulos

        final String username = "rcomp_2dj_g4@outlook.com"; // replace with your email
        final String password = "Passwordgrupo4"; // replace with your password

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.office365.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("rcomp_2dj_g4@outlook.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(application.getCandidate().getCandidateEmail().toString())
            );

            String candidateName = application.getCandidate().getCandidateName().toString();
            String customerCode = application.getJobOpening().getJobReference().getCustomerCode();

            String customer = customerRepository.findByCustomerCode(new CustomerCode(customerCode)).get().getCustomerName().toString();

            String text = ("Candidate name: " + candidateName + "\nCustomer: " + customer + "\n\nWe inform you that after processing your files the result from your application is " + application.getApplicationState() + ".");

            message.setSubject("Requirements Verification Process");
            message.setText(text);

            Transport.send(message);

            System.out.println("Candidates notified by email of the result of the verification process!");

        } catch (MessagingException e) {
            // Handle the exception
            System.err.println("Failed to send email: " + e.getMessage());
        }
        System.out.println("acabou!");
    }
}
