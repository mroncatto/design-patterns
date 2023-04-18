package behavioral.state_pattern;

public class Main {
    public static void main(String[] args) {
//        Permite alterar el estado interno de un objeto separando la logica
//        delegando el comportamiento por clases organizadas de forma separadas

        Telefono telefono = new Telefono();
        System.out.println(telefono.clickPower());
        System.out.println(telefono.clickPower());
        System.out.println(telefono.clickHome());
        System.out.println(telefono.clickHome());
        System.out.println(telefono.clickHome());
        System.out.println(telefono.clickPower());
        System.out.println(telefono.clickPower());
        System.out.println(telefono.clickHome());
    }
}
