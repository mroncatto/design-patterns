package structural.bridge_pattern.abstractions;

import structural.bridge_pattern.implementations.Pizza;

public abstract class Pizzeria {

    protected Pizza pizza;

    protected Pizzeria(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSalsa();
    abstract void addCobertura();
    abstract void preparaMasa();

    public void deliver(){
        preparaMasa();
        addSalsa();
        addCobertura();
        pizza.preparar();
        pizza.verificarCalidad();
        System.out.println("Pedido en progreso!");
    }
}
