import javax.swing.JOptionPane;

public class EjercicioOnce {
    public static void main(String[] args) throws Exception {

        // Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos
        // puntos en el plano. Calcula y muestra la distancia entre ellos.

        String coordenadaX1 = JOptionPane.showInputDialog("Ingrese el valor de x1: ");
        String coordenadaY1 = JOptionPane.showInputDialog("Ingrese el valor de y1: ");
        String coordenadaX2 = JOptionPane.showInputDialog("Ingrese el valor de x2: ");
        String coordenadaY2 = JOptionPane.showInputDialog("Ingrese el valor de y2: ");

        Double xUno = Double.parseDouble(coordenadaX1);
        Double yUno = Double.parseDouble(coordenadaY1);
        Double xDos = Double.parseDouble(coordenadaX2);
        Double yDos = Double.parseDouble(coordenadaY2);

        Double distancia = Math.sqrt((Math.pow(xDos - xUno, 2)) + (Math.pow(yDos - yUno, 2)));

        JOptionPane.showMessageDialog(null, "La distancia entre los puntos es: " + distancia);

    }
}
