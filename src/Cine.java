import java.util.ArrayList;

public class Cine {
<<<<<<< HEAD
    String nombre;
=======
  String nombre;
>>>>>>> 490a302434562231a6dfea9ddf3d9d9fe563eecc
    int nit;
    String direccion;
    ArrayList<Sala> salas;
    ArrayList<Pelicula> cartelera;
    ArrayList<Empleado> empleados;

    public Cine (String nombre, int nit, String direccion){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.peliculas = new ArrayList<Pelicula>();
        this.salas = new ArrayList<Sala>();
        this.empleados = new ArrayList<Empleado>();
    }
<<<<<<< HEAD

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
=======
  
  public void getAddSala(){
>>>>>>> 490a302434562231a6dfea9ddf3d9d9fe563eecc
        salas.add(sala);
    }

    public void getAddPelicula(){
        cartelera.add(pelicula);
    }

    public void getAddEmpleado(){
        empleados.add(empleado);
    }

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
