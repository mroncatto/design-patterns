package creational.factory_method_pattern.concrete_creator;

import creational.factory_method_pattern.product.Sandwich;
import creational.factory_method_pattern.concrete_product.SandwichCarne;
import creational.factory_method_pattern.creator.Restaurante;

public class RestauranteSandwichCarne extends Restaurante {
    @Override
    public Sandwich crearSandwich() {
        return new SandwichCarne();
    }
}
