package creational.factoryMethodPattern;

public class RestauranteSandwichCarne extends Restaurante {
    @Override
    public Sandwich crearSandwich() {
        return new SandwichCarne();
    }
}
