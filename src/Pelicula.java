public class Pelicula {


    public Genero genero;
    public String nombrePelicula;
    public String duracion;
    public Horario horario;
    public Restriccion restriccion;

    public Pelicula(Genero genero, String nombrePelicula, String duracion, Horario horario, Restriccion restriccion){
        this.genero = genero;
        this.nombrePelicula = nombrePelicula;
        this.duracion = duracion;
        this.horario = horario;
        this.restriccion = restriccion;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getDuracion() {
        return duracion;
    }

    public Horario getHorario() {
        return horario;
    }

    public Restriccion getRestriccion() {
        return restriccion;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public void setRestriccion(Restriccion restriccion) {
        this.restriccion = restriccion;
    }
}

// comentario



