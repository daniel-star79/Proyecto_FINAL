
import java.util.Calendar;

import java.util.Calendar;

public class Cliente extends Persona implements Berificador_de_Personas_que_ya_estan_Registradas {
    int cantidadpuntos;
    String correoElectronico;
    String nacionalidad;
    public Cliente(String nombrePersona, int carnetIdentidad, String fechaNacimiento,String correoElectronico , String nacionalidad){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.nacionalidad=nacionalidad;
    }

    public Cliente(String nombrePersona ,  int  carnetIdentidad , String fechaNacimiento){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.correoElectronico = correoElectronico;
    }

    public void AñadirPersonaCorreo(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }

    public String MostrarDatosCliente(){
        return  "nombre Persona : "+nombrePersona+"\n"+
                "carnet de Identidad : "+carnetIdentidad+"\n"+
                "fecha Nacimiento : "+fechaNacimiento+"\n"+
                "correoElectronico : "+correoElectronico+"\n"+
                "Puntos Acumulados : "+cantidadpuntos+"\n";
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

    public void ActuaizarPutos(int puntos_a_Descontar){
            cantidadpuntos-=puntos_a_Descontar;
    }
    public int getEdadPersona(){
        // d d / m m / y y y y
        // 0 1 2 3 4 5 6 7 8 9
        String añoNacimineto = fechaNacimiento.substring(6);
        int año = Integer.parseInt(añoNacimineto);
        String mesNacimineto = fechaNacimiento.substring(3, 5);
        int mes = Integer.parseInt(mesNacimineto);
        String diaNacimineto = fechaNacimiento.substring(0, 2);
        int dia = Integer.parseInt(diaNacimineto);
        Calendar nacimineto = Calendar.getInstance();
        nacimineto.set(año, mes, dia);
        Calendar actual = Calendar.getInstance();

        System.out.println(nacimineto.get(Calendar.DAY_OF_YEAR));
        System.out.println(" ");
        System.out.println(actual.get(Calendar.DAY_OF_YEAR));

        int edad = actual.get(Calendar.YEAR) - nacimineto.get(Calendar.YEAR);
        if (nacimineto.get(Calendar.DAY_OF_YEAR) > actual.get(Calendar.DAY_OF_YEAR)){
            edad--;
        }
        return edad;
    }

    @Override
    public void Verificar_y_Recorrer_Lista(){

    };

}
