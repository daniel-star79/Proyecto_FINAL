public class Persona {
    String nombrePersona;
    int carnetIdentidad;
    //String fechaNacimiento; // Este se tendra que ingresar en el formato dd/MM/yyyy
    ClasificarEdad edad;
    public Persona(String nombrePersona ,  int  carnetIdentidad , ClasificarEdad edad){
        this.carnetIdentidad = carnetIdentidad;
        this.nombrePersona = nombrePersona;
        //this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
}




