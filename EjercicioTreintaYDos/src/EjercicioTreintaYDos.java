import javax.swing.JOptionPane;

public class EjercicioTreintaYDos {
    public static void main(String[] args) throws Exception {
        
        // Realizar una algoritmo que muestre la 
        // tabla de multiplicar de un número introducido por teclado.

        String numero = JOptionPane.showInputDialog("Ingrese un número: ");
        int num = Integer.parseInt(numero);
        String guardar = "";
        int multiplicacion = 0;

        for(int i = 1; i <= 10; i++){
            multiplicacion = num * i;

            guardar += num + "x" + i + " = " + multiplicacion + "\n";
        }

        JOptionPane.showMessageDialog(null, guardar);

    }
}
