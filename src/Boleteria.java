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

//  public Boleteria(String pelicula , Horario horario , String calidadPelicula, Cliente cliente){
    public Boleteria(String calidadPelicula , String dia ){
        this.calidadPelicula = calidadPelicula;
        // this.pelicula=pelicula;
        //zthis.horario =horario;
        this.dia = dia;
         Butaca = new ArrayList<>();
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

    // DATOS A MEJORAR





/*
    public Boleteria(int cantidadAsientos ,String tipoDePago){
        this.tipoDePago=tipoDePago;
        this.cantidadAsientos=cantidadAsientos;
    }
*/




}
