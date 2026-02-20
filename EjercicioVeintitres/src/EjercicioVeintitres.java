import javax.swing.JOptionPane;

public class EjercicioVeintitres {
    public static void main(String[] args) throws Exception {

        // La asociación de vinicultores tiene como política fijar un precio inicial al
        // kilo de uva,
        // la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
        // Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño,
        // se requiere determinar cuánto recibirá un productor por la uva que entrega en
        // un
        // embarque, considerando lo siguiente:

        // Si es de tipo A, se le cargarán 20 céntimos al precio inicial cuando es de
        // tamaño 1; y 30
        // céntimos si es de tamaño 2.
        // Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50
        // céntimos cuando es de tamaño 2.
        // Realice un algoritmo para determinar la ganancia obtenida.

        String pInicial = JOptionPane.showInputDialog("Ingrese el valor del precio inicial por kilo: ");
        String tipoUva = JOptionPane.showInputDialog("Ingrese el tipo de uva (A o B): ");
        String uvaTa = JOptionPane.showInputDialog("Ingrese el tamaño de uva (1 o 2): ");
        String canti = JOptionPane.showInputDialog("Ingrese la cantidad de kilos a llevar: ");

        Double precioInicial = Double.parseDouble(pInicial);
        Double tamanoUva = Double.parseDouble(uvaTa);
        Double cantidadUva = Double.parseDouble(canti);
        Double total = 0.0;

        if (tipoUva.equalsIgnoreCase("A")) {
            if (tamanoUva == 1) {
                total = (precioInicial + 0.20) * cantidadUva;
                JOptionPane.showMessageDialog(null, "La ganancia obtenida es: " + total);

            } else if (tamanoUva == 2) {
                total = (precioInicial + 0.30) * cantidadUva;
                JOptionPane.showMessageDialog(null, "La ganancia obtenida es: " + total);

            } else {
                JOptionPane.showMessageDialog(null, "Usted ha seleccionado un tamaño de uvas incorrecto.");
            }
        } else if (tipoUva.equalsIgnoreCase("B")) {
            if (tamanoUva == 1) {
                total = (precioInicial - 0.30) * cantidadUva;
                JOptionPane.showMessageDialog(null, "La ganancia obtenida es: " + total);
            } else if (tamanoUva == 2) {
                total = (precioInicial - 0.50) * cantidadUva;
                JOptionPane.showMessageDialog(null, "La ganancia obtenida es: " + total);
            } else {
                JOptionPane.showMessageDialog(null, "Usted ha seleccionado un tamaño de uvas incorrecto.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usted ha seleccionado un tipo de uvas incorrecto.");
        }

    }
}
