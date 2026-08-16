package model;

public class PedidoEncomienda extends Pedido {
    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Pedido de encomienda " + idPedido + ": validar peso y embalaje antes de asignar.");
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor " + nombreRepartidor + " asignado al pedido de encomienda " + idPedido + " (validar peso y embalaje).");
    }
}
