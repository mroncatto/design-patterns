package behavioral.command_pattern.components.receiver;

public class Lampara {
    private boolean accionada = false;
    private boolean modoParpadeo = false;

    public void accionarLampara() {
        accionada = !accionada;
    }
    public boolean isAccionada() {
        return accionada;
    }

    public boolean isModoParpadeo() {
        return modoParpadeo;
    }

    public void cambiarModoParpadeo() {
        modoParpadeo = !modoParpadeo;
    }
}
