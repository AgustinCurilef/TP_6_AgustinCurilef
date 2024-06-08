package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class EnviosColectivoSur implements EmpresaDeEnvio{
    private tipoDestino destino;
    private Map<String, CalculadorDestino> estrategiasCalculo = new HashMap<>();
    public EnviosColectivoSur(tipoDestino destino){
        this.destino = destino;
        this.estrategiasCalculo.put(tipoDestino.CAPITAL_FEDERAL.name(),
                new CalculadorCapitalFederal(1000.0));
        this.estrategiasCalculo.put(tipoDestino.GRAN_BS_AS.name(),
                new CalculadorGranBsAs(1500.0));
        this.estrategiasCalculo.put(tipoDestino.OTRO.name(),
                new CalculadorOtro(3000.0));
    }
    @Override
    public double calcularEnvio(CarritoDeCompra carrito) {
        return this.estrategiasCalculo.get(this.destino.name()).calcularEnvio(carrito.pesoTotalCarrito(),0);
    }
}
