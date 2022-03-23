import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Cine {
    String nombre;
    int nit;
    String direccion;
    ArrayList<Sala> salas;
    ArrayList<Pelicula> cartelera;
    ArrayList<Empleado> empleados;
    ArrayList<Cliente>clientesRegistrados;

    public Cine(String nombre, int nit, String direccion){
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
       // this.peliculas = new ArrayList<>();
        salas = new ArrayList<>();
        empleados = new ArrayList<>();
        cartelera = new ArrayList<>();
        clientesRegistrados = new ArrayList<>();
    }

    public void setNombre(String nombre) {
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
    }

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

    @Override
       public String toString() {
           return nombre +" "+ "nit:" + nit ;
       }


     public String RegistrarCliente(Cliente cliente){
        String registro = "";
        if(cliente.correoElectronico != null){
            for(Cliente c:clientesRegistrados){
                    if(cliente.equals(c)){
                        registro =  "Ya registrado";
                    }else{
                        registro =  "Registro Exitoso";
                    }
            }
            clientesRegistrados.add(cliente);
        }
        return registro;
     }


     public Pelicula RetornarPelicula(String peli_entrada){
        Pelicula peli_salida = null;
        for(Pelicula p:cartelera){
            if(p.getNombrePelicula().equals(peli_entrada)){
                peli_salida = p;
            }
        }
        return peli_salida;
     }

}
