package structural.bridge_pattern.implementations;

public class PizzaVegana extends Pizza {

    @Override
    public void preparar() {
        System.out.println("Adicionando salsa " + salsa);
        System.out.println("Adicionando cobertura " + cobertura);
        System.out.println("Adicionando queso");
    }

    @Override
    public void verificarCalidad() {
        System.out.println("Masa es " + masa);
    }
}
