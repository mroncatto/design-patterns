package creational.singleton_pattern;

import java.util.Date;

public class Reloj extends Thread {

    private static Reloj reloj;

    // Constructor debe ser privado
    Reloj() {
    }

    // Obtiene una unica instancia del gestor de geozonas
    public static Reloj getInstancia() {
        createInstance();
        return reloj;
    }

    // Sincronizacion de thread
    private synchronized static void createInstance() {
        if (reloj == null) {
            reloj = new Reloj();
            reloj.start();
        }
    }

    @Override
    public void run() {
        while (true) {
            Date hora = new Date(System.currentTimeMillis());
            System.out.println(hora.getTime());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
