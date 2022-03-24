import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Boleteria {
    private String dia  = "Miercoles";
    private String nuevoDia;
    private ClasificarEdad edad;
    private ArrayList<String> Butaca;
    private Map<String, Integer> souvenirs;
    private Map<String, Integer> descuentos;
    private Map<String,TipoDePago>bancos;
    private int puntos_por_compra= 50 ;
    private double precio2D, precio3D;
    private ArrayList<Cliente> listaclientes;
    private ArrayList<Banco> listaBancos;
    private double precioTotal = 0 ;

    public Boleteria(int precio3D, int precio2D) {
        this.precio3D = precio3D;
        this.precio2D = precio2D;
        Butaca = new ArrayList<>();
        souvenirs = new HashMap<>();
        descuentos = new HashMap<>();
        bancos = new HashMap<>();
        listaBancos = new ArrayList<>();
        listaclientes = new ArrayList<>();

    }

    public void añadirCliente(Cliente cliente){
        listaclientes.add(cliente);
    }

    public int getPuntosPorCompra() {
        return puntos_por_compra;
    }

    public void actualizarDia(String dia) {
        dia = nuevoDia;
    }

    public int sizeDescuentos() {
        return descuentos.size();
    }

    public int sizeBancos() {
        return bancos.size();
    }


    public double getPrecio2D() {
        return precio2D;
    }

    public double getPrecio3D() {
        return precio3D;
    }

    public String getDia(){
        return dia;
    }

    public void controlDeAsientos(Sala sala) {
        if (sala.listaAsientos.size() == 12) {

        }
    }

    // ARREGLAR Y OPTIMIZAR MUESTRA BUTACA
    public ArrayList<String> muestraButaca(ArrayList<Pelicula> peliculas, ArrayList<Sala> listasalas) {
        String color = "\u001B[32m";
        for (int i = 0; i < listasalas.size(); i++) {
            Butaca.add("\u001B[37m" + peliculas.get(i).getNombrePelicula() + " " + listasalas.get(i).IDSala + " " + peliculas.get(i).getCalidad().MostrarAbreviatura() + " \n" +
                    "" + color + Horario.MAÑANA.toString() + "\n" + color + Horario.TARDE.toString() + "\n" + color + Horario.NOCHE.toString() + "\n" +
                    "" + color + Horario.PRENOCHE.toString() + "\n" + color + Horario.MAÑANA.toString() + "\n");
        }
        return Butaca;
    }

    public String muestraButaca(Pelicula peliculas , Sala sala) {
        String color = "\u001B[32m";
        return  "\u001B[37m" + peliculas.getNombrePelicula() + " " + sala.IDSala + " " + peliculas.getCalidad().MostrarAbreviatura() + " \n" +
                    "" + color + Horario.MAÑANA.toString() + "\n" + color + Horario.TARDE.toString() + "\n" + color + Horario.NOCHE.toString() + "\n" +
                    "" + color + Horario.PRENOCHE.toString() + "\n" + color + Horario.MAÑANA.toString() + "\n";
    }


    public void addSouvenirs(String souvenir, int cantidad) {
        souvenirs.put(souvenir, cantidad);
    }

    public void registarCliente(Cliente cliente) {
        listaclientes.add(cliente);
    }


    /*public void ocuparAsiento1(Sala sala, String codigoAsiento) {

        char [] codigoDividido = codigoAsiento.toCharArray();
        String columna = "";
        for(int i = 0; i < codigoDividido.length; i++){
            if(Character.isDigit(codigoDividido[i])){
                columna+=codigoDividido[i];
            }
        }
        String columnaNumero = columna.substring(0);

        String fila = "";
        for(int i = 0; i < codigoDividido.length; i++){
            if(Character.isLetter(codigoDividido[i])){
                fila+=codigoDividido[i];
            }
        }

        for (Asientos a : sala.getListaAsientos()) {
            if (a.getLetraFila().equals(Fila) && a.getNumeroAciento()== numeroAsientos && a.getEstado()) {
                a.estado = false;
            } else {
                System.out.print("El Asiento se halla ocupado");
            }
        }
    }*/

    public void ocuparAsiento(Sala sala, String codigo ) {
        int cantidadDigitos = codigo.length();
        String fila  = "";
        int columna  = 0;
        if(cantidadDigitos == 2){
            columna = Integer.parseInt(codigo.substring(0,1));
            fila = codigo.substring(1);
        }else{
            columna = Integer.parseInt(codigo.substring(0,2));
            fila = codigo.substring(2);
        }
        for (Asientos a : sala.getListaAsientos()) {
            if (a.getLetraFila().equals(fila) && a.getNumeroAciento()== columna && a.getEstado()) {
                a.estado = false;
            } else {
                System.out.println("El Asiento se encuentra ocupado");
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

    public String mostarFactura(Cine cine, Pelicula pelicula) {
        return cine.toString() + " " + pelicula.getNombrePelicula();
    }

    public void comprarBoletos(ClasificarEdad edad, int cantidadBoletos,Pelicula pelicula,String metodoDePago, String banco) {
        double precioBoleto = precioBoleto(pelicula.getCalidad());
        if (dia.equals("Miercoles")) {
            precioTotal = precioBoleto*descuentos.get("Miercoles");
        } else if (edad == ClasificarEdad.ADULTO_MAYOR) {
            precioTotal = precioBoleto*descuentos.get("ADULTO_MAYOR");
        } else if (edad == ClasificarEdad.INFANTE || pelicula.getGenero().equals(Genero.ANIMACION)) {
            precioTotal = precioBoleto*descuentos.get("INFANTE");
        }

        precioTotal = precioTotal + cantidadBoletos * precio3D + cantidadBoletos * precio2D;
        TipoDePago tipoDePagoPrueva = Enum.valueOf(TipoDePago.class ,metodoDePago);
        if (dia.equals("Jueves") || tipoDePagoPrueva.equals(TipoDePago.TARJETA_DE_CREDITO) || banco.equals("Los Elefantes")) {
            precioTotal = precioBoleto*descuentos.get("BANCO");
        }

    }

    public boolean verificacionDeTrabajoBanco(String banco){
        return listaBancos.contains(banco);
    }


    public ClasificarEdad clasificarEdad(String edad){
        //          00/00/0000
        int edad_entero = Integer.parseInt(edad.substring(6));
        edad_entero = 2022-edad_entero;
        ClasificarEdad edad_Clasificada = null;
        if(edad_entero<=10){
            edad_Clasificada  = ClasificarEdad.INFANTE;
        }else if (edad_entero<=23 && edad_entero>10){
            edad_Clasificada  = ClasificarEdad.ADOLECENTE;
        }else if (edad_entero<=49 && edad_entero>23){
            edad_Clasificada  = ClasificarEdad.ADULTO;
            }else if(edad_entero>59) {
            edad_Clasificada = ClasificarEdad.ADULTO_MAYOR;
        }
        return edad_Clasificada;
    }
    public void canjearSouvenirs(Cliente cliente, String souvenir) {
        for (Map.Entry<String, Integer> s : souvenirs.entrySet()) {
            if (s.getKey().equals(souvenir) && s.getValue() < cliente.getPuntos()) {
                cliente.actuaizarPutos(s.getValue());
            }
        }
    }


    public boolean verificacionDeRegistro(int carnet){
        boolean verificacion = false ;
            for (Cliente c:listaclientes){
                if(carnet == c.getCarnetIdentidad()){
                    verificacion =  true;
                    break;
                }
            }
            return verificacion;
    }
    public int sizeCliente(){
        return listaclientes.size();
    }
/*


   public int  Verificacion_de_Registro(Cliente cliente){
        int registro = 0;
        for(Cliente c: listaclientes){
            if(c.carnetIdentidad == cliente.carnetIdentidad){
                registro =  0;
            }
            else{
                registro =  1;
            }
        }
        return  registro;
    }
 */
    public void setClasificacionEdad(ClasificarEdad edad){
        this.edad = edad;
    }

    public void añadirDescuento(String nombreDescuento , int porcentaje){
        descuentos.put(nombreDescuento,porcentaje/100);
    }
    public void añadirBancos(String nombreDelBanco, TipoDePago tipoDePago){
        bancos.put(nombreDelBanco,tipoDePago);
    }

}
