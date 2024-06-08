package ejercicio3;
abstract class CalculadoraDePrecios {
    double impuestos = 0;
    double descuentos = 0;
    public double precio;
    public CalculadoraDePrecios(double precio) {
        this.precio = precio;
    }
    public final double precioFinal() {
        double total = precio * (1 + calcularImpuestos()) * (1 - calcularDescuentos());
        if (calcularEnvioGratis()) {
            total -= 10;
        }
        return total;
    }
    protected abstract double calcularImpuestos();
    protected abstract double calcularDescuentos();
    protected abstract boolean calcularEnvioGratis();
}
