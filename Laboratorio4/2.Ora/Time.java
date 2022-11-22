public class Time {
    private int hours;
    private int minutes;
    private boolean pm;


    public Time() {
        this.pm = false;
        this.hours = 0;
        this.minutes = 0;
    }

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        if (hours >= 12) {
            this.pm = true;
        } else {
            this.pm = false;
        }
    }

    public Time(int hours, int minutes, boolean pm) {
        if (pm) {
            this.hours = hours+12;
        }
        this.minutes = minutes;
        this.pm = pm;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void avanca(int hours, int minutes) {
        int extraHour = 0;
        int auxM = this.minutes + minutes;
        while (auxM > 59) {
            auxM = auxM - 60;
            extraHour++;
        }
        this.minutes = auxM;

        hours += extraHour;
        int auxH = this.hours + hours;
        while (auxH > 23) {
            auxH = auxH - 24;
        }
        this.hours = auxH;

        if (hours >= 12) {
            this.pm = true;
        } else {
            this.pm = false;
        }
    }

    public String getOra24() {
        return (this.hours + ":" + this.minutes);
    }

    public String getOra12() {

        if (this.pm) {
            return ((this.hours - 12) + ":" + this.minutes + "pm");
        } else {
            return (this.hours + ":" + this.minutes + "am");
        }
    }

    public boolean equals(Time time) {
        if (time.getHours() == this.hours && time.getMinutes() == this.minutes) {
            return true; 
        }
        return false;
    }

}
