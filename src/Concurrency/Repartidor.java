package concurrency;

import model.Pedido;
import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {
    private String nombre;
    private List<Pedido> pedidos;
    private Random random = new Random();

    public Repartidor(String nombre, List<Pedido> pedidos) {
        this.nombre = nombre;
        this.pedidos = pedidos;
    }

    @Override
    public void run() {
        System.out.println("🚴 Repartidor " + nombre + " inicia sus entregas...");
        for (Pedido pedido : pedidos) {
            try {
                System.out.println("➡️ " + nombre + " entregando pedido " + pedido.getIdPedido() +
                        " a " + pedido.getDireccionEntrega());
                Thread.sleep(1000 + random.nextInt(2000)); // Simula tiempo aleatorio
                System.out.println("✅ " + nombre + " completó entrega de pedido " + pedido.getIdPedido());
            } catch (InterruptedException e) {
                System.out.println("⚠️ " + nombre + " fue interrumpido durante la entrega.");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("🏁 Repartidor " + nombre + " terminó todas sus entregas.");
    }
}
