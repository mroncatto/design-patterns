package behavioral.memento_pattern;

import java.util.Deque;
import java.util.LinkedList;

import behavioral.memento_pattern.TextArea.Memento;

public class Editor {
    private final TextArea textArea;
    private final Deque<Memento> estadoHistoria;

    public Editor() {
        textArea = new TextArea();
        estadoHistoria = new LinkedList<>();
    }

    public void escribir(String texto) {
        textArea.set(texto);
        estadoHistoria.offer(textArea.copiaInstantanea());
    }

    public void deshacer() {
        if (estadoHistoria.isEmpty()) return;
        estadoHistoria.pollLast();
        textArea.restaurar(estadoHistoria.peekLast());
    }

    public void imprimirTexto() {
        System.out.println(textArea.getTexto());
    }
}
