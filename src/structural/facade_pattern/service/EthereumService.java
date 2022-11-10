package structural.facade_pattern.service;

public class EthereumService extends CryptoService {
    @Override
    public void buyCurrency(User user, double monto) {
        System.out.println("Buying " + monto + " of Ethereum...");
    }
}
