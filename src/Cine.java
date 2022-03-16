import java.util.ArrayList;

public class Cine {
    String nombre;
    int nit;
    String direccion;
    ArrayList<Sala> salas;
    ArrayList<Pelicula> cartelera;
    ArrayList<Empleado> empleados;

    public Cine (String nombre, int nit, String direccion){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.peliculas = new ArrayList<>();
        this.salas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNit(int nit){
        this.nit = nit;
    }
    public int getNit(){
        return nit;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }*/

//Métodos para agregar objetos a los ArrayList
    public void AddSala(Sala sala){
        salas.add(sala);
    }

    public void AddPelicula(Pelicula pelicula){
        cartelera.add(pelicula);
    }

    public void AddEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

//Métodos para obtener el tamaño de los ArrayList    
    public int getSalaSize(){
        return salas.size();
    }

    public int getPeliculasSize(){
        return cartelera.size();
    }

    public int getEmpleadosSize(){
        return empleados.size();
    }
}
