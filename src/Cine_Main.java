import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

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

    static Cliente cliente1 = new Cliente("1", 123, "13/13/2000");
    static Cliente cliente2 = new Cliente("2", 123, "13/13/2000");
    static Cliente cliente3 = new Cliente("3", 123, "13/13/2000");
    static Cliente cliente4 = new Cliente("4", 123, "13/13/2000");

    public void AñadirSalas() {
        cine.AddSala(sala1);
        cine.AddSala(sala2);
        cine.AddSala(sala3);
        cine.AddSala(sala4);
        cine.AddSala(sala5);
        cine.AddSala(sala6);
        cine.AddSala(sala7);

        assertEquals(7, cine.salas.size());

    }

    public void AñadirPeliculas() {

        AñadirSalas();
        cine.AddPelicula(pelicula1);
        cine.AddPelicula(pelicula2);
        cine.AddPelicula(pelicula3);
        cine.AddPelicula(pelicula4);
        cine.AddPelicula(pelicula5);
        cine.AddPelicula(pelicula6);
        cine.AddPelicula(pelicula7);

    }

    static Boleteria boleteria = new Boleteria(60, 40);


//Se arma la estructura del metodo main

    public void menuPrincipal() {
        System.out.println("***BIENVENIDO A CINE POOI***");
        System.out.println("Desea realizar su Registro");
        System.out.println("Seleccione una opcion de servicio:");
        System.out.println("1.   Realizar registro");
        System.out.println("2.   Sin Registrarse");
        System.out.println("3.   Salir");
        System.out.println("Ingrese la opcion a seguir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese su  Nombre");
                String nombrePersona = scanner.next();
                System.out.println("Ingrese su numero de carnet de Identidad");
                int carnetIdentidad = scanner.nextInt();
                System.out.println("Ingrese su fecha de Nacimiento de la siguiente forma 00/00/00");
                String fechaNacimiento = scanner.next();
                System.out.println("Ingrese su correo electronico");
                String correoElectronico = scanner.next();
                System.out.println("Ingrese su nacionalidad");
                String nacionalidad = scanner.next();
                break;
            case 2:
                System.out.println("Ingrese su Nombre");
                String nombreCliente = scanner.next();
                System.out.println("Ingresa tu numero de carnet");
                int carnet = scanner.nextInt();
                System.out.println("Ingrese su fecha de nacimiento");
                String fecha = scanner.next();
                break;
            case 3:
                break;
            default:
                System.out.println("Ingrese uno de los servicios indicados en pantalla");


        }

    }

    public void menuBoleteria() {
        System.out.println("****BOLETERIA***");
        System.out.println("1. Ver Cartelera");
        System.out.println("2. Comprar Boletos");
        System.out.println("3. Canjear Puntos");

        System.out.println("\nIngrese la opcion a seguir: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                menuPeliculas();
                break;
            case 2:
                System.out.println("\nCOMPRA DE BOLETOS");

                System.out.println("\nBoletos para: ");
                System.out.println("1. Niños (hasta los  10 años)");
                System.out.println("2. Adultos");
                System.out.println("3. Adultos Mayores");

                System.out.println("\nIngrese el tipo de boleto a comprar: ");
                int seleccion = scanner.nextInt();

                switch (seleccion){
                    case 1:
                        //edad = ClasificarEdad.INFANTE;
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                }

                //boleteria.comprarBoletos();

                System.out.println("Ingrese la cantidad de boletos que comprara:");
                int cantidad = scanner.nextInt();
                System.out.println("\n");

                System.out.println("COMPRA DE BOLETOS");

                boleteria.comprarBoletos(ClasificarEdad.INFANTE,4, pelicula1, TipoDePago.TARJETA_DE_CREDITO, "Los Elefantes");
                System.out.println("GRACIAS POR SU COMPRA!!");
                System.out.println("Vuelva prontos");
                break;
            case 3:
                boleteria.canjearSouvenirs(cliente1, "Awa");
                break;
            default:
                System.out.println("Ingrese una opcion valida, en el rango de 1-3");
        }
    }

    public void menuPeliculas() {
        AñadirPeliculas();
        ArrayList<String> butaca = boleteria.MuestraButaca(cine.cartelera, cine.salas);

        System.out.println("Escoja una de las peliculas que se encuentra en nuestra cartelera");
        System.out.println("1."+pelicula1.nombrePelicula);
        System.out.println("2."+pelicula2.nombrePelicula);
        System.out.println("3."+pelicula3.nombrePelicula);
        System.out.println("4."+pelicula4.nombrePelicula);
        System.out.println("5."+pelicula5.nombrePelicula);
        System.out.println("6."+pelicula6.nombrePelicula);
        System.out.println("7."+pelicula7.nombrePelicula);

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(butaca.get(1));
                break;
            case 2:
                System.out.println(butaca.get(2));
                break;
            case 3:
                System.out.println(butaca.get(3));
                break;
            case 4:
                System.out.println(butaca.get(4));
                break;
            case 5:
                System.out.println(butaca.get(5));
                break;
            case 6:
                System.out.println(butaca.get(6));
                break;
            case 7:
                System.out.println(butaca.get(7));
                break;
            default:
                System.out.println("Ingrese una opcion valida, en la lista de peliculas, gracias :) ");

        }
    }


        public static void main (String[]args){
        Cine_Main cine_main = new Cine_Main();
        cine_main.menuPeliculas();

        }

}