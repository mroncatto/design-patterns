package creational.abstract_factory_pattern.concrete;

import creational.abstract_factory_pattern.product.Avion;

public class AvionBoeing implements Avion {

    @Override
    public void armar() {
//      Logica de negocio para armar un avion boeing
        System.out.println("Avion fabricado!");
        System.out.println("----------------------");
    }
}
