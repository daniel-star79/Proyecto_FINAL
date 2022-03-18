import org.junit.Test;

import java.util.ArrayList;


public class TestCine {

    @Test
    public void TestCine(){

        Sala sala1 = new Sala("A",100);
        System.out.println(sala1.CrearAsientos());
        Sala sala2 = new Sala("B",100);
        System.out.println(sala2.CrearAsientos());
        Sala sala3 = new Sala("C",100);
        System.out.println(sala3.CrearAsientos());
        Sala sala4 = new Sala("D",80);
        System.out.println(sala4.CrearAsientos());
        Sala sala5 = new Sala("E",80);
        System.out.println(sala5.CrearAsientos());
        Sala sala6 = new Sala("F",50);
        System.out.println(sala6.CrearAsientos());
        Sala sala7 = new Sala("G",50);
        System.out.println(sala7.CrearAsientos());
    }

    @Test
    public void TestPelicula() {
        Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA, Restriccion.edad1);
        Pelicula pelicula2 = new Pelicula(Genero.CIENCIAFICCION, "Batman", "3 horas", Horario.TARDE, Restriccion.edad4);
        Pelicula pelicula3 = new Pelicula(Genero.FANTACIA, "El mago de Oz", "2:30 horas", Horario.PRENOCHE, Restriccion.edad1);
        Pelicula pelicula4 = new Pelicula(Genero.DRAMA, "Casablanca", "1 horas", Horario.NOCHE, Restriccion.edad1);
        Pelicula pelicula5 = new Pelicula(Genero.SUSPENSO, "El padrino", "3:30 horas", Horario.TARDE, Restriccion.edad2);
        Pelicula pelicula6 = new Pelicula(Genero.ACCION, "Los Vengadores", "3 horas", Horario.MAÑANA, Restriccion.edad3);
        Pelicula pelicula7 = new Pelicula(Genero.ANIMACION, "El Rey León", "2 horas", Horario.NOCHE, Restriccion.edad1);
    }

    @Test
    public void MostrarPelicula(){
        Cine cine = new Cine("CENTER ", 73238,"AV.AMERICA" );
        
        Sala sala1 = new Sala("A",100);
        Sala sala2 = new Sala("B",100);
        Sala sala3 = new Sala("C",100);
        Sala sala4 = new Sala("D",80);

        cine.AddSala(sala1);
        cine.AddSala(sala2);
        cine.AddSala(sala3);
        cine.AddSala(sala4);

        Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA, Restriccion.edad1);
        Pelicula pelicula2 = new Pelicula(Genero.CIENCIAFICCION, "Batman", "3 horas", Horario.TARDE, Restriccion.edad4);
        Pelicula pelicula3 = new Pelicula(Genero.FANTACIA, "El mago de Oz", "2:30 horas", Horario.PRENOCHE, Restriccion.edad1);
        Pelicula pelicula4 = new Pelicula(Genero.DRAMA, "Casablanca", "1 horas", Horario.NOCHE, Restriccion.edad1);
        cine.AddPelicula(pelicula1);
        cine.AddPelicula(pelicula2);
        cine.AddPelicula(pelicula3);
        cine.AddPelicula(pelicula4);
        Boleteria boleteria = new Boleteria("2D", "Martes");
        ArrayList<String> butaca  = boleteria.MuestraButaca(cine.cartelera,cine.salas);
        System.out.println(butaca);
    }

}
