package behavioral.memento_pattern;

public class Main {
    public static void main(String[] args) {
//        Salvar y restaurar el estado de un objeto sin revelar detalles de implementacion
//        Delegar a criacao de copia de estado do objeto para o proprio objeto

        Editor editor = new Editor();
        editor.escribir("Like");
        editor.imprimirTexto();
        editor.escribir("Like and");
        editor.imprimirTexto();
        editor.escribir("Like and Subscribe");
        editor.imprimirTexto();
        editor.escribir("Like and Subscribe to Java!");
        editor.imprimirTexto();
        editor.deshacer();
        editor.imprimirTexto();
        editor.deshacer();
        editor.imprimirTexto();
        editor.deshacer();
        editor.imprimirTexto();

    }
}
