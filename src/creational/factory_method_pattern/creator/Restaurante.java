package creational.factory_method_pattern.creator;

import creational.factory_method_pattern.product.Sandwich;

public abstract class Restaurante {

    public Sandwich pedidoSandwich(){
        Sandwich sandwich = crearSandwich();
        sandwich.preparar();
        return sandwich;
    }

    public abstract Sandwich crearSandwich();

}
