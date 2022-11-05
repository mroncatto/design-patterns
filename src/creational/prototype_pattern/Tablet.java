package creational.prototype_pattern;

public class Tablet extends Electronico {
    private final String tela;

    public Tablet(String marca, String modelo, String color, String tela) {
        super(marca, modelo, color);
        this.tela = tela;
    }

    private Tablet(Tablet tablet) {
        super(tablet);
        this.tela = tablet.tela;
    }

    @Override
    public Tablet clone() {
        return new Tablet(this);
    }
}
