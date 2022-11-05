package creational.prototype_pattern;

public class Tablet extends Electronico {
    private String marca;
    private String modelo;
    private String color;

    public Tablet(Tablet tablet) {
        super(tablet);
    }

    @Override
    public Tablet clone() {
        return new Tablet(this);
    }
}
