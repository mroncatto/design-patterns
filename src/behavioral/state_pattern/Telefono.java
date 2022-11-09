package behavioral.state_pattern;

import behavioral.state_pattern.state.OffState;
import behavioral.state_pattern.state.State;

public class Telefono {

    private State state;

    public Telefono(){
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Bloquea el telefono y apaga la pantalla";
    }

    public String home() {
        return "Va para la pantalla principal";
    }

    public String unlock() {
        return "Desbloquea el telefono";
    }

    public String turnOn() {
        return "Prende la pantalla, dispositivo sigue bloqueado.";
    }

    public String clickHome() {
        return state.onHome();
    }

    public String clickPower() {
        return state.onOffOn();
    }
}
