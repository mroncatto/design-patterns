package structural.composite_pattern.products;

import structural.composite_pattern.Caja;
import structural.composite_pattern.ComporCaja;

public class EntregaService {
    private Caja caja;

    public EntregaService() {

    }

    public void configurarPedido(Caja... cajas){
        this.caja = new ComporCaja(cajas);
    }

    public double calcularPrecioPedido(){
        return caja.calcularPrecio();
    }
}
