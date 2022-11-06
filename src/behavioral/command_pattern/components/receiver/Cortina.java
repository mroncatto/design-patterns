package behavioral.command_pattern.components.receiver;

public class Cortina {
    private boolean abierto = false;

    public void abrirCerrar() {
        abierto = !abierto;
    }

    public boolean isAbierto() {
        return abierto;
    }
}
