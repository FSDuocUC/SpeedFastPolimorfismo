package model;

public abstract class Pedido {
    protected int idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    public Pedido(int idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("Pedido #" + idPedido + " → Dirección: " + direccionEntrega + ", Distancia: " + distanciaKm + " km");
    }

    public abstract int calcularTiempoEntrega();

    // Polimorfismo: sobrecarga y sobrescritura
    public void asignarRepartidor() {
        System.out.println("Repartidor asignado automáticamente.");
    }

    public void asignarRepartidor(String nombre) {
        System.out.println("Repartidor asignado manualmente: " + nombre);
    }
}
