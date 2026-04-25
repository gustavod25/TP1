package unlar.edu.ar;

import unlar.edu.ar.biblioteca.Biblioteca;
import unlar.edu.ar.exception.*;
import unlar.edu.ar.objets.*;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();

        sistema.agregarLibro(new Libro("101", "Java", "JAlvarez", 2021, true));
        sistema.agregarLibro(new Libro("102", "Estructuras de Datos", "NN", 2019, true));
        sistema.agregarLibro(new Libro("103", "Matematicas", "Cespedes", 2008, true));
        sistema.agregarLibro(new Libro("104", "martin fierro", "fierro martin", 1994, true));
        sistema.agregarLibro(new Libro("105", "Algoritmos", "Messi", 2011, true));

        sistema.agregarEstudiante(new Estudiante("L001", "Juan Perez", "Sistemas", "juan@unlar.edu.ar"));
        sistema.agregarEstudiante(new Estudiante("L002", "Ana Lopez", "Medicina", "ana@unlar.edu.ar"));
        sistema.agregarEstudiante(new Estudiante("L003", "Luis Gomez", "Sistemas", "luis@unlar.edu.ar"));

        System.out.println("=== SISTEMA DE GESTION BIBLIOTECARIA UNLaR ===");
        System.out.println("==============================================");

        // Mostrar cantidad de Estudiantes y libros registrados
        System.out.println("\n--- Catalogo Registrado ---");
        System.out.println("Cantidad de Libros: " + sistema.getCantidadLibros());
        System.out.println("Cantidad de Estudiantes: " + sistema.getCantidadEstudiantes());

        // Prestamo registrado con exito
        System.out.println("\n--- Prestamo registrado con exito ---");
        try {
            sistema.registrarPrestamo("L001", "101");
            System.out.println("Libro: Java - JAlvarez");
            System.out.println("Para: Juan Perez Legajo: L001");
            System.out.println("Fecha: " + LocalDate.now());
        } catch (LibroNoDisponibleException e) {
            System.out.println("Aviso: El libro ya está ocupado.");
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

        // Reintentando el prestamo del mismo libro
        System.out.println("\n--- Reintentando el prestamo del mismo libro ---");
        try {
            sistema.registrarPrestamo("L002", "101");
        } catch (LibroNoDisponibleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

        // Prestamo a legajo inexistente
        System.out.println("\n--- Prestamo a legajo inexistente ---");
        try {
            sistema.registrarPrestamo("L999", "102");
        } catch (EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error genérico: " + e.getMessage());
        }

        // Multa calculada
        System.out.println("\n--- Multa calculada ---");
        double valorLibro = 1000.0;
        int diasRetraso = 15;
        double multaCalculada = sistema.calcularMulta(diasRetraso, valorLibro);
        System.out.println("Valor del libro: $" + valorLibro);
        System.out.println("Dias de retraso: " + diasRetraso);
        System.out.println("Multa calculada (1% por dia): $" + multaCalculada);

    }

}
