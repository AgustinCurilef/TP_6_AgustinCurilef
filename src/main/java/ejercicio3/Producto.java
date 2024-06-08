package ejercicio3;

import java.util.Map;

public class Producto {
    private Map<String, CalculadoraDePrecios> calculadoraDePrecios;
    private double precio;
    private TipoProducto tipoProducto;

    public Producto(TipoProducto tipoProducto, double precio) {
        this.precio = precio;
        this.tipoProducto = tipoProducto;
        this.calculadoraDePrecios.put(TipoProducto.LIBRO.name(),new CalculadoraPrecioDeLibro(precio));
        this.calculadoraDePrecios.put(TipoProducto.ALIMENTO.name(),new CalculadoraPrecioDeAlimento(precio));
        this.calculadoraDePrecios.put(TipoProducto.MEDICINA.name(),new CalculadoraPrecioDeMedicina(precio));
        this.calculadoraDePrecios.put(TipoProducto.OTRO.name(),new CalculadoraPrecioDeOtro(precio));
    }

    public double precioFinal() {
        return calculadoraDePrecios.get(tipoProducto.name()).precioFinal();
    }
}

