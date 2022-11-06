package behavioral.template_method_pattern;

public class WorldOfWarcraftLoader extends BaseGameLoader {
    @Override
    byte[] cargarDatosLocales() {
        System.out.println("Cargando datos locales de WoW...");
        // Some Warcraft code
        return new byte[0];
    }

    @Override
    void crearObjetos(byte[] datos) {
        System.out.println("Creando objetos de WoW");
        // Some Warcraft code
    }

    @Override
    void descargarArchivosAdicionales() {
        System.out.println("Descargando archivos de WoW");
        // Some Warcraft code
    }

    @Override
    void inicializarPerfiles() {
        System.out.println("Cargando perfiles de WoW");
        // Some Warcraft code
    }
}
