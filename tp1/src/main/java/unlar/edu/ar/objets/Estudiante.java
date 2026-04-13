package unlar.edu.ar.objets;

public class Estudiante {
    private String legajo, nombre, carrera, email;

    public Estudiante(String legajo, String nombre, String carrera, String email) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.email = email;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getEmail() {
        return email;
    }

    public String getLegajo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLegajo'");
    }

}
