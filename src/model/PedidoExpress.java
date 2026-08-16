package model;

public class PedidoExpress extends Pedido {
    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Compra Express");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido express " + idPedido + ": asignar repartidor más cercano y disponible.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido express " + idPedido + " (disponibilidad inmediata).");
    }
}
