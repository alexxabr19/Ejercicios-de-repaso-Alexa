import javax.swing.JOptionPane;

public class EjercicioSiete {
    public static void main(String[] args) throws Exception {
        
        // Calcular la media de tres números pedidos por teclado

        String numero1 = JOptionPane.showInputDialog("Número 1: ");
        String numero2 = JOptionPane.showInputDialog("Número 2: ");
        String numero3 = JOptionPane.showInputDialog("Número 3: ");

        double num1 = Double.parseDouble(numero1);
        double num2 = Double.parseDouble(numero2);
        double num3 = Double.parseDouble(numero3);

        double media = (num1 + num2 + num3)/3;

        JOptionPane.showMessageDialog(null, "La media de sus tres números es: " + media);

    }
}
