public class Pelicula {

    private Genero genero;
    private String nombrePelicula;
    private String duracion;
    private Horario horario;
    private int  restriccion;
    private Calidad calidad;
    Pelicula(Genero genero, String nombrePelicula, String duracion, Horario horario, int restriccion, Calidad calidad){
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

    public String getDuracion() {
        return duracion;
    }

    public Horario getHorario() {
        return horario;
    }

    public int  getRestriccion() {
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

    public void setRestriccion(int  restriccion) {
        this.restriccion = restriccion;
    }

    public Calidad getCalidad() {
        return calidad;
    }
}

// comentario

/*
Ejemplo Cartelera Semana 1

Sala     Horario              Lu                Ma                  Mi              Ju              Vi              Sa
1        M              Jurassic World       El Rey Leon
         T                El Rey Leon       Los Vengadores
         P              Los Vengadores       El Mago de Oz
         N                El Padrino            Batman

2        M                  Batman          Jurassic World
         T                Casa Blanca         El Rey Leon
         P               Jurassic World     Los Vengadores
         N                 Mago de Oz         El Padrino

3        M               El Mago de Oz         Batman           Jurassic World
         T                El Rey Leon        Casa Blanca          El Rey Leon
         P              Los Vengadores      Jurassic World      Los Vengadores
         N                El Padrino          Mago de Oz          El Padrino

4        M               Casa Blanca         El Mago de Oz         Batman
         T              El Mago de Oz         El Rey Leon        Casa Blanca
         P                  Batman          Los Vengadores      Jurassic World
         N              Jurassic World        El Padrino          Mago de Oz

5        M               El Padrino          Casa Blanca         El Mago de Oz
         T              Los Vengadores      El Mago de Oz         El Rey Leon
         P               Casa Blanca            Batman          Los Vengadores
         N               El Rey Leon        Jurassic World        El Padrino

6        M               Los Vengadores      El Padrino          Casa Blanca
         T               Jurassic World     Los Vengadores      El Mago de Oz
         P                  Batman           Casa Blanca            Batman
         N                El Mago de Oz      El Rey Leon        Jurassic World

7        M               El Rey Leon        Los Vengadores       El Padrino
         T              Los Vengadores      Jurassic World      Los Vengadores
         P               El Mago de Oz         Batman            Casa Blanca
         N                  Batman           El Mago de Oz       El Rey Leon
 */

