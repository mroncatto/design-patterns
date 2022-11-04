package creational.factoryMethodPattern;

public class SandwichVegano implements Sandwich {
    @Override
    public void preparar() {
        System.out.println("Preparando Sandwich vegano");
    }
}
