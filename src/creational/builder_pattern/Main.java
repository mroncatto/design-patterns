package creational.builder_pattern;

public class Main {
    public static void main(String[] args) {
//      Producir diferentes tipos y representaciones de un objeto utilizando el mismo código de construcción
        Car car1 = new CarBuilder()
                .color("Azul")
                .marca("Toyota")
                .modelo("Corola")
                .puertas(4)
                .build();

        Car car2 = new CarBuilder()
                .color("Rojo")
                .marca("Lamborgini")
                .modelo("Aventador")
                .puertas(2)
                .build();

        System.out.println("El auto 1 es un " + car1.getMarca() + ", modelo " + car1.getModelo() + ", color " + car1.getColor());
        System.out.println("El auto 2 es un " + car2.getMarca() + ", modelo " + car2.getModelo() + ", color " + car2.getColor());
    }
}
