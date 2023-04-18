package creational.singleton_pattern;

public class Main {
    public static void main(String[] args) {

        /*
         Se puede llamar varias veces la instancia pero el
         padron singleton mantiene apenas 1 unica instancia.
         */
        Reloj r1 = Reloj.getInstancia();
        Reloj r2 = Reloj.getInstancia();
        Reloj r3 = Reloj.getInstancia();
    }
}
