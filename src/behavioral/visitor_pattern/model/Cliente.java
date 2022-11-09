package behavioral.visitor_pattern.model;

import behavioral.visitor_pattern.Visitor;

public abstract class Cliente {

    private final String name;
    private final String address;
    private final String number;

    public Cliente(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}
