public enum Calidad {

    TERCERA_DIMENSION("3D"),
    SEGUNDA_DIMENSION("2D");

    private String calidad;

    private Calidad(String calidad) {
        this.calidad = calidad;
    }

    @Override
    public String toString(){
        return "calidad = " + calidad;
    }
}




