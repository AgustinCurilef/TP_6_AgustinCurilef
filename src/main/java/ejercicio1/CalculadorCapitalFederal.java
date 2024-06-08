package ejercicio1;

public class CalculadorCapitalFederal extends CalculadorDestino {

    private static final double AdicionPesoIntermedio=500;
    private static final double AdicionPesoMaximo=2000;
    private static final double adicionKM=5;

    public CalculadorCapitalFederal(double monto) {
        super(monto);
    }


    @Override
    protected double calcularPeso(float peso) {
        if ((peso > CalculadorDestino.pesoIntermedio)) {
            return peso > CalculadorDestino.pesoMaximo ? AdicionPesoMaximo : AdicionPesoIntermedio;
        }
        return 0;
    }

    @Override
    protected double calcularKM(int kilometros) {
        return 0;
    }
}
