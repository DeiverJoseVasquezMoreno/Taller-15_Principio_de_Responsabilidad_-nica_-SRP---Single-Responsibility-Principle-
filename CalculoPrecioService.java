public class CalculoPrecioService {
    public double calcularPrecioConImpuesto(Producto producto) {
        return producto.getPrecio() * 1.15;
    }
}
