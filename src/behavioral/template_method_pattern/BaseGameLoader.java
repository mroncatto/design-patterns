package behavioral.template_method_pattern;

public abstract class BaseGameLoader {
    public void load(){
        byte[] datos = cargarDatosLocales();
        crearObjetos(datos);
        descargarArchivosAdicionales();
        limpiarArchivosTemporales();
        inicializarPerfiles();
    }

    abstract byte[] cargarDatosLocales();
    abstract void crearObjetos(byte[] datos);
    abstract void descargarArchivosAdicionales();
    abstract void inicializarPerfiles();

    protected void limpiarArchivosTemporales(){
        System.out.println("Limpiando archivos temporales...");
        // Some code
    }
}
