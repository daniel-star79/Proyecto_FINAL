public class Empleado extends Persona{
    Cargo cargoEmpleado;
    String fechaNacimineto;
    public Empleado(String nombrePersona , int carnetIdentidad , String fechaNacimiento, Cargo cargoEmpleado, ClasificarEdad edad){
        super(nombrePersona,carnetIdentidad,edad);
        this.cargoEmpleado = cargoEmpleado;
        this.fechaNacimineto = fechaNacimiento;
    }
}
