import javax.swing.JOptionPane;

public class EjercicioVeintinueve {
    public static void main(String[] args) throws Exception {
        
        // Algoritmo que pide números hasta que se introduzca un cero. 
        // Debe imprimir la suma y la media de todos los números introducidos

        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        int numero = Integer.parseInt(num);
        double suma = 0;
        double contador = 0.0;
        while (numero != 0) {
            suma += numero;
            contador++;
            num = JOptionPane.showInputDialog("Ingrese un número: ");
            numero = Integer.parseInt(num);
        }

        if (contador > 0) { 
            JOptionPane.showMessageDialog(null, "La suma de los números ingresados es: " + suma +
                "\nEl promedio de los números es: " + (suma / contador)
            );
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números distintos de cero.");
        }
        
    }
}
