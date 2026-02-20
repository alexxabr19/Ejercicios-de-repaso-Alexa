import javax.swing.JOptionPane;

public class EjercicioVeintiuno {
    public static void main(String[] args) throws Exception {

        // Escribir un programa que lea un año indicar si es bisiesto.

        // Nota: un año es bisiesto si es un número divisible por 4, pero no
        // si es divisible por 100, excepto que también sea divisible por 400.

        String num1 = JOptionPane.showInputDialog("Ingrese el valor del año: ");

        int numeroUno = Integer.parseInt(num1);

        if (numeroUno % 4 == 0) {
            if (numeroUno % 100 == 0 && numeroUno % 400 == 0) {
                JOptionPane.showMessageDialog(null, "El año " + numeroUno + " ES bisiesto.");
            }else if (numeroUno % 100 != 0) {
               JOptionPane.showMessageDialog(null, "El año " + numeroUno + " ES bisiesto.");
            }else{
                JOptionPane.showMessageDialog(null, "El año " + numeroUno + " ES bisiesto.");
            }
        }else{
                JOptionPane.showMessageDialog(null, "El año " + numeroUno + " NO es bisiesto.");
        }

    }
}
