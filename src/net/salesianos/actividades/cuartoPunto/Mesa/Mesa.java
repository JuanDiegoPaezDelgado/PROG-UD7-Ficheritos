package net.salesianos.actividades.cuartoPunto.Mesa;

import java.io.Serializable;

public class Mesa implements Serializable {
    private String color;
    private int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Mesa { color ='" + color + "', numeroPatas=" + numeroPatas + " }";
    }
}
