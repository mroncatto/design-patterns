package behavioral.iterator_pattern;

import java.util.Deque;
import java.util.LinkedList;

public class PrimerIterador<T> implements Iterator<T> {

    private final  Vertice<T> iniciaVertice;
    private final Deque<Vertice<T>> pila = new LinkedList<>();

    public PrimerIterador(Vertice<T> iniciaVertice) {
        this.iniciaVertice = iniciaVertice;
        pila.push(iniciaVertice);
    }

    @Override
    public boolean tieneProximo() {
        return !pila.isEmpty();
    }

    @Override
    public Vertice<T> getProximo() {
        if(!tieneProximo()) return null;

        Vertice<T> atual = pila.pop();
        if(!atual.isVisitado()){
            atual.setVisitado(true);
            atual.getVecinos().forEach(pila::push);
            return atual;
        }

        return getProximo();
    }

    @Override
    public void reset() {
        pila.clear();
        pila.push(iniciaVertice);
    }
}
