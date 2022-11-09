package behavioral.state_pattern.state;

import behavioral.state_pattern.Telefono;

public abstract class State {

    protected Telefono telefono;

    public State(Telefono telefono) {
        this.telefono = telefono;
    }

    public abstract String onHome();

    public abstract String onOffOn();
}
