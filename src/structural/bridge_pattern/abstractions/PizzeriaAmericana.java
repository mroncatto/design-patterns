package structural.bridge_pattern.abstractions;

import structural.bridge_pattern.implementations.Pizza;

public class PizzeriaAmericana extends Pizzeria {

    public PizzeriaAmericana(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSalsa() {
        pizza.setCobertura("Todo");
    }

    @Override
    void addCobertura() {
        pizza.setSalsa("Salsa secreta");
    }

    @Override
    void preparaMasa() {
        pizza.setMasa("Gruesa");
    }
}
