// Versión inicial
// public class Producto {
//     private String nombre;
//     private double precio;

//     public Producto(String nombre, double precio) {
//         this.nombre = nombre;
//         this.precio = precio;
//     }

//     public double calcularPrecioConImpuesto() {
//         return precio * 1.15;
//     }

//     public void generarEtiqueta() {
//         System.out.println("Etiqueta del producto: " + nombre);
//     }
// }

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
