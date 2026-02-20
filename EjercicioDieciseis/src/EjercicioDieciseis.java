import javax.swing.JOptionPane;

public class EjercicioDieciseis {
    public static void main(String[] args) throws Exception {
        
        // Escribe un programa que lea un número e indique si es par o impar.

        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        int numero = Integer.parseInt(num);

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado es par.");
        }else{
            JOptionPane.showMessageDialog(null, "El número ingresado es impar.");
        }
    }
}
