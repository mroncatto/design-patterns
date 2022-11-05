package creational.prototype_pattern;

public abstract class Electronico {
    private final String marca;
    private final String modelo;
    private final String color;

    public Electronico(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    protected Electronico(Electronico electronico) {
        this.marca = electronico.marca;
        this.modelo = electronico.modelo;
        this.color = electronico.color;
    }

    public abstract Electronico clone();

    @Override
    public String toString() {
        return "Electronico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
