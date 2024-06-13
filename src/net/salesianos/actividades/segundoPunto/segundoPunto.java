package net.salesianos.actividades.segundoPunto;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class segundoPunto {
    public static void main(String[] args) {
        String texto = "Hola, pibe.";

        try (FileWriter writer = new FileWriter("src\\Segundo\\segundo.txt");FileReader entrada = new FileReader("src\\Segundo\\segundo.txt")) {
            writer.write(texto);
            System.out.println("Texto guardado en el fichero.");
            writer.close();
            
            String resultado = "";
            int c;
            while ((c = entrada.read()) != -1) {
                char letra = (char) c;
                resultado += letra + "_" + c + ", ";
            }

            System.out.println(resultado.substring(0, resultado.length() - 2) + ".");
            entrada.close();
        } catch (IOException e) {
            System.out.println("Error");
        
        }
        
    }
}
