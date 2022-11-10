package structural.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class FabricaLibro {

    private static final Map<String, TipoLibro> tipolibros = new HashMap<>();

    public static TipoLibro getTipoLibro(String tipo, String distribuidor, String otrosDatos) {
        if (tipolibros.get(tipo) == null) {
            tipolibros.put(tipo, new TipoLibro(tipo, distribuidor, otrosDatos));
        }
        return tipolibros.get(tipo);
    }
}
