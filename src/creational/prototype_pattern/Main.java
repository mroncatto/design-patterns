package creational.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      Copia de objetos sin depender de la clase
        List<Electronico> electronicos = List.of(
                new Computadora("comp_marca", "comp_modelo", "comp_color", "comp_potencia"),
                new Tablet("tablet_marca", "tablet_modelo", "tablet_color", "tablet_tela")
        );

        List<Electronico> copyList = new ArrayList<>();
        for (Electronico electronico : electronicos) {
            copyList.add(electronico.clone());
        }

        copyList.forEach(System.out::println);
        System.out.println("===========================");

        ElectronicoCache registro = new ElectronicoCache();
        registro.put(electronicos);
        System.out.println(registro.get("comp_marca comp_modelo"));
    }
}
