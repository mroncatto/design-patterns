package behavioral.memento_pattern;

public class TextArea {
    private String texto;

    public void set(String texto) {
        this.texto = texto;
    }

    public String getTexto(){
        return texto;
    }

    public Memento copiaInstantanea() {
        return new Memento(this.texto);
    }

    public void restaurar(Memento memento) {
        this.texto = memento != null ? memento.getSavedText() : null;
    }

    public static class Memento {
        private final String texto;

        private Memento(String textoParaSalvar) {
            texto = textoParaSalvar;
        }

        private String getSavedText() {
            return texto;
        }
    }
}
