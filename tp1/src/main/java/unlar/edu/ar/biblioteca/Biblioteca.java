package unlar.edu.ar.biblioteca;

import unlar.edu.ar.objets.Estudiante;

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

}
