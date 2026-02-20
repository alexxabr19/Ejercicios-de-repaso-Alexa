import javax.swing.JOptionPane;

public class EjercicioVeintiocho {
    public static void main(String[] args) throws Exception {

        // Crea una aplicación que permita adivinar un número.
        // La aplicación genera un número aleatorio del 1 al 100.
        // A continuación va pidiendo números y va respondiendo si el número a adivinar
        // es mayor o menor que el introducido, además de los intentos que te quedan
        // (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el
        // número
        // (además te dice en cuantos intentos lo has acertado), si se llega al limite
        // de intentos te
        // muestra el número que había generado.

        String num = JOptionPane.showInputDialog("Ingrese un número del 1 al 100: ");
        int numero = Integer.parseInt(num);

        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int intentos = 10;   

        while ((numero != numeroAleatorio) && intentos > 1) {

            if (numero < numeroAleatorio) {

                JOptionPane.showMessageDialog(null, "El número secreto es MAYOR");
            } else {
                JOptionPane.showMessageDialog(null, "El número secreto es MENOR");
            }

            intentos--;
            JOptionPane.showMessageDialog(null, "Te quedan " + intentos + " intentos.");
            num = JOptionPane.showInputDialog("Ingrese un número del 1 al 100: ");
            numero = Integer.parseInt(num);
        }

        if (intentos < 1) {
            JOptionPane.showMessageDialog(null, "Lo siento:(, el número secreto era: " + numeroAleatorio);
        } else {
            JOptionPane.showMessageDialog(null, "ADIVINASTEE!, el número era: " + numeroAleatorio + ". \n" +
                    " Lo hiciste en " + (10-intentos) + "intentos");
        }

    }
}
