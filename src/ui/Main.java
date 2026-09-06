package ui;

import concurrency.Repartidor;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Crear pedidos
        PedidoComida p1 = new PedidoComida(1, "Av. Principal 123", 5);
        PedidoEncomienda p2 = new PedidoEncomienda(2, "Calle Secundaria 456", 10);
        PedidoExpress p3 = new PedidoExpress(3, "Pasaje 789", 3);

        PedidoComida p4 = new PedidoComida(4, "Av. Libertad 321", 7);
        PedidoEncomienda p5 = new PedidoEncomienda(5, "Calle Norte 654", 12);
        PedidoExpress p6 = new PedidoExpress(6, "Pasaje Sur 987", 2);

        // Crear repartidores con listas de pedidos
        Repartidor r1 = new Repartidor("Carlos", Arrays.asList(p1, p2));
        Repartidor r2 = new Repartidor("Ana", Arrays.asList(p3, p4));
        Repartidor r3 = new Repartidor("Luis", Arrays.asList(p5, p6));

        // Ejecutar hilos en paralelo con ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(r1);
        executor.execute(r2);
        executor.execute(r3);

        executor.shutdown(); // Espera a que todos terminen
    }
}
