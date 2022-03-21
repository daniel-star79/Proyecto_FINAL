import java.util.ArrayList;
import java.util.Scanner;
public class Boleteria extends Cine  {
    private final Object calidadPelicula;
    String tipoDePago;
    String pelicula;
    Horario horario;
    String dia;
    int cantidadBoletos;
    Cliente cliente;
    Sala sala;
    ArrayList <String> Butaca;
    ArrayList <String> souvenirs;
    int puntos_por_compra ;
    int precio_2D , precio3D;
    ArrayList<Cliente>listaclientes;
    ArrayList<Puntos> cangeaar,

//  public Boleteria(String pelicula , Horario horario , String calidadPelicula, Cliente cliente){
    public Boleteria(int precio3D, int precio_2D){
        // this.pelicula=pelicula;
        //zthis.horario =horario;
        this.precio3D = precio3D;
        this.precio_2D = precio_2D;
        Butaca = new ArrayList<>();
        souvenirs = new ArrayList<>();
        listaclientes = new ArrayList<>();
        Sala sala;
    }
    public void ActualizarDia(String dia){
        dia  = dia ;
    }


    public ArrayList<String> MuestraButaca(ArrayList<Pelicula> peliculas, ArrayList<Sala> listasalas) {
        for (int i = 0; i < listasalas.size(); i++) {
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " " + Horario.MAÑANA.toString()  +"\n");
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " " + Horario.TARDE.toString()   +"\n");
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " " + Horario.NOCHE.toString()   +"\n");
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " " + Horario.PRENOCHE.toString()+"\n");
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " " + Horario.MAÑANA.toString()  +"\n");
        }
        return Butaca;
    }

    public void comprarAsiento(Sala sala, int asiento, int numeroAsientos){

        if (sala.listaAsientos.get(asiento).estado){
            sala.listaAsientos.get(asiento).estado = false;
        }
        else {
            System.out.println("El asiento no esta disponible ");
        }
    }

    public void addsouvenirs(String souvenir){
        souvenirs.add(souvenir);
    }

    public void RegistarCliente(Cliente cliente){
        listaclientes.add(cliente);
    }

    public void ventaSouveniers(String souvenirs)
    {
        for(int i=0 ; i<souvenirs.length ; i++)
        {
            if(souvenirs[i].equals("souvenirs")
            {

         }

        }


     }

    public int precioBoleto() {
        if (getCalidad().equals("3D"))

        {
            return precio3D;
        }
        else  if(getCalidad().equals("2D"))
        {
            return precio2D  ;
        }
        return 0;
        }

    public int precioTotal( String dia  ,TipoDePago tipoDePago , String banco , int cantidadBoletos ,  Genero genero ,ClasificarEdad clasificarEdad)
    {
        int precioBoleto = precioBoleto();
        int precio ;
        if((clasificarEdad.name().equals("ADULTO_MAYOR"))|| (dia.equals("MIERCOLES")))
        {
            precio = precioBoleto/2;
            return cantidadBoletos*precio;
        }
        else
        {
            if(clasificarEdad.name().equals("INFANTE"))
            {
                if(genero.name().equals("ANIMACION"))
                {
                    precio=(precioBoleto*85)/100;
                    return precio*cantidadBoletos;
                }
            }
            else
            {
                if ((dia.equals("JUEVES")) && (tipoDePago.name().equals("TARJETA_DE_CREDITO")))
                {
                    if(banco.equals("Los Elefantes"))
                    {
                        precio=precioBoleto*cantidadBoletos;
                        return (precio*88)/100;
                    }

                }

            }
            return precioBoleto*cantidadBoletos;
        }

    }

    public String mostarFactura(Cine cine ,Pelicula pelicula)
    {
        return cine.toString() + " " +pelicula.getNombrePelicula()  ;
    }
    /*
    public String mostarFactura(Cine cine ,Pelicula pelicula)
        {
            return cine.toString() + " " +pelicula.getNombrePelicula()  ;
        }

    */



    // DATOS A MEJORAR





/*
    public Boleteria(int cantidadAsientos ,String tipoDePago){
        this.tipoDePago=tipoDePago;
        this.cantidadAsientos=cantidadAsientos;
    }
*/




}
