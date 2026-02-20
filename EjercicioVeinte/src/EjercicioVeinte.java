import javax.swing.JOptionPane;

public class EjercicioVeinte {
    public static void main(String[] args) throws Exception {
        // Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las
        // dimensiones de los
        // lados de un triángulo. El programa debe determinar que tipo de triángulo es,
        // teniendo en cuenta:

        // Si se cumple Pitágoras entonces es triángulo rectángulo
        // Si sólo dos lados del triángulo son iguales entonces es isósceles.
        // Si los 3 lados son iguales entonces es equilátero.
        // Si no se cumple ninguna de las condiciones anteriores, es escaleno.

        String lado1 = JOptionPane.showInputDialog("Ingrese el valor del primer lado: ");
        String lado2 = JOptionPane.showInputDialog("Ingrese el valor del segundo lado: ");
        String lado3 = JOptionPane.showInputDialog("Ingrese el valor del tercer lado: ");

        int numeroUno = Integer.parseInt(lado1);
        int numeroDos = Integer.parseInt(lado2);
        int numeroTres = Integer.parseInt(lado3);

        if (numeroUno == Math.sqrt((Math.pow(numeroDos, 2)) + (Math.pow(numeroTres, 2)))
                || numeroDos == Math.sqrt((Math.pow(numeroUno, 2)) + (Math.pow(numeroTres, 2)))
                || numeroTres == Math.sqrt((Math.pow(numeroUno, 2)) + (Math.pow(numeroDos, 2)))) {
            JOptionPane.showMessageDialog(null, "El triángulo es rectángulo.");
        } else if ((numeroDos == numeroUno && numeroDos != numeroTres)
                || (numeroUno == numeroTres && numeroUno != numeroDos)
                || (numeroTres == numeroDos && numeroTres != numeroUno)) {
            JOptionPane.showMessageDialog(null, "El triángulo es isósceles.");
        } else if (numeroUno == numeroDos && numeroUno == numeroTres) {
            JOptionPane.showMessageDialog(null, "El triángulo es equilátero.");
        } else {
            JOptionPane.showMessageDialog(null, "El triángulo es escaleno.");
        }
    }
}
