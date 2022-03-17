public class Asientos {
    // write your code here
    String  letraFila ;
    int numeroAciento;
    boolean estado = true ;
    public Asientos(String Fila , int numeroAciento){
        this.letraFila = Fila;
        this.numeroAciento  = numeroAciento;
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