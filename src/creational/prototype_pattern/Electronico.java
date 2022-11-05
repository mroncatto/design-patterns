package creational.prototype_pattern;

public abstract class Electronico {
    private String marca;
    private String modelo;
    private String color;

    protected Electronico(Electronico electronico){
        this.marca = electronico.marca;
        this.modelo = electronico.modelo;
        this.color = electronico.color;
    }

    public abstract Electronico clone();
}
