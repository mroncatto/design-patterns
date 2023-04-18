package creational.abstract_factory_pattern.concrete;

import creational.abstract_factory_pattern.product.Helicoptero;

public class HelicopteroBoeing implements Helicoptero {
    @Override
    public void armar() {
//        Logica de negocio para armar un helicoptero boeing
        System.out.println("Helicoptero fabricado!");
        System.out.println("----------------------");
    }
}
