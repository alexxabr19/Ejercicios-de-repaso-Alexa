import javax.swing.JOptionPane;

public class EjercicioTreintaYTres {
    public static void main(String[] args) throws Exception {

        // Escribe un programa que diga si un número introducido por teclado es o no
        // primo.
        // Un número primo es aquel que sólo es divisible entre él mismo y la unidad.

        String numero = JOptionPane.showInputDialog("Ingrese un número: ");
        int num = Integer.parseInt(numero);
        int acumular = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                acumular++;
            }
        }
        if (acumular > 2 || num == 1) {
            JOptionPane.showMessageDialog(null, "El número " + num + " NO es primo.");
        }else{
            JOptionPane.showMessageDialog(null, "El número " + num + " ES primo.");

        }

    }
}
