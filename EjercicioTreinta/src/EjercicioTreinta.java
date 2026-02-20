import javax.swing.JOptionPane;

public class EjercicioTreinta {
    public static void main(String[] args) throws Exception {

        // Realizar un algoritmo que pida números
        // (se pedirá por teclado la cantidad de números a introducir).
        // El programa debe informar de cuantos números introducidos
        // son mayores que 0, menores que 0 e iguales a 0.

        String cantNum = JOptionPane.showInputDialog("Ingrese la cantidad de números que va a ingresar: ");
        int cantNumero = Integer.parseInt(cantNum);

        int numMayor = 0;
        int numMenor = 0;
        int numCero = 0;

        for (int i = 1; i <= cantNumero; i++) {
            String num = JOptionPane.showInputDialog("Ingrese un número: ");
            int numero = Integer.parseInt(num);

            if (numero < 0) {
                numMenor++;
            } else if (numero > 0) {
                numMayor++;
            } else {
                numCero++;
            }

        }

        JOptionPane.showMessageDialog(null, "Los números mayores a cero fueron " + numMayor + "\n" + 
            "Los números menores a cero fueron: " + numMenor + "\n" + "Los números iguales a cero fueron: " + numCero
        );

    }
}
