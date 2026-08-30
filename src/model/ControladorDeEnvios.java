package model;

import java.util.ArrayList;

public class ControladorDeEnvios implements Rastreable {
    private ArrayList<String> historial = new ArrayList<>();

    public void registrarEntrega(String detalle) {
        historial.add(detalle);
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial de entregas:");
        for (String h : historial) {
            System.out.println("- " + h);
        }
    }
}
