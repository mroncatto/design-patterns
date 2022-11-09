package behavioral.state_pattern.state;

import behavioral.state_pattern.Telefono;

public class OffState extends State {

    public OffState(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String onHome() {
        telefono.setState(new LockedState(telefono));
        return telefono.turnOn();
    }

    @Override
    public String onOffOn() {
        telefono.setState(new LockedState(telefono));
        return telefono.turnOn();
    }
}
