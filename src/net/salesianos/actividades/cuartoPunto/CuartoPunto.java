package net.salesianos.actividades.cuartoPunto;

import java.util.List;
import java.util.Scanner;

import net.salesianos.actividades.cuartoPunto.Mesa.Mesa;
import net.salesianos.actividades.cuartoPunto.utilidad.GestorMesa;
import net.salesianos.actividades.cuartoPunto.utilidad.Menu;

public class CuartoPunto {
     public static void main(String[] args) {
        Scanner scanner = GestorMesa.scanner;
        while (true) {
            Menu.mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el color de la mesa: ");
                    String color = scanner.nextLine();
                    System.out.print("Introduce el número de patas: ");
                    int numeroPatas = scanner.nextInt(); 
                    Mesa nuevaMesa = new Mesa(color, numeroPatas);
                    GestorMesa.guardarMesa(nuevaMesa);
                    System.out.println("Mesa guardada.");
                    break;
                case 2:
                    List<Mesa> mesas = GestorMesa.obtenerTodasLasMesas();
                    if (mesas.isEmpty()) {
                        System.out.println("No hay mesas almacenadas.");
                    } else {
                        for (Mesa mesa : mesas) {
                            System.out.println(mesa);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
            
        }
        
        
    }
}
