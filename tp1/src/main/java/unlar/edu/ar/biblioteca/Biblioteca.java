package unlar.edu.ar.biblioteca;

import java.time.LocalDate;
import java.util.*;

import unlar.edu.ar.exception.*;
import unlar.edu.ar.objets.*;

public class Biblioteca {
    private List<Libro> catalogo = new Arraylist<>();// es una lista de libros
    private Map<String, estudiante> estudiantes = new HashMap<>();// obtenemos el hash del estudiante
    private set<Prestamo> prestamosActivos = new HashSet<>();// hash del pretamo

    public void agregarLibro(Libro l) {
        catalogo.add(l);
    } // agregas libros

    public void agregarEstudiante(Estudiante e) {
        estudiantes.put(e.getLegajo(), e);
    }// usamos el numero de legajo para guardar al pibe

    public void registrarPrestamo(String legajo, String isbn)
            throws EstudianteNoEncontradoException, LibroNoDisponibleException,
            LimitePrestamosExcedidoException {

        Estudiante est = estudiantes.get(legajo);
        if (est == null)
            throw new EstudianteNoEncontradoException("Legajo " + legajo + " no existe.");

        Libro lib = null;
        for (Libro l : catalogo) {
            if (l.getIsbn().equals(isbn)) {
                lib = l;
                break;
            }
        }
        if (lib == null || !lib.isDisponible()) {
            throw new LibroNoDisponibleException("No disponible.");
        }

        long contador = 0;
        for (Prestamo p : prestamosActivos) {
            if (p.getEstudiante().getLegajo().equals(legajo))
                contador++;
        }
        if (contador >= 3) {
            throw new LimitePrestamosExcedidoException("Máximo 3 libros.");
        }

        prestamosActivos.add(new Prestamo(lib, est, LocalDate.now()));
        lib.setDisponible(false);

    public double calcularMulta(int diasRetraso, double valorLibro) {

        if (diasRetraso <= 0) return 0;
        if (diasRetraso > 30) return calcularMulta(30, valorLibro);
        return (valorLibro * 0.01) + calcularMulta(diasRetraso - 1, valorLibro);
    }


   public void buscarLibro(String parteTitulo) {
        System.out.println("\nResultados para: " + parteTitulo);
        for (Libro l : catalogo) {
            if (l.getTitulo().toLowerCase().contains(parteTitulo.toLowerCase())) {
                System.out.println("- " + l.toString());
            }
        }
    }  


    }

}
