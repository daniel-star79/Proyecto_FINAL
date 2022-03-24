import java.util.ArrayList;

public class Cine {
    String nombre;
    int nit;
    String direccion;
    ArrayList<Sala> salas;
    ArrayList<Pelicula> cartelera;
    ArrayList<Empleado> empleados;
    ArrayList<Cliente> clientesRegistrados;

    public Cine(String nombre, int nit, String direccion) {
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

    public String getNombre() {
        return nombre;
    }

    //Métodos para agregar objetos a los ArrayList
    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public void addPelicula(Pelicula pelicula) {
        cartelera.add(pelicula);
    }

    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    //Métodos para obtener el tamaño de los ArrayList
    public int getSalaSize() {
        return salas.size();
    }

    public int getPeliculasSize() {
        return cartelera.size();
    }

    public int getEmpleadosSize() {
        return empleados.size();
    }

    @Override
    public String toString() {
        return nombre + " " + "nit:" + nit;
    }


    public String registrarCliente(Cliente cliente) {
        String registro = "";
        if (cliente.getCorreoElectronico() != null) {
            for (Cliente c : clientesRegistrados) {
                if (cliente.equals(c)) {
                    registro = "Ya registrado";
                } else {
                    registro = "Registro Exitoso";
                }
            }
            clientesRegistrados.add(cliente);
        }
        return registro;
    }

    public Sala retornarSala(String sala_letras) {
        Sala sala_retorno = null;
        for (Sala s : salas) {
            if (s.getIDSala().equals(sala_letras)) {
                sala_retorno = s;
            }
        }
        return sala_retorno;
    }

    public Pelicula retornarPelicula(String peliEntradaa) {
        Pelicula peliSalida = null;
        for (Pelicula p : cartelera) {
            if (p.getNombrePelicula().equals(peliEntradaa)) {
                peliSalida = p;
            }
        }
        return peliSalida;
    }

}
