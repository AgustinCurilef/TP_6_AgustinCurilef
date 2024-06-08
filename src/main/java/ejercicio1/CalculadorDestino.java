package ejercicio1;

public abstract class CalculadorDestino {
    private double total;
    private double monto;
    protected static final float pesoIntermedio= 5.0F;
    protected static final float pesoMaximo= 30.0F;

    protected CalculadorDestino(double monto) {
        this.monto = monto;
    }
    public double calcularEnvio(float peso, int kilometros){
        total= monto + calcularKM(kilometros) +  calcularPeso(peso);
        return total;
    }

    protected abstract double calcularPeso(float peso);

    protected abstract double calcularKM(int kilometros);

    ;
}
