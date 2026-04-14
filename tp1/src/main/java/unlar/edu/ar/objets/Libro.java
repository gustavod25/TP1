package unlar.edu.ar.objets;

public class Libro {
    private String isbn, titulo, autor;
    private int anio;
    private boolean disponible;

    public Libro(String isbn, String titulo, String autor, int anio, boolean disponible) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean d) {
        this.disponible = d;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " [" + isbn + "] - " + (disponible ? "Disponible" : "Prestado");
    }
}
