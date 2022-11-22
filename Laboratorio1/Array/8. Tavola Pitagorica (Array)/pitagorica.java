public class pitagorica {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                int[][] matrixRet = createPitagoricTable(n);
                printPitagoricTable(matrixRet);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("error");
        }
        System.out.println("ended");
    }

   
    public static int[][] createPitagoricTable(int n) {
        int[][] matrixPitagoric = new int[n][n];
        for (int linea = 0; linea < matrixPitagoric.length; linea++) {
            for (int colonna = 0; colonna < matrixPitagoric[0].length; colonna++) {
                matrixPitagoric[linea][colonna] = (linea + 1) * (colonna + 1);
               
            }
        }
        return matrixPitagoric;
    }


    public static void printPitagoricTable(int[][] matrixRet) {
        for (int linea = 0; linea < matrixRet.length; linea++) {

            for (int colonna = 0; colonna < matrixRet[0].length; colonna++) {
                System.out.print(matrixRet[linea][colonna] + "  ");
                
            }
            System.out.println("");
        }
    }
}





