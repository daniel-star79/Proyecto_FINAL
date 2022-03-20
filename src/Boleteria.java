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
    Sala sala;
    ArrayList <String> Butaca;
    ArrayList <String> souvenirs;
    int puntos_por_compra  = 50;
    int precio2D , precio3D;
    ArrayList<Puntos> cangeo;


    //  public Boleteria(String pelicula , Horario horario , String calidadPelicula, Cliente cliente){
    public Boleteria(int precio3D, int precio2D){
        this.calidadPelicula = calidadPelicula;
        // this.pelicula=pelicula;
        //zthis.horario =horario;
        this.precio3D = precio3D;
        this.precio2D = precio2D;
        Butaca = new ArrayList<>();
        souvenirs = new ArrayList<>();
        Sala sala;
    }

    public String getCalidadPelicula() {
        return calidadPelicula;
    }

    public void setCalidadPelicula(String calidadPelicula) {
        this.calidadPelicula = calidadPelicula;
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
            //System.out.println("El asiento no esta disponible ");;
        }
    }

    public int precioBoleto()
    {

        if (getCalidadPelicula().equals("3D"))
        {
            return precio3D;
        }
        else
        { if(getCalidadPelicula().equals("2D"))
        {
            return precio2D  ;
        }
        return 0;
        }
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


    // DATOS A MEJORAR





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
