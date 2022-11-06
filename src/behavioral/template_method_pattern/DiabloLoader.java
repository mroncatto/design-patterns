package behavioral.template_method_pattern;

public class DiabloLoader extends BaseGameLoader {
    @Override
    byte[] cargarDatosLocales() {
        System.out.println("Cargando datos locales de Diablo...");
        // Some Diablo code
        return new byte[0];
    }

    @Override
    void crearObjetos(byte[] datos) {
        System.out.println("Creando objetos de Diablo");
        // Some Diablo code
    }

    @Override
    void descargarArchivosAdicionales() {
        System.out.println("Descargando archivos de Diablo");
        // Some Diablo code
    }

    @Override
    void inicializarPerfiles() {
        System.out.println("Cargando perfiles de Diablo");
        // Some Diablo code
    }
}
