public class pitagorica {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                int[][] matrixRetornada = createPitagoricTable(n);
                printPitagoricTable(matrixRetornada);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("error");
        }
        System.out.println("ended");
    }

    // Funcionando
    public static int[][] createPitagoricTable(int n) {
        int[][] matrixPitagoric = new int[n][n];
        for (int linha = 0; linha < matrixPitagoric.length; linha++) {
            for (int coluna = 0; coluna < matrixPitagoric[0].length; coluna++) {
                matrixPitagoric[linha][coluna] = (linha + 1) * (coluna + 1);
                // linha -> 0
                // coluna -> 0,1,2,3,4
            }
        }
        return matrixPitagoric;
    }

    // Funcionando
    public static void printPitagoricTable(int[][] matrixRetornada) {
        for (int linha = 0; linha < matrixRetornada.length; linha++) {

            for (int coluna = 0; coluna < matrixRetornada[0].length; coluna++) {
                System.out.print(matrixRetornada[linha][coluna] + "  ");
                // linha -> 0
                // coluna -> 0,1,2,3,4
                /*
                 * output - 1 2 3 4 5
                 * 2 4 6 8 10
                 */
            }
            System.out.println("");
        }
    }
}





