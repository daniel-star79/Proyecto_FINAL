public class ServicioEmpleado extends Persona{
    Cargo cargoEmpleado;
    public ServicioEmpleado(String nombrePersona ,  String carnetIdentidad , String fechaNacimiento,Cargo cargoEmpleado){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.cargoEmpleado =cargoEmpleado;
    }
}
