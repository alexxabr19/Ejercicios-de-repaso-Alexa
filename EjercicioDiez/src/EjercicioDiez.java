import javax.swing.JOptionPane;

public class EjercicioDiez {
    public static void main(String[] args) throws Exception {

        // Un alumno desea saber cual será su calificación final en la materia de
        // Estructura de Datos. Dicha calificación se compone de los siguientes
        // porcentajes:

        // 55% del promedio de sus tres calificaciones parciales.
        // 30% de la calificación del examen final.
        // 15% de la calificación de un trabajo final.

        String primerParcial = JOptionPane.showInputDialog("Ingrese la nota del primer parcial: ");
        String segundoParcial = JOptionPane.showInputDialog("Ingrese la nota del segundo parcial: ");
        String tercerParcial = JOptionPane.showInputDialog("Ingrese la nota del tercer parcial: ");
        String examenFinal = JOptionPane.showInputDialog("Ingrese la nota del parcial final: ");
        String trabajo = JOptionPane.showInputDialog("Ingrese la nota del trabajo final: ");


        Double parcialUno = Double.parseDouble(primerParcial);
        Double parcialDos = Double.parseDouble(segundoParcial);
        Double parcialTres = Double.parseDouble(tercerParcial);
        Double parcialFinal = Double.parseDouble(examenFinal);
        Double trabajoFinal = Double.parseDouble(trabajo);

        Double notaFinal = (((parcialUno + parcialDos + parcialTres)/3)*0.55) + (parcialFinal * 0.30) + (trabajoFinal * 0.15);

        JOptionPane.showMessageDialog(null, "La calificación final del estudiante es: " + notaFinal);

    }
}
