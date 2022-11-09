package structural.bridge_pattern.abstractions;

import structural.bridge_pattern.implementations.Pizza;

public class PizzeriaItaliana extends Pizzeria {

    public PizzeriaItaliana(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSalsa() {
        pizza.setSalsa("Oil");
    }

    @Override
    void addCobertura() {
        pizza.setCobertura("-");
    }

    @Override
    void preparaMasa() {
        pizza.setMasa("Delgada");
    }
}
