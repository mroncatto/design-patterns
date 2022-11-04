package creational.abstract_factory_pattern.concrete_factory;

import creational.abstract_factory_pattern.abstract_factory.Compania;
import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;

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
