import java.util.ArrayList;
import java.util.Scanner;
public class Boleteria {
    String calidadPelicula;
    ArrayList <String> Butaca;
    ArrayList <String> souvenirs;
    int puntos_por_compra ;
    int precio_2D , precio3D;
    ArrayList<Cliente>listaclientes;

//  public Boleteria(String pelicula , Horario horario , String calidadPelicula, Cliente cliente){
    public Boleteria(int precio3D, int precio_2D){
        this.calidadPelicula = calidadPelicula;
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

    // DATOS A MEJORAR





/*
    public Boleteria(int cantidadAsientos ,String tipoDePago){
        this.tipoDePago=tipoDePago;
        this.cantidadAsientos=cantidadAsientos;
    }
*/




}
