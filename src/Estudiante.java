public class Estudiante {

    private String nombre;
    private int edad;
    private double notaMedia;
    private boolean estadoMatricula;

    public Estudiante(String nombre, int edad, double notaMedia, boolean estadoMatricula) {
        setNombre(nombre);
        setEdad(edad);
        setNotaMedia(notaMedia);
        setEstadoMatricula(estadoMatricula);
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

    }

    //Edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    //Nota Media
    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {

        if (notaMedia < 0 || notaMedia > 10) {
            throw new IllegalArgumentException("La nota debe ser entre 0 y 10");
        }
        this.notaMedia = notaMedia;
    }

    //Estado Matrícula
    public boolean isEstadoMatricula() {
        return estadoMatricula;
    }

    public void setEstadoMatricula(boolean estadoMatricula) {
        this.estadoMatricula = estadoMatricula;
    }
}
