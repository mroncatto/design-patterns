package structural.facade_pattern;


import structural.facade_pattern.service.*;

public class ComprarCryptoFacade {

    public void buyCryptoCurrency(double monto, String moneda) {
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());
        if (user.balance() < monto) {
            System.out.println("Insufficient balance to perform transaction");
            return;
        }
        CryptoFactory.getCryptoService(moneda).buyCurrency(user, monto);
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user);
        System.out.println(monto + " of " + moneda + " bought successfully!");
    }
}
