import java.util.ArrayList;
public class Boleteria {
    //Tipo pago;
    String tipoDePago;
    String pelicula;
    Horario horario;
    String dia;
    String calidadPelicula;
    int cantidadBoletos;
    Cliente cliente;
    ArrayList <String> Butaca;


    public Boleteria(String pelicula , Horario horario , String calidadPelicula, Cliente cliente){
        this.calidadPelicula = calidadPelicula;
        this.pelicula=pelicula;
        this.horario =horario;
        this.dia = dia;
         Butaca = new ArrayList<>();
    }


    public ArrayList<String> MuestraButaca(ArrayList<Pelicula> peliculas, ArrayList<Sala> listasalas,int excibiciones) {
        int countExcibiciones = excibiciones;
        for (int i = 0; i < listasalas.size(); i++) {
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " \n " + Horario.MAÑANA.toString());
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " \n " + Horario.TARDE.toString());
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " \n " + Horario.NOCHE.toString());
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " \n " + Horario.PRENOCHE.toString());
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " \n " + Horario.MAÑANA.toString());
        }
        return Butaca;
    }

    // DATOS A MEJORAR





/*
    public Boleteria(int cantidadAsientos ,String tipoDePago){
        this.tipoDePago=tipoDePago;
        this.cantidadAsientos=cantidadAsientos;
    }
*/




}
