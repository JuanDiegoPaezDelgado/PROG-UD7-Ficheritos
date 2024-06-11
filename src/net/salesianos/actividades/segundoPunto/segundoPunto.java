package net.salesianos.actividades.segundoPunto;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class segundoPunto {
    public static void main(String[] args) {
        String texto = "Hola, pibe.";
        String rutaEscritura = "src\\net\\salesianos\\actividades\\segundoPunto\\segundoPunto.txt";
        try (FileWriter writer = new FileWriter(rutaEscritura)) {
            writer.write(texto);
            System.out.println("Texto guardado en el fichero.");
            writer.close();
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo");
        }

        String rutaLectura = "src\\net\\salesianos\\actividades\\segundoPunto\\segundoPunto.txt";
        try (FileReader entrada = new FileReader(rutaLectura)) {
            int c;
            while ((c = entrada.read()) != -1) {
                char letra = (char) c;
                System.out.print(letra + "_" + c);
                c = entrada.read();
                if (c != -1) {
                    System.out.print(", ");
                }
            }

            entrada.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
