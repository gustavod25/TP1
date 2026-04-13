package unlar.edu.ar.objets;

import java.time.LocalDate;

public class Prestamo {
private Libro libro;

private Estudiante estudiante;

private LocalDate fechaPrestamo;

public Prestamo(Libro libro, Estudiante estudiante, LocalDate fechaPrestamo) {
    this.libro = libro;
    this.estudiante = estudiante;
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







}
