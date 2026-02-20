import javax.swing.JOptionPane;

public class EjercicioTreintaYUno {

    public static void main(String[] args) throws Exception {

        // Escribir un programa que imprima todos los números pares
        // entre dos números que se le pidan al usuario.

        String numero1 = JOptionPane.showInputDialog("Ingrese un número: ");
        String numero2 = JOptionPane.showInputDialog("Ingrese otro número: ");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        String guardar = "";

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    guardar += i + " ";
                }
            }
            JOptionPane.showMessageDialog(null, "Los números pares entre " + num1 + " y " + num2 + " son: " + guardar);
        } else if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 2 == 0) {
                    guardar += i + " ";
                }
            }
            JOptionPane.showMessageDialog(null, "Los números pares entre " + num2 + " y " + num1 + " son: " + guardar);
        } else {
            JOptionPane.showMessageDialog(null, "No es válido ingresar dos números iguales.");
        }

    }
}
