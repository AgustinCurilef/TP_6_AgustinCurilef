package ejercicio1;

import ejercicio1.*;

import java.util.HashMap;
import java.util.Map;

public class EnviosCorreoArgentino implements EmpresaDeEnvio {
    private tipoDestino destino;
    private Map<String, CalculadorDestino> estrategiasCalculo = new HashMap<>();
    public EnviosCorreoArgentino(tipoDestino destino){
        this.destino = destino;
        this.estrategiasCalculo.put(tipoDestino.CAPITAL_FEDERAL.name(),
                new CalculadorCapitalFederal(500.0));
        this.estrategiasCalculo.put(tipoDestino.GRAN_BS_AS.name(),
                new CalculadorGranBsAs(800.0));
        this.estrategiasCalculo.put(tipoDestino.OTRO.name(),
                new CalculadorOtro(800.0));
    }
    @Override
    public double calcularEnvio(CarritoDeCompra carrito) {
        return this.estrategiasCalculo.get(this.destino.name()).calcularEnvio(0, carrito.distanciaClienteYEmpresa());
    }
}
