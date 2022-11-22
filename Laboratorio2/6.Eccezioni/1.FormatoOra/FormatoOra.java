import java.time.format.DateTimeParseException;

public class FormatoOra {
    
    public static void main(String[] args) {
       converti(args[0]);
    }

    public static String converti(String s) throws DateTimeParseException {
        int ore = 0;
        String convention = "am";
        int newHour = 0;
        int minutes = 0;
        try {
        String arr [] =  s.split(":");
        ore = Integer.parseInt(arr[0]);
        newHour = ore;
        minutes = Integer.parseInt(arr[1]);
        if (s.length() < 5 || ore >24 || minutes >60) {
            throw new DateTimeParseException("wrong hours", s, ore);
        }
        }catch (Exception e) {
            throw new DateTimeParseException(s, s, 0);
        }

            if ((ore -12) >0) {      
                newHour = ore -12;
                convention = "pm";
            };
    
       
        String res =  Integer.toString(newHour) + ":" + Integer.toString(minutes) + convention;
        System.out.println(res);
        return res;
        
       
    }
}
