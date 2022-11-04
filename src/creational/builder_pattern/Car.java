package creational.builder_pattern;

public class Car {
    private int id;
    private String modelo;
    private String marca;
    private int puertas;
    private String color;

    public Car() {
    }

    public Car(int id, String modelo, String marca, int puertas, String color) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.puertas = puertas;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

