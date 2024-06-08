package ejercicio3;

public class CalculadoraPrecioDeAlimento extends CalculadoraDePrecios {
    public CalculadoraPrecioDeAlimento(double precio) {
        super( precio);
    }
    @Override
    protected double calcularImpuestos() {
        return 0.05;
    }
    @Override
    protected double calcularDescuentos() {
        descuentos = precio > 100 ? 0.15 : 0;
        return descuentos;
    }
    @Override
    protected boolean calcularEnvioGratis() {
        return precio > 200;
    }
}
