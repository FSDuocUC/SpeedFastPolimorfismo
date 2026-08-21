package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Pedido comida = new PedidoComida(1, "Av. Principal 123", 3);
        Pedido encomienda = new PedidoEncomienda(2, "Calle Secundaria 456", 10);
        Pedido express = new PedidoExpress(3, "Pasaje Rápido 789", 7);

        comida.mostrarResumen();
        System.out.println("Tiempo estimado: " + comida.calcularTiempoEntrega() + " min\n");

        encomienda.mostrarResumen();
        System.out.println("Tiempo estimado: " + encomienda.calcularTiempoEntrega() + " min\n");

        express.mostrarResumen();
        System.out.println("Tiempo estimado: " + express.calcularTiempoEntrega() + " min\n");
    }
}
