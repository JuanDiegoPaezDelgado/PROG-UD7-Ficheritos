package net.salesianos.actividades.tercerPunto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import net.salesianos.actividades.tercerPunto.utilidad.Lector;

public class TercerPunto {
        public static void main(String[] args) {
        String ruta1 = "src\\net\\salesianos\\actividades\\primerPunto\\punto1.txt";
        String ruta2 = "src\\net\\salesianos\\actividades\\segundoPunto\\segundoPunto.txt";
        String fichero1 = Lector.leerFichero(ruta1);
        String fichero2 = Lector.leerFichero(ruta2);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\net\\salesianos\\actividades\\tercerPunto\\TercerPunto.txt"))) {
            writer.write("Contenido del Fichero Uno: " + fichero1 + "\n");
            writer.write("Contenido del Fichero Dos: " + fichero2 + "\n");
            writer.write("fichero modificado por william y juan diego");
            System.out.println("Contenido fusionado y guardado en el fichero.");
        } catch (IOException e) {
            System.out.println("ERROR: Problema de I/O.");
        }
    }

}
