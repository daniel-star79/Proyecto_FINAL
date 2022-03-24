public class Asientos {
    // write your code here
    private String  letraFila ;
    private int numeroAciento;
    boolean estado ;
    public Asientos(String Fila , int numeroAciento){
        this.letraFila = Fila;
        this.numeroAciento  = numeroAciento;
        estado = true;
    }

    public void setLetraFila(String letraFila) {
        this.letraFila = letraFila;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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