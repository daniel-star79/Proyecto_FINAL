import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

import static org.junit.Assert.assertEquals;

public class
Cine_Main {

    static Scanner scanner = new Scanner(System.in);
    static Cine cine = new Cine("POOI", 16727, "AV FERROVIARIA");

    static Sala sala1 = new Sala("A", 100);
    static Sala sala2 = new Sala("B", 100);
    static Sala sala3 = new Sala("C", 100);
    static Sala sala4 = new Sala("D", 80);
    static Sala sala5 = new Sala("E", 80);
    static Sala sala6 = new Sala("F", 50);
    static Sala sala7 = new Sala("G", 50);

    static Pelicula pelicula1 = new Pelicula(Genero.ACCION, "Jurassic World", "2 horas", Horario.MAÑANA, 16, Calidad.SEGUNDA_DIMENSION);
    static Pelicula pelicula2 = new Pelicula(Genero.CIENCIAFICCION, "Batman", "3 horas", Horario.TARDE, 16, Calidad.SEGUNDA_DIMENSION);
    static Pelicula pelicula3 = new Pelicula(Genero.FANTACIA, "El mago de Oz", "2:30 horas", Horario.PRENOCHE, 16, Calidad.SEGUNDA_DIMENSION);
    static Pelicula pelicula4 = new Pelicula(Genero.DRAMA, "Casablanca", "1 horas", Horario.NOCHE, 16, Calidad.SEGUNDA_DIMENSION);
    static Pelicula pelicula5 = new Pelicula(Genero.SUSPENSO, "El padrino", "3:30 horas", Horario.TARDE, 16, Calidad.SEGUNDA_DIMENSION);
    static Pelicula pelicula6 = new Pelicula(Genero.ACCION, "Los Vengadores", "3 horas", Horario.MAÑANA, 16, Calidad.SEGUNDA_DIMENSION);
    static Pelicula pelicula7 = new Pelicula(Genero.ANIMACION, "El Rey León", "2 horas", Horario.NOCHE, 16, Calidad.SEGUNDA_DIMENSION);
    static Cliente cliente;
    static Cliente clienteRegistrado;

    public void AñadirSalas() {
        cine.addSala(sala1);
        cine.addSala(sala2);
        cine.addSala(sala3);
        cine.addSala(sala4);
        cine.addSala(sala5);
        cine.addSala(sala6);
        cine.addSala(sala7);
    }
    public void AñadirSouvenirs(){
        boleteria.addSouvenirs("PIPOCAS",200);
        boleteria.addSouvenirs("GORRA", 350);
        boleteria.addSouvenirs("CHOMPA",500);
    }


    public void añadirDescuentos(){
        boleteria.añadirDescuento("ADULTO_MAYOR",50);
        boleteria.añadirDescuento("Miercoles",50);
        boleteria.añadirDescuento("INFANTE",15);
        boleteria.añadirDescuento("BANCO",12);
    }
    public void AñadirPeliculas() {
        AñadirSalas();
        cine.addPelicula(pelicula1);
        cine.addPelicula(pelicula2);
        cine.addPelicula(pelicula3);
        cine.addPelicula(pelicula4);
        cine.addPelicula(pelicula5);
        cine.addPelicula(pelicula6);
        cine.addPelicula(pelicula7);
    }

    public void AñadirBancos() {
        boleteria.añadirBancos("Fie", TipoDePago.TARJETA_DE_CREDITO);
        boleteria.añadirBancos("Sol", TipoDePago.TARJETA_DE_DEBITO);
    }

    static Boleteria boleteria = new Boleteria(60, 40);

    public void actualizar_dia() {
        boleteria.actualizarDia("Miercoles");
    }

//Se arma la estructura del metodo main

    public void menuPrincipal() {
        actualizar_dia();
        System.out.println("\033[34m" + "********BIENVENIDOS********\n " + "\033[36m"
                + "1.  Entrar como Usuario Registrado\n"
                + "2.  Registrase\n"
                + "3.  Entrar Sin Registarse\n"
                + "4.  Salir \n "
                + "\033[34m" + "Ingrese la opcion a seguir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese su numero de carnet");
                int numeroCarnet = scanner.nextInt();

                if (boleteria.verificacionDeRegistro(numeroCarnet)) {
                    System.out.println("Usuario Registrado");
                    menuBoleteria();

                } else {
                    System.out.println("Usuario no registrado");
                    menuPrincipal();
                }

            case 2:
                System.out.println("Ingrese su  Nombre");
                String nombrePersona = scanner.next();
                System.out.println("Ingrese su numero de carnet de Identidad");
                int carnetId = scanner.nextInt();
                System.out.println("Ingrese su fecha de Nacimiento de la siguiente forma dd/MM/yyyy");
                String fechaNacimiento = scanner.next();
                System.out.println("Ingrese su correo electronico");
                String correoElectronico = scanner.next();
                System.out.println("Ingrese su nacionalidad");
                String nacionalidad = scanner.next();

                ClasificarEdad edad_Clasificada = boleteria.clasificarEdad(fechaNacimiento);
                Cliente cliente_R = new Cliente(nombrePersona, carnetId, fechaNacimiento, correoElectronico, nacionalidad, edad_Clasificada);
                boleteria.añadirCliente(cliente_R);
                if (boleteria.verificacionDeRegistro(carnetId)) {
                    clienteRegistrado = cliente_R;
                    System.out.println("Registro Exitoso");
                } else {
                    System.out.println("El cliente ya se encuentra registrado");
                }
                menuBoleteria();

            case 3:
                menuBoleteria();
            case 4:
                break;
            default:
                System.out.println("\033[34m" + "Ingrese una de las opciones indicadas en pantalla");
        }

    }

    public void menuBoleteria() {
        añadirDescuentos();
        actualizar_dia();
        String peli = "";
        AñadirBancos();
        System.out.println("***BOLETERIA DEL CINE POOI***" + "\n");
        System.out.println("****BOLETERIA***" + "\n" + "\033[36m"
                + "1. Ver Cartelera\n"
                + "2. Comprar Boletos\n"
                + "3. Canjear Puntos\n"
                + "4. Volver");
        System.out.println("\033[34m" + "\nQue pelicula desea ver, Elija un numero\n ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                peli = menuPeliculas();
                menuBoleteria();
                break;
            case 2:
                peli = menuPeliculas();

                System.out.println("\033[34m" + "la pelicula se encuentra disponible en el siguiente horario: ");
                System.out.println("Para que horario desea comprar? " + "\033[36m");
                System.out.println("1. Mañana 10:00 - 11:30\n" +
                        "2. Tarde 14:00 - 15:00\n" +
                        "3. Prenoche 18:00 - 19:00\n" +
                        "4. Noche 20:00 - 21:00\n");
                int horario_elegido = scanner.nextInt();
                System.out.println("\033[34m" + "La pelicula estara en funcion en las salas: ");
                System.out.println("\033[36m" + "1. SALA-A\n" +
                        "2. SALA-B\n" +
                        "3. SALA-C\n" +
                        "4. SALA-D\n");
                System.out.println("\033[34m" + "Ingrese el ID de la sala");
                String sala_elegida = scanner.next().toUpperCase();
                sala1.ActualizarAsientos();

                System.out.println("Ingrese la cantidad de boletos que comprara:");
                int cantidad_de_boletos = scanner.nextInt();

                Pelicula peliculaEscogida = cine.retornarPelicula(peli);
                System.out.println(boleteria.muestraButaca(peliculaEscogida, sala1));
                sala1.CrearAsientos();
                System.out.println(sala1.ActualizarAsientos());
                for (int i = 0; i < cantidad_de_boletos; i++) {
                    System.out.println("Que asientos desea");
                    boleteria.setAsientoComprado(scanner.next().toUpperCase());
                    boleteria.ocuparAsiento(sala1, boleteria.getAsientoComprado());
                    System.out.println(sala1.ActualizarAsientos());
                    boleteria.addAsientocomprado();
                }

                System.out.println("Metodo de pago" + "\033[36m" +
                        "\nEFECTIVO , TARJETA_DE_CREDITO , TARJETA_DE_DEBITO , QR ,PUNTOS ");
                String metodoPago = scanner.next().toUpperCase();
                switch (metodoPago) {
                    case "EFECTIVO":
                        System.out.println(boleteria.mostarFactura(cine, peliculaEscogida, clienteRegistrado));
                        break;
                    case "PUNTOS":
                      if(clienteRegistrado.compraPorPuntos(50,cantidad_de_boletos)){
                        System.out.print("Se descontaron sus puntos");
                        System.out.println("Puntos actuales :"+clienteRegistrado.getPuntos());
                        }else{
                          System.out.println("No tiene los puntos suficientes consulte otro metodo de pago");
                        }
                        break;
                        default:
                        System.out.println("\033[34m" + "Ingrese su Banca Movil");
                        String banco = scanner.next();
                        break;
                }
                System.out.println("Ingrese sus datos para imprimir su factura: ");
                System.out.println("C.I. ");
                int carnet = scanner.nextInt();
                if (boleteria.verificacionDeRegistro(carnet)) {
                    cliente = clienteRegistrado;
                } else {
                    System.out.println("Nombre ");
                    String nombre = scanner.next();
                    System.out.println("Fecha de Nacimiento");
                    ClasificarEdad edadSinRegistro = boleteria.clasificarEdad(scanner.next());
                    cliente = new Cliente(nombre,carnet,edadSinRegistro);
                    }
                    añadirDescuentos();

                    boleteria.comprarBoletos(cliente.getClasificarEdad(), cantidad_de_boletos, peliculaEscogida, metodoPago, "los elefantes");
                    System.out.println(boleteria.getPrecioTotal());
                    System.out.println(boleteria.mostarFactura(cine, peliculaEscogida, cliente));

                    System.out.println("GRACIAS POR SU COMPRA!!");
                    System.out.println("Vuelva pronto");

                    System.out.println("Por favor introduzca su carnet de identidad para acumular puntos");
                    int carId = scanner.nextInt();
                    if (boleteria.verificacionDeRegistro(carId)) {
                        clienteRegistrado.addPuntos(cantidad_de_boletos, boleteria.getPuntosPorCompra(), 50);
                    }
                    break;

                    case 3:
                        System.out.println("Ingrese su carnet de Identidad ");
                        int carnetIdentidad = scanner.nextInt();
                        if (boleteria.verificacionDeRegistro(carnetIdentidad)) {
                            System.out.println("Gracias por formar parte de nuestra familia \n Elija una opcion : ");
                            String souvenElegido = scanner.next().toUpperCase();
                            boleteria.canjearSouvenirs(cliente, souvenElegido);
                            System.out.println("Cangeo exitoso");
                            System.out.println("Gracias por seguir con Nosotros");
                        } else {
                            System.out.println("Debe registrarse para poder cangear puntos");
                        }
                        break;
                    case 4:
                        menuPrincipal();
                    default:
                        System.out.println("Ingrese una opcion valida, en el rango de 1-3");
                }
        }

    public String menuPeliculas() {
        AñadirPeliculas();
        ArrayList<String> butaca = boleteria.muestraButaca(cine.cartelera, cine.salas);

        String nombrePelicula = "";

        System.out.println("Peliculas que se encuentra en nuestra cartelera \n" + "\033[36m" +
                "1." + pelicula1.getNombrePelicula() + "\n" +
                "2." + pelicula2.getNombrePelicula() + "\n" +
                "3." + pelicula3.getNombrePelicula() + "\n" +
                "4." + pelicula4.getNombrePelicula() + "\n" +
                "5." + pelicula5.getNombrePelicula() + "\n" +
                "6." + pelicula6.getNombrePelicula() + "\n" +
                "7." + pelicula7.getNombrePelicula() + "\n" +
                "8.Regresar" + "\n");


        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(butaca.get(0));
                nombrePelicula = pelicula1.getNombrePelicula();
                break;
            case 2:
                System.out.println(butaca.get(1));
                nombrePelicula = pelicula2.getNombrePelicula();

                break;
            case 3:
                System.out.println(butaca.get(2));
                nombrePelicula = pelicula3.getNombrePelicula();
                break;
            case 4:
                System.out.println(butaca.get(3));
                nombrePelicula = pelicula4.getNombrePelicula();

                break;
            case 5:
                System.out.println(butaca.get(4));
                nombrePelicula = pelicula5.getNombrePelicula();

                break;
            case 6:
                System.out.println(butaca.get(5));
                nombrePelicula = pelicula6.getNombrePelicula();

                break;
            case 7:
                System.out.println(butaca.get(6));
                nombrePelicula = pelicula7.getNombrePelicula();

                break;
            case 8:
                menuBoleteria();
                break;
            default:
                System.out.println("Ingrese una opcion valida, en la lista de peliculas, gracias :) ");
        }
        return nombrePelicula;
    }

    public static void main(String[] args) {

        boolean repeticion = false;
        Cine_Main cine_main = new Cine_Main();
        cine_main.menuPrincipal();
    }

}