package creational.abstractFactoryPattern;

public class FabricanteAirbus extends Compania {

    @Override
    public Avion crearAvion(String tipo) {
        System.out.println("Creado avion Airbus " + tipo);
        return null;
    }

    @Override
    public Helicoptero crearHelicoptero(String tipo) {
        System.out.println("Creado helicoptero Airbus " + tipo);
        return null;
    }
}
