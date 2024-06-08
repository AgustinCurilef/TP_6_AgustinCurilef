package ejercicio1;

import ejercicio1.CalculadorDestino;

public class CalculadorOtro extends CalculadorDestino {

    private static final float AdicionPesoIntermedio=500;
    private static final float AdicionPesoMaximo=2000;
    private static final double adicionKM=5;
    public CalculadorOtro(double monto ) {
        super(monto);
    }
    @Override
    protected double calcularPeso( float peso) {
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
