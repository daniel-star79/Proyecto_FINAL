import java.util.ArrayList;
import java.util.HashMap;
import    java.util.Map;

public class Boleteria {
    Horario horario;
    String dia;
    ClasificarEdad edad;
    ArrayList<String> Butaca;
    Map <String, Integer> souvenirs;
    int puntos_por_compra;
    double precio2D, precio3D;
    ArrayList<Cliente> listaclientes;
    ArrayList<String> listasBancos;
    //ArrayList<Puntos> cangeaar;
    double precioTotal = 0;

    public Boleteria(int precio3D, int precio_2D) {
        this.precio3D = precio3D;
        this.precio2D = precio_2D;
        Butaca = new ArrayList<>();
        listasBancos = new ArrayList<>();
        souvenirs = new HashMap<>();

    }

    public void ActualizarDia(String dia) {
        dia = dia;
    }

    public void setListasBancos(ArrayList<String> listasBancos) {
        this.listasBancos = listasBancos;
    }

    public ArrayList<String> getListasBancos() {
        return listasBancos;
    }
    
    public void  Control_de_Asientos( Sala sala){
        if(sala.listaAsientos.size() == 12){

        }
    }
// ARREGLAR Y OPTIMIZAR MUESTRA BUTACA
    public ArrayList<String> MuestraButaca(ArrayList<Pelicula> peliculas, ArrayList<Sala> listasalas) {
        String color  = "\u001B[32m";
        for (int i = 0; i < listasalas.size(); i++) {
            Butaca.add(peliculas.get(i).nombrePelicula + " " + listasalas.get(i).IDSala + " " + peliculas.get(i).calidad.MostrarAbreviatura() + " \n" +
                    "" + color+Horario.MAÑANA.toString() + " " +  color + Horario.TARDE.toString() + " " +color+  Horario.NOCHE.toString() + " " +
                    "" + color+ Horario.PRENOCHE.toString() + " " + color+  Horario.MAÑANA.toString() +"\n");
        }
        return Butaca;
    }

    public void addsouvenirs(String souvenir , int  cantidad) {
        souvenirs.put(souvenir,cantidad);
    }

    public void RegistarCliente(Cliente cliente) {
        listaclientes.add(cliente);
    }


    public void OcuparAsiento(Sala sala, String Fila, int numeroAsientos) {

        for(Asientos a: sala.getListaAsientos()){
            if (a.letraFila.equals(Fila)  && a.numeroAciento == numeroAsientos && a.getEstado() ){
                a.estado = false;
            }else{
                System.out.print("El Asiento se halla ocupado");
            }
        }
    }
    public double precioBoleto(Calidad calidadPelicula) {
        double precio = 0;
        if (calidadPelicula.MostrarAbreviatura().equals("3D")) {
            precio = precio3D;
        } else {
            if (calidadPelicula.MostrarAbreviatura().equals("2D")) {
                precio = precio2D;
            }
        }
        return precio;
    }

    //Pendiente
    public double precioTotal(Pelicula pelicula, int cantidadBoletos, Cliente cliente, TipoDePago pago, String banco) {
        double precioBoleto = precioBoleto(pelicula.calidad);
        double precioTotal = 0;
        if (cliente.getEdadPersona() <= 60 || (dia.equals("MIERCOLES"))) {
            precioTotal = cantidadBoletos * precioBoleto / 2;
        } else if (cliente.getEdadPersona() <= 10 && pelicula.genero.equals(Genero.ANIMACION)) {
            precioTotal = cantidadBoletos * ((precioBoleto * 85) / 100);
        } else if ((dia.equals("JUEVES")) && (pago.equals(TipoDePago.TARJETA_DE_CREDITO)) && banco.equals("Los Elefantes")) {
            precioTotal = cantidadBoletos * ((precioBoleto * 88) / 100);
        }
        return precioTotal;
    }
    //hasta aqui

    public String mostarFactura(Cine cine ,Pelicula pelicula) {
        return cine.toString() + " " + pelicula.getNombrePelicula();
    }

    public void comprarBoletos(ClasificarEdad edad, int cantidadBoletos, Pelicula pelicula, TipoDePago pago, String banco){
        if(dia.equals("Miercoles")) {
            precio3D = (precio3D*0.5);
            precio2D = (precio2D*0.5);
        }
        else if(edad == ClasificarEdad.ADULTO_MAYOR){
            precio3D = (precio3D*0.5);
            precio2D = (precio2D*0.5);
        }
        else if(edad == ClasificarEdad.INFANTE || pelicula.genero.equals(Genero.ANIMACION)){
            precio3D = (precio3D*0.75);
            precio2D = (precio2D*0.75);
        }

        precioTotal = precioTotal + cantidadBoletos*precio3D + cantidadBoletos*precio2D;

        if(dia.equals("Jueves") || pago.equals(TipoDePago.TARJETA_DE_CREDITO) || banco.equals("Los Elefantes")){
            precioTotal = (precioTotal*0.88);
        }

    }

    public void  canjearSouvenirs(Cliente cliente , String souvenir ) {
        for (Map.Entry<String, Integer> s: souvenirs.entrySet()) {
                if(s.getKey().equals(souvenir)  && s.getValue() <cliente.cantidadpuntos){
                    cliente.ActuaizarPutos(s.getValue());
                }
        }
    }
    
}
