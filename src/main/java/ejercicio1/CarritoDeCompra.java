package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private List<Producto> carrito;
    private EmpresaDeEnvio empresaDeEnvio;
    private Cliente cliente;
    private float peso=0;

    public CarritoDeCompra(EmpresaDeEnvio empresaDeEnvio, Cliente cliente) {
        carrito= new ArrayList<>();
        this.empresaDeEnvio= empresaDeEnvio;
        this.cliente= cliente;
    }
    public void agregarProducto(Producto producto){
        carrito.add(producto);
        peso= peso + producto.peso();
    }
    public double precioTotalDelEnvio(){
        return empresaDeEnvio.calcularEnvio(this);
    }
    public float pesoTotalCarrito(){
        return peso;
    }
    public int distanciaClienteYEmpresa() {
        return cliente.obtenerDistancia();
    }
}
