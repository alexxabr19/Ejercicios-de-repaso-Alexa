import javax.swing.JOptionPane;

public class EjercicioCatorce {
    public static void main(String[] args) throws Exception {

        // Algoritmo que pida dos números e indique si el primero es mayor que el
        // segundo.

        String num1 = JOptionPane.showInputDialog("Ingrese el valor del primer número: ");
        String num2 = JOptionPane.showInputDialog("Ingrese el valor del segundo número: ");

        Double numeroUno = Double.parseDouble(num1);
        Double numeroDos = Double.parseDouble(num2);

        if (numeroUno > numeroDos) {
            JOptionPane.showMessageDialog(null, "El primer número es mayor que el segundo: " + numeroUno + " > " + numeroDos);
        }else{
            JOptionPane.showMessageDialog(null, "El primer número es menor o igual que el segundo: " + numeroUno + " < o = " + numeroDos);

        }
        
    }
}
