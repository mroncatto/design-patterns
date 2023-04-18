package creational.abstract_factory_pattern.concrete;

import creational.abstract_factory_pattern.product.Helicoptero;

public class HelicopteroAirbus implements Helicoptero {
    @Override
    public void armar() {
//        Logica de negocio para armar un helicoptero airbus
        System.out.println("Helicoptero fabricado!");
        System.out.println("----------------------");
    }
}
