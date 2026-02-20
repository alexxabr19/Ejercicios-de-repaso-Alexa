import javax.swing.JOptionPane;

public class EjercicioTrece {
    public static void main(String[] args) throws Exception {

        // Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados
        // por una distancia d. El que está detrás viaja a una velocidad mayor. Se pide
        // hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y
        // sus respectivas velocidades (km/h) y con esto determinar y mostrar en que
        // tiempo (minutos) alcanzará el vehículo más rápido al otro.

        String v1 = JOptionPane.showInputDialog("Ingrese la velocidad del primer vehículo (km/h): ");
        String v2 = JOptionPane.showInputDialog("Ingrese la velocidad del segundo vehículo (km/h): ");
        String d = JOptionPane.showInputDialog("Ingrese la distancia entre los dos vehículos (km): ");

        Double velocidadRapido = Double.parseDouble(v1);
        Double velocidadLento = Double.parseDouble(v2);
        Double distancia = Double.parseDouble(d);

        if (velocidadRapido <= velocidadLento) {
            JOptionPane.showMessageDialog(null, "El vehículo que va más rápido no alcanzará al otro");
        } else {
            Double velocidadRelativa = velocidadRapido - velocidadLento;
            Double tiempoHoras = distancia / velocidadRelativa;
            Double tiempoMinutos = tiempoHoras * 60;
            JOptionPane.showMessageDialog(null, "El vehículo que va más rápido alcanzará al otro en: " + tiempoMinutos + " minutos.");

        }
    }
}

