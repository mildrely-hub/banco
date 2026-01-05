public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depositando $" + monto + ". Saldo actual: $" + saldo);
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retirando $" + monto + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente para retirar $" + monto);
        }
    }

    public double getSaldo() { return saldo; }
    public String getTitular() { return titular; }
}