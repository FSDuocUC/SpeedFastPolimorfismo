package model;

public class PedidoComida extends Pedido implements Despachable, Cancelable {
    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        return (int)(15 + 2 * distanciaKm);
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Repartidor especializado en comida asignado.");
    }

    @Override
    public void despachar() {
        System.out.println("Pedido de comida despachado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido de comida cancelado.");
    }
}
