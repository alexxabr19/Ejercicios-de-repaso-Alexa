import javax.swing.JOptionPane;

public class EjercicioOcho {
    public static void main(String[] args) throws Exception {

        // Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus
        // ventas, el vendedor desea saber cuanto dinero obtendrá por concepto de
        // comisiones por las tres ventas que realiza en el mes y el total que recibirá
        // en el mes tomando en cuenta su sueldo base y comisiones.

        String sueldo = JOptionPane.showInputDialog("Ingrese el valor del sueldo base: ");
        String primerVenta = JOptionPane.showInputDialog("Ingrese el valor de la primera venta: ");
        String segundaVenta = JOptionPane.showInputDialog("Ingrese el valor de la segunda venta: ");
        String tercerVenta = JOptionPane.showInputDialog("Ingrese el valor de la tercera venta: ");

        Double sueldoBase = Double.parseDouble(sueldo);
        Double ventaUno = Double.parseDouble(primerVenta);
        Double ventaDos = Double.parseDouble(segundaVenta);
        Double ventaTres = Double.parseDouble(tercerVenta);

        Double sueldoFinal = sueldoBase + (ventaUno + ventaUno * 0.1) + (ventaDos + ventaDos * 0.1)
                + (ventaTres + ventaTres * 0.1);

        JOptionPane.showMessageDialog(null, "El sueldo total es: " + sueldoFinal + ". \n" +
                "La primera venta tuvo un valor de: " + ventaUno + ", y la comisión ganada fue de: " + ventaUno * 0.1
                + ". \n"
                + "La segunda venta tuvo un valor de: " + ventaDos + ", y la comisión ganada fue de: " + ventaDos * 0.1
                + ". \n" 
                + "La tercera venta tuvo un valor de: " + ventaTres + ", y la comisión ganada fue de: " + ventaTres * 0.1 + ".");

    }
}
