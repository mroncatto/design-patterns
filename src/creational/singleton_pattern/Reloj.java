package creational.singleton_pattern;

import java.util.Date;

public class Reloj extends Thread {

    private static Reloj reloj;

    // Constructor privado por que se usa el patron Singleton
    private Reloj() {
    }

    // Inicializa una sola vez el reloj
    private synchronized static void createInstance() {
        if (reloj == null) {
            reloj = new Reloj();
            reloj.start();
        }
    }

    /**
     * Obtiene la unica instancia del gestor de geozonas
     */
    public static Reloj getInstancia() {
        createInstance();
        return reloj;
    }

    @Override
    public void run() {
        while (true) {
            Date hora = new Date(System.currentTimeMillis());
            System.out.println(hora);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
