import javax.swing.JOptionPane;

public class EjercicioNueve {
    public static void main(String[] args) throws Exception {

        // Una tienda ofrece un descuento del 15% sobre el total de la compra y un
        // cliente desea saber cuanto deberá pagar finalmente por su compra.

        
        String compra = JOptionPane.showInputDialog("Ingrese el valor de la compra: ");

        Double valorCompra = Double.parseDouble(compra);
        Double descuento = valorCompra*0.15;


        JOptionPane.showMessageDialog(null, "Subtotal: " + valorCompra + ". \n" + "Descuento: " + descuento + ". \n" 
            + "Total Compra: " + (valorCompra - descuento)
        );

    }
}
