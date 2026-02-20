import javax.swing.JOptionPane;

public class EjercicioVeintiseis {
    public static void main(String[] args) throws Exception {

        // Realiza un programa que pida el dí­a de la semana (del 1 al 7) y escriba el
        // dí­a correspondiente.
        // Si introducimos otro número nos da un error.

        String dia = JOptionPane.showInputDialog("Ingrese un día de la semana (1 al 7): ");

        int diaSemana = Integer.parseInt(dia);

        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "¡Es Lunes!");
                break;
            
            case 2:
                JOptionPane.showMessageDialog(null, "¡Es Martes!");
                break;
            
            case 3:
                JOptionPane.showMessageDialog(null, "¡Es Miércoles!");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "¡Es Jueves!");
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, "¡Es Viernes!");
                break;
                
            case 6:
                JOptionPane.showMessageDialog(null, "¡Es Sábado!");
                break;
                
            case 7:
                JOptionPane.showMessageDialog(null, "¡Es Domingo!");
                break;    

            default:
                JOptionPane.showMessageDialog(null, "ERROR. No existe un día asociado a ese número.");
                break;
        }

    }
}
