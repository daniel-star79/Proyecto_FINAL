public class Asientos {

    private String letraFila;
    private int numeroAciento;
    boolean estado;

    public Asientos(String Fila, int numeroAciento) {
        this.letraFila = Fila;
        this.numeroAciento = numeroAciento;
        estado = true;
    }

    public boolean getEstado() {
        return estado;
    }

    public int getNumeroAciento() {
        return numeroAciento;
    }

    public String getLetraFila() {
        return letraFila;
    }
}