public class Persona {

    private String nombre;
    private String apellido;
    private String documento;
    private int anioNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String documento, int anioNacimiento, String paisNacimiento,
            char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

        public void imprimirInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento: " + documento);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + genero);
        System.out.println("");
    }

        public static void main(String[] args) {

        Persona persona1 = new Persona("Alexa", "Bedoya", "123456789",
                2004, "Colombia", 'M');

        Persona persona2 = new Persona("Shary", "De Arcos", "987654321",
                2001, "Colombia", 'M');

        persona1.imprimirInformacion();
        persona2.imprimirInformacion();
    }

}
