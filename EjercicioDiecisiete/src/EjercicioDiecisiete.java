import javax.swing.JOptionPane;

public class EjercicioDiecisiete {
    public static void main(String[] args) throws Exception {

        // Escribe un programa que pida un nombre de usuario y una contraseña y si se ha
        // introducido correctamente indicar "Has entrado al sistema", sino se da un
        // mensaje de error.

        String usuarioCorrecto = "Alexa123";
        String contraseñaCorrecta = "123";

        String usuario = JOptionPane.showInputDialog("Ingrese el usuario: ");
        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña: ");

        if (usuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
            JOptionPane.showMessageDialog(null, "Has entrado al sistema.");
        }else{
            JOptionPane.showMessageDialog(null, "¡Error! Usuario o contraseña incorrectos.");

        }

    }
}
