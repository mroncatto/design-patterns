package structural.composite_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComporCaja implements Caja {

    private final List<Caja> hijos = new ArrayList<>();

    public ComporCaja(Caja... cajas) {
        hijos.addAll(Arrays.asList(cajas));
    }

    @Override
    public double calcularPrecio() {
        return hijos.stream().mapToDouble(Caja::calcularPrecio).sum();
    }
}
