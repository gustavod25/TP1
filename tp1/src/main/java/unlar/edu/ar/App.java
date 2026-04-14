package unlar.edu.ar;

import unlar.edu.ar.biblioteca.Biblioteca;
import unlar.edu.ar.exception.LibroNoDisponibleException;

public class App {
    public static void main(String[] args) {
        Biblioteca sistema = new Biblioteca();

        try {
            // 1. Aquí pones el código "peligroso" (el que puede lanzar exceptions)
            sistema.registrarPrestamo("L001", "101");
        } catch (LibroNoDisponibleException e) {
            // 2. Si ocurre ESE error específico, el programa salta aquí
            System.out.println("Aviso: El libro ya está ocupado.");
        } catch (Exception e) {
            // 3. Este es el 'salvavidas' para cualquier otro error no previsto
            System.out.println("Error genérico: " + e.getMessage());
        }

    }

}
