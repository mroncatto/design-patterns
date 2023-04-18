package behavioral.template_method_pattern;

public class Main {
    public static void main(String[] args) {
//        Mantiene una base de estructura para una serie de metodos individuales que se ejecutan en orden
//        y pueden ser implementado manteniendo un orden evitando duplicar codigo

        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("====================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();
    }
}
