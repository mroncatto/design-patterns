package structural.adapter_pattern;

public class MultiRestoApp implements IMultiRestoApp {
    @Override
    public void mostrarMenus(XmlData xmlData) {
        // Mostrar menus usando XML
        System.out.println("Mostrando menus usando XML");
    }

    @Override
    public void mostrarRecomedaciones(XmlData xmlData) {
        // Mostrar recomendaciones usando XML
        System.out.println("Mostrar recomendaciones usando XML");
    }
}
