/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;
import ejercicio5.Ejercicio5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamenFinal {

    static Ejercicio1 ej1 = new Ejercicio1();
    static Ejercicio2 ej2 = new Ejercicio2();
    static Ejercicio3 ej3 = new Ejercicio3();
    static Ejercicio4 ej4 = new Ejercicio4();
    static Ejercicio5 ej5 = new Ejercicio5();

    public ExamenFinal() {
    }

    public static void main(String[] args) throws IOException {
        menu();
    }

    /**
     * Método principal que muestra el menú de ejercicios, permite al usuario
     * seleccionar una opción y ejecuta la función correspondiente al ejercicio
     * seleccionado.
     *
     * @param args Los argumentos de la línea de comandos (no utilizados en este
     * caso).
     */
    public static void menu() throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;

        System.out.println("=== Menú de Ejercicios ===");
        System.out.println("1. Recursividad - N-ésimo término de Fibonacci");
        System.out.println("2. Manejo Dinámico de la Memoria - Registro de"
                + " Clientes");
        System.out.println("3. Archivos - Valor total del Inventario");
        System.out.println("4. Polimorfismo, Herencia y Clases Abstractas -"
                + " Vehículos");
        System.out.println("5. Interfaces - Conexión de Red");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");

        try {
            opcion = Integer.parseInt(br.readLine());
        } catch (IOException iOException) {
            menu();
        } catch (NumberFormatException numberFormatException) {
            System.out.println("No ingreso una opción valida");
            menu();
        }

        switch (opcion) {
            case 1:
                // Ejercicio de Recursividad
               ej1.calcularFibonacci();
                 menu();
                break;

            case 2:
                // Ejercicio de Manejo Dinámico de la Memoria
                ej2.gestionarClientes();
                  menu();
                 
                break;

            case 3:
                // Ejercicio de Archivos
                ej3.calcularValorInventario();
                 menu();
                break;

            case 4:
                // Ejercicio de Polimorfismo, Herencia y Clases Abstractas
                ej4.probarVehiculos();
                 menu();
                break;

            case 5:
                // Ejercicio de Interfaces
                ej5.probarConexionRed();
                 menu();
                break;

            case 0:
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;

            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                break;
        }

        br.close();
    }

    // Métodos de los ejercicios
}
