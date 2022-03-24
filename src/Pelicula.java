public class Pelicula {

    private Genero genero;
    private String nombrePelicula;
    private String duracion;
    private Horario horario;
    private int restriccion;
    private Calidad calidad;

    Pelicula(Genero genero, String nombrePelicula, String duracion, Horario horario, int restriccion, Calidad calidad) {
        this.genero = genero;
        this.nombrePelicula = nombrePelicula;
        this.duracion = duracion;
        this.horario = horario;
        this.restriccion = restriccion;
        this.calidad = calidad;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }


    public Calidad getCalidad() {
        return calidad;
    }
}

