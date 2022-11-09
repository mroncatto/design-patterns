package behavioral.iterator_pattern;

import java.util.LinkedList;
import java.util.List;

public class Vertice<T> {

    private final  T  data;
    private boolean visitado;

    public Vertice(T data) {
        this.data = data;
    }

    private List<Vertice<T>> vecinos = new LinkedList<>();

    public T getData() {
        return data;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public List<Vertice<T>> getVecinos() {
        return vecinos;
    }

    public void setVecinos(List<Vertice<T>> vecinos) {
        this.vecinos = vecinos;
    }

    @Override
    public String toString() {
        return "Vertice{" +
                "data=" + data +
                ", visitado=" + visitado +
                '}';
    }
}
