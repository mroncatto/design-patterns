package behavioral.iterator_pattern;

public interface Iterator<T> {

    boolean tieneProximo();
    Vertice<T> getProximo();
    void reset();
}
