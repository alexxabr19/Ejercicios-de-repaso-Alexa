public class Rectangulo {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    public void mostrarResultados() {
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("");
    }

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(5, 3);
        Rectangulo rectangulo2 = new Rectangulo(7.5, 4);

        rectangulo1.mostrarResultados();
        rectangulo2.mostrarResultados();
    }
}
