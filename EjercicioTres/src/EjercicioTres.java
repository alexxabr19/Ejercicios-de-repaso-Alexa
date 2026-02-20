import javax.swing.JOptionPane;

public class EjercicioTres {
    public static void main(String[] args) throws Exception {

        // Calcular el perímetro y área de un rectángulo dada su base y su altura.

        String base = JOptionPane.showInputDialog("Ingrese la base de su rectángulo:");
        String altura = JOptionPane.showInputDialog("Ingrese la altura de su rectángulo:");

        Float basefloat = Float.parseFloat(base);
        Float alturafloat = Float.parseFloat(altura);

        JOptionPane.showMessageDialog(null,
                "El perímetro de su rectángulo es: " + ((basefloat * 2) + (alturafloat * 2)) + ". \n"
                        + "El área de su rectángulo es: " + (basefloat * alturafloat) + ".");
    }
}
