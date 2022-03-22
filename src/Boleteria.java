import java.util.ArrayList;
import java.util.Scanner;

public class Boleteria {
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
    //Horario horario;
    String calidadPelicula;

    //ArrayList<Puntos> cangeaar;


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

    public void addsouvenirs(String souvenir){
        souvenirs.add(souvenir);
    }

    public void RegistarCliente(Cliente cliente){
        listaclientes.add(cliente);
    }

    public void comprarAsiento(Sala sala, int asiento, int numeroAsientos){
        if (sala.listaAsientos.get(asiento).estado){
            sala.listaAsientos.get(asiento).estado = false;
        }
        else {

            //System.out.println("El asiento no esta disponible ");;

            System.out.println("El asiento no esta disponible ");
        }
    }

    public int precioBoleto(Calidad calidadPelicula) {
        int precio = 0;
        if (calidadPelicula.toString().equals("3D")) {
            precio = precio3D;
        } else {
            if (calidadPelicula.toString().equals("2D")) {
                precio = precio_2D;
            }
        }
        return precio;
    }

/*
    public void ventaSouveniers(String producto)
    {
        for(int i=0 ; i<souvenirs.size ; i++)
      size()
        }


     }
*/


    public int precioTotal( String dia  ,TipoDePago tipoDePago , String banco , int cantidadBoletos ,ClasificarEdad clasificarEdad , Calidad calidad) {
        int precioBoleto = precioBoleto(calidad);
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
    public int getPeliculasSize(){
        return cangeo.size();
    }

    public void AddCangeo(Puntos Puntos){
        cangeo.add(Puntos);
    }
*/

}
