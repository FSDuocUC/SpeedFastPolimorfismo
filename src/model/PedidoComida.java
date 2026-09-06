package model;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        // Ejemplo: tiempo = distancia * 5 minutos
        return (int)(distanciaKm * 5);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("🍔 Pedido Comida #" + idPedido +
                " | Dirección: " + direccionEntrega +
                " | Distancia: " + distanciaKm + " km" +
                " | Tiempo estimado: " + calcularTiempoEntrega() + " min");
    }
}
