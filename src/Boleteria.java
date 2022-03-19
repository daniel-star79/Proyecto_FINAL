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
    ArrayList<Puntos> cangeo;


    public Boleteria(String pelicula , Horario horario , String calidadPelicula, Cliente cliente){
        this.calidadPelicula = calidadPelicula;
        this.pelicula=pelicula;
        this.horario =horario;
        this.dia = dia;
        cangeo = new ArrayList<>();

    }






/*
    public Boleteria(int cantidadAsientos ,String tipoDePago){
        this.tipoDePago=tipoDePago;
        this.cantidadAsientos=cantidadAsientos;
    }
*/

    public int getPeliculasSize(){
        return cangeo.size();
    }
    public void AddCangeo(Puntos Puntos){
        cangeo.add(Puntos);
    }


}
