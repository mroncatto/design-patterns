package creational.factoryMethodPattern;

public abstract class Restaurante {

    public Sandwich pedidoSandwich(){
        Sandwich sandwich = crearSandwich();
        sandwich.preparar();
        return sandwich;
    }

    public abstract Sandwich crearSandwich();

}
