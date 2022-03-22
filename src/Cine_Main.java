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
    static Cliente cliente ;
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
        System.out.println("***BIENVENIDO A CINE POOI***"
                            +"Desea realizar su Registro"
                            +"Seleccione una opcion de servicio:"
                            +"1.   Realizar registro"
                            +"2.   Sin Registrarse"
                            +"3.   Ir a Boleteria"
                            +"4.   Salir"
                            +"Ingrese la opcion a seguir");
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
                ClasificarEdad edad_Clasificada= boleteria.ClasificarEdad(fechaNacimiento);
                Cliente cliente_R = new Cliente(nombrePersona,carnetIdentidad,fechaNacimiento,correoElectronico,nacionalidad,edad_Clasificada);
                if (boleteria.Verificacion_de_Registro(cliente_R)== 1) {
                    cliente = cliente_R;
                    boleteria.listaclientes.add(cliente);
                    System.out.println("Registro Exitoso");
                }else{
                    System.out.println("El cliente ya se encuentra registrado");
                }

                break;
            case 2:
                System.out.println("Ingrese su Nombre");
                String nombreCliente = scanner.next();
                System.out.println("Ingresa tu numero de carnet");
                int carnet = scanner.nextInt();
                System.out.println("Ingrese su fecha de nacimiento");
                String fecha = scanner.next();
                cliente = new Cliente(nombreCliente, carnet, boleteria.ClasificarEdad(fecha));
                break;
            case 3:
                menuBoleteria();
                break;
            case 4:
                System.out.println("------CINE CENTER -----------");
                break;
            default:
                System.out.println("Ingrese uno de los servicios indicados en pantalla");
        }

    }

    public void menuBoleteria() {
        System.out.println("****BOLETERIA***"
                            +"1. Ver Cartelera\n"
                            +"2. Comprar Boletos\n"
                            +"3. Canjear Puntos");
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

                ClasificarEdad edad;

                switch (seleccion){
                    case 1:
                        edad = ClasificarEdad.INFANTE;
                        break;
                    case 2:
                        edad = ClasificarEdad.ADULTO;
                        break;
                    case 3:
                        edad = ClasificarEdad.ADULTO_MAYOR;
                        break;
                    default:
                        System.out.println("");
                }

                System.out.println("Ingrese la cantidad de boletos que comprara:");
                int cantidad = scanner.nextInt();
                System.out.println("\n");

                boleteria.comprarBoletos(ClasificarEdad.ADULTO_MAYOR, cantidad, pelicula7, TipoDePago. EFECTIVO, "");

                boleteria.comprarBoletos(ClasificarEdad.INFANTE,4, pelicula1, TipoDePago.TARJETA_DE_CREDITO, "Los Elefantes");
                System.out.println("GRACIAS POR SU COMPRA!!");
                System.out.println("Vuelva prontos");

                if(boleteria.Verificacion_de_Registro(cliente) == 1){
                    cliente.addPuntos(cantidad, 10, 0.50);
                }

                break;
            case 3:
                if(boleteria.Verificacion_de_Registro(cliente) == 1){
                    boleteria.canjearSouvenirs(cliente, "Awa");
                }
                else{
                    System.out.println("Debe registrarse para poder obtener el beneficio de puntos");
                }
                break;
            default:
                System.out.println("Ingrese una opcion valida, en el rango de 1-3");
        }
    }

    public void menuPeliculas() {
        AñadirPeliculas();
        ArrayList<String> butaca = boleteria.MuestraButaca(cine.cartelera, cine.salas);

        System.out.println("Escoja una de las peliculas que se encuentra en nuestra cartelera \n"+
                                "1."+pelicula1.nombrePelicula+"\n"+
                                "2."+pelicula2.nombrePelicula+"\n"+
                                "3."+pelicula3.nombrePelicula+"\n"+
                                "4."+pelicula4.nombrePelicula+"\n"+
                                "5."+pelicula5.nombrePelicula+"\n"+
                                "6."+pelicula6.nombrePelicula+"\n"+
                                "7."+pelicula7.nombrePelicula+"\n"+
                                "8.Regresar"+"\n");


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
            case 8:
                menuBoleteria();
                break;
            default:
                System.out.println("Ingrese una opcion valida, en la lista de peliculas, gracias :) ");

        }
    }


        public static void main (String[]args){

        boolean repeticion = false;
        Scanner scan = new Scanner(System.in)
        Cine_Main cine_main = new Cine_Main();

        while (repeticion == false){
            System.out.println("-----------" +
                    "CINE"+"\n" +
                    "1. menu principal"+"\n" +
                    "2. salir"+"\n");
        }
            int operacion = scan.nextInt();
        if (operacion == 2){
            System.out.println("salio del cine");
            break;
        }
        if (operacion != 0 && operacion >1){
            continue;
        }
            switch (opcion)





    }

}