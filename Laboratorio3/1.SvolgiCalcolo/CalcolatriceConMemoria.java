import java.util.InputMismatchException;

public class CalcolatriceConMemoria {

    // Overview: calcolatrice sequenziale su numeri decimali, utilizzando il
    // risultato dell'operazione precedente come il primo operando dell'operazione
    // successiva
    private double mem;

    public CalcolatriceConMemoria() {
        this.mem = 0; 
    }

    // constructor:
    public CalcolatriceConMemoria (double mem) {
        //MODIFIES: this
        //EFFECTS: iniazzaliza la calcoltrice con memoria pari a zero
        this.mem = mem;

    }

    // methods
    public double getMem() {
        // effects: restituisce il valore attuale della memoria
        return this.mem;
    }

    public double add(double op2) {
        // modifies : this
        // effects: svolge l'operazione di somma tra op2 e il valore in memoria
        this.mem += op2;
        return this.mem;
    }

    public double sub(double op2) {
        // modifies : this
        // effects: svolge l'operazione di sotrazione tra il valore in memoria e op2
        this.mem -= op2;
        return this.mem;
    }

    public double mul(double op2) {
        // modifies : this
        // effects: svolge l'operazione di moltiplicazione tra il valore in memoria e
        // op2
        this.mem *= op2;
        return this.mem;
    }

    public double div(double op2) throws DivideByZeroException {
        // modifies : this
        // effects : se op2 e maggiore di 0 svolege loperazione di divione tra il valore
        // in memoria e op2 invece se op2 e uguale a zero allora lascio lerrore
        if (op2 == 0) {
            throw new DivideByZeroException("non puoi dividere per zero");
        } else {
            this.mem /= op2;
        }
        return this.mem;
    }


    public double operate(char operator, double op2) throws DivideByZeroException, InputMismatchException {
        //modifies: this
        //effects: esegue loperazione di tipo operator in memoria  e op2 impostando in memoria il risultato del operazione.
        //se operator non è un operatore il meotdo lascia un eccezione
        //se op2 e uguale a zero lancia una dividebyzeroexception

        switch(operator){
            case '+' :
                this.add(op2);
                return this.mem;
            case '-':
                this.sub(op2);
                return this.mem;
            case '*':
                this.mul(op2);
                return this.mem;
            case '/':
                this.div(op2);
                return this.mem;
            default:
            throw new InputMismatchException("operatore non valido");
        }

    }

}