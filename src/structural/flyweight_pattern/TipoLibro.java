package structural.flyweight_pattern;

public class TipoLibro {
    private final String tipo;
    private final String distribuidor;
    private final String otrosDatos;

    public TipoLibro(String tipo, String distribuidor, String otrosDatos) {
        this.tipo = tipo;
        this.distribuidor = distribuidor;
        this.otrosDatos = otrosDatos;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public String getOtrosDatos() {
        return otrosDatos;
    }

    @Override
    public String toString() {
        return "TipoLibro{" +
                "tipo='" + tipo + '\'' +
                ", distribuidor='" + distribuidor + '\'' +
                ", otrosDatos='" + otrosDatos + '\'' +
                '}';
    }
}
