package creational.abstract_factory_pattern.concrete;

import creational.abstract_factory_pattern.product.Avion;

public class AvionAirbus implements Avion {
    @Override
    public void armar() {
//        Logica de negocio para armar un avion airbus
        System.out.println("Avion fabricado!");
        System.out.println("----------------------");
    }
}
