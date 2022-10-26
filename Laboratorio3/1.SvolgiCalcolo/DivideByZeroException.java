public class DivideByZeroException extends Exception {
    public DivideByZeroException () {
        super("divisone per zero!!!");
    }
    
    public DivideByZeroException (String messaggio) {
        super(messaggio);
    }
}
