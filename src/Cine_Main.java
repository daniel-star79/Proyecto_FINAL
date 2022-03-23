import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Locale;
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

    public void AñadirBancos(){
        boleteria.AñadirBancos("Fie",TipoDePago.TARJETA_DE_CREDITO);
        boleteria.AñadirBancos("Sol",TipoDePago.TARJETA_DE_DEBITO);
    }

    static Boleteria boleteria = new Boleteria(60, 40);


//Se arma la estructura del metodo main

    public void menuPrincipal() {
        System.out.println("********BIENVENIDOS********\n "
                            +"Seleccione una opcion de servicio:\n"
                            +"1.  Usuario Registrado\n"
                            +"2.  Registrase\n"
                            +"3.  Sin Registarse\n"
                            +"4.  Salir \n "
                            +"Ingrese la opcion a seguir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese su numero de carnet");
                int numeroCarnet = scanner.nextInt();
                Cliente cliente = new Cliente(numeroCarnet);
                if (boleteria.Verificacion_de_Registro(cliente)==0)
                {
                    System.out.println("Usuario Registrado");


                }else{
                    System.out.println("Usuario no registrado");
                }

            case 2:
                System.out.println("Ingrese su  Nombre");
                String nombrePersona = scanner.next();
                System.out.println("Ingrese su numero de carnet de Identidad");
                int carnetIdentidad = scanner.nextInt();
                System.out.println("Ingrese su fecha de Nacimiento de la siguiente forma dd/MM/yyyy");
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


            case 3:
                System.out.println("Ingrese su nombre");
                String nombre=scanner.next();
                System.out.println("Ingrese su fecha de nacimiento ");
                String fecha =scanner.next();
                System.out.println("Ingrese su carnet de Identidad");
                int carnetI= scanner.nextInt();
                ClasificarEdad edad = boleteria.ClasificarEdad(fecha);
                Cliente cliente1= new Cliente(nombre , carnetI , edad);
                break;
            case 4:
                break;
            default:
                System.out.println("Ingrese uno de los servicios indicados en pantalla");
        }

    }
/*
    public void menuBoleteria() {
        System.out.println("***BOLETERIA DEL CINE POOI***");

        System.out.println("Que pelicula desea ver?");
        menuPeliculas();

        System.out.println("Escoja un horario: ");

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

                System.out.println("\nComprar boletos para:\n "
                +"1. Niños (hasta los  10 años\n)"
                +"2. Adulto\ns"
                +"3. Adultos Mayores");

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
*/

    public void menuBoleteria() {
        System.out.println("***BOLETERIA DEL CINE POOI***"+"\n");
        System.out.println("****BOLETERIA***"+"\n"
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
                System.out.println("Que pelicula desea ver");
                String pelicula = scanner.next();
                System.out.println("Ingrese la cantidad de boletos que comprara:");
                int cantidad_de_boletos = scanner.nextInt();
                Pelicula peliculaEscogida = cine.RetornarPelicula(pelicula);
                System.out.println(boleteria.MuestraButaca(peliculaEscogida,sala1));
                for(int i = 1;i<cantidad_de_boletos ;i++) {
                    System.out.println(sala1.ActualizarAsientos());
                    System.out.println("Que acientos desea");
                    int columna = scanner.nextInt();
                    System.out.print("");
                    String fila = scanner.next().toUpperCase(Locale.ROOT);
                    boleteria.OcuparAsiento(sala1, fila, columna);
                }
                System.out.println("Metodo de pago"+
                                    "\nEFECTIVO , TARJETA_DE_CREDITO , TARJETA_DE_DEBITO , QR ,PUNTOS ");
                String metodoPago = scanner.next().toUpperCase();
                if(metodoPago != "EFECTIVO"){
                    System.out.println("Ingrese su Banca Movil");
                    boleteria.comprarBoletos(cliente.clasificarEdad,cantidad_de_boletos,peliculaEscogida, TipoDePago.TARJETA_DE_CREDITO, "Los Elefantes");
                    System.out.println("GRACIAS POR SU COMPRA!!");
                    System.out.println("Vuelva pronto");
                }
                System.out.println("Por favor introdusca su carnet de identidad para acumular puntos");
                int carId = scanner.nextInt();
                if(boleteria.Verificacion_de_Registro(cliente) == 0){
                    cliente.addPuntos(cantidad_de_boletos, boleteria.puntos_por_compra, 50);
                }
                break;
            case 3:
                if(boleteria.Verificacion_de_Registro(cliente) == 1){
                    boleteria.canjearSouvenirs(cliente, "Awa");
                    System.out.println("Gracias por seguir con Nosotros");
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
        Cine_Main cine_main = new Cine_Main();

        while (repeticion == false) {
            System.out.println("-----------" +"\n"+
                    "CINE" + "\n" +
                    "1. menu principal" + "\n" +
                    "2. salir" + "\n");

            int opcion = scanner.nextInt();

            if (opcion == 2) {
                System.out.println("salio del cine");
                break;
            }
            if (opcion != 0 && opcion > 1) {
                continue;
            }
            switch(opcion){
                case 1:
                    cine_main.menuPrincipal();
                    break;
                default:
                    System.out.println("error vuelva a intentarlo");
                    break;

            }

        }

    }

}