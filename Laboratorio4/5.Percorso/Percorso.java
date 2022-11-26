import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Percorso {
   private List<punto> myList = new ArrayList<punto>();

    public Percorso() {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("insert input");
        while (myscanner.hasNext()) {
            double x = myscanner.nextDouble();
            double y = myscanner.nextDouble();
            punto newputo = new punto(x, y);
            myList.add(newputo);
        }
}

public List<punto> getMyList() {
    return this.myList;
}
  

}

    

    

    
    


