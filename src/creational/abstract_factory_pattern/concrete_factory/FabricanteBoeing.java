package creational.abstract_factory_pattern.concrete_factory;

import creational.abstract_factory_pattern.abstract_factory.Compania;
import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;

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
