public enum Calidad {

    TERCERA_DIMENSION("3D"),
    SEGUNDA_DIMENSION("2D");

    Calidad(String calidad) {
        this.calidad = calidad;
    }

    public String MostrarAbreviatura(){
        return calidad;
    }

    private String calidad;
}




