package creational.factory_method_pattern.concrete_creator;

import creational.factory_method_pattern.product.Sandwich;
import creational.factory_method_pattern.concrete_product.SandwichVegano;
import creational.factory_method_pattern.creator.Restaurante;

public class RestauranteSandwichVegano extends Restaurante {
    @Override
    public Sandwich crearSandwich() {
        return new SandwichVegano();
    }
}
