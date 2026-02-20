import javax.swing.JOptionPane;

public class EjercicioVeinticinco {
    public static void main(String[] args) throws Exception {

        // La política de cobro de una compañía telefónica es: cuando se realiza una
        // llamada,
        // el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco
        // minutos
        // cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos,
        // 70 céntimos, y a partir del décimo minuto, 50 céntimos.
        // Además, se carga un impuesto del 3 % cuando es domingo, y si es otro día, en
        // turno de mañana,
        // 15 %, y en turno de tarde, 10 %. Realiza un algoritmo para determinar cuánto
        // debe pagar
        // por cada concepto una persona que realiza una llamada.

        String minuto = JOptionPane.showInputDialog("Ingrese la cantidad de minutos de duración de la llamada: ");
        String diaSemana = JOptionPane.showInputDialog("Ingrese el día de la semana en que realiza la llamada: ");
        Double minutos = Double.parseDouble(minuto);
        Double precio = 0.0;

        // Precio por minutos
        if (minutos <= 5) {
            precio = minutos * 1.0;
        } else if (minutos > 5 && minutos <= 8) {
            precio = (minutos - 5) * 0.80 + (5 * 1.0);
        } else if (minutos > 8 && minutos <= 10) {
            precio = (minutos - 8) * 0.70 + (3 * 0.80) + (5 * 1.0);
        } else {
            precio = (minutos - 10) * 0.50 + (2 * 0.70) + (3 * 0.80) + (5 * 1.0);
        }

        // Precio por días
        if (diaSemana.equalsIgnoreCase("domingo")) {
            precio += precio * 0.03;
        } else {
            String momentoDia = JOptionPane.showInputDialog("Indique si es de mañana o tarde: ");
            if (momentoDia.equalsIgnoreCase("mañana")) {
                precio += precio * 0.15;
            } else if (momentoDia.equalsIgnoreCase("tarde")) {
                precio += precio * 0.10;
            } else {
                precio += 0;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El precio total de la llamada es: " + precio + " euros");

    }
}
