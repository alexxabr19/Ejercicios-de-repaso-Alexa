import javax.swing.JOptionPane;

public class EjercicioSeis {
    public static void main(String[] args) throws Exception {
        
        // Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.

        String numero = JOptionPane.showInputDialog("Ingrese un valor en grados Fahrenheit: ");
        double fahrenheit = Double.parseDouble(numero);

        double celsius = (fahrenheit - 32)/1.8;
       
        JOptionPane.showMessageDialog(null, fahrenheit + "° Fahrenheit es igual a " + celsius + "° Celsius");

    }
}
