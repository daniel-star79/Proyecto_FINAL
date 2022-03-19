public class Puntos {

    int cantidadPuntos;
    String canjear;


    public Puntos(int cantidadPuntos, String canjear) {
        this.cantidadPuntos = cantidadPuntos;
        this.canjear = canjear;

    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public String getCanjear() {
        return canjear;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public void setCanjear(String canjear) {
        this.canjear = canjear;
    }
}
