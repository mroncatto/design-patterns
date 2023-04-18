package structural.facade_pattern;

public class Main {
    public static void main(String[] args) {
//        Define puntos de entrada para cada nivel de subsistema, desacoplando, centralizando y
//        forzando trabajar por medio de una fachada (facade)

        ComprarCryptoFacade comprarCryto = new ComprarCryptoFacade();
        comprarCryto.buyCryptoCurrency(100, "BTC");
    }
}
