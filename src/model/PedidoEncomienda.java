package model;

public class PedidoEncomienda extends Pedido implements Despachable, Rastreable {
    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(20 + 1.5 * distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Repartidor de encomiendas asignado.");
    }

    @Override
    public void despachar() {
        System.out.println("Encomienda despachada.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial de encomiendas mostrado.");
    }
}
