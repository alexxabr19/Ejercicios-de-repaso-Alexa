import javax.swing.JOptionPane;

public class EjercicioUno {
    public static void main(String[] args) throws Exception {
        
        // Escribir un programa que pregunte al usuario su nombre, y luego lo salude.

        String nombre  = JOptionPane.showInputDialog("¿Cómo te llamas? ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", espero que tengas un bonito día :D");
    }
}
