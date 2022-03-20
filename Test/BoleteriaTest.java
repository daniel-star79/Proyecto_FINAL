import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class BoleteriaTest {
    @Test

    public void precioDescuento()
    {
        Boleteria boleteria = new Boleteria(60, 40 );
        boleteria.setCalidadPelicula("2D");
        int precio =boleteria.precioTotal("MIERCOLES" , TipoDePago.EFECTIVO, "SIN BANCO" , 1 , Genero.ANIMACION , ClasificarEdad.ADOLECENTE);
        boleteria.setCalidadPelicula("3D");
        int precio2 =boleteria.precioTotal("LUNES" , TipoDePago.EFECTIVO, "SIN BANCO" , 1 , Genero.ANIMACION , ClasificarEdad.INFANTE);
        boleteria.setCalidadPelicula("2D");
        int precio3 =boleteria.precioTotal("JUEVES" , TipoDePago.TARJETA_DE_CREDITO, "Los Elefantes" , 1 , Genero.ANIMACION , ClasificarEdad.ADULTO);

        System.out.println(precio);
        System.out.println(precio2);
        System.out.println(precio3);

        assertEquals(20,precio);
        assertEquals(51,precio2);
        assertEquals(35,precio3);




    }
    @Test
    public void mostarFactura()
    {
        Cine cine = new Cine("CINE CENTER ", 73238,"AV.AMERICA" );
        Boleteria boleteria = new Boleteria(60  , 40);
        Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA, Restriccion.edad1);
        Persona cliente1 = new Cliente("VICTORIA " , "5862" , "05/10/1985" , "" );
        String factura =boleteria.mostarFactura(cine , pelicula1 );
        System.out.println(factura);
        assertEquals("CINE CENTER  nit:73238 Jurassic World" , factura);

    }

}
