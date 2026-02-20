import javax.swing.JOptionPane;

public class EjercicioTreintaYDosR {
    public static void main(String[] args) throws Exception {

        // Escribe un programa que dados dos números, uno real (base) y un entero
        // positivo (exponente),
        // saque por pantalla el resultado de la potencia. No se puede utilizar el
        // operador de potencia.

        String numeroUno = JOptionPane.showInputDialog("Ingrese la base: ");
        String numeroDos = JOptionPane.showInputDialog("Ingrese el exponente (número positivo): ");

        double numBase = Double.parseDouble(numeroUno);
        int numExponente = Integer.parseInt(numeroDos);
        Double potencia = 1.0;

        if (numExponente < 0) {
            JOptionPane.showMessageDialog(null, "Lo siento, debes ingresar un exponente positivo.");
        }else if (numExponente == 0) {
            JOptionPane.showMessageDialog(null, "El resultado de " + numBase + " elevado a la 0 es igual a 1 ");
        }else{
            for(int i = 1; i <= numExponente; i++){
                potencia *= numBase;
            }
            JOptionPane.showMessageDialog(null, "El resultado de " + numBase + " elevado a " + numExponente + " es igual a " + potencia);
        }
    }
}
