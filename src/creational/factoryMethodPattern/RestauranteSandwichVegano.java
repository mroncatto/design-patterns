package creational.factoryMethodPattern;

public class RestauranteSandwichVegano extends Restaurante {
    @Override
    public Sandwich crearSandwich() {
        return new SandwichVegano();
    }
}
