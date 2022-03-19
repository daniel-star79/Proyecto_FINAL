import org.junit.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;


public class TestCine {


    @Test
    public void TestCine() {

        Sala sala1 = new Sala("A", 100);
        System.out.println(sala1.CrearAsientos());
        Sala sala2 = new Sala("B", 100);
        System.out.println(sala2.CrearAsientos());
        Sala sala3 = new Sala("C", 100);
        System.out.println(sala3.CrearAsientos());
        Sala sala4 = new Sala("D", 80);
        System.out.println(sala4.CrearAsientos());
        Sala sala5 = new Sala("E", 80);
        System.out.println(sala5.CrearAsientos());
        Sala sala6 = new Sala("F", 50);
        System.out.println(sala6.CrearAsientos());
        Sala sala7 = new Sala("G", 50);
        System.out.println(sala7.CrearAsientos());
    }


    @Test
    public void TestPelicula() {
        Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA,  16);
        Pelicula pelicula2 = new Pelicula(Genero.CIENCIAFICCION, "Batman", "3 horas", Horario.TARDE,    16);
        Pelicula pelicula3 = new Pelicula(Genero.FANTACIA, "El mago de Oz", "2:30 horas", Horario.PRENOCHE, 16);
        Pelicula pelicula4 = new Pelicula(Genero.DRAMA, "Casablanca", "1 horas", Horario.NOCHE,       16);
        Pelicula pelicula5 = new Pelicula(Genero.SUSPENSO, "El padrino", "3:30 horas", Horario.TARDE, 16);
        Pelicula pelicula6 = new Pelicula(Genero.ACCION, "Los Vengadores", "3 horas", Horario.MAÑANA,  16);
        Pelicula pelicula7 = new Pelicula(Genero.ANIMACION, "El Rey León", "2 horas", Horario.NOCHE, 16);
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


        Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA, 18);
        Pelicula pelicula2 = new Pelicula(Genero.CIENCIAFICCION, "Batman", "3 horas", Horario.TARDE, 17);
        Pelicula pelicula3 = new Pelicula(Genero.FANTACIA, "El mago de Oz", "2:30 horas", Horario.PRENOCHE, 15);
        Pelicula pelicula4 = new Pelicula(Genero.DRAMA, "Casablanca", "1 horas", Horario.NOCHE, 12);
        cine.AddPelicula(pelicula1);
        cine.AddPelicula(pelicula2);
        cine.AddPelicula(pelicula3);
        cine.AddPelicula(pelicula4);
        Boleteria boleteria = new Boleteria(25,35);
        ArrayList<String> butaca  = boleteria.MuestraButaca(cine.cartelera,cine.salas);
        System.out.println(butaca);


    }
    @Test
    public void TestAsiento(){
        Asientos asientos = new Asientos("A",1);
        asientos.setEstado(false);
    }
    @Test
    public void TestSouvenirs(){
        Boleteria boleteria = new Boleteria(25,35);
        boleteria.addsouvenirs("gorra");
    }
    //String nombrePersona ,  String carnetIdentidad , String fechaNacimiento,String correoElectronico)

    @Test
    public void TestPuntos(){
        Cliente personaRegistrada = new Cliente("JUAN",836839,"12/09/1999","Daniel92@gmail.com");
        int puntos  = personaRegistrada.MostrarPuntos();
        assertEquals(0,puntos);
        personaRegistrada.addPuntos(7,50,50);

        System.out.println(personaRegistrada.MostrarPuntos());
    }
}
