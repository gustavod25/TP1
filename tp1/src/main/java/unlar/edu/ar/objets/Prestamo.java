package unlar.edu.ar.objets;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;

    private Estudiante estudiante;

    private LocalDate fechaPrestamo;

    public Prestamo(Libro l, Estudiante e, LocalDate fechaPrestamo) {
        this.libro = l;
        this.estudiante = e;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    @Override
    public int hashCode() {
        return (libro.getIsbn() + estudiante.getLegajo()).hashCode();
    }

    @Override
    public String toString() {
        return "Prestamo: " + libro.getTitulo() + " a " + estudiante.getLegajo();
    }
}
