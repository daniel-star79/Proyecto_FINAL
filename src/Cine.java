import java.util.ArrayList;

public class Cine {
    String nombre;
    int nit;
    String direccion;
    ArrayList<Sala> salas;
    ArrayList<Pelicula> peliculas;
    ArrayList<Empleado> empleados;

    public Cine (String nombre, int nit, String direccion){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.peliculas = new ArrayList<Pelicula>();
        this.salas = new ArrayList<Sala>();
        this.empleados = new ArrayList<Empleado>();
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

    public void getAddSala(){
        salas.add(sala);
    }

    public void getAddPelicula(){
        peliculas.add(pelicula);
    }

    public void getAddEmpleado(){
        empleados.add(empleado);
    }

    public int getSalaSize(){
        return salas.size();
    }

    public int getPeliculasSize(){
        return peliculas.size();
    }

    public int getEmpleadosSize(){
        return empleados.size();
    }
}
