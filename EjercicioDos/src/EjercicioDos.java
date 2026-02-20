import javax.swing.JOptionPane;

public class EjercicioDos {
    public static void main(String[] args) throws Exception {

        // Escribir un programa que pregunte al usuario su edad, y luego le diga cuántos
        // años tendrá en 10 años.

        String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?: ");
        String edad = JOptionPane.showInputDialog("¿Cuántos años tienes?: ");
        JOptionPane.showMessageDialog(null, "Hola " + nombre + ", en diez años tendrás " + (Integer.parseInt(edad) + 10) + " años.");
    }
}
