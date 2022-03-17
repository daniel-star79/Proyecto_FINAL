public class RegistroCliente {
    int carnetIdentidad;
    String nombreCliente;
    String nacionalidad;
    String fechaNacimiento;
    // Puntos puntosAcumulados;
    int edad;

    public class RegistroCliente {
        int carnetIdentidad;
        String nombreCliente;
        String nacionalidad;
        String fechaNacimiento;
        // Puntos puntosAcumulados;

        //Se hace sobrecarga de constructores, uno para clientes q accederan al beneficio de puntos y otro para clientes normales
        public RegistroCliente(int carnetIdentidad, String nombreCliente, String nacionalidad, String fechaNacimiento) {
            this.carnetIdentidad = carnetIdentidad;
            this.nombreCliente = nombreCliente;
            this.nacionalidad = nacionalidad;
            this.fechaNacimiento = fechaNacimiento;
        }

        public RegistroCliente(String nombreCliente, int edad){
            this.nombreCliente = nombreCliente;
            this.edad = edad;
        }
    }
