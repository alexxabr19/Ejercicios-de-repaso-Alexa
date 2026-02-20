import javax.swing.JOptionPane;

public class EjercicioVeintidos {
    public static void main(String[] args) throws Exception {

        // Escribe un programa que reciba un mes y diga cuantos dias tiene este mes.

        String mes = JOptionPane.showInputDialog("Escriba un mes: ");

        if (mes.equalsIgnoreCase("enero") || mes.equalsIgnoreCase("marzo") || mes.equalsIgnoreCase("mayo") ||
                mes.equalsIgnoreCase("julio") || mes.equalsIgnoreCase("agosto") || mes.equalsIgnoreCase("octubre")
                || mes.equalsIgnoreCase("diciembre")) {
            JOptionPane.showMessageDialog(null, "El mes de " + mes + " tiene 31 días.");

        } else if (mes.equalsIgnoreCase("febrero")) {
            String num = JOptionPane.showInputDialog("Escriba un año: ");

            int numeroUno = Integer.parseInt(num);

            if (numeroUno % 4 == 0) {
                if (numeroUno % 100 == 0 && numeroUno % 400 == 0) {
                    JOptionPane.showMessageDialog(null,
                            "El año " + numeroUno + " ES bisiesto. Por ende, Febrero tiene 29 días");
                } else if (numeroUno % 100 != 0) {
                    JOptionPane.showMessageDialog(null,
                            "El año " + numeroUno + " ES bisiesto. Por ende, Febrero tiene 29 días.");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "El año " + numeroUno + " ES bisiesto. Por ende, Febrero tiene 29 días.");
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "El año " + numeroUno + " NO es bisiesto. Por ende, Febrero tiene 28 días.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "El mes de " + mes + " tiene 30 días.");
        }

    }
}
