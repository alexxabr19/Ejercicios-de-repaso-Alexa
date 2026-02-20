import javax.swing.JOptionPane;

public class EjercicioDiecinueve {
    public static void main(String[] args) throws Exception {

        // Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)

        String num1 = JOptionPane.showInputDialog("Ingrese el valor del primer número: ");
        String num2 = JOptionPane.showInputDialog("Ingrese el valor del segundo número: ");
        String num3 = JOptionPane.showInputDialog("Ingrese el valor del tercer número: ");

        int numeroUno = Integer.parseInt(num1);
        int numeroDos = Integer.parseInt(num2);
        int numeroTres = Integer.parseInt(num3);

        if ((numeroUno >= numeroDos) && (numeroUno >= numeroTres)) {
            if (numeroDos > numeroTres) {
                JOptionPane.showMessageDialog(null, numeroUno + ", " + numeroDos + ", " + numeroTres);
            } else {
                JOptionPane.showMessageDialog(null, numeroUno + ", " + numeroTres + ", " + numeroDos);
            }
        } else if ((numeroDos >= numeroUno) && (numeroDos >= numeroTres)) {
            if (numeroUno > numeroTres) {
                JOptionPane.showMessageDialog(null, numeroDos + ", " + numeroUno + ", " + numeroTres);
            } else {
                JOptionPane.showMessageDialog(null, numeroDos + ", " + numeroTres + ", " + numeroUno);
            }
        } else {
            if (numeroUno > numeroDos) {
                JOptionPane.showMessageDialog(null, numeroTres + ", " + numeroUno + ", " + numeroDos);
            } else {
                JOptionPane.showMessageDialog(null, numeroTres + ", " + numeroDos + ", " + numeroUno);
            }
        }

    }
}
