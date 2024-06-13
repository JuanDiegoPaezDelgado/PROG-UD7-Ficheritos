package net.salesianos.actividades.tercerPunto.utilidad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
    public static String leerFichero(String ruta) {
        String contenido = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea != null) {
                    contenido = linea + "\n";
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: Problema de I/O.");
        }
        return contenido;
    }
}
