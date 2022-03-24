
public class Persona {
    protected String nombrePersona;
    protected int carnetIdentidad;
    //String fechaNacimiento; // Este se tendra que ingresar en el formato dd/MM/yyyy
    ClasificarEdad clasificarEdad;

    public Persona(String nombrePersona, int carnetIdentidad, ClasificarEdad clasificarEdad) {

        this.nombrePersona = nombrePersona;

        this.carnetIdentidad = carnetIdentidad;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public ClasificarEdad getClasificarEdad() {
        return clasificarEdad;
    }

    @Override
    public boolean equals(Object obj) {
        Persona persona = (Persona) obj;
        if (carnetIdentidad == persona.carnetIdentidad)
            return true;
        else
            return false;
    }

}

