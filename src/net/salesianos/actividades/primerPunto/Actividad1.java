package net.salesianos.actividades.primerPunto;

import java.io.FileWriter;
import java.io.IOException;
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
        
        String textoFormateado = texto.toUpperCase().replace(' ', '_');

        try (FileWriter escritura = new FileWriter("src/net/salesianos/actividades/primerPunto/punto1.txt")) {
           escritura.write(textoFormateado);
            escritura.close();
            System.out.println("Texto escrito correctamente");
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }
}
