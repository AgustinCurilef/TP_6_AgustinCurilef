package ejercicio3;

public class CalculadoraPrecioDeMedicina extends CalculadoraDePrecios {
    public CalculadoraPrecioDeMedicina(double precio) {
        super(precio);
    }
    @Override
    protected double calcularImpuestos() {
        return 0;
    }
    @Override
    protected double calcularDescuentos() {
        descuentos = precio > 50 ? 0.1 : 0;
        return descuentos;
    }
    @Override
    protected boolean calcularEnvioGratis() {
        return precio > 100;
    }
}
