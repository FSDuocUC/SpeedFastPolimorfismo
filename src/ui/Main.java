package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        PedidoComida comida = new PedidoComida(1, "Av. Principal 123");
        PedidoEncomienda encomienda = new PedidoEncomienda(2, "Calle Secundaria 456");
        PedidoExpress express = new PedidoExpress(3, "Plaza Central 789");

        // Métodos sobrescritos
        comida.asignarRepartidor();
        encomienda.asignarRepartidor();
        express.asignarRepartidor();

        // Metodos sobrecargados
        comida.asignarRepartidor("Carlos");
        encomienda.asignarRepartidor("Ana");
        express.asignarRepartidor("Luis");
    }
}
