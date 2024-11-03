// Versión inicial
// public class Usuario {
//     private String nombre;
//     private String contrasena;

//     public Usuario(String nombre, String contrasena) {
//         this.nombre = nombre;
//         this.contrasena = contrasena;
//     }

//     public boolean autenticar(String contrasena) {
//         return this.contrasena.equals(contrasena);
//     }

//     public boolean validarNombre() {
//         return nombre != null && !nombre.isEmpty();
//     }
// }

// Versión refactorizada
public class Usuario {
    private String nombre;
    private String contrasena;

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
}
