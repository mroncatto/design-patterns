package structural.bridge_pattern;

import structural.bridge_pattern.abstractions.Pizzeria;
import structural.bridge_pattern.abstractions.PizzeriaAmericana;
import structural.bridge_pattern.abstractions.PizzeriaItaliana;
import structural.bridge_pattern.implementations.PizzaPepperoni;
import structural.bridge_pattern.implementations.PizzaVegana;

public class Main {
    public static void main(String[] args) {
//        Divide y organiza una unica clase con multiples variantes de funcionalidades
//        en 2 hierarquias, abstraccion y implementacion

        Pizzeria pizzeriaAmericana = new PizzeriaAmericana(new PizzaPepperoni());
        pizzeriaAmericana.deliver();

        System.out.println("=========================================");

        Pizzeria pizzeriaItaliana = new PizzeriaItaliana(new PizzaVegana());
        pizzeriaItaliana.deliver();
    }
}
