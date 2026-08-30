package model;

public class PedidoExpress extends Pedido implements Despachable, Cancelable, Rastreable {
    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return distanciaKm > 5 ? 15 : 10;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Repartidor express asignado.");
    }

    @Override
    public void despachar() {
        System.out.println("Pedido express despachado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido express cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial de pedidos express mostrado.");
    }
}

