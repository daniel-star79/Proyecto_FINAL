import java.util.ArrayList;

public class Sala {

    String IDSala = "SALA-";
    ArrayList<Asientos> listaAsientos;
    int capacidad;
    String asiento;


    public Sala(String IDSala, int capacidad) {
        this.IDSala += IDSala;
        this.capacidad = capacidad;
        listaAsientos = new ArrayList<>();
    }

    public String getIDSala() {
        return IDSala;
    }

    public void setIDSala(String IDSala) {
        this.IDSala = IDSala;
    }

    public void CrearAsientos() {

        int filas = capacidad / 10, count = 0;
        String letraFila = "A", asientos = "";
        for (int i = 1; i < 11; i++) {
            listaAsientos.add(new Asientos(letraFila, i));
            if (i == 10) {
                i = 0;
                char codigo = letraFila.charAt(0);
                codigo++;
                letraFila = String.valueOf(codigo);
                filas--;
            }
            if (filas == 0) {
                break;
            }
        }
    }

    public void ImprimirAienos() {
        for (Asientos a : listaAsientos) {
            System.out.println(a.getEstado() + " " + a.getNumeroAciento() + " " + a.getLetraFila());
        }
    }


    public String ActualizarAsientos() {
        String color = "";
        int filas = capacidad / 10, count = 0;
        String letraFila = "A", asientos = "";
        for (Asientos a : listaAsientos) {
            count++;
            if (a.estado) {
                color = "\u001B[32m";
            } else {
                color = "\u001B[31m";
            }
            asientos += color + "[" + a.getNumeroAciento() + " " + a.getLetraFila() + "]";
            if (count == 10) {
                asientos += "\n";
                count = 0;
            }

        }
        return asientos;
    }

    public ArrayList<Asientos> getListaAsientos() {
        return listaAsientos;
    }

}

