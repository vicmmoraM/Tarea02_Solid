package Repositorio2.Solucion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaComprador {
    public static List<Comprador> cargarCompradores(String rutaArchivo) {
        List<Comprador> compradores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Comprador comprador = new Comprador(datos[0], datos[1], datos[2]);
                compradores.add(comprador);
            }
        } catch (IOException e) {
            System.err.println("Error al cargar compradores: " + e.getMessage());
        }
        return compradores;
    }

    public static void guardarCompradores(List<Comprador> compradores, String rutaArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (Comprador comprador : compradores) {
                bw.write(comprador.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar compradores: " + e.getMessage());
        }
    }
}
