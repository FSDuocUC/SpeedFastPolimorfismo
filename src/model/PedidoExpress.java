package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        // Ejemplo: entrega rápida, base 10 min + 1 min por km
        return (int)(10 + distanciaKm);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("⚡ Pedido Express #" + idPedido +
                " | Dirección: " + direccionEntrega +
                " | Distancia: " + distanciaKm + " km" +
                " | Tiempo estimado: " + calcularTiempoEntrega() + " min");
    }
}
