package unlar.edu.ar.biblioteca;

import java.util.*;

import unlar.edu.ar.objets.*;

public class Biblioteca {

    private List<Libro> catalogo = new ArrayList<>();
    private Map<String, Estudiante> estudiantes = new HashMap<>();
    private Set<Prestamo> prestamosActivos = new HashSet<>();

    public void agregarLibro(Libro l) {
        catalogo.add(l);
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.put(e.getLegajo(), e);
    }

}
