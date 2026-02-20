import javax.swing.JOptionPane;

public class EjercicioTreintaYCuatro {
    public static void main(String[] args) throws Exception {
        
        // Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. 
        // Realice un algoritmo para determinar el sueldo semanal de N trabajadores y, 
        // además, calcule cuánto pagó la empresa por los N empleados.
        

        String numeroTrabajadores = JOptionPane.showInputDialog("Ingrese el número de trabajadores: ");
        int numTrabajadores = Integer.parseInt(numeroTrabajadores);
        double totalPagado = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            JOptionPane.showMessageDialog(null, "\nTrabajador " + i);

            String hora = JOptionPane.showInputDialog("Ingrese las horas trabajadas: ");
            double horas = Double.parseDouble(hora); 

            String pagoHora = JOptionPane.showInputDialog("Ingrese el pago por hora: ");
            double pagoPorHora = Double.parseDouble(pagoHora);

            double sueldo = horas * pagoPorHora;

            JOptionPane.showMessageDialog(null, "Sueldo semanal: $ " + sueldo);

            totalPagado += sueldo;
        }
    
            JOptionPane.showMessageDialog(null, "El sueldo total pagado por la empresa: $ " + totalPagado);
    }
}

