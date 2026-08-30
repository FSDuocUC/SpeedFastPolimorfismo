package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        PedidoComida comida = new PedidoComida(1, "Av. Central 123", 5);
        PedidoEncomienda encomienda = new PedidoEncomienda(2, "Calle Norte 456", 10);
        PedidoExpress express = new PedidoExpress(3, "Av. Sur 789", 3);

        ControladorDeEnvios controlador = new ControladorDeEnvios();

        // Asignación de repartidores
        comida.asignarRepartidor();
        encomienda.asignarRepartidor("Juan");
        express.asignarRepartidor();

        // Mostrar resumen y tiempos
        comida.mostrarResumen();
        System.out.println("Tiempo entrega: " + comida.calcularTiempoEntrega() + " min");

        encomienda.mostrarResumen();
        System.out.println("Tiempo entrega: " + encomienda.calcularTiempoEntrega() + " min");

        express.mostrarResumen();
        System.out.println("Tiempo entrega: " + express.calcularTiempoEntrega() + " min");

        // Despacho, cancelación e historial
        comida.despachar();
        encomienda.despachar();
        express.cancelar();

        controlador.registrarEntrega("Pedido comida entregado");
        controlador.registrarEntrega("Encomienda entregada");
        controlador.verHistorial();
    }
}