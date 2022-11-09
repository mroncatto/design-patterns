package behavioral.state_pattern.state;

import behavioral.state_pattern.Telefono;

public class LockedState extends State {

    public LockedState(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String onHome() {
        telefono.setState(new ReadyState(telefono));
        return telefono.unlock();
    }

    @Override
    public String onOffOn() {
        telefono.setState(new OffState(telefono));
        return telefono.lock();
    }
}
