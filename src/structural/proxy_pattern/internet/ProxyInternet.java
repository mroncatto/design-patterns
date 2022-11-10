package structural.proxy_pattern.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private static final List<String> sitesBloqueados;
    private final Internet internet = new RealInternet();

    static {
        sitesBloqueados = new ArrayList<>();
        sitesBloqueados.add("bloqueado.com");
    }

    @Override
    public void connectTo(String host) {
        if(sitesBloqueados.contains(host)){
            System.out.println("Acceso bloqueado a " + host);
        } else {
            internet.connectTo(host);
        }
    }
}
