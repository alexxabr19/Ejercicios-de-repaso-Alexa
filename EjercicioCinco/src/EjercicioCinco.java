import javax.swing.JOptionPane;

public class EjercicioCinco {
    public static void main(String[] args) throws Exception {

        // Dados dos números, mostrar la suma, resta, división y multiplicación de
        // ambos.

        String numero1 = JOptionPane.showInputDialog("Ingrese un número: ");
        String numero2 = JOptionPane.showInputDialog("Ingrese otro número: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        if (num2 != 0) {
            int division = num1 / num2;

            JOptionPane.showMessageDialog(null, "La suma de los número es: " + suma + ". \n" +
                    "La resta de los números es: " + resta + ". \n" + "El producto de tus números es: " + multiplicacion
                    + ". \n" +
                    "El cociente de tus números es: " + division);

        } else {
              JOptionPane.showMessageDialog(null, "La suma de los número es: " + suma + ". \n" +
                    "La resta de los números es: " + resta + ". \n" + "El producto de tus números es: " + multiplicacion
                    + ". \n" +
                    "El cociente de tus números es INDEFINIDO.");
        }
    }
}
