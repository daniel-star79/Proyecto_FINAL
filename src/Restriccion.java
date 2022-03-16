public enum Restriccion {
    edad1(15),
    edad2(16),
    edad3(18);

    private int restriccion;

    private Restriccion(int restriccion) {
        this.restriccion = restriccion;
    }

    @Override
    public String toString(){
        return "edad = +" + restriccion;
    }

}
