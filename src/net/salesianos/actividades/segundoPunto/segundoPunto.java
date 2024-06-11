package net.salesianos.actividades.segundoPunto;

import java.io.FileWriter;
import java.io.IOException;

public class segundoPunto {
    public static void main(String[] args) {
        String texto = "Hola, pibe.";
        String ruta = "src\\net\\salesianos\\actividades\\segundoPunto\\segundoPunto.txt";
        try (FileWriter writer = new FileWriter(ruta)) {
            writer.write(texto);
            System.out.println("Texto guardado en el fichero.");
            writer.close();
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo");
        }
    }
}
