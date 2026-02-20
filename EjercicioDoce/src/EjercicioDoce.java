import javax.swing.JOptionPane;

public class EjercicioDoce {
    public static void main(String[] args) throws Exception {

        // Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide
        // realizar un algoritmo que intercambie los valores de ambas variables y
        // muestre cuanto valen al final las dos variables.

        String num1 = JOptionPane.showInputDialog("Ingrese el valor de la primera variable: ");
        String num2 = JOptionPane.showInputDialog("Ingrese el valor de la segunda variable: ");

        Double variableUno = Double.parseDouble(num1);
        Double variableDos = Double.parseDouble(num2);

        Double variableFalsa = variableUno;
        variableUno = variableDos;
        variableDos = variableFalsa;

        JOptionPane.showMessageDialog(null,
                "Variable A original: " + variableFalsa + ". Variable A intercambiada: " + variableUno + ". \n"
                        + "Variable B original: " + variableUno + ". Variable B intercambiada: " + variableDos);

    }
}
