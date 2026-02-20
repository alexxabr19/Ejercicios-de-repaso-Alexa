import javax.swing.JOptionPane;

public class EjercicioVeinticuatro {
    public static void main(String[] args) throws Exception {
        // El director de una escuela está organizando un viaje de estudios y requiere
        // determinar
        // cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes
        // por el servicio.
        // La forma de cobrar es la siguiente:

        // si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
        // de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros,
        // y si son menos de 30, el costo de la renta del autobús es de 4000 euros,
        // sin importar el número de alumnos.
        // Realice un algoritmo que permita determinar el pago a la compañía de
        // autobuses
        // y lo que debe pagar cada alumno por el viaje.

        String cAlumnos = JOptionPane.showInputDialog("Ingrese la cantidad de alumnos ");
        int cantidadAlumnos = Integer.parseInt(cAlumnos);
        double costoAlumno = 0.0;
        double totalPagar = 0.0;

        if (cantidadAlumnos >= 100) {
            costoAlumno = 65;
            totalPagar = cantidadAlumnos * costoAlumno;
            JOptionPane.showMessageDialog(null, "El pago total a la compañía de viajes es: " + totalPagar + " euros.\n"
                    + " El precio por cada alumno es: " + costoAlumno + " euros.");
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
            costoAlumno = 70;
            totalPagar = cantidadAlumnos * costoAlumno;
            JOptionPane.showMessageDialog(null, "El pago total a la compañía de viajes es: " + totalPagar + " euros.\n"
                    + " El precio por cada alumno es: " + costoAlumno + " euros.");
        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
            costoAlumno = 95;
            totalPagar = cantidadAlumnos * costoAlumno;
            JOptionPane.showMessageDialog(null, "El pago total a la compañía de viajes es: " + totalPagar + " euros.\n"
                    + " El precio por cada alumno es: " + costoAlumno + " euros.");
        } else {
            costoAlumno = 4000 / cantidadAlumnos;
            totalPagar = cantidadAlumnos * costoAlumno;
            JOptionPane.showMessageDialog(null, "El pago total a la compañía de viajes es: " + totalPagar + " euros.\n"
                    + " El precio por cada alumno es: " + costoAlumno + " euros.");
        }

    }
}
