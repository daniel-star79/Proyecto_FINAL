public class Banco {
// esta clse nos ayuda aque un cine pueda añadir mas bancos ademas de sus formas con las que se pueda realizar el pago
    private String nombreDelBanco;

    private TipoDePago tipoDePago;

    public Banco(String nombreDelBanco, TipoDePago tipoDePago) {
        this.nombreDelBanco = nombreDelBanco;
        this.tipoDePago = tipoDePago;
    }


    public String getNombreDelBanco() {return nombreDelBanco;}
    public TipoDePago getTipoDePago() {
        return tipoDePago;
    }




}
