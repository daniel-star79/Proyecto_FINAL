import org.junit.Test;

import java.util.ArrayList;

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


        @Test
        public void AñadirDescuentos(){
            boleteria.añadirDescuento("ADULTO_MAYOR",50);
            boleteria.añadirDescuento("Miercoles",50);
            boleteria.añadirDescuento("INFANTE",15);
            boleteria.añadirDescuento("BANCO",12);

            assertEquals(4,boleteria.sizeDescuentos());
    }

       @Test
       public void añadirBancos(){
            boleteria.añadirBancos("Fie",TipoDePago.TARJETA_DE_DEBITO);
            boleteria.añadirBancos("Sol",TipoDePago.TARJETA_DE_CREDITO);

            assertEquals(2,boleteria.sizeBancos());
       }
    @Test
    public void TestAñadirPersonas(){
        boleteria.añadirCliente(persona1);
        boleteria.añadirCliente(persona2);
        boleteria.añadirCliente(persona3);
        boleteria.añadirCliente(persona4);
        boleteria.añadirCliente(persona5);
        boleteria.añadirCliente(persona6);
        boleteria.añadirCliente(persona7);

        assertEquals(7,boleteria.sizeCliente());

    }
    @Test
    public void TestAddSouvenirs () {
        boleteria.addSouvenirs("gorra", 8);
        assertEquals(1,boleteria.sizeDescuentos());

    }
    @Test
    public void TestAñadirSalas(){
        cine.addSala(sala1);
        cine.addSala(sala2);
        cine.addSala(sala3);
        cine.addSala(sala4);
        cine.addSala(sala5);
        cine.addSala(sala6);
        cine.addSala(sala7);

        assertEquals(7,cine.salas.size());

    }

    @Test
    public void TestAñadirPeliculas() {

        TestAñadirSalas();
        cine.addPelicula(pelicula1);
        cine.addPelicula(pelicula2);
        cine.addPelicula(pelicula3);
        cine.addPelicula(pelicula4);
        cine.addPelicula(pelicula5);
        cine.addPelicula(pelicula6);
        cine.addPelicula(pelicula7);

        assertEquals(7,cine.getPeliculasSize());
        assertEquals(7,cine.salas.size());

    }


    @Test
    public void TestMostrarbutaca() {
        TestAñadirPeliculas();
        ArrayList<String> butaca = boleteria.muestraButaca(cine.cartelera, cine.salas);

        System.out.print(butaca.get(1));
    }

    @Test
    public void TestOcuparcAsiento () {
        boleteria.ocuparAsiento(sala1,"2A");
    }

    @Test
    public void TestOcuparAsiento () {
        boleteria.ocuparAsiento(sala1,"4B");
    }

    @Test
    public void RegistrarPersona(){
        TestAñadirPeliculas();
        boleteria.registarCliente(persona1);
        persona1.añadirPersonaCorreo("julian@gmail.com");
        System.out.println(persona1.mostrarDatosCliente());
        //assertEquals();
    }

    @Test
    public void TestRetornarPelicula(){
            cine.retornarPelicula("Batman");
            //assertEquals();
    }



    @Test

    public void TestAsignarPuntos () {

        double puntos = persona1.getPuntos();

        persona1.addPuntos(7, 50, 10);
        persona2.addPuntos(9,50);
        assertEquals(450,persona1.getPuntos());
        assertEquals(35,persona1.getPuntos());


    }

    @Test
    public void TestVerificacion(){
        TestAñadirPersonas();
        System.out.println(boleteria.verificacionDeRegistro(343243));
        assertEquals(true,boleteria.verificacionDeRegistro(343243));
        assertEquals(false,boleteria.verificacionDeRegistro(5254563));
    }

    @Test
    public void TestActualizardia(){
        boleteria.actualizarDia("jueves");
        assertEquals("jueves", boleteria.getDia());
    }

    @Test
    public void mostarFactura(){
        String factura =boleteria.mostarFactura(cine , pelicula1 );
        System.out.println(factura);
        assertEquals("PREMIER  nit:16717 Jurassic World" , factura);

    }
    @Test
    public void CalcularEdad(){

    }
    @Test
    public void TestActualizarAsientos(){
        System.out.println(sala1.ActualizarAsientos());
        boleteria.ocuparAsiento(sala1,"10B");
        boleteria.ocuparAsiento(sala2,"5A");
        boleteria.ocuparAsiento(sala3,"7A");
        boleteria.ocuparAsiento(sala4,"9C");
        System.out.println(sala1.ActualizarAsientos());

    }

    @Test
    public void TestEdad() {
        assertEquals(22, persona8.getEdadPersona());
        assertEquals(22, persona9.getEdadPersona());
        assertEquals(22, persona10.getEdadPersona());
    }
    @Test
    public void TestComprarBoletos(){
            boleteria.comprarBoletos(ClasificarEdad.ADULTO_MAYOR,5,pelicula1,"EFECTIVO","Los Elefantes");

            //
    }
    @Test
    public void TestComprraBoletos(){
            boleteria.comprarBoletos(ClasificarEdad.INFANTE,3,pelicula1,"TARJETA_DE_CREDITO","Los elefantes");
        System.out.println(boleteria.mostarFactura(cine,pelicula1));
    }
    /*
    @Test
    public void TestCangeoPuntos(){
        Boleteria cangeo1 =
    }

    */




}
