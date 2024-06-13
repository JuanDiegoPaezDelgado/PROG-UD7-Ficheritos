package net.salesianos.actividades.cuartoPunto.utilidad;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import net.salesianos.actividades.cuartoPunto.Mesa.Mesa;

public class GestorMesa {

    private static final String FICHERO = "src\\net\\salesianos\\actividades\\cuartoPunto\\CuartoPunto.txt";
    public static Scanner scanner = new Scanner(System.in);

    public static void guardarMesa(Mesa mesa) {
        List<Mesa> mesas = obtenerTodasLasMesas();
        mesas.add(mesa);

        try (ObjectOutputStream objectoutput = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
            objectoutput.writeObject(mesas);
        } catch (IOException e) {
            System.err.println("Error al guardar la mesa: " + e.getMessage());
        }
    }

    public static List<Mesa> obtenerTodasLasMesas() {
        List<Mesa> mesas = new ArrayList<>();
        try (ObjectInputStream objectinput = new ObjectInputStream(new FileInputStream(FICHERO))) {
            mesas = (List<Mesa>) objectinput.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el fichero, se creara uno al guardar la primera mesa.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer las mesas: " + e.getMessage());
        }
        return mesas;
    }
}
