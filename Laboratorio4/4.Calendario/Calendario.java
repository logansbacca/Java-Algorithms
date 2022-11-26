import java.util.ArrayList;
import java.util.List;


public class Calendario {
    private List <Evento> myCalendario = new ArrayList <Evento>();

    public Calendario () {
        
    }


    public List <Evento> getCalendario() {
        return this.myCalendario;
    }

    public void setCalendario(Evento e) {
       this.myCalendario.add(e);
    }

}
