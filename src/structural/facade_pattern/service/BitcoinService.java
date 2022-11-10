package structural.facade_pattern.service;

public class BitcoinService extends CryptoService {
    @Override
    public void buyCurrency(User user, double monto) {
        System.out.println("Buying " + monto + " of Bitcoin...");
    }
}
