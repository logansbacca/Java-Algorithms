public class bilanciata {
    public static void main (String[] args){
        String parentesi = args[0];
        Integer counter1 = 0;
        for (int i = 0; i<parentesi.length(); i++) {
           
            if (parentesi.charAt(i) == '['){
                counter1++;
            }
            if (parentesi.charAt(i) == ']'){
                counter1--;
                if (counter1 <0) {
                    break;
                }
            }    
            
        }
        if (counter1 !=0) {
            System.out.println("non bilanciata");
        }else {
            System.out.println("bilanciata");
        }
        
    }
}
