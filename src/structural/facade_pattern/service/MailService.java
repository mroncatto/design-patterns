package structural.facade_pattern.service;

public class MailService {

    public void sendConfirmationMail(User user) {
        System.out.println("Sending mail to " + user.name());
    }
}
