package creational.abstract_factory_pattern.abstract_factory;

import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;

public abstract class Compania {

    public abstract Avion crearAvion(String tipo);
    public abstract Helicoptero crearHelicoptero(String tipo);
}
