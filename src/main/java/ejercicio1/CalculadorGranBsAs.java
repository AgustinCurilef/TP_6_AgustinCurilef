package ejercicio1;

import ejercicio1.CalculadorDestino;

public class CalculadorGranBsAs extends CalculadorDestino {

    private static final float AdicionPesoIntermedio=500;
    private static final float AdicionPesoMaximo=2000;
    private static final double adicionKM=5;

    public CalculadorGranBsAs(double monto) {
        super(monto);
    }

    @Override
    protected double calcularPeso(float peso) {
        if ((peso > pesoIntermedio)) {
            return peso > pesoMaximo ? AdicionPesoMaximo : AdicionPesoIntermedio;
        }
        return 0;
    }

    @Override
    protected double calcularKM(int kilometros) {
        return kilometros* adicionKM;
    }

}
