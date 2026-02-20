import javax.swing.JOptionPane;

public class EjercicioDieciocho {
    public static void main(String[] args) throws Exception {

        // Realiza un algoritmo que calcule la potencia, para ello pide por teclado, la
        // base y el exponente. Pueden ocurrir tres cosas:

        // El exponente sea positivo, sólo tienes que imprimir la potencia.
        // El exponente sea 0, el resultado es 1.
        // El exponente sea negativo, el resultado es 1/potencia con el exponente
        // positivo.

        
        String basee = JOptionPane.showInputDialog("Ingrese el valor de la base: ");
        String exp = JOptionPane.showInputDialog("Ingrese el valor del exponente: ");
        Double potencia = 0.0;

        Double base = Double.parseDouble(basee);
        Double exponente = Double.parseDouble(exp);

        if (exponente > 0) {
            potencia = Math.pow(base, exponente);
        }else if(exponente == 0){
            potencia = 1.0;
        }else{
            potencia = (1/Math.pow(base, exponente*-1));
        }

        JOptionPane.showMessageDialog(null, "El resultado de la potencia es: " + potencia);

    }
}
