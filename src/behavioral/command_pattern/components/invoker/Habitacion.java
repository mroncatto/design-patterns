package behavioral.command_pattern.components.invoker;

import behavioral.command_pattern.components.Component;
import behavioral.command_pattern.components.receiver.Cortina;

public class Habitacion extends Component {
    private final Cortina cortina;

    public Habitacion() {
        this.cortina = new Cortina();
    }

    public Cortina getCortina() {
        return cortina;
    }

    public boolean cortinaAbierta() {
        return cortina.isAbierto();
    }
}
