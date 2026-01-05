class ComandoDeposito implements Transaccion {
    private CuentaBancaria cuenta;
    private double monto;

    public ComandoDeposito(CuentaBancaria cuenta, double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }

    @Override
    public void ejecutar() { cuenta.depositar(monto); }

    @Override
    public void deshacer() { cuenta.retirar(monto); }
}