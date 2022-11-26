import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Evento {
    final Date date;
    final String name;

    public Evento( Date data, String nome) {
        this.date = data;
        this.name= nome;
    }

    public String getNome(){
        return this.name;
    }

    public Date getData(){
       return this.date; 
    }
    
    public Evento copiaEvento(int offset) {
     Date newData = new Date(this.date.getTime() + TimeUnit.DAYS.toMillis(offset));
     return new Evento(newData, this.name);
    }
    
}
