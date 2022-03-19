public class Cliente extends Persona {
    int cantidadpuntos;
    String correoElectronico;
    public Cliente(String nombrePersona, int carnetIdentidad, String fechaNacimiento,String correoElectronico){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.correoElectronico = correoElectronico;
    }

    public Cliente(String nombrePersona ,  int  carnetIdentidad , String fechaNacimiento){
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
}
