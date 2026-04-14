package unlar.edu.ar;

import unlar.edu.ar.biblioteca.Biblioteca;
import unlar.edu.ar.exception.*;
import unlar.edu.ar.objets.*;

public class App {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();

        sistema.agregarLibro(new Libro("101", "Java", "JAlvarez", 2021, true));
        sistema.agregarLibro(new Libro("102", "Estructuras de Datos", "NN", 2019, true));
        sistema.agregarLibro(new Libro("103", "Matematicas", "Cespedes", 2008, true));
        sistema.agregarLibro(new Libro("104", "martin fierro", "fierro martin", 1994, true));
        sistema.agregarLibro(new Libro("105", "Algoritmos", "Messi", 2011, true));

        sistema.agregarEstudiante(new Estudiante("L001", "Juan Perez", "Sistemas", "juan@u.edu"));
        sistema.agregarEstudiante(new Estudiante("L002", "Ana Lopez", "Sistemas", "ana@u.edu"));
        sistema.agregarEstudiante(new Estudiante("L003", "Luis Gomez", "Sistemas", "luis@u.edu"));

        System.out.println("=== SISTEMA DE GESTION BIBLIOTECARIA UNLaR ===");

        try {
            sistema.registrarPrestamo("L001", "101");
        } catch (LibroNoDisponibleException e) {
            System.out.println("Aviso: El libro ya está ocupado.");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }
        try {
            System.out.println("\n--- Prueba: Libro no disponible ---");
            sistema.registrarPrestamo("L002", "101");
        } catch (LibroNoDisponibleException e) {
            System.out.println("Capturada: " + e.getMessage());
        } catch (Exception e) {
            /* ... */ }

        sistema.buscarLibro("Clean");

        System.out.println("\n--- Prueba de Multa (15 días de retraso) ---");
        double multaTotal = sistema.calcularMulta(15, 5000.0);
        System.out.println("Valor del libro: $5000");
        System.out.println("Monto de la multa: $" + multaTotal);

    }

}
