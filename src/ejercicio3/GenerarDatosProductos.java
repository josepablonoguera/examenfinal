/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author pablonoguera
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;

public class GenerarDatosProductos {

    public static void main(String[] args) {
        String nombreArchivo = "datos.txt";

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {

            writer.write("Nombre,Precio,CantidadEnStock\n");

            for (int i = 1; i <= 500; i++) {
                String nombreProducto = "Producto " + i;
                double precio = generarPrecioAleatorio(10, 100);
                int cantidadEnStock = generarCantidadAleatoria(1, 100);

                writer.write(nombreProducto + "," + formatoDosDecimales(precio) + "," + cantidadEnStock + "\n");
            }

            System.out.println("Archivo generado con éxito: " + nombreArchivo);

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static double generarPrecioAleatorio(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    private static int generarCantidadAleatoria(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
      private static String formatoDosDecimales(double numero) {
        DecimalFormat formato = new DecimalFormat("#.##");
        return formato.format(numero);
    }
}
