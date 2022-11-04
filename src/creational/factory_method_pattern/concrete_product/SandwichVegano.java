package creational.factory_method_pattern.concrete_product;

import creational.factory_method_pattern.product.Sandwich;

public class SandwichVegano implements Sandwich {
    @Override
    public void preparar() {
        System.out.println("Preparando Sandwich vegano");
    }
}
