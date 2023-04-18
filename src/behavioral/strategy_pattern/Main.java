package behavioral.strategy_pattern;

import behavioral.strategy_pattern.strategy.PagoPaypalStrategy;
import behavioral.strategy_pattern.strategy.PagoTarjetaCreditoStrategy;

public class Main {
    public static void main(String[] args) {
//        Aislamiento de estrategias separadas por clases
//        que pueden facilmente ser implementadas

        PagoService pagoService = new PagoService();

        pagoService.setPagoStrategy(new PagoTarjetaCreditoStrategy());
        pagoService.procesarPedido(100);

        System.out.println("=========================================");

        pagoService.setPagoStrategy(new PagoPaypalStrategy());
        pagoService.procesarPedido(100);
    }
}
