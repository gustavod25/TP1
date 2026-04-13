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

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

}
