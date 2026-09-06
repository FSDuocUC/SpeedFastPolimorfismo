package model;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        // Ejemplo: tiempo base 20 min + 2 min por km
        return (int)(20 + distanciaKm * 2);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("📦 Pedido Encomienda #" + idPedido +
                " | Dirección: " + direccionEntrega +
                " | Distancia: " + distanciaKm + " km" +
                " | Tiempo estimado: " + calcularTiempoEntrega() + " min");
    }
}
