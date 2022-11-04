package creational.builder_pattern;

public class CarBuilder {
    private int id;
    private String modelo;
    private String marca;
    private int puertas;
    private String color;

    public CarBuilder id(int id){
        this.id = id;
        return this;
    }

    public CarBuilder modelo(String modelo){
        this.modelo = modelo;
        return this;
    }

    public CarBuilder marca(String marca){
        this.marca = marca;
        return this;
    }

    public CarBuilder puertas(int puertas){
        this.puertas = puertas;
        return this;
    }

    public CarBuilder color(String color){
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(id, modelo, marca, puertas, color);
    }

}
