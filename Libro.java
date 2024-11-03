// Versión inicial
// public class Libro {
//     private String titulo;
//     private String autor;

//     public Libro(String titulo, String autor) {
//         this.titulo = titulo;
//         this.autor = autor;
//     }

//     public void generarReporte() {
//         System.out.println("Generando reporte para el libro: " + titulo);
//     }

//     public void guardarEnBaseDeDatos() {
//         System.out.println("Guardando el libro en la base de datos...");
//     }
// }

// Versión refactorizada
public class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
