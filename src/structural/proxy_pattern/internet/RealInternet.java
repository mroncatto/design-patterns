package structural.proxy_pattern.internet;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        System.out.println("Conectado exitosamente a " + host);
    }
}
