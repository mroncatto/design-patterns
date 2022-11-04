package creational.abstractFactoryPattern;

public class FabricanteBoeing extends Compania {

    @Override
    public Avion crearAvion(String tipo) {
        System.out.println("Creado avion Boeing " + tipo);
        return null;
    }

    @Override
    public Helicoptero crearHelicoptero(String tipo) {
        System.out.println("Creado helicoptero Boeing " + tipo);
        return null;
    }
}
