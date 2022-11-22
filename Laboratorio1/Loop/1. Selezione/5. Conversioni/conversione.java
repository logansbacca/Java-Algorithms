public class conversione {
    public static void main (String [] args){
        int one = Integer.parseInt(args[0]);
        String val = args[1];
        String val2 = args[2];
        //int secondstominutes = seconds / 60;
        int minutestohours = secondstominutes / 60;
        int hourstodays = minutestohours/24;
        int daystomonths= hourstodays/12;
        int monthstoyears = daystomonths/24;

        if (val == "minutes" && val2 = "days"){
            minutestohours = one;
        }
    }
}