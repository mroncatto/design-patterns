package creational.abstract_factory_pattern;

import creational.abstract_factory_pattern.abstract_factory.Compania;
import creational.abstract_factory_pattern.concrete_factory.FabricanteAirbus;
import creational.abstract_factory_pattern.concrete_factory.FabricanteBoeing;
import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;

public class Main {
    public static void main(String[] args) {
//        Se necesita fabricar difentes tipos de aeronaves de diferentes tipos
//        de companias que fabrican aeronaves

//      ########################################################################
        Compania airbus = new FabricanteAirbus();
        Avion avionAirbus = airbus.crearAvion("A380");
        avionAirbus.armar();

        Helicoptero helicopteroAirbus = airbus.crearHelicoptero("H160");
        helicopteroAirbus.armar();

//      ########################################################################
        Compania boeing = new FabricanteBoeing();
        Avion avionBoeing = boeing.crearAvion(" B747");
        avionBoeing.armar();

        Helicoptero helicopteroBoeing = boeing.crearHelicoptero("CH-47");
        helicopteroBoeing.armar();
//       ########################################################################
    }
}
