package net.salesianos.actividades.primerPunto;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        do {
            System.out.println("Introduce un texto de minimo 30 caracteres");
            texto = scanner.nextLine();
            if (texto.length() < 30) {
                System.out.println("Te hacen falta " + (30 - texto.length()) + " caracteres mas");
            }
        } while (texto.length() < 30);

        scanner.close();
    }
}
