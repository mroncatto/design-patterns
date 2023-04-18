package structural.adapter_pattern;

public class Main {
    public static void main(String[] args) {
//        - Utiliza herencia y composicion para habilitar objectos con interface incompatibles para colaborar entre ellos.
//        - Una clase de camada que sirve como un traductor.
//        - La adaptacion es separada y permite introducir nuevos adaptadores sin romper el codigo existente

        XmlData myData = new XmlData();

        // Old UI
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.mostrarMenus(myData);
        multiRestoApp.mostrarRecomedaciones(myData);

        System.out.println("==========================================");

        // New UI
        IMultiRestoApp adapter = new FancyUIServiceAdapter();
        adapter.mostrarMenus(myData);
        adapter.mostrarRecomedaciones(myData);
    }
}
