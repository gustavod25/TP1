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
public boolean equals(Object o) {
Prestamo otro = (Prestamo) o;
return this.libro.getIsbn().equals(otro.libro.getIsbn()) &&
this.estudiante.getLegajo().equals(otro.estudiante.getLegajo());
}


}
