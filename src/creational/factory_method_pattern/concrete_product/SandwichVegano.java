package creational.factory_method_pattern.concrete_product;

import creational.factory_method_pattern.product.Sandwich;

public class SandwichVegano implements Sandwich {
    @Override
    public void preparar() {
        // Logica de negocio para preparar un sandwich vegano
        System.out.println("Preparando un Sandwich vegano...");
    }
}
