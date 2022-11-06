package behavioral.command_pattern.components.invoker;

import behavioral.command_pattern.components.Component;
import behavioral.command_pattern.components.receiver.Lampara;

public class Piso extends Component {
    private final Lampara lampara;

    public Piso() {
        this.lampara = new Lampara();
    }

    public Lampara getLampara() {
        return lampara;
    }

    public boolean isLamparaAccionada() {
        return lampara.isAccionada();
    }
}
