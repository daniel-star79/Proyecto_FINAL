public class Asientos {
    // write your code here
    String ID = null;
    boolean estado = false;

    public Asientos(String ID, Boolean estado) {
        this.ID = ID;
        this.estado = estado;
    }

    public String getID() {
        return ID;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}