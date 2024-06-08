package ejercicio3;

public class CalculadoraPrecioDeOtro extends CalculadoraDePrecios {
    public CalculadoraPrecioDeOtro(double precio) {
        super(precio);
    }
    @Override
    protected double calcularImpuestos() {
        return 0.15;
    }

    @Override
    protected double calcularDescuentos() {
        descuentos = precio > 50 ? 0.05 : 0;
        return descuentos;
    }

    @Override
    protected boolean calcularEnvioGratis() {
        return precio > 200;
    }
}
