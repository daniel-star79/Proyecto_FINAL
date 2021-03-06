import java.util.Calendar;

public class Cliente extends Persona {
    int cantidadpuntos;
    String correoElectronico;
    public Cliente(String nombrePersona ,  String carnetIdentidad , String fechaNacimiento,String correoElectronico){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.correoElectronico = correoElectronico;
    }

    public Cliente(String nombrePersona ,  String carnetIdentidad , String fechaNacimiento){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.correoElectronico = correoElectronico;
    }

    public void  addPuntos(int entradas , int puntos_x_compra){
        cantidadpuntos = entradas*puntos_x_compra;
    }

    public void  addPuntos(int entradas , int puntos_x_compra,int descuento){
        cantidadpuntos = ((entradas*puntos_x_compra*descuento)/100);
    }
    public int MostrarPuntos(){
        return cantidadpuntos;
    }

    public void addCorreoElectronico(){

    }

    /*public int getEdadPersona(String fechaNacimiento){
        // d d / m m / y y y y
        // 0 1 2 3 4 5 6 7 8 9
        String añoNacimineto = fechaNacimiento.substring(6, 9);
        int edad = 2022 - Integer.parseInt(añoNacimineto);
        return edad;
    }*/

    public int getEdadPersona(){
        // d d / m m / y y y y
        // 0 1 2 3 4 5 6 7 8 9
        String añoNacimineto = fechaNacimiento.substring(6, 9);
        int año = Integer.parseInt(añoNacimineto);
        String mesNacimineto = fechaNacimiento.substring(3, 4);
        int mes = Integer.parseInt(añoNacimineto);
        String diaNacimineto = fechaNacimiento.substring(0, 1);
        int día = Integer.parseInt(añoNacimineto);

        Calendar nacimineto = Calendar.getInstance();
        nacimineto.set(año, mes, día);

        Calendar actual = Calendar.getInstance();

        int edad = actual.get(Calendar.YEAR) - nacimineto.get(Calendar.YEAR);
        if (nacimineto.get(Calendar.YEAR) > actual.get(Calendar.YEAR)){
            edad--;
        }
        return edad;
    }
}
