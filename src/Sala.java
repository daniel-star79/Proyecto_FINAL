public class Sala {

        // write your code here

        String IDSala = null;
        Asientos asientos;

// matrises

    public Sala(String IDSala, Asientos asientos){
            this.IDSala = IDSala;
            this.asientos = asientos;
        }

        public String getIDSala () {
            return IDSala;
        }


        public Asientos getAsientos () {
            return asientos;
        }

        public void setIDSala (String IDSala){
            this.IDSala = IDSala;
        }
        

        public void setAsientos (Asientos asientos){
            this.asientos = asientos;
        }
    }

