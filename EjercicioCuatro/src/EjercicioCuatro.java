import javax.swing.JOptionPane;

public class EjercicioCuatro {
    public static void main(String[] args) throws Exception {

        // Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

        String cateto1 = JOptionPane.showInputDialog("Ingrese el valor del primer cateto: ");
        String cateto2 = JOptionPane.showInputDialog("Ingrese el valor del segundo cateto: ");

        Double catetoDouble1 = Double.parseDouble(cateto1);
        Double catetoDouble2 = Double.parseDouble(cateto2);

        Double hipotenusa = Math.sqrt((Math.pow(catetoDouble1, 2) + (Math.pow(catetoDouble2, 2))));

        JOptionPane.showMessageDialog(null, "La hipotenusa de su triángulo es: " + hipotenusa);

    }
}
