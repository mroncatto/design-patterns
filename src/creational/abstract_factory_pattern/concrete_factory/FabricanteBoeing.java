package creational.abstract_factory_pattern.concrete_factory;

import creational.abstract_factory_pattern.abstract_factory.Compania;
import creational.abstract_factory_pattern.concrete.AvionBoeing;
import creational.abstract_factory_pattern.concrete.HelicopteroBoeing;
import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;

public class FabricanteBoeing extends Compania {

    @Override
    public Avion crearAvion(String tipo) {
        // Logica de negocio para crear un avion boeing
        System.out.println("Creando un avion Boeing " + tipo + "...");
        return new AvionBoeing();
    }

    @Override
    public Helicoptero crearHelicoptero(String tipo) {
        // Logica de negocio para crear un helicoptero boeing
        System.out.println("Creando un helicoptero Boeing " + tipo + "...");
        return new HelicopteroBoeing();
    }
}
