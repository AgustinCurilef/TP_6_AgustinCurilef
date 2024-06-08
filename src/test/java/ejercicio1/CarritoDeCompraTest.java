package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CarritoDeCompraTest {

    @Test
    public void ColectivoSurPesoMinimo() {

        CarritoDeCompra carrito= new CarritoDeCompra(new EnviosColectivoSur(tipoDestino.CAPITAL_FEDERAL), new Cliente(0));
        carrito.agregarProducto(new Producto("Producto 1", 1.0f,500.0));
        carrito.agregarProducto(new Producto("Producto 2", 0.8f,80.00));
        carrito.agregarProducto(new Producto("Producto 3", 2.0f,800.0));
        double precioTotalDelEnvio= carrito.precioTotalDelEnvio();
        assertEquals(precioTotalDelEnvio,1000.0,0.1);
    }

    @Test
    public void ColectivoSurPesoIntermedio() {
        CarritoDeCompra carrito= new CarritoDeCompra(new EnviosColectivoSur(tipoDestino.GRAN_BS_AS),new Cliente(0));
        carrito.agregarProducto(new Producto("Producto 1", 1.0f,500.0));
        carrito.agregarProducto(new Producto("Producto 2", 1.8f,80.00));
        carrito.agregarProducto(new Producto("Producto 3", 3.0f,800.0));
        double precioTotalDelEnvio= carrito.precioTotalDelEnvio();
        assertEquals(precioTotalDelEnvio,2000.0,0.1);
    }
    @Test
    public void ColectivoSurPesoMaximo() {
        CarritoDeCompra carrito= new CarritoDeCompra(new EnviosColectivoSur(tipoDestino.OTRO), new Cliente(50));
        carrito.agregarProducto(new Producto("Producto 1", 10.0f,5000.0));
        carrito.agregarProducto(new Producto("Producto 2", 3.8f,800.00));
        carrito.agregarProducto(new Producto("Producto 3", 30.0f,8000.0));
        double precioTotalDelEnvio= carrito.precioTotalDelEnvio();
        assertEquals(precioTotalDelEnvio,5000.0,0.1);
    }
    @Test
    public void CorreoArgentinoCapitalFederal() {
        CarritoDeCompra carrito= new CarritoDeCompra(new EnviosCorreoArgentino(tipoDestino.CAPITAL_FEDERAL), new Cliente(50));
        carrito.agregarProducto(new Producto("Producto 1", 10.0f,5000.0));
        carrito.agregarProducto(new Producto("Producto 2", 3.8f,800.00));
        carrito.agregarProducto(new Producto("Producto 3", 30.0f,8000.0));
        double precioTotalDelEnvio= carrito.precioTotalDelEnvio();
        assertEquals(precioTotalDelEnvio,500.0,0.1);
    }
    @Test
    public void CorreoArgentinoOtro() {
        CarritoDeCompra carrito= new CarritoDeCompra(new EnviosCorreoArgentino(tipoDestino.OTRO), new Cliente(100));
        carrito.agregarProducto(new Producto("Producto 1", 10.0f,5000.0));
        carrito.agregarProducto(new Producto("Producto 2", 3.8f,800.00));
        carrito.agregarProducto(new Producto("Producto 3", 30.0f,8000.0));
        double precioTotalDelEnvio= carrito.precioTotalDelEnvio();
        assertEquals(precioTotalDelEnvio,1300.0,0.1);
    }
    @Test
    public void CorreoArgentinoGranBsAs() {
        CarritoDeCompra carrito= new CarritoDeCompra(new EnviosCorreoArgentino(tipoDestino.GRAN_BS_AS), new Cliente(100));
        carrito.agregarProducto(new Producto("Producto 1", 10.0f,5000.0));
        carrito.agregarProducto(new Producto("Producto 2", 3.8f,800.00));
        carrito.agregarProducto(new Producto("Producto 3", 30.0f,8000.0));
        double precioTotalDelEnvio= carrito.precioTotalDelEnvio();
        assertEquals(precioTotalDelEnvio,1300.0,0.1);
    }

}