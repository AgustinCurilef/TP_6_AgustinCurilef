package ejercicio3;

public class CalculadoraPrecioDeLibro extends CalculadoraDePrecios {
    public CalculadoraPrecioDeLibro(double precio) {
        super(precio);
    }
    @Override
    protected double calcularImpuestos() {
        return 0.1;
    }
    @Override
    protected double calcularDescuentos() {
        return 0.1;
    }
    @Override
    protected boolean calcularEnvioGratis() {
        return precio > 100;
    }
}
