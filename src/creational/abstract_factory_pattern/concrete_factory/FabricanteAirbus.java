package creational.abstract_factory_pattern.concrete_factory;

import creational.abstract_factory_pattern.abstract_factory.Compania;
import creational.abstract_factory_pattern.concrete.AvionAirbus;
import creational.abstract_factory_pattern.concrete.HelicopteroAirbus;
import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;

public class FabricanteAirbus extends Compania {

    @Override
    public Avion crearAvion(String tipo) {
//        Logica de negocio para crear un avion airbus
        System.out.println("Creando un avion Airbus " + tipo + "...");
        return new AvionAirbus();
    }

    @Override
    public Helicoptero crearHelicoptero(String tipo) {
//        Logica de negocio para crear un helicoptero airbus
        System.out.println("Creando un helicoptero Airbus " + tipo + "...");
        return new HelicopteroAirbus();
    }
}
