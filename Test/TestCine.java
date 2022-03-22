import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class TestCine {

        Cine cine = new Cine("PREMIER", 16727, "AV FERROVIARIA");

        Sala sala1 = new Sala("A", 100);
        Sala sala2 = new Sala("B", 100);
        Sala sala3 = new Sala("C", 100);
        Sala sala4 = new Sala("D", 80);
        Sala sala5 = new Sala("E", 80);
        Sala sala6 = new Sala("F", 50);
        Sala sala7 = new Sala("G", 50);

        Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA, 16,   Calidad.SEGUNDA_DIMENSION);
        Pelicula pelicula2 = new Pelicula(Genero.CIENCIAFICCION, "Batman", "3 horas", Horario.TARDE, 16 ,   Calidad.SEGUNDA_DIMENSION );
        Pelicula pelicula3 = new Pelicula(Genero.FANTACIA, "El mago de Oz", "2:30 horas", Horario.PRENOCHE, 16,Calidad.SEGUNDA_DIMENSION);
        Pelicula pelicula4 = new Pelicula(Genero.DRAMA, "Casablanca", "1 horas", Horario.NOCHE, 16,         Calidad.SEGUNDA_DIMENSION);
        Pelicula pelicula5 = new Pelicula(Genero.SUSPENSO, "El padrino", "3:30 horas", Horario.TARDE, 16,   Calidad.SEGUNDA_DIMENSION);
        Pelicula pelicula6 = new Pelicula(Genero.ACCION, "Los Vengadores", "3 horas", Horario.MAÑANA, 16,   Calidad.SEGUNDA_DIMENSION);
        Pelicula pelicula7 = new Pelicula(Genero.ANIMACION, "El Rey León", "2 horas", Horario.NOCHE, 16,    Calidad.SEGUNDA_DIMENSION);

        Boleteria boleteria = new Boleteria(25, 35);

        Cliente persona1 = new Cliente("JUAN", 836839, ClasificarEdad.ADOLECENTE);
        Cliente persona2 = new Cliente("JUANA", 342423, ClasificarEdad.INFANTE);
        Cliente persona3 = new Cliente("JULIAN", 343243, ClasificarEdad.ADULTO);
        Cliente persona4 = new Cliente("JUACHO", 564656, ClasificarEdad.ADULTO);
        Cliente persona5 = new Cliente("ANDRES", 634437, ClasificarEdad.ADULTO_MAYOR);
        Cliente persona6 = new Cliente("DANIEL", 876544,ClasificarEdad.INFANTE);
        Cliente persona7 = new Cliente("LEONARDO", 876532, "12/09/1999", "Daniel92@gmail.com", "BOLIVIANA", ClasificarEdad.ADOLECENTE);
        Cliente persona8 = new Cliente("GASTON", 567433, "12/09/1999", "Daniel92@gmail.com", "BOLIVIANA", ClasificarEdad.ADULTO);
        Cliente persona9 = new Cliente("CARLOS", 876543, "12/09/1999", "Daniel92@gmail.com", "BOLIVIANA", ClasificarEdad.ADULTO_MAYOR);
        Cliente persona10 = new Cliente("KATHERIN",998265, "12/09/1999", "Daniel92@gmail.com", "BOLIVIANA", ClasificarEdad.ADULTO_MAYOR);
        Cliente persona11 = new Cliente("ADRIANA",831832, "12/09/1999", "Daniel92@gmail.com", "BOLIVIANA", ClasificarEdad.ADULTO_MAYOR);
        Cliente persona12 = new Cliente("JUAN",234352, "12/09/1999", "Daniel92@gmail.com", "BOLIVIANA", ClasificarEdad.INFANTE);
/*
        public añadirRegistrados(){
            cine
    }
      */

    @Test
    public void TestAddSouvenirs () {
        boleteria.addsouvenirs("gorra", 8);
    }
    @Test
    public void TestAñadirSalas(){
        cine.AddSala(sala1);
        cine.AddSala(sala2);
        cine.AddSala(sala3);
        cine.AddSala(sala4);
        cine.AddSala(sala5);
        cine.AddSala(sala6);
        cine.AddSala(sala7);

        assertEquals(7,cine.salas.size());

    }

    @Test
    public void TestAñadirPeliculas() {

        TestAñadirSalas();
        cine.AddPelicula(pelicula1);
        cine.AddPelicula(pelicula2);
        cine.AddPelicula(pelicula3);
        cine.AddPelicula(pelicula4);
        cine.AddPelicula(pelicula5);
        cine.AddPelicula(pelicula6);
        cine.AddPelicula(pelicula7);
        assertEquals(7,cine.getPeliculasSize());
        assertEquals(7,cine.salas.size());


    }


    @Test
    public void Mostrarbutaca() {
        TestAñadirPeliculas();
        ArrayList<String> butaca = boleteria.MuestraButaca(cine.cartelera, cine.salas);

        System.out.print(butaca.get(1));
    }

    @Test
    public void TestOcuparcAsiento () {
        boleteria.OcuparAsiento(sala1,"A", 2);
    }

    @Test
    public void TestOcuparAsiento () {
        boleteria.OcuparAsiento(sala1,"A", 2);
    }

    @Test
    public void RegistrarPersona(){
        TestAñadirPeliculas();
        boleteria.RegistarCliente(persona1);
        persona1.AñadirPersonaCorreo("julian@gmail.com");
        System.out.println(persona1.MostrarDatosCliente());
    }

    @Test
    public void TestAsignarPuntos () {

        double puntos = persona1.MostrarPuntos();

        persona1.addPuntos(7, 50, 50);

        System.out.println(persona1.MostrarPuntos());
    }

    @Test
    public void TestActualizardia(){
        boleteria.ActualizarDia("jueves");
    }

    @Test
    public void precioDescuento(){
        TestAñadirPeliculas();
        double precio1 =boleteria.precioTotal(pelicula1,7,persona4,TipoDePago.TARJETA_DE_CREDITO,"UNION");
        double precio2 =boleteria.precioTotal(pelicula6,3,persona4,TipoDePago.TARJETA_DE_CREDITO,"Los Elefantes");
        double precio3 =boleteria.precioTotal(pelicula7,9,persona4,TipoDePago.TARJETA_DE_CREDITO,"BCP");

        System.out.println(precio1);
        System.out.println(precio2);
        System.out.println(precio3);
    }

    @Test
    public void mostarFactura(){
        String factura =boleteria.mostarFactura(cine , pelicula1 );
        System.out.println(factura);
        assertEquals("CINE CENTER  nit:73238 Jurassic World" , factura);

    }
    @Test
    public void CalcularEdad(){

    }
    @Test
    public void TestActualizarAsientos(){
        System.out.println(sala1.ActualizarAsientos());
        boleteria.OcuparAsiento(sala1,"A", 2);
        boleteria.OcuparAsiento(sala1,"A", 5);
        boleteria.OcuparAsiento(sala1,"A", 7);
        boleteria.OcuparAsiento(sala1,"A", 8);
        System.out.println(sala1.ActualizarAsientos());
    }

    @Test
    public void TestEdad() {
        assertEquals(22, persona1.getEdadPersona());
        //assertEquals(22, persona2.getEdadPersona());
        //assertEquals(23, persona3.getEdadPersona());
    }
    @Test
    public void TestCangeoPuntos(){
        Boleteria cangeo1 =
    }



}
