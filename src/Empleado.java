public class Empleado extends Persona{
    Cargo cargoEmpleado;
    public Empleado(String nombrePersona , String carnetIdentidad , String fechaNacimiento, Cargo cargoEmpleado){
        super(nombrePersona,carnetIdentidad,fechaNacimiento);
        this.cargoEmpleado =cargoEmpleado;
    }
}
