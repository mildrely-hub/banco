public class Main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Mildrely", 1000.0);
        GestorTransacciones gestor = new GestorTransacciones();

        System.out.println("--- Inicio de Movimientos ---");
        
        // 1. Depósito
        gestor.ejecutarOperacion(new ComandoDeposito(miCuenta, 500.0));
        
        // 2. Retiro
        gestor.ejecutarOperacion(new ComandoRetiro(miCuenta, 200.0));

        // 3. Deshacer el retiro (el dinero vuelve a la cuenta)
        System.out.println("\n--- Aplicando Deshacer (Undo) ---");
        gestor.reversarUltima();

        // 4. Deshacer el depósito (el dinero se retira)
        gestor.reversarUltima();
    }
}