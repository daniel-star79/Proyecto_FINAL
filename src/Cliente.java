public class Cliente extends Persona{
    String correoElectronico;
    public Cliente(String nombrePersona ,  String carnetIdentidad , String fechaNacimiento,String correoElectronico){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.correoElectronico = correoElectronico;
    }

    public void addCorreoElectronico(){

    }
}
