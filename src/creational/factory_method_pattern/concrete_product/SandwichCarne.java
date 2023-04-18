package creational.factory_method_pattern.concrete_product;

import creational.factory_method_pattern.product.Sandwich;

public class SandwichCarne implements Sandwich {
    @Override
    public void preparar() {
        // Logica de negocio para preparar un sandwich de carne
        System.out.println("Preparando un sandwich de carne...");
    }
}

