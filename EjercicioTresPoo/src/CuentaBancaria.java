public class CuentaBancaria {

    private String numeroCuenta;
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public void consignar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Consignación exitosa. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0) {
            if (monto <= saldo) {
                saldo -= monto;
                System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("El monto debe ser mayor que cero.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("0012345", "Alexa Bedoya", 1000);

        cuenta1.consultarSaldo();
        cuenta1.consignar(500);
        cuenta1.retirar(300);
        cuenta1.retirar(2000); 
        cuenta1.consultarSaldo();
    }
}
