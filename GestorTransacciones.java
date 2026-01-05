import java.util.Stack;

public class GestorTransacciones {
    private Stack<Transaccion> historial = new Stack<>();

    public void ejecutarOperacion(Transaccion transaccion) {
        transaccion.ejecutar();
        historial.push(transaccion);
    }

    public void reversarUltima() {
        if (!historial.isEmpty()) {
            Transaccion ultima = historial.pop();
            System.out.print("Reversando operacion: ");
            ultima.deshacer();
        } else {
            System.out.println("No hay nada que deshacer.");
        }
    }
}