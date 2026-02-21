public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
        System.out.println("");
    }

    public void modificarAnio(int nuevoAño) {
        if (nuevoAño > 0) {
            this.añoPublicacion = nuevoAño;
            System.out.println("Año de publicación actualizado correctamente.");
        } else {
            System.out.println("El año ingresado no es válido.");
        }
    }

    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("7 cuentos peregrinos", "Gabriel García Márquez", 1992);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        libro1.modificarAnio(1970);

        libro1.mostrarInformacion();
    }
}