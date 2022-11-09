package structural.adapter_pattern;

public class FancyUIServiceAdapter implements IMultiRestoApp {

    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter() {
        this.fancyUIService = new FancyUIService();
    }

    @Override
    public void mostrarMenus(XmlData xmlData) {
        JsonData jsonData = converXmltoJson(xmlData);
        System.out.println("Mostrando menus usando convercion a JSON");
        fancyUIService.mostrarMenus(jsonData);
    }

    @Override
    public void mostrarRecomedaciones(XmlData xmlData) {
        JsonData jsonData = converXmltoJson(xmlData);
        System.out.println("Mostrando recomendaciones usando convercion a JSON");
        fancyUIService.mostrarRecomedaciones(jsonData);
    }

    private JsonData converXmltoJson(XmlData xmlData){
        System.out.println("Convertiendo XML a JSON");
        return new JsonData();
    }
}
