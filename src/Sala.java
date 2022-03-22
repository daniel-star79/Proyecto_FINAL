import java.util.ArrayList;

public class Sala {

        // write your code here

        String IDSala = "SALA-" ;
        ArrayList<Asientos> listaAsientos;
        int capacidad ;


    public Sala(String IDSala, int capacidad){
            this.IDSala += IDSala;
            this.capacidad = capacidad;
            listaAsientos = new ArrayList<>();
        }

        public String getIDSala () {
            return IDSala;
        }

        public void setIDSala (String IDSala){
            this.IDSala = IDSala;
        }

        public String ActualizarAsientos(){
        String color= "";
                int filas  = capacidad / 10 , count = 0 ;
                String letraFila  = "A", asientos= "";
                for(int i = 1 ;i<11;i++){
                    listaAsientos.add(new Asientos(letraFila,i));
                    if (listaAsientos.get(count).estado == true)color = "\u001B[32m"; else color = "\u001B[31m";
                    asientos+= color+"["+listaAsientos.get(count).numeroAciento+" "+listaAsientos.get(count).letraFila+"]";
                    count ++;
                    if(i==10) {
                        asientos+="\n";
                        i = 0;
                        char codigo = letraFila.charAt(0);
                        codigo++;
                        letraFila = String.valueOf(codigo);
                        filas--;
                    }
                    if (filas ==0){
                        break;
                    }
                }
            return asientos;
        }

    public ArrayList<Asientos> getListaAsientos() {
        return listaAsientos;
    }
}

