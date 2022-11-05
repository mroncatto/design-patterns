package creational.prototype_pattern;

public class Computadora extends Electronico {
    private String marca;
    private String modelo;
    private String color;

    public Computadora(Computadora computadora){
        super(computadora);
    }

    @Override
    public Computadora clone() {
        return new Computadora(this);
    }
}
