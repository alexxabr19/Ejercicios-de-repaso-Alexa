import javax.swing.JOptionPane;

public class EjercicioQuince {
    public static void main(String[] args) throws Exception {

        // Algoritmo que pida un número y diga si es positivo, negativo o 0.

        String num = JOptionPane.showInputDialog("Ingrese un número: ");
        Double numero = Double.parseDouble(num);

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número ingresado es positivo.");
        }else if(numero < 0){
            JOptionPane.showMessageDialog(null, "El número ingresado es negativo.");
        }else{
            JOptionPane.showMessageDialog(null, "El número ingresado es cero.");
        }

    }
}
