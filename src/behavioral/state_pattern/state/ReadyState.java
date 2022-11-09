package behavioral.state_pattern.state;

import behavioral.state_pattern.Telefono;

public class ReadyState extends State {

    public ReadyState(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String onHome() {
        return telefono.home();
    }

    @Override
    public String onOffOn() {
        telefono.setState(new OffState(telefono));
        return telefono.lock();
    }
}
