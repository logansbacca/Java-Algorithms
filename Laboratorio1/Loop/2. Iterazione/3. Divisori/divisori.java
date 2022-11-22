public class divisori {
    public static void main (String [] args) {
        int n= Integer.parseInt(args[0]);
       
        for (int index = 1; index <n; index++) {
           if (n % index == 0) {
            System.out.println(index);;
           } 
        }
    }
    
}
