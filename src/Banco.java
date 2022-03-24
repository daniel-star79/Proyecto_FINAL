public class Banco {

    private String nombreDelBanco;
    private TipoDePago tipoDePago;
    public Banco(String nombreDelBanco, TipoDePago tipoDePago) {
        this.nombreDelBanco = nombreDelBanco;
        this.tipoDePago = tipoDePago;
    }
    public String getNombreDelBanco() {
        return nombreDelBanco;
    }
    public TipoDePago getTipoDePago() {
        return tipoDePago;
    }

}
