public class Persona {
    String nombrePersona;
    int carnetIdentidad;
    //String fechaNacimiento; // Este se tendra que ingresar en el formato dd/MM/yyyy
    ClasificarEdad clasificarEdad;
    public Persona(String nombrePersona ,  int  carnetIdentidad , ClasificarEdad clasificarEdad){
        this.carnetIdentidad = carnetIdentidad;
        this.nombrePersona = nombrePersona;
        //this.fechaNacimiento = fechaNacimiento;
        this.carnetIdentidad = carnetIdentidad;
    }
    public Persona(int carnetIdentidad){
        this.carnetIdentidad=carnetIdentidad;
    }

    @Override
    public boolean equals(Object obj){
        Persona persona =(Persona) obj;
        if (carnetIdentidad == persona.carnetIdentidad)
            return true;
        else
            return false;
    }

}




