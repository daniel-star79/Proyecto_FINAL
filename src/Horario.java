public enum Horario {

    MAÑANA("10:00 a 11:30"),
    TARDE("14:00 a 15:00"),
    PRENOCHE("18:00 a 19:00"),
    NOCHE("20:00 a 21:00");

    private String horario;

    private Horario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString(){
        return "horario = " + horario;
    }

}