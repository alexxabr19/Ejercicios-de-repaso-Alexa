import javax.swing.JOptionPane;

public class EjercicioVeintisiete {
    public static void main(String[] args) throws Exception {

        // Crea una aplicación que pida un número y calcule su factorial
        // (El factorial de un número es el producto de todos los enteros entre 1
        // y el propio número y se representa por el número seguido de un signo de
        // exclamación.
        // Por ejemplo 5! = 1x2x3x4x5=120).

        String num = JOptionPane.showInputDialog("Ingrese un número: ");

        int numero = Integer.parseInt(num);
        int factorial = 1;
        int i;

        for (i = numero; i > 0; i--) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);

    }
}
