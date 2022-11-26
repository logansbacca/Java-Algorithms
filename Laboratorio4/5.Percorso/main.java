public class main {
    
public static void main(String[] args) {
    double tot = 0;

    Percorso myPercorso = new Percorso();

    for (int index = 0; index < myPercorso.getMyList().size() - 1; index++) {
             
        tot = tot + calculateDistance(myPercorso.getMyList().get(index), myPercorso.getMyList().get(index + 1));
        
    }
    System.out.println(tot);
}

  public static double calculateDistance(punto point1, punto point2) {
      double x1 = point1.getPuntoX();
      double y1 = point1.getPuntoY();
      double x2 = point2.getPuntoX();
      double y2 = point2.getPuntoY();
      double x = x1 - x2;
      double y = y1 - y2;
      double res = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
      System.out.println(res);
      return res;
  }
    







}
