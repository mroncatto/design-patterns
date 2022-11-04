package creational.factoryMethodPattern;

public class SandwichCarne implements Sandwich {
    @Override
    public void preparar() {
        System.out.println("Preparando Sandwich de carne");
    }
}

