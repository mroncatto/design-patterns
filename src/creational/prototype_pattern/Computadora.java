package creational.prototype_pattern;

public class Computadora extends Electronico {
    private final String potencia_fuente;

    public Computadora(String marca, String modelo, String color, String potencia_fuente) {
        super(marca, modelo, color);
        this.potencia_fuente = potencia_fuente;
    }

    private Computadora(Computadora computadora){
        super(computadora);
        this.potencia_fuente = computadora.potencia_fuente;
    }

    @Override
    public Computadora clone() {
        return new Computadora(this);
    }
}
